
package uk.co.noetic.legic;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "prepareDirectWalletRegistrationRequest"
})
public class WalletRegistrationRequestWrapper {

    @JsonProperty("prepareDirectWalletRegistrationRequest")
    private PrepareDirectWalletRegistrationRequest prepareDirectWalletRegistrationRequest;

    @JsonProperty("prepareDirectWalletRegistrationRequest")
    public PrepareDirectWalletRegistrationRequest getPrepareDirectWalletRegistrationRequest() {
        return prepareDirectWalletRegistrationRequest;
    }

    @JsonProperty("prepareDirectWalletRegistrationRequest")
    public void setPrepareDirectWalletRegistrationRequest(PrepareDirectWalletRegistrationRequest prepareDirectWalletRegistrationRequest) {
        this.prepareDirectWalletRegistrationRequest = prepareDirectWalletRegistrationRequest;
    }

}
