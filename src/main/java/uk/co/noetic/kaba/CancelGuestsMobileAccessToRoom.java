
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
 *         &lt;element name="SiteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MainRoomNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuestMobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PMSTerminalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "reservationID",
    "mainRoomNo",
    "guestMobileNumber",
    "pmsTerminalID"
})
@XmlRootElement(name = "CancelGuestsMobileAccessToRoom")
public class CancelGuestsMobileAccessToRoom {

    @XmlElement(name = "SiteName")
    protected String siteName;
    @XmlElement(name = "ReservationID")
    protected String reservationID;
    @XmlElement(name = "MainRoomNo")
    protected String mainRoomNo;
    @XmlElement(name = "GuestMobileNumber")
    protected String guestMobileNumber;
    @XmlElement(name = "PMSTerminalID")
    protected String pmsTerminalID;

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
     * Gets the value of the guestMobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestMobileNumber() {
        return guestMobileNumber;
    }

    /**
     * Sets the value of the guestMobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestMobileNumber(String value) {
        this.guestMobileNumber = value;
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

}
