/**
 * 
 */
package uk.co.noetic.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.Binder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.client.methods.HttpRequestBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Node;

import uk.co.noetic.kaba.CMessengerResponse;
import uk.co.noetic.kaba.Fault;

/**
 * @author Sampath Ekanayake created on Oct 19, 2017
 *
 */
public class KabaUtil {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(KabaUtil.class);

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Object getJavaObj(Object content, Class mClassType) throws Exception {
		

		Object retunObj = null;
		JAXBContext context = JAXBContext.newInstance(mClassType);

		// create binder
		Binder<Node> binder = context.createBinder();
		// get xml node from the document
		Node xmlNode = (Node) content;

		// unmarshal the xml
		if (mClassType.equals(CMessengerResponse.class)) {

			JAXBElement<CMessengerResponse> jst = binder.unmarshal(xmlNode, mClassType);
			retunObj = jst.getValue();
		}else if (mClassType.equals(Fault.class)) {

		            JAXBElement<Fault> jst = binder.unmarshal(xmlNode, mClassType);
		            retunObj = jst.getValue();
		        } else {
			System.out.println("Please modify this condition");
		}

		return retunObj;
	}
	
	
	public static String generateCustomNum(String walletID, String uniqueDeviceId) {
		
		return "custom#" + walletID + "-" + uniqueDeviceId;
	}
	
	public static String getTargetEnv(String targetEnv) {
		
		String finalEnv = null;
		
		switch (targetEnv) {
		case "LOCAL": case "DEV" : case "STAGING" :
			finalEnv = "DEV";
			break;
		case "PRODUCTION": case "PRELIVE":
			finalEnv = "PRODUCTION";
			break;
		default:
			finalEnv = "DEV";
			break;
		}
		
		LOGGER.warn("TARGET_ENV for Kaba-Connector: " + targetEnv + " resolved to " +finalEnv);
		
        return finalEnv;
	}
	
	public static XMLGregorianCalendar getXMLGregorianCalendar(String dateStr) throws Exception{
		//DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		Date date = format.parse(dateStr);

		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);

		XMLGregorianCalendar xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);

		return xmlGregCal;
	}
	
	public static XMLGregorianCalendar getXMLGregorianCalendar(Date date) throws Exception{

		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);

		XMLGregorianCalendar xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);

		return xmlGregCal;
	}
	
	public static String convertStreamToString(InputStream is) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		StringBuilder sb = new StringBuilder();

		String line = null;
		try {
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
		} catch (IOException e) {
			throw (new Exception(e.getMessage()));
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				throw (new Exception(e.getMessage()));
			}
		}
		return sb.toString();
	}
	
	public static void updateAuthorization(String user, String pwd, HttpRequestBase httpRequest) {

		byte[] credentials = Base64
				.encodeBase64((user + ":" + pwd).getBytes(StandardCharsets.UTF_8));

		httpRequest.setHeader("Authorization", "Basic " + new String(credentials, StandardCharsets.UTF_8));
	}
}
