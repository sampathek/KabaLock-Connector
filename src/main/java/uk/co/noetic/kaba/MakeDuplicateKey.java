
package uk.co.noetic.kaba;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="ReservationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SiteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PMSTerminalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EncoderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KeyCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="KeySize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="UID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuestName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "reservationID",
    "siteName",
    "pmsTerminalID",
    "encoderID",
    "keyCount",
    "keySize",
    "uid",
    "guestName"
})
@XmlRootElement(name = "MakeDuplicateKey")
public class MakeDuplicateKey {

    @XmlElement(name = "ReservationID", required = true, nillable = true)
    protected String reservationID;
    @XmlElement(name = "SiteName")
    protected String siteName;
    @XmlElement(name = "PMSTerminalID")
    protected String pmsTerminalID;
    @XmlElement(name = "EncoderID")
    protected String encoderID;
    @XmlElement(name = "KeyCount")
    @XmlSchemaType(name = "unsignedInt")
    protected long keyCount;
    @XmlElement(name = "KeySize")
    @XmlSchemaType(name = "unsignedInt")
    protected long keySize;
    @XmlElement(name = "UID")
    protected String uid;
    @XmlElement(name = "GuestName")
    protected String guestName;

    /**
     * Gets the value of the reservationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationID() {
        return reservationID;
    }

    /**
     * Sets the value of the reservationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationID(String value) {
        this.reservationID = value;
    }

    /**
     * Gets the value of the siteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * Sets the value of the siteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteName(String value) {
        this.siteName = value;
    }

    /**
     * Gets the value of the pmsTerminalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMSTerminalID() {
        return pmsTerminalID;
    }

    /**
     * Sets the value of the pmsTerminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMSTerminalID(String value) {
        this.pmsTerminalID = value;
    }

    /**
     * Gets the value of the encoderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoderID() {
        return encoderID;
    }

    /**
     * Sets the value of the encoderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoderID(String value) {
        this.encoderID = value;
    }

    /**
     * Gets the value of the keyCount property.
     * 
     */
    public long getKeyCount() {
        return keyCount;
    }

    /**
     * Sets the value of the keyCount property.
     * 
     */
    public void setKeyCount(long value) {
        this.keyCount = value;
    }

    /**
     * Gets the value of the keySize property.
     * 
     */
    public long getKeySize() {
        return keySize;
    }

    /**
     * Sets the value of the keySize property.
     * 
     */
    public void setKeySize(long value) {
        this.keySize = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUID() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUID(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the guestName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestName() {
        return guestName;
    }

    /**
     * Sets the value of the guestName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestName(String value) {
        this.guestName = value;
    }

}
