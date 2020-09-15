/**
 * 
 */
package uk.co.noetic.util;

/**
 * @author Sampath Ekanayake created on Oct 18, 2017
 *
 */
import java.io.PrintStream;
import java.io.StringWriter;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.commons.lang3.StringUtils;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/*
 * This simple SOAPHandler will output the contents of incoming
 * and outgoing messages.
 */
public class SOAPLoggingHandler implements SOAPHandler<SOAPMessageContext> {
    
    private final static Logger LOGGER = LoggerFactory.getLogger(SOAPLoggingHandler.class);

	// change this to redirect output if desired
	private static PrintStream out = System.out;

	public Set<QName> getHeaders() {
		return null;
	}

	public boolean handleMessage(SOAPMessageContext smc) {
		logToSystemOut(smc);
		return true;
	}

	public boolean handleFault(SOAPMessageContext smc) {
		logToSystemOut(smc);
		return true;
	}

	// nothing to clean up
	public void close(MessageContext messageContext) {
	}

	/*
	 * Check the MESSAGE_OUTBOUND_PROPERTY in the context to see if this is an
	 * outgoing or incoming message. Write a brief message to the print stream and
	 * output the message. The writeTo() method can throw SOAPException or
	 * IOException
	 */
	private void logToSystemOut(SOAPMessageContext smc) {
		Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        String type = "";
        if (outboundProperty.booleanValue()) {
            type = "Request:";
        } else {
            type = "Response:";
        }

        SOAPMessage message = smc.getMessage();
        try {
            LOGGER.info("{} {}", type, prettyPrint(getSoapStringXML(message)));
        } catch (Exception e) {
            out.println("Exception in handler: " + e);
        }
	}
	
	public String prettyPrint(final String xml){  

	    if (StringUtils.isBlank(xml)) {
	        throw new RuntimeException("xml was null or blank in prettyPrint()");
	    }

	    final StringWriter sw;

	    try {
	        final OutputFormat format = OutputFormat.createPrettyPrint();
	        final org.dom4j.Document document = DocumentHelper.parseText(xml);
	        sw = new StringWriter();
	        final XMLWriter writer = new XMLWriter(sw, format);
	        writer.write(document);
	    }
	    catch (Exception e) {
	        throw new RuntimeException("Error pretty printing xml:\n" + xml, e);
	    }
	    return sw.toString();
	}
	private String getSoapStringXML(SOAPMessage message) {
		StringWriter sw = new StringWriter();
		try {
			Transformer t = TransformerFactory.newInstance().newTransformer();
			t.setOutputProperty(OutputKeys.INDENT, "yes");
			t.transform(new DOMSource(message.getSOAPPart()), new StreamResult(sw));
		} catch (TransformerException e) {
			throw new RuntimeException(e);
		}
		return sw.toString();
	}
}