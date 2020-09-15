
package uk.co.noetic.kaba;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eCommonAreaSelMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eCommonAreaSelMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DefaultConfiguredAccess"/>
 *     &lt;enumeration value="GrantAccess"/>
 *     &lt;enumeration value="DenyAccess"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eCommonAreaSelMode")
@XmlEnum
public enum ECommonAreaSelMode {

    @XmlEnumValue("DefaultConfiguredAccess")
    DEFAULT_CONFIGURED_ACCESS("DefaultConfiguredAccess"),
    @XmlEnumValue("GrantAccess")
    GRANT_ACCESS("GrantAccess"),
    @XmlEnumValue("DenyAccess")
    DENY_ACCESS("DenyAccess");
    private final String value;

    ECommonAreaSelMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ECommonAreaSelMode fromValue(String v) {
        for (ECommonAreaSelMode c: ECommonAreaSelMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
