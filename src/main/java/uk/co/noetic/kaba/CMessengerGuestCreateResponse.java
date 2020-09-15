
package uk.co.noetic.kaba;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CMessengerGuestCreateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CMessengerGuestCreateResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org}CMessengerBaseResponse">
 *       &lt;sequence>
 *         &lt;element name="retPMSTransactionNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CMessengerGuestCreateResponse", propOrder = {
    "retPMSTransactionNo"
})
public class CMessengerGuestCreateResponse
    extends CMessengerBaseResponse
{

    protected long retPMSTransactionNo;

    /**
     * Gets the value of the retPMSTransactionNo property.
     * 
     */
    public long getRetPMSTransactionNo() {
        return retPMSTransactionNo;
    }

    /**
     * Sets the value of the retPMSTransactionNo property.
     * 
     */
    public void setRetPMSTransactionNo(long value) {
        this.retPMSTransactionNo = value;
    }

}
