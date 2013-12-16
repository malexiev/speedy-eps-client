
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paramClientSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paramClientSearch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="clientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userDefTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Used to define search criteria for clients
 * 
 * @since 1.6.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramClientSearch", propOrder = {
    "clientId",
    "clientName",
    "objectName",
    "phone",
    "siteId",
    "userDefTag"
})
public class ParamClientSearch {

	/**
     * Client id
     * MANDATORY: NO
     */
    protected Long clientId;
    
    /**
     * Client name
     * MANDATORY: NO
     */
    protected String clientName;
    
    /**
     * Common object name
     * MANDATORY: NO
     */
    protected String objectName;
    
    /**
     * Client phone
     * MANDATORY: NO
     */
    protected String phone;
    
    /**
     * Site id
     * MANDATORY: NO
     */
    protected Long siteId;
    
    /**
     * User def tag
     * MANDATORY: NO
     */
    protected String userDefTag;

    /**
     * Gets the client id
     * @return Client id
     */
    public Long getClientId() {
        return clientId;
    }

    /**
     * Sets the client id
     * @param clientId Client id
     */
    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    /**
     * Gets the client name
     * @return Client name
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the client name
     * @param clientName Client name
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * Gets the common object name
     * @return Common object name
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * Sets the common object name
     * @param objectName Common object name
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    /**
     * Gets the client phone.
     * @return Client phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the client phone
     * @param phone Client phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets the site id
     * @return Site id
     */
    public Long getSiteId() {
        return siteId;
    }

    /**
     * Sets the site id
     * @param siteId Site id
     */
    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    /**
     * Gets the user def tag
     * @return User def tag
     */
    public String getUserDefTag() {
        return userDefTag;
    }

    /**
     * Sets the user def tag
     * @param userDefTag User def tag
     */
    public void setUserDefTag(String userDefTag) {
        this.userDefTag = userDefTag;
    }

}
