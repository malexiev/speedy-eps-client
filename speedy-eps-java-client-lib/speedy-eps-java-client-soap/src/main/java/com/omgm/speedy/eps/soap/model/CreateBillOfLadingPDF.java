
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createBillOfLadingPDF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createBillOfLadingPDF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billOfLading" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="includeAutoPrintJS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createBillOfLadingPDF", propOrder = {
    "sessionId",
    "billOfLading",
    "includeAutoPrintJS"
})
public class CreateBillOfLadingPDF {

    protected String sessionId;
    protected long billOfLading;
    protected boolean includeAutoPrintJS;

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
     * Gets the value of the billOfLading property.
     * 
     */
    public long getBillOfLading() {
        return billOfLading;
    }

    /**
     * Sets the value of the billOfLading property.
     * 
     */
    public void setBillOfLading(long value) {
        this.billOfLading = value;
    }

    /**
     * Gets the value of the includeAutoPrintJS property.
     * 
     */
    public boolean isIncludeAutoPrintJS() {
        return includeAutoPrintJS;
    }

    /**
     * Sets the value of the includeAutoPrintJS property.
     * 
     */
    public void setIncludeAutoPrintJS(boolean value) {
        this.includeAutoPrintJS = value;
    }

}
