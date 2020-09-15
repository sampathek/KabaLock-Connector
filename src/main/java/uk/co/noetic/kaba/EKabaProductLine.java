
package uk.co.noetic.kaba;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eKabaProductLine.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eKabaProductLine">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Atlas"/>
 *     &lt;enumeration value="Saflok"/>
 *     &lt;enumeration value="Eplex"/>
 *     &lt;enumeration value="Oracode"/>
 *     &lt;enumeration value="MultiHousing"/>
 *     &lt;enumeration value="eDATA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eKabaProductLine")
@XmlEnum
public enum EKabaProductLine {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Atlas")
    ATLAS("Atlas"),
    @XmlEnumValue("Saflok")
    SAFLOK("Saflok"),
    @XmlEnumValue("Eplex")
    EPLEX("Eplex"),
    @XmlEnumValue("Oracode")
    ORACODE("Oracode"),
    @XmlEnumValue("MultiHousing")
    MULTI_HOUSING("MultiHousing"),
    @XmlEnumValue("eDATA")
    E_DATA("eDATA");
    private final String value;

    EKabaProductLine(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EKabaProductLine fromValue(String v) {
        for (EKabaProductLine c: EKabaProductLine.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
