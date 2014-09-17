
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateAlpha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p> Instances of this class are used in queries for country states
 * 
 * @since 2.5.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultState", propOrder = {
    "countryId",
    "name",
    "stateAlpha",
    "stateId"
})
public class ResultState {

	/**
	 * State country id
	 */
    protected long countryId;
    
    /**
     * Country state name
     */
    protected String name;
    
    /**
     * Country state alpha code
     */
    protected String stateAlpha;
    
    /**
     * Country state id
     */
    protected String stateId;

    /**
     * Gets state country id
     * @return State country id
     */
    public long getCountryId() {
        return countryId;
    }

    /**
     * Sets the state country id
     * @param countryId State country id
     */
    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    /**
     * Gets the country state name
     * @return Country state name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the country state name
     * @param name Country state name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the country state alpha code
     * @return Country state alpha
     */
    public String getStateAlpha() {
        return stateAlpha;
    }

    /**
     * Sets the country state alpha code
     * @param stateAlpha Country state alpha code
     */
    public void setStateAlpha(String stateAlpha) {
        this.stateAlpha = stateAlpha;
    }

    /**
     * Gets the country state id
     * @return Country state id
     */
    public String getStateId() {
        return stateId;
    }

    /**
     * Sets the country state id
     * @param stateId Country state id
     */
    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

}
