
package uk.co.noetic.kaba;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CMessengerResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CMessengerResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org}CMessengerBaseResponse">
 *       &lt;sequence>
 *         &lt;element name="retAccessKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMessengerResponse", propOrder = {
    "retAccessKey"
})
public class CMessengerResponse
    extends CMessengerBaseResponse
{

    protected String retAccessKey;

    /**
     * Gets the value of the retAccessKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetAccessKey() {
        return retAccessKey;
    }

    /**
     * Sets the value of the retAccessKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetAccessKey(String value) {
        this.retAccessKey = value;
    }

}
