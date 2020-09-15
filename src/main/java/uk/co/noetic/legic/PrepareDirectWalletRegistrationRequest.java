
package uk.co.noetic.legic;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "walletId",
    "publicSEId"
})
public class PrepareDirectWalletRegistrationRequest {

    @JsonProperty("walletId")
    private String walletId;
    @JsonProperty("publicSEId")
    private String publicSEId;

    @JsonProperty("walletId")
    public String getWalletId() {
        return walletId;
    }

    @JsonProperty("walletId")
    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    @JsonProperty("publicSEId")
    public String getPublicSEId() {
        return publicSEId;
    }

    @JsonProperty("publicSEId")
    public void setPublicSEId(String publicSEId) {
        this.publicSEId = publicSEId;
    }

}
