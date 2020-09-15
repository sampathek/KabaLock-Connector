package uk.co.noetic.util;


public enum KabaConfigEnum {
	
	WS_ENDPOINT("WS_ENDPOINT"), 
	USER_NAME("USER_NAME"), 
	PASSWORD("PASSWORD"),
	LEGIC_WALLET_ID("LEGIC_WALLET_ID");

	String abbriviation;

	KabaConfigEnum(String arg0) {
		abbriviation = arg0;
	}

	public String getAbbrivation() {
		return abbriviation;
	}	
}
