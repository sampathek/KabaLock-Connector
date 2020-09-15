
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
 *         &lt;element name="PMSTransactionID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ReservationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EncoderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd}MainRoomNo" minOccurs="0"/>
 *         &lt;element name="TransactionStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExternalRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QualifierRef" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="ReturnedMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "pmsTransactionID",
    "reservationID",
    "encoderID",
    "mainRoomNo",
    "transactionStatus",
    "externalRefNo",
    "qualifierRef",
    "returnedMsg"
})
@XmlRootElement(name = "UpdateKeyTransactionStatus")
public class UpdateKeyTransactionStatus {

    @XmlElement(name = "PMSTransactionID")
    protected long pmsTransactionID;
    @XmlElement(name = "ReservationID")
    protected String reservationID;
    @XmlElement(name = "EncoderID")
    protected String encoderID;
    @XmlElement(name = "MainRoomNo", namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd")
    protected String mainRoomNo;
    @XmlElement(name = "TransactionStatus")
    protected int transactionStatus;
    @XmlElement(name = "ExternalRefNo")
    protected String externalRefNo;
    @XmlElement(name = "QualifierRef")
    @XmlSchemaType(name = "unsignedInt")
    protected long qualifierRef;
    @XmlElement(name = "ReturnedMsg")
    protected String returnedMsg;

    /**
     * Gets the value of the pmsTransactionID property.
     * 
     */
    public long getPMSTransactionID() {
        return pmsTransactionID;
    }

    /**
     * Sets the value of the pmsTransactionID property.
     * 
     */
    public void setPMSTransactionID(long value) {
        this.pmsTransactionID = value;
    }

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
     * Gets the value of the transactionStatus property.
     * 
     */
    public int getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the value of the transactionStatus property.
     * 
     */
    public void setTransactionStatus(int value) {
        this.transactionStatus = value;
    }

    /**
     * Gets the value of the externalRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRefNo() {
        return externalRefNo;
    }

    /**
     * Sets the value of the externalRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRefNo(String value) {
        this.externalRefNo = value;
    }

    /**
     * Gets the value of the qualifierRef property.
     * 
     */
    public long getQualifierRef() {
        return qualifierRef;
    }

    /**
     * Sets the value of the qualifierRef property.
     * 
     */
    public void setQualifierRef(long value) {
        this.qualifierRef = value;
    }

    /**
     * Gets the value of the returnedMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnedMsg() {
        return returnedMsg;
    }

    /**
     * Sets the value of the returnedMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnedMsg(String value) {
        this.returnedMsg = value;
    }

}
