
package uk.co.noetic.kaba;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eRFIDEncodingTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eRFIDEncodingTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Legacy"/>
 *     &lt;enumeration value="Type1"/>
 *     &lt;enumeration value="Type2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eRFIDEncodingTypes")
@XmlEnum
public enum ERFIDEncodingTypes {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Legacy")
    LEGACY("Legacy"),
    @XmlEnumValue("Type1")
    TYPE_1("Type1"),
    @XmlEnumValue("Type2")
    TYPE_2("Type2");
    private final String value;

    ERFIDEncodingTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ERFIDEncodingTypes fromValue(String v) {
        for (ERFIDEncodingTypes c: ERFIDEncodingTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
