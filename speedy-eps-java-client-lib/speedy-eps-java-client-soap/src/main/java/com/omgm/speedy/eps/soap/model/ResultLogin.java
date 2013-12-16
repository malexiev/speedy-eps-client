
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultLogin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultLogin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instances of this class are returned as a result of login Speedy web service method calls
 * 
 * @since 1.0.0
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultLogin", propOrder = {
    "clientId",
    "sessionId"
})
public class ResultLogin {

	/**
     * The logged client's ID (in Speedy's nomenclature).
     */
    protected long clientId;
    
    /**
     * The session ID to be used as a parameter in subsequent method calls.
     */
    protected String sessionId;

    /**
     * Gets logged client's id (in Speedy's nomenclature)
     * @return Logged client's id
     */
    public long getClientId() {
        return clientId;
    }

    /**
     * Sets the logged client's id (in Speedy's nomenclature)
     * @param clientId Logged client's id
     */
    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    /**
     * Gets the session id to be used as a parameter in subsequent method calls
     * @return Session id to be used as a parameter in subsequent method calls
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the session id to be used as a parameter in subsequent method calls
     * @param sessionId Session id to be used as a parameter in subsequent method calls
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

}
