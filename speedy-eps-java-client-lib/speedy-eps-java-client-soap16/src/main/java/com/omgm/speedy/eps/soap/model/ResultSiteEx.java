
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultSiteEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultSiteEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exactMatch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="site" type="{http://ver01.eps.speedy.sirma.com/}resultSite" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultSiteEx", propOrder = {
    "exactMatch",
    "site"
})
public class ResultSiteEx {

    protected boolean exactMatch;
    protected ResultSite site;

    /**
     * Gets the value of the exactMatch property.
     * 
     */
    public boolean isExactMatch() {
        return exactMatch;
    }

    /**
     * Sets the value of the exactMatch property.
     * 
     */
    public void setExactMatch(boolean value) {
        this.exactMatch = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link ResultSite }
     *     
     */
    public ResultSite getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultSite }
     *     
     */
    public void setSite(ResultSite value) {
        this.site = value;
    }

}
