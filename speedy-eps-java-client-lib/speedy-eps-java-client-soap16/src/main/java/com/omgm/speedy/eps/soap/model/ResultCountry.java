
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
 * 
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

    protected String activeCurrencyCode;
    protected long countryId;
    protected String isoAlpha2;
    protected String isoAlpha3;
    protected String name;
    protected String postCodeFormat;
    protected boolean requirePostCode;
    protected boolean requireState;
    protected Integer siteNomen;

    /**
     * Gets the value of the activeCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveCurrencyCode() {
        return activeCurrencyCode;
    }

    /**
     * Sets the value of the activeCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveCurrencyCode(String value) {
        this.activeCurrencyCode = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     */
    public long getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     */
    public void setCountryId(long value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the isoAlpha2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoAlpha2() {
        return isoAlpha2;
    }

    /**
     * Sets the value of the isoAlpha2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoAlpha2(String value) {
        this.isoAlpha2 = value;
    }

    /**
     * Gets the value of the isoAlpha3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoAlpha3() {
        return isoAlpha3;
    }

    /**
     * Sets the value of the isoAlpha3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoAlpha3(String value) {
        this.isoAlpha3 = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the postCodeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCodeFormat() {
        return postCodeFormat;
    }

    /**
     * Sets the value of the postCodeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCodeFormat(String value) {
        this.postCodeFormat = value;
    }

    /**
     * Gets the value of the requirePostCode property.
     * 
     */
    public boolean isRequirePostCode() {
        return requirePostCode;
    }

    /**
     * Sets the value of the requirePostCode property.
     * 
     */
    public void setRequirePostCode(boolean value) {
        this.requirePostCode = value;
    }

    /**
     * Gets the value of the requireState property.
     * 
     */
    public boolean isRequireState() {
        return requireState;
    }

    /**
     * Sets the value of the requireState property.
     * 
     */
    public void setRequireState(boolean value) {
        this.requireState = value;
    }

    /**
     * Gets the value of the siteNomen property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSiteNomen() {
        return siteNomen;
    }

    /**
     * Sets the value of the siteNomen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSiteNomen(Integer value) {
        this.siteNomen = value;
    }

}
