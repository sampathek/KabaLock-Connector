
package uk.co.noetic.kaba;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TransactionStatusHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionStatusHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PMSTransactionNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SystemActivityID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SystemActivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TransactionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionInError" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="GuestInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StaInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionStatusHistory", propOrder = {
    "id",
    "pmsTransactionNo",
    "systemActivityID",
    "systemActivity",
    "responseDateTime",
    "transactionStatus",
    "transactionInError",
    "guestInfo",
    "message",
    "roomNumber",
    "staInfo"
})
public class TransactionStatusHistory {

    @XmlElement(name = "ID")
    protected long id;
    @XmlElement(name = "PMSTransactionNo")
    protected long pmsTransactionNo;
    @XmlElement(name = "SystemActivityID")
    protected int systemActivityID;
    @XmlElement(name = "SystemActivity")
    protected String systemActivity;
    @XmlElement(name = "ResponseDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar responseDateTime;
    @XmlElement(name = "TransactionStatus")
    protected String transactionStatus;
    @XmlElement(name = "TransactionInError")
    protected boolean transactionInError;
    @XmlElement(name = "GuestInfo")
    protected String guestInfo;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "RoomNumber")
    protected String roomNumber;
    @XmlElement(name = "StaInfo")
    protected String staInfo;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the pmsTransactionNo property.
     * 
     */
    public long getPMSTransactionNo() {
        return pmsTransactionNo;
    }

    /**
     * Sets the value of the pmsTransactionNo property.
     * 
     */
    public void setPMSTransactionNo(long value) {
        this.pmsTransactionNo = value;
    }

    /**
     * Gets the value of the systemActivityID property.
     * 
     */
    public int getSystemActivityID() {
        return systemActivityID;
    }

    /**
     * Sets the value of the systemActivityID property.
     * 
     */
    public void setSystemActivityID(int value) {
        this.systemActivityID = value;
    }

    /**
     * Gets the value of the systemActivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemActivity() {
        return systemActivity;
    }

    /**
     * Sets the value of the systemActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemActivity(String value) {
        this.systemActivity = value;
    }

    /**
     * Gets the value of the responseDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseDateTime() {
        return responseDateTime;
    }

    /**
     * Sets the value of the responseDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseDateTime(XMLGregorianCalendar value) {
        this.responseDateTime = value;
    }

    /**
     * Gets the value of the transactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the value of the transactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatus(String value) {
        this.transactionStatus = value;
    }

    /**
     * Gets the value of the transactionInError property.
     * 
     */
    public boolean isTransactionInError() {
        return transactionInError;
    }

    /**
     * Sets the value of the transactionInError property.
     * 
     */
    public void setTransactionInError(boolean value) {
        this.transactionInError = value;
    }

    /**
     * Gets the value of the guestInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestInfo() {
        return guestInfo;
    }

    /**
     * Sets the value of the guestInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestInfo(String value) {
        this.guestInfo = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the roomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * Sets the value of the roomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomNumber(String value) {
        this.roomNumber = value;
    }

    /**
     * Gets the value of the staInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaInfo() {
        return staInfo;
    }

    /**
     * Sets the value of the staInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaInfo(String value) {
        this.staInfo = value;
    }

}
