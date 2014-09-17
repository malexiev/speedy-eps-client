
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paramFilterCountry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paramFilterCountry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isoAlpha2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isoAlpha3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instances of this class are used as a parameter to filter Speedy web service country query
 * 
 * @since 2.5.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramFilterCountry", propOrder = {
    "countryId",
    "isoAlpha2",
    "isoAlpha3",
    "name",
    "searchString"
})
public class ParamFilterCountry {

	/**
	 * Country id
	 */
    protected Long countryId;
    
    /**
     * ISO alpha2 country code
     */
    protected String isoAlpha2;
    
    /**
     * ISO alhpa 3 country code
     */
    protected String isoAlpha3;
    
    /**
     * Country name
     */
    protected String name;
    
    /**
     * Search string
     */
    protected String searchString;

    /**
     * Gets the country id
     * @return Country Id
     */
    public Long getCountryId() {
        return countryId;
    }

    /**
     * Sets the country id
     * @param countryId Country id
     */
    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    /**
     * Gets the ISO alpha2 code
     * @return ISO alpha2 code
     */
    public String getIsoAlpha2() {
        return isoAlpha2;
    }

    /**
     * Sets the ISO alpha2 code
     * @param isoAlpha2 ISO alpha2 code
     */
    public void setIsoAlpha2(String isoAlpha2) {
        this.isoAlpha2 = isoAlpha2;
    }

    /**
     * Gets the ISO alpha3 code
     * @return ISO alpha3 code
     */
    public String getIsoAlpha3() {
        return isoAlpha3;
    }

    /**
     * Sets the ISO alpha3 code
     * @param isoAlpha3 ISO alpha3 code
     */
    public void setIsoAlpha3(String isoAlpha3) {
        this.isoAlpha3 = isoAlpha3;
    }

    /**
     * Gets the country name
     * @return Country name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the country name
     * @param name Country name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the search string
     * @return Search string
     */
    public String getSearchString() {
        return searchString;
    }

    /**
     * Sets the search string
     * @param searchString Search string
     */
    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

}
