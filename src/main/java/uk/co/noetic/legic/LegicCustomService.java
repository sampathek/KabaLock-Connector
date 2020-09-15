/**
 * 
 */
package uk.co.noetic.legic;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import uk.co.noetic.util.KabaConfigEnum;
import uk.co.noetic.util.KabaConfigUtils;
import uk.co.noetic.util.KabaUtil;

/**
 * @author Sampath Ekanayake created on Oct 26, 2017
 *
 */
public class LegicCustomService {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(LegicCustomService.class);
	
	private String targetEnv;
	
	private ObjectMapper mapper = new ObjectMapper().configure(JsonParser.Feature.ALLOW_COMMENTS, true);
	
	private HttpClient httpClient = HttpClientBuilder.create().build();
	
	public LegicCustomService() {
	}
	
	public LegicCustomService(String targetEnv) {
		this.targetEnv = KabaUtil.getTargetEnv(targetEnv);
	}

	public PrepareDirectWalletRegistrationResponse prepareLEGICRgistration(PrepareDirectWalletRegistrationRequest walletRegRequest) {
		
		PrepareDirectWalletRegistrationResponse walletRegistrationResponse = null;
		
        StringBuffer stringRequest = new StringBuffer(KabaConfigUtils.getPropValue(KabaConfigEnum.WS_ENDPOINT, "legic", targetEnv)+"/PrepareDirectWalletRegistration");
        HttpPost httpRequest = new HttpPost(stringRequest.toString());
        LOGGER.info("RequestURL to Legic registration : {}", stringRequest.toString());
        
        httpRequest.setHeader("Content-Type", "application/json");
        KabaUtil.updateAuthorization(KabaConfigUtils.getPropValue(KabaConfigEnum.USER_NAME, "legic", targetEnv),KabaConfigUtils.getPropValue(KabaConfigEnum.PASSWORD, "legic", targetEnv),httpRequest);
		
        WalletRegistrationRequestWrapper walletRegReqWrapper = new WalletRegistrationRequestWrapper();
        
        walletRegReqWrapper.setPrepareDirectWalletRegistrationRequest(walletRegRequest);
        
        try {
			String jsonString = mapper.writeValueAsString(walletRegReqWrapper);
			LOGGER.info("HttpJSONRequest for LEGIC wallet registration : {}", jsonString);
			
			httpRequest.setEntity(new StringEntity(jsonString, StandardCharsets.UTF_8));

			HttpResponse httpResponse = httpClient.execute(httpRequest);
			
			jsonString = KabaUtil.convertStreamToString(httpResponse.getEntity().getContent());

			LOGGER.info("HttpJSONResponse for LEGIC wallet registration : {}", jsonString);

			WalletRegistrationResponseWrapper responseWrapper = mapper.readValue(jsonString, WalletRegistrationResponseWrapper.class);
			
			walletRegistrationResponse = responseWrapper.getPrepareDirectWalletRegistrationResponse();
			
			 
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
        
        return walletRegistrationResponse;
		
	}
}
