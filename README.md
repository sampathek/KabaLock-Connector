# Kaba Connector Interface

### SOAP/REST base interface to communicate with Kaba/Legic web services


KabaTest class contains simple tests for Kaba SOAP based web service related operations and tests for Legic REST based web service operations. 

Endpoint, Username, Password configurations for both Kaba & Legic are in: /src/main/resources/kaba_config.properties

Auto generated classes using Apache-CXF wsdl2java command are in uk.co.noetic.kaba package. 

WSDL used to generate JAXB java classes are in: /src/main/resources/MessengerPMSService_1.wsdl

Use the following command to regenerate the JAXB java classes:
	
	wsdl2java -p uk.co.noetic.kaba -d <output_dir> -client -impl -exsh false -dns true -dex true -verbose /src/main/resources/MessengerPMSService_1.wsdl
	

### Note:
If you regenerate the JAXB java classes, make sure to overwrite getMessengerPMSWSServiceSoap() in MessengerPMSWSService class with the following:

    @WebEndpoint(name = "MessengerPMSWSServiceSoap")
    public MessengerPMSWSServiceSoap getMessengerPMSWSServiceSoap() {
    	MessengerPMSWSServiceSoap port = super.getPort(MessengerPMSWSServiceSoap, MessengerPMSWSServiceSoap.class);
    	BindingProvider provider=(BindingProvider) port;
    	
		provider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, 
				KabaConfigUtils.getPropValue(KabaConfigEnum.WS_ENDPOINT, "kaba")+"?wsdl");
    	
    	List<Handler> handlerChain = provider.getBinding().getHandlerChain();
    	handlerChain.add(new HeaderHandler());
    	handlerChain.add(new SOAPLoggingHandler());
    	provider.getBinding().setHandlerChain(handlerChain);
      
      return port;
    	
    }	


