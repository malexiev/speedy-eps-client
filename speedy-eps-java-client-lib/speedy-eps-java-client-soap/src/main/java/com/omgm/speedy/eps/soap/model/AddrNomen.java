
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
 * <p>Enumeration to determine whether speedy address nomenclature is full, partial or missing for certain sites
 * 
 * @since 1.0.0
 */
@XmlType(name = "addrNomen")
@XmlEnum
public enum AddrNomen {

	/**
     * Speedy has no address nomenclature (streets, quarters etc.) for the site.
     */
    NO,
    
    /**
     * Speedy has full address nomenclature (streets, quarters etc.) for the site.
     */    
    FULL,
    
    /**
     * Speedy has partial address nomenclature (streets, quarters etc.) for this site.
     */
    PARTIAL;

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
    public static AddrNomen fromValue(String v) {
        return valueOf(v);
    }
}
