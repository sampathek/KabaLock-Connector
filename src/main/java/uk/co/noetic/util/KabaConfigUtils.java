package uk.co.noetic.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class KabaConfigUtils {
	private static Logger logger = LoggerFactory.getLogger(KabaConfigUtils.class);
	private static Properties props;

	/**
	 * static code block that load kaba_config.properties file.
	 */
	static {
		props = new Properties();
		try {
			props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("kaba_config.properties"));
		} catch (FileNotFoundException e) {
			logger.error("travelport_config.properties does not found", e);
		} catch (IOException e) {
			logger.error("IOException occured during loding kaba_config.properties", e);
		}
	}

	/**
	 * fetch the property from kaba_config.properties file.
	 * @param prop
	 * @return
	 */
	public static String getPropValue(KabaConfigEnum prop) {
		String prop_value = props.getProperty(prop.getAbbrivation());
		if (prop_value == null)
			logger.error("No property value found for property" + prop);
		return prop_value;
	}

	public static String getPropValue(KabaConfigEnum prop, String vendor, String targetEnv) {
		String prop_value = props.getProperty(vendor + "." + targetEnv + "." + prop.getAbbrivation());
		if (prop_value == null)
			logger.error("No property value found for property: " + vendor + "." + prop);
		return prop_value;
	}
}
