
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
 * <p>Instances of this class are returned as a result of sites speedy web service requests
 * 
 * @since 1.0.0
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultSiteEx", propOrder = {
    "exactMatch",
    "site"
})
public class ResultSiteEx {

	/**
     * Specifies if there is an exact match
     */
    protected boolean exactMatch;
    
    /**
     * Site data
     */
    protected ResultSite site;

    /**
     * Gets the exact match flag value
     * @return Exact match flag value
     */
    public boolean isExactMatch() {
        return exactMatch;
    }

    /**
     * Sets the exact match flag value
     * @param exactMatch Exact match flag value
     */
    public void setExactMatch(boolean exactMatch) {
        this.exactMatch = exactMatch;
    }

    /**
     * Gets the site details
     * @return Site details
     */
    public ResultSite getSite() {
        return site;
    }

    /**
     * Sets the site details
     * @param site Site details
     */
    public void setSite(ResultSite site) {
        this.site = site;
    }

}
