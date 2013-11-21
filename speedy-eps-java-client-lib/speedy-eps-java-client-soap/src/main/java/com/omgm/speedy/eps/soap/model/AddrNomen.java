
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addrNomen.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="addrNomen">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO"/>
 *     &lt;enumeration value="FULL"/>
 *     &lt;enumeration value="PARTIAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "addrNomen")
@XmlEnum
public enum AddrNomen {

    NO,
    FULL,
    PARTIAL;

    public String value() {
        return name();
    }

    public static AddrNomen fromValue(String v) {
        return valueOf(v);
    }

}
