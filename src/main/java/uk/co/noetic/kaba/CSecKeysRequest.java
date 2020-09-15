
package uk.co.noetic.kaba;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CSecKeysRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CSecKeysRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductLine" type="{http://tempuri.org}eKabaProductLine"/>
 *         &lt;element name="KeyDeviceUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFIDEncodingType" type="{http://tempuri.org}eRFIDEncodingTypes"/>
 *         &lt;element name="SecKeysRightsBuffer" type="{http://tempuri.org}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CSecKeysRequest", propOrder = {
    "productLine",
    "keyDeviceUID",
    "rfidEncodingType",
    "secKeysRightsBuffer"
})
public class CSecKeysRequest {

    @XmlElement(name = "ProductLine", required = true)
    protected EKabaProductLine productLine;
    @XmlElement(name = "KeyDeviceUID")
    protected String keyDeviceUID;
    @XmlElement(name = "RFIDEncodingType", required = true)
    protected ERFIDEncodingTypes rfidEncodingType;
    @XmlElement(name = "SecKeysRightsBuffer")
    protected ArrayOfString secKeysRightsBuffer;

    /**
     * Gets the value of the productLine property.
     * 
     * @return
     *     possible object is
     *     {@link EKabaProductLine }
     *     
     */
    public EKabaProductLine getProductLine() {
        return productLine;
    }

    /**
     * Sets the value of the productLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link EKabaProductLine }
     *     
     */
    public void setProductLine(EKabaProductLine value) {
        this.productLine = value;
    }

    /**
     * Gets the value of the keyDeviceUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyDeviceUID() {
        return keyDeviceUID;
    }

    /**
     * Sets the value of the keyDeviceUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyDeviceUID(String value) {
        this.keyDeviceUID = value;
    }

    /**
     * Gets the value of the rfidEncodingType property.
     * 
     * @return
     *     possible object is
     *     {@link ERFIDEncodingTypes }
     *     
     */
    public ERFIDEncodingTypes getRFIDEncodingType() {
        return rfidEncodingType;
    }

    /**
     * Sets the value of the rfidEncodingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ERFIDEncodingTypes }
     *     
     */
    public void setRFIDEncodingType(ERFIDEncodingTypes value) {
        this.rfidEncodingType = value;
    }

    /**
     * Gets the value of the secKeysRightsBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getSecKeysRightsBuffer() {
        return secKeysRightsBuffer;
    }

    /**
     * Sets the value of the secKeysRightsBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setSecKeysRightsBuffer(ArrayOfString value) {
        this.secKeysRightsBuffer = value;
    }

}
