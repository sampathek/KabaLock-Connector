
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
 *         &lt;element name="SendKey2StaffMobileDeviceResult" type="{http://tempuri.org}CMessengerGuestCreateResponse" minOccurs="0"/>
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
    "sendKey2StaffMobileDeviceResult"
})
@XmlRootElement(name = "SendKey2StaffMobileDeviceResponse")
public class SendKey2StaffMobileDeviceResponse {

    @XmlElement(name = "SendKey2StaffMobileDeviceResult")
    protected CMessengerGuestCreateResponse sendKey2StaffMobileDeviceResult;

    /**
     * Gets the value of the sendKey2StaffMobileDeviceResult property.
     * 
     * @return
     *     possible object is
     *     {@link CMessengerGuestCreateResponse }
     *     
     */
    public CMessengerGuestCreateResponse getSendKey2StaffMobileDeviceResult() {
        return sendKey2StaffMobileDeviceResult;
    }

    /**
     * Sets the value of the sendKey2StaffMobileDeviceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CMessengerGuestCreateResponse }
     *     
     */
    public void setSendKey2StaffMobileDeviceResult(CMessengerGuestCreateResponse value) {
        this.sendKey2StaffMobileDeviceResult = value;
    }

}
