
package uk.co.noetic.kaba;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="SiteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PMSTerminalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EncoderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MainRoomNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CheckOut" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="KeySize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="UID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "siteName",
    "pmsTerminalID",
    "encoderID",
    "mainRoomNo",
    "checkIn",
    "checkOut",
    "keySize",
    "uid"
})
@XmlRootElement(name = "CreateOneShotKey")
public class CreateOneShotKey {

    @XmlElement(name = "SiteName")
    protected String siteName;
    @XmlElement(name = "PMSTerminalID")
    protected String pmsTerminalID;
    @XmlElement(name = "EncoderID")
    protected String encoderID;
    @XmlElement(name = "MainRoomNo")
    protected String mainRoomNo;
    @XmlElement(name = "CheckIn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkIn;
    @XmlElement(name = "CheckOut", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkOut;
    @XmlElement(name = "KeySize")
    @XmlSchemaType(name = "unsignedInt")
    protected long keySize;
    @XmlElement(name = "UID")
    protected String uid;

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
     * Gets the value of the mainRoomNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainRoomNo() {
        return mainRoomNo;
    }

    /**
     * Sets the value of the mainRoomNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainRoomNo(String value) {
        this.mainRoomNo = value;
    }

    /**
     * Gets the value of the checkIn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckIn() {
        return checkIn;
    }

    /**
     * Sets the value of the checkIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckIn(XMLGregorianCalendar value) {
        this.checkIn = value;
    }

    /**
     * Gets the value of the checkOut property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckOut() {
        return checkOut;
    }

    /**
     * Sets the value of the checkOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckOut(XMLGregorianCalendar value) {
        this.checkOut = value;
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

}
