
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
 *         &lt;element name="UnRegisterStaffResult" type="{http://tempuri.org}CMessengerGuestCreateResponse" minOccurs="0"/>
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
    "unRegisterStaffResult"
})
@XmlRootElement(name = "UnRegisterStaffResponse")
public class UnRegisterStaffResponse {

    @XmlElement(name = "UnRegisterStaffResult")
    protected CMessengerGuestCreateResponse unRegisterStaffResult;

    /**
     * Gets the value of the unRegisterStaffResult property.
     * 
     * @return
     *     possible object is
     *     {@link CMessengerGuestCreateResponse }
     *     
     */
    public CMessengerGuestCreateResponse getUnRegisterStaffResult() {
        return unRegisterStaffResult;
    }

    /**
     * Sets the value of the unRegisterStaffResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CMessengerGuestCreateResponse }
     *     
     */
    public void setUnRegisterStaffResult(CMessengerGuestCreateResponse value) {
        this.unRegisterStaffResult = value;
    }

}
