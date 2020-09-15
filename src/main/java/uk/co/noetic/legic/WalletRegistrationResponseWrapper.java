
package uk.co.noetic.legic;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.sitemorph.web.request.Request;
import uk.co.noetic.util.MapperFactory;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "prepareDirectWalletRegistrationResponse"
})
public class WalletRegistrationResponseWrapper {

    @JsonProperty("prepareDirectWalletRegistrationResponse")
    private PrepareDirectWalletRegistrationResponse prepareDirectWalletRegistrationResponse;

    @JsonProperty("prepareDirectWalletRegistrationResponse")
    public PrepareDirectWalletRegistrationResponse getPrepareDirectWalletRegistrationResponse() {
        return prepareDirectWalletRegistrationResponse;
    }

    @JsonProperty("prepareDirectWalletRegistrationResponse")
    public void setPrepareDirectWalletRegistrationResponse(PrepareDirectWalletRegistrationResponse prepareDirectWalletRegistrationResponse) {
        this.prepareDirectWalletRegistrationResponse = prepareDirectWalletRegistrationResponse;
    }
    
    @JsonIgnore
    public void render(Request request) throws IOException {
        ObjectMapper mapper = MapperFactory.getMappper();
        mapper.writeValue(request.getWriter(), this);
    }

}
