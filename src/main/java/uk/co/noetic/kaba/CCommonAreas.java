
package uk.co.noetic.kaba;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCommonAreas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCommonAreas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassLevelNo" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="eMode" type="{http://tempuri.org}eCommonAreaSelMode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCommonAreas", propOrder = {
    "passLevelNo",
    "eMode"
})
public class CCommonAreas {

    @XmlElement(name = "PassLevelNo")
    @XmlSchemaType(name = "unsignedInt")
    protected long passLevelNo;
    @XmlElement(required = true)
    protected ECommonAreaSelMode eMode;

    /**
     * Gets the value of the passLevelNo property.
     * 
     */
    public long getPassLevelNo() {
        return passLevelNo;
    }

    /**
     * Sets the value of the passLevelNo property.
     * 
     */
    public void setPassLevelNo(long value) {
        this.passLevelNo = value;
    }

    /**
     * Gets the value of the eMode property.
     * 
     * @return
     *     possible object is
     *     {@link ECommonAreaSelMode }
     *     
     */
    public ECommonAreaSelMode getEMode() {
        return eMode;
    }

    /**
     * Sets the value of the eMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECommonAreaSelMode }
     *     
     */
    public void setEMode(ECommonAreaSelMode value) {
        this.eMode = value;
    }

}
