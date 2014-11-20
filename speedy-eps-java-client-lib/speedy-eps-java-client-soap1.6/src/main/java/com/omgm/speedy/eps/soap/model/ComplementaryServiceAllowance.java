
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
 */
@XmlType(name = "complementaryServiceAllowance")
@XmlEnum
public enum ComplementaryServiceAllowance {

    BANNED,
    ALLOWED,
    REQUIRED;

    public String value() {
        return name();
    }

    public static ComplementaryServiceAllowance fromValue(String v) {
        return valueOf(v);
    }

}
