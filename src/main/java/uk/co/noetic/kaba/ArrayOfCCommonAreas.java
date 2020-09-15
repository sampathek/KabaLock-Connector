
package uk.co.noetic.kaba;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCCommonAreas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCCommonAreas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CCommonAreas" type="{http://tempuri.org}CCommonAreas" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCCommonAreas", propOrder = {
    "cCommonAreas"
})
public class ArrayOfCCommonAreas {

    @XmlElement(name = "CCommonAreas", nillable = true)
    protected List<CCommonAreas> cCommonAreas;

    /**
     * Gets the value of the cCommonAreas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cCommonAreas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCCommonAreas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCommonAreas }
     * 
     * 
     */
    public List<CCommonAreas> getCCommonAreas() {
        if (cCommonAreas == null) {
            cCommonAreas = new ArrayList<CCommonAreas>();
        }
        return this.cCommonAreas;
    }

}
