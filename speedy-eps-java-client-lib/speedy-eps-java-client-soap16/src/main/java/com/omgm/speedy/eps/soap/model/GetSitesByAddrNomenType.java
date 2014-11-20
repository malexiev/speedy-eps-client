
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSitesByAddrNomenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSitesByAddrNomenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addrNomen" type="{http://ver01.eps.speedy.sirma.com/}addrNomen" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSitesByAddrNomenType", propOrder = {
    "sessionId",
    "addrNomen"
})
public class GetSitesByAddrNomenType {

    protected String sessionId;
    protected AddrNomen addrNomen;

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
     * Gets the value of the addrNomen property.
     * 
     * @return
     *     possible object is
     *     {@link AddrNomen }
     *     
     */
    public AddrNomen getAddrNomen() {
        return addrNomen;
    }

    /**
     * Sets the value of the addrNomen property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrNomen }
     *     
     */
    public void setAddrNomen(AddrNomen value) {
        this.addrNomen = value;
    }

}
