
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
 *         &lt;element name="ReservationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PMSTerminalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EncoderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CheckOut" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element ref="{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd}GuestName" minOccurs="0"/>
 *         &lt;element name="MainRoomNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VariableRoomList" type="{http://tempuri.org}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="CommonAreaList" type="{http://tempuri.org}ArrayOfCCommonAreas" minOccurs="0"/>
 *         &lt;element name="TrackIIFolioNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackIGuestNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KeyCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "reservationID",
    "siteName",
    "pmsTerminalID",
    "encoderID",
    "checkIn",
    "checkOut",
    "guestName",
    "mainRoomNo",
    "variableRoomList",
    "commonAreaList",
    "trackIIFolioNo",
    "trackIGuestNo",
    "keyCount",
    "keySize",
    "uid"
})
@XmlRootElement(name = "AddSharedGuest")
public class AddSharedGuest {

    @XmlElement(name = "ReservationID")
    protected String reservationID;
    @XmlElement(name = "SiteName")
    protected String siteName;
    @XmlElement(name = "PMSTerminalID")
    protected String pmsTerminalID;
    @XmlElement(name = "EncoderID")
    protected String encoderID;
    @XmlElement(name = "CheckIn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkIn;
    @XmlElement(name = "CheckOut", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkOut;
    @XmlElement(name = "GuestName", namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd")
    protected String guestName;
    @XmlElement(name = "MainRoomNo")
    protected String mainRoomNo;
    @XmlElement(name = "VariableRoomList")
    protected ArrayOfString variableRoomList;
    @XmlElement(name = "CommonAreaList")
    protected ArrayOfCCommonAreas commonAreaList;
    @XmlElement(name = "TrackIIFolioNo")
    protected String trackIIFolioNo;
    @XmlElement(name = "TrackIGuestNo")
    protected String trackIGuestNo;
    @XmlElement(name = "KeyCount")
    @XmlSchemaType(name = "unsignedInt")
    protected long keyCount;
    @XmlElement(name = "KeySize")
    @XmlSchemaType(name = "unsignedInt")
    protected long keySize;
    @XmlElement(name = "UID")
    protected String uid;

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
     * Gets the value of the variableRoomList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getVariableRoomList() {
        return variableRoomList;
    }

    /**
     * Sets the value of the variableRoomList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setVariableRoomList(ArrayOfString value) {
        this.variableRoomList = value;
    }

    /**
     * Gets the value of the commonAreaList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCCommonAreas }
     *     
     */
    public ArrayOfCCommonAreas getCommonAreaList() {
        return commonAreaList;
    }

    /**
     * Sets the value of the commonAreaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCCommonAreas }
     *     
     */
    public void setCommonAreaList(ArrayOfCCommonAreas value) {
        this.commonAreaList = value;
    }

    /**
     * Gets the value of the trackIIFolioNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackIIFolioNo() {
        return trackIIFolioNo;
    }

    /**
     * Sets the value of the trackIIFolioNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackIIFolioNo(String value) {
        this.trackIIFolioNo = value;
    }

    /**
     * Gets the value of the trackIGuestNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackIGuestNo() {
        return trackIGuestNo;
    }

    /**
     * Sets the value of the trackIGuestNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackIGuestNo(String value) {
        this.trackIGuestNo = value;
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

}
