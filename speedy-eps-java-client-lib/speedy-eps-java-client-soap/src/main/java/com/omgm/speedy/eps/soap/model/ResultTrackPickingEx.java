
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for resultTrackPickingEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultTrackPickingEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consignee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moment" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="operationCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="operationComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="redirectBillOfLading" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="returnBillOfLading" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="siteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instances of this class are returned as a result of extended track picking web service calls
 * 
 * @since 1.1.0
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultTrackPickingEx", propOrder = {
    "consignee",
    "moment",
    "operationCode",
    "operationComment",
    "operationDescription",
    "redirectBillOfLading",
    "returnBillOfLading",
    "siteName",
    "siteType"
})
public class ResultTrackPickingEx {

	/**
     * The name of the person who received the shipment
     */
    protected String consignee;
    
    /**
     * Date and time
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar moment;
    
    /**
     * Operation code
     */
    protected int operationCode;
    
    /**
     * Additional note/comment
     */
    protected String operationComment;
    
    /**
     * Text description of the operation
     */
    protected String operationDescription;
    
    /**
     * Redirecting bill of lading
     */
    protected long redirectBillOfLading;
    
    /**
     * Returning bill of lading
     */
    protected long returnBillOfLading;
    
    /**
     * Site name
     */
    protected String siteName;

    /**
     * Site type
     */
    protected String siteType;

    /**
     * Gets the name of the person who received the shipment
     * @return The name of the person who received the shipment
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * Sets the name of the person who received the shipment
     * @param consignee The name of the person who received the shipment
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    /**
     * Gets the datetime of event
     * @return Datetime of event
     */
    public XMLGregorianCalendar getMoment() {
        return moment;
    }

    /**
     * Sets the datetime of event
     * @param moment Datetime of event
     */
    public void setMoment(XMLGregorianCalendar moment) {
        this.moment = moment;
    }

    /**
     * Gets the operation code
     * @return Operation code
     */
    public int getOperationCode() {
        return operationCode;
    }

    /**
     * Sets the operation code
     * @param operationCode Operation code
     */
    public void setOperationCode(int operationCode) {
        this.operationCode = operationCode;
    }

    /**
     * Gets the operation comment
     * @return Operation comment
     */
    public String getOperationComment() {
        return operationComment;
    }

    /**
     * Sets the operation comment
     * @param operationComment Operation comment
     */
    public void setOperationComment(String operationComment) {
        this.operationComment = operationComment;
    }

    /**
     * Gets the operation description
     * @return Operation description
     */
    public String getOperationDescription() {
        return operationDescription;
    }

    /**
     * Sets the operation description
     * @param operationDescription Operation description
     */
    public void setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
    }

    /**
     * Gets the redirect bill of lading
     * @return Redirect bill of lading
     */
    public long getRedirectBillOfLading() {
        return redirectBillOfLading;
    }

    /**
     * Sets the redirect bill of lading
     * @param redirectBillOfLading Redirect bill of lading
     */
    public void setRedirectBillOfLading(long redirectBillOfLading) {
        this.redirectBillOfLading = redirectBillOfLading;
    }

    /**
     * Gets the return bill of lading
     * @return Return bill of lading
     */
    public long getReturnBillOfLading() {
        return returnBillOfLading;
    }

    /**
     * Sets the return bill of lading
     * @param returnBillOfLading Return bill of lading
     */
    public void setReturnBillOfLading(long returnBillOfLading) {
        this.returnBillOfLading = returnBillOfLading;
    }

    /**
     * Gets the site name
     * @return Site name
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * Sets the site name
     * @param siteName Site name
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    /**
     * Gets the site type
     * @return Site type
     */
    public String getSiteType() {
        return siteType;
    }

    /**
     * Sets the site type
     * @param siteType Site type
     */
    public void setSiteType(String siteType) {
        this.siteType = siteType;
    }

}
