
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
 *         &lt;element name="DummyResponse" type="{http://tempuri.org}CMessengerResponse" minOccurs="0"/>
 *         &lt;element name="DummyFault" type="{http://tempuri.org}Fault" minOccurs="0"/>
 *         &lt;element name="aReason" type="{http://tempuri.org}eMainFaultReasons"/>
 *         &lt;element name="aDetailReason" type="{http://tempuri.org}eDetailEncoderFaultReasons"/>
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
    "dummyResponse",
    "dummyFault",
    "aReason",
    "aDetailReason"
})
@XmlRootElement(name = "PublishResponseComplexTypes")
public class PublishResponseComplexTypes {

    @XmlElement(name = "DummyResponse")
    protected CMessengerResponse dummyResponse;
    @XmlElement(name = "DummyFault")
    protected Fault dummyFault;
    @XmlElement(required = true)
    protected EMainFaultReasons aReason;
    @XmlElement(required = true)
    protected EDetailEncoderFaultReasons aDetailReason;

    /**
     * Gets the value of the dummyResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CMessengerResponse }
     *     
     */
    public CMessengerResponse getDummyResponse() {
        return dummyResponse;
    }

    /**
     * Sets the value of the dummyResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CMessengerResponse }
     *     
     */
    public void setDummyResponse(CMessengerResponse value) {
        this.dummyResponse = value;
    }

    /**
     * Gets the value of the dummyFault property.
     * 
     * @return
     *     possible object is
     *     {@link Fault }
     *     
     */
    public Fault getDummyFault() {
        return dummyFault;
    }

    /**
     * Sets the value of the dummyFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fault }
     *     
     */
    public void setDummyFault(Fault value) {
        this.dummyFault = value;
    }

    /**
     * Gets the value of the aReason property.
     * 
     * @return
     *     possible object is
     *     {@link EMainFaultReasons }
     *     
     */
    public EMainFaultReasons getAReason() {
        return aReason;
    }

    /**
     * Sets the value of the aReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMainFaultReasons }
     *     
     */
    public void setAReason(EMainFaultReasons value) {
        this.aReason = value;
    }

    /**
     * Gets the value of the aDetailReason property.
     * 
     * @return
     *     possible object is
     *     {@link EDetailEncoderFaultReasons }
     *     
     */
    public EDetailEncoderFaultReasons getADetailReason() {
        return aDetailReason;
    }

    /**
     * Sets the value of the aDetailReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDetailEncoderFaultReasons }
     *     
     */
    public void setADetailReason(EDetailEncoderFaultReasons value) {
        this.aDetailReason = value;
    }

}
