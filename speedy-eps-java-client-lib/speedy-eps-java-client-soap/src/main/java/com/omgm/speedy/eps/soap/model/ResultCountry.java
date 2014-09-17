
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultCountry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultCountry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activeCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="isoAlpha2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isoAlpha3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postCodeFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requirePostCode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="requireState" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="siteNomen" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p> Instances of this class are returned in response to country search methods
 * 
 * @since 2.5.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultCountry", propOrder = {
    "activeCurrencyCode",
    "countryId",
    "isoAlpha2",
    "isoAlpha3",
    "name",
    "postCodeFormat",
    "requirePostCode",
    "requireState",
    "siteNomen"
})
public class ResultCountry {

	/**
	 * Active country currency code
	 */
    protected String activeCurrencyCode;
    
    /**
     * Country id
     */
    protected long countryId;
    
    /**
     * Country ISO alpha 2 code
     */
    protected String isoAlpha2;
    
    /**
     * Country ISO alpha 3 code
     */
    protected String isoAlpha3;
    
    /**
     * Country name
     */
    protected String name;
    
    /**
     * Country post code format
     */
    protected String postCodeFormat;
    
    /**
     * Require post code for country addresses flag
     */
    protected boolean requirePostCode;
    
    /**
     * Require state for country addresses flag
     */
    protected boolean requireState;
    
    /**
     * Code for site nomenclature support
     * 0 - No site nomenclature
     * 1 - Site nomenclature is supported for this site 
     */
    protected Integer siteNomen;

    /**
     * Gets country active currency code
     * @return Active currency code for the country
     */
    public String getActiveCurrencyCode() {
        return activeCurrencyCode;
    }

    /**
     * Sets the active currency code for the country
     * @param activeCurrencyCode Active currency code for the country
     */
    public void setActiveCurrencyCode(String activeCurrencyCode) {
        this.activeCurrencyCode = activeCurrencyCode;
    }

    /**
     * Gets the country id
     * @return Country id
     */
    public long getCountryId() {
        return countryId;
    }

    /**
     * Sets country id
     * @param countryId Country id
     */
    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }
    
    /**
     * Gets the country ISO alpha2 code
     * @return Country ISO alpha2 code
     */
    public String getIsoAlpha2() {
        return isoAlpha2;
    }

    /**
     * Sets the country ISO alpha2 code
     * @param isoAlpha2 Country ISO alpha2 code
     */
    public void setIsoAlpha2(String isoAlpha2) {
        this.isoAlpha2 = isoAlpha2;
    }

    /**
     * Gets the country ISO alpha3 code
     * @return Country ISO alpha3 code
     */
    public String getIsoAlpha3() {
        return isoAlpha3;
    }

    /**
     * Sets the country ISO alpha3 code
     * @param isoAlpha3 Country ISO alpha3 code
     */
    public void setIsoAlpha3(String value) {
        this.isoAlpha3 = value;
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
     * Gets the country post code format
     * @return Country post code format
     */
    public String getPostCodeFormat() {
        return postCodeFormat;
    }

    /**
     * Sets the country post code format
     * @param postCodeFormat Country post code format
     */
    public void setPostCodeFormat(String postCodeFormat) {
        this.postCodeFormat = postCodeFormat;
    }

    /**
     * Gets the require post code flag for the country
     * @return Country require post code flag value 
     */
    public boolean isRequirePostCode() {
        return requirePostCode;
    }

    /**
     * Sets the require post code flag value for the country
     * @param requirePostCode Country require post code flag value
     */
    public void setRequirePostCode(boolean requirePostCode) {
        this.requirePostCode = requirePostCode;
    }

    /**
     * Gets the require state flag value for the country
     * @return Country require state flag value
     */
    public boolean isRequireState() {
        return requireState;
    }

    /**
     * Sets the require state flag value for the country
     * @param requireState Require state flag value for the country
     */
    public void setRequireState(boolean requireState) {
        this.requireState = requireState;
    }

    /**
     * Gets the code for site nomenclature support for the country
     * @return Code for site nomenclature support for the country
     *   0 - No site nomenclature
     *   1 - Has full site nomenclature
     */
    public Integer getSiteNomen() {
        return siteNomen;
    }

    /**
     * Sets the code for site nomenclature support for the country
     * @param siteNomen Code for site nomenclature support for the country
     *   0 - No site nomenclature
     *   1 - Has full site nomenclature
     */
    public void setSiteNomen(Integer siteNomen) {
        this.siteNomen = siteNomen;
    }

}
