
package uk.co.noetic.kaba;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetMobileTransactionHistoryResult" type="{http://tempuri.org}MobileTransactionHistory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getMobileTransactionHistoryResult"
})
@XmlRootElement(name = "GetMobileTransactionHistoryResponse")
public class GetMobileTransactionHistoryResponse {

    @XmlElement(name = "GetMobileTransactionHistoryResult")
    protected MobileTransactionHistory getMobileTransactionHistoryResult;

    /**
     * Gets the value of the getMobileTransactionHistoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link MobileTransactionHistory }
     *     
     */
    public MobileTransactionHistory getGetMobileTransactionHistoryResult() {
        return getMobileTransactionHistoryResult;
    }

    /**
     * Sets the value of the getMobileTransactionHistoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileTransactionHistory }
     *     
     */
    public void setGetMobileTransactionHistoryResult(MobileTransactionHistory value) {
        this.getMobileTransactionHistoryResult = value;
    }

}
