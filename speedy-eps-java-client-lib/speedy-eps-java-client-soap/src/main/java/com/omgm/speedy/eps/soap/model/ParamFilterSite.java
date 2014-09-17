
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paramFilterSite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paramFilterSite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="municipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instances of this class are used as a parameter to filter Speedy web service site query
 * 
 * @since 1.0.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramFilterSite", propOrder = {
	"countryId",
	"municipality",
    "name",
    "postCode",
    "region",
    "searchString",
    "type"
})
public class ParamFilterSite {

	/**
	 * Country id
	 * MANDATORY: NO
	 * @since 2.5.0
	 */
	protected Long countryId;
	
	/**
     * Site municipality name
     * MANDATORY: NO
     */
    protected String municipality;
    
    /**
     * Site name
     * MANDATORY: NO
     */
    protected String name;
    
    /**
     * Post code
     * MANDATORY: NO
     */
    protected String postCode;
    
    /**
     * Site region name
     * MANDATORY: NO
     */
    protected String region;
    
    /**
     * Search string
     * MANDATORY: NO
     * @since 2.5.0
     */
    protected String searchString;
    
    /**
     * Site type
     * MANDATORY: NO
     */
    protected String type;

    /**
     * Get country id
     * @return Country id
     * @since 2.5.0
     */
    public Long getCountryId() {
    	return countryId;
    }
    
    /**
     * Set country id
     * @param countryId Country id
     * @since 2.5.0
     */
    public void setCountryId(Long countryId) {
    	this.countryId = countryId;
    }
    
    /**
     * Gets the site municipality name
     * @return Site municipality name
     */
    public String getMunicipality() {
        return municipality;
    }

    /**
     * Sets the site municipality name
     * @param municipality Site municipality name
     */
    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    /**
     * Gets the site name
     * @return Site name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the site name
     * @param name Site name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the post code
     * @return Post code
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the post code
     * @param postCode Post code
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * Gets the site region name
     * @return Site region name
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the site region name
     * @param region Site region name
     */
    public void setRegion(String region) {
        this.region = region;
    }
    
    /**
     * Get search string
     * @return Search string
     */
    public String getSearchString() {
    	return searchString;
    }
    
    /**
     * Get search string
     * @param searchString Search string
     */
    public void setSearchString(String searchString) {
    	this.searchString = searchString;
    }

    /**
     * Gets the site type
     * @return Site type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the site type
     * @param type Site type
     */
    public void setType(String type) {
        this.type = type;
    }

}
