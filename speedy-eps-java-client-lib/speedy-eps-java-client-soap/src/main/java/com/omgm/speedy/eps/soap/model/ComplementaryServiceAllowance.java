
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for complementaryServiceAllowance.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="complementaryServiceAllowance">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BANNED"/>
 *     &lt;enumeration value="ALLOWED"/>
 *     &lt;enumeration value="REQUIRED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * <p>Enumeration to determine whether complementary services are banned, allowed or required for particular service
 * 
 * @since 1.0.0
 */
@XmlType(name = "complementaryServiceAllowance")
@XmlEnum
public enum ComplementaryServiceAllowance {

	/**
     * The complementary service is not allowed.
     */
    BANNED,
    
    /**
     * The complementary service is allowed (but not required).
     */
    ALLOWED,
    
    /**
     * The complementary service is required.
     */
    REQUIRED;

    /**
     * Get enumeration name as value
     * @return Enumeration name
     */
    public String value() {
        return name();
    }

    /**
     * Get enum instance from string
     * @param v String value
     * @return Enum instance
     */
    public static ComplementaryServiceAllowance fromValue(String v) {
        return valueOf(v);
    }

}
