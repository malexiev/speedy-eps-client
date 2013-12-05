
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paramLanguage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="paramLanguage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BG"/>
 *     &lt;enumeration value="EN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * <p>Language enumeration
 * 
 * @since 1.2.0
 */
@XmlType(name = "paramLanguage")
@XmlEnum
public enum ParamLanguage {

	/**
     * Bulgarian language
     */
    BG,
    
    /**
     * Engilish language
     */
    EN;

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
    public static ParamLanguage fromValue(String v) {
        return valueOf(v);
    }

}
