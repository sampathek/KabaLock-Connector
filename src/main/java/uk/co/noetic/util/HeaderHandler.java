/**
 * 
 */
package uk.co.noetic.util;

import java.util.Calendar;
/**
 * @author Sampath Ekanayake created on Oct 18, 2017
 *
 */
import java.util.Set;
import java.util.UUID;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import uk.co.noetic.kaba.AuthHeader;
import uk.co.noetic.kaba.CUserNameToken;
import uk.co.noetic.kaba.ObjectFactory;
import uk.co.noetic.kaba.SecurityHeader;

public class HeaderHandler implements SOAPHandler<SOAPMessageContext> {
	
	private String targetEnv;
	private String userName;
	private String password;

	
    public HeaderHandler(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

	public boolean handleMessage(SOAPMessageContext smc) {

		Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

		if (outboundProperty.booleanValue()) {
			

			try {
				SOAPEnvelope soapEnvelope = smc.getMessage().getSOAPPart().getEnvelope();
				SOAPHeader soapHeader = soapEnvelope.getHeader();
				
				if(soapHeader==null){
					soapHeader = soapEnvelope.addHeader();
				}
				
				//SOAPMessage message = smc.getMessage();
				
				AuthHeader authHeader = new AuthHeader();
				SecurityHeader security = new SecurityHeader();
				CUserNameToken usernameToken = new CUserNameToken();
				
				usernameToken.setUsername(this.userName);
				usernameToken.setPassword(this.password);
				usernameToken.setId(UUID.randomUUID().toString());
				usernameToken.setCreated(KabaUtil.getXMLGregorianCalendar(Calendar.getInstance().getTime()));
				
				security.setUsernameToken(usernameToken);
				authHeader.setSecurity(security);

				ObjectFactory objectFactory =  new ObjectFactory();
				JAXBElement<AuthHeader> jaxbAuthHeaderElement = objectFactory.createAuthHeader(authHeader);

				try {
					// Obtaining marshaler which should marshal instance to xml
					final Marshaller marshaller = JAXBContext.newInstance(ObjectFactory.class).createMarshaller();
					// Marshaling instance (appending) to SOAP header's xml node
					marshaller.marshal(jaxbAuthHeaderElement, soapHeader);
				} catch (final Exception e) {
					throw new RuntimeException(e);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			try {

				// This handler does nothing with the response from the Web Service so
				// we just print out the SOAP message.
				SOAPMessage message = smc.getMessage();
				//message.writeTo(System.out);
				//System.out.println("");

			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		return outboundProperty;

	}
	
    /*public boolean handleMessage(SOAPMessageContext context) {
        Boolean outboundProperty = 
            (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (outboundProperty.booleanValue()) {
            SOAPMessage message = context.getMessage();
            try {
                SOAPEnvelope envelope = context.getMessage()
                        .getSOAPPart().getEnvelope();
                SOAPFactory factory = SOAPFactory.newInstance();
                String prefix = "X";
                String uri = "http://...wsssecurity...";
                SOAPElement securityElem = 
                        factory.createElement("Security",prefix,uri);
                SOAPElement tokenElem = 
                        factory.createElement("BinarySecurityToken",prefix,uri);
                tokenElem.addTextNode("kjh...897=");
                securityElem.addChildElement(tokenElem);
                SOAPHeader header = envelope.addHeader();
                header.addChildElement(securityElem);

            } catch (Exception e) {
                System.out.println("Exception in handler: " + e);
            }
        } else {
            // inbound
        }
        return true;
    }*/

	public Set getHeaders() {
		// throw new UnsupportedOperationException("Not supported yet.");
		return null;
	}

	public boolean handleFault(SOAPMessageContext context) {
		// throw new UnsupportedOperationException("Not supported yet.");
		return true;
	}

	public void close(MessageContext context) {
		// throw new UnsupportedOperationException("Not supported yet.");
	}
	
	private static XMLGregorianCalendar convertStringToXMLGregorianCalendar(String lexicalRepresentation) throws DatatypeConfigurationException {
		return DatatypeFactory.newInstance().newXMLGregorianCalendar(lexicalRepresentation);
	}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
