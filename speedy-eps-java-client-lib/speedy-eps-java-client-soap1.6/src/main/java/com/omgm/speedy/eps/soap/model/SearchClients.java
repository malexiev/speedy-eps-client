
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchClients complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchClients">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientQuery" type="{http://ver01.eps.speedy.sirma.com/}paramClientSearch" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchClients", propOrder = {
    "sessionId",
    "clientQuery"
})
public class SearchClients {

    protected String sessionId;
    protected ParamClientSearch clientQuery;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the clientQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ParamClientSearch }
     *     
     */
    public ParamClientSearch getClientQuery() {
        return clientQuery;
    }

    /**
     * Sets the value of the clientQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamClientSearch }
     *     
     */
    public void setClientQuery(ParamClientSearch value) {
        this.clientQuery = value;
    }

}
