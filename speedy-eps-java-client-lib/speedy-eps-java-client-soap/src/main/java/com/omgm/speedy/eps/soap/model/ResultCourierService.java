
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultCourierService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultCourierService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allowanceBackDocumentsRequest" type="{http://ver01.eps.speedy.sirma.com/}complementaryServiceAllowance" minOccurs="0"/>
 *         &lt;element name="allowanceBackReceiptRequest" type="{http://ver01.eps.speedy.sirma.com/}complementaryServiceAllowance" minOccurs="0"/>
 *         &lt;element name="allowanceCashOnDelivery" type="{http://ver01.eps.speedy.sirma.com/}complementaryServiceAllowance" minOccurs="0"/>
 *         &lt;element name="allowanceFixedTimeDelivery" type="{http://ver01.eps.speedy.sirma.com/}complementaryServiceAllowance" minOccurs="0"/>
 *         &lt;element name="allowanceInsurance" type="{http://ver01.eps.speedy.sirma.com/}complementaryServiceAllowance" minOccurs="0"/>
 *         &lt;element name="allowanceToBeCalled" type="{http://ver01.eps.speedy.sirma.com/}complementaryServiceAllowance" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instances of this class are returned as a result of Speedy web service calls for services
 * 
 * @since 1.0.0
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultCourierService", propOrder = {
    "allowanceBackDocumentsRequest",
    "allowanceBackReceiptRequest",
    "allowanceCashOnDelivery",
    "allowanceFixedTimeDelivery",
    "allowanceInsurance",
    "allowanceToBeCalled",
    "name",
    "typeId"
})
@XmlSeeAlso({
    ResultCourierServiceExt.class
})
public class ResultCourierService {

    /**
     * Specifies if the complementary service "Return documents" is banned, allowed or required
     */
    protected ComplementaryServiceAllowance allowanceBackDocumentsRequest;
    
    /**
     * Specifies if the complementary service "Return receipt" is banned, allowed or required
     */
    protected ComplementaryServiceAllowance allowanceBackReceiptRequest;
    
    /**
     * Specifies if the complementary service "COD" is banned, allowed or required
     */
    protected ComplementaryServiceAllowance allowanceCashOnDelivery;
    
    /**
     * Specifies if the complementary service "Fixed time for delivery" is banned, allowed or required
     */
    protected ComplementaryServiceAllowance allowanceFixedTimeDelivery;
    
    /**
     * Specifies if the complementary service "Insurance" is banned, allowed or required
     */
    protected ComplementaryServiceAllowance allowanceInsurance;
    
    /**
     * Specifies if the complementary service "To be called" is banned, allowed or required
     */
    protected ComplementaryServiceAllowance allowanceToBeCalled;
    
    /**
     * Courier service name
     */
    protected String name;
    
    /**
     * Courier service type ID
     */
    protected long typeId;

    /**
     * Gets the complementary service "Return documents" allowance
     * @return Complementary service "Return documents" allowance
     */
    public ComplementaryServiceAllowance getAllowanceBackDocumentsRequest() {
        return allowanceBackDocumentsRequest;
    }

    /**
     * Sets the complementary service "Return documents" allowance
     * @param allowanceBackDocumentsRequest Complementary service "Return documents" allowance
     */
    public void setAllowanceBackDocumentsRequest(ComplementaryServiceAllowance allowanceBackDocumentsRequest) {
        this.allowanceBackDocumentsRequest = allowanceBackDocumentsRequest;
    }

    /**
     * Gets the complementary service "Return receipt" allowance
     * @return Complementary service "Return receipt" allowance
     */
    public ComplementaryServiceAllowance getAllowanceBackReceiptRequest() {
        return allowanceBackReceiptRequest;
    }

    /**
     * Sets the complementary service "Return receipt" allowance
     * @param allowanceBackReceiptRequest Complementary service "Return receipt" allowance
     */
    public void setAllowanceBackReceiptRequest(ComplementaryServiceAllowance allowanceBackReceiptRequest) {
        this.allowanceBackReceiptRequest = allowanceBackReceiptRequest;
    }

    /**
     * Gets the complementary service "COD" allowance
     * @return Complementary service "COD" allowance
     */
    public ComplementaryServiceAllowance getAllowanceCashOnDelivery() {
        return allowanceCashOnDelivery;
    }

    /**
     * Sets the complementary service "COD" allowance
     * @param allowanceCashOnDelivery Complementary service "COD" allowance
     */
    public void setAllowanceCashOnDelivery(ComplementaryServiceAllowance allowanceCashOnDelivery) {
        this.allowanceCashOnDelivery = allowanceCashOnDelivery;
    }

    /**
     * Gets the complementary service "Fixed time for delivery" allowance
     * @return Complementary service "Fixed time for delivery" allowance
     */
    public ComplementaryServiceAllowance getAllowanceFixedTimeDelivery() {
        return allowanceFixedTimeDelivery;
    }

    /**
     * Sets the complementary service "Fixed time for delivery" allowance
     * @param allowanceFixedTimeDelivery Complementary service "Fixed time for delivery" allowance
     */
    public void setAllowanceFixedTimeDelivery(ComplementaryServiceAllowance allowanceFixedTimeDelivery) {
        this.allowanceFixedTimeDelivery = allowanceFixedTimeDelivery;
    }

    /**
     * Gets the complementary service "Insurance" allowance
     * @return Complementary service "Insurance" allowance
     */
    public ComplementaryServiceAllowance getAllowanceInsurance() {
        return allowanceInsurance;
    }

    /**
     * Sets the complementary service "Insurance" allowance
     * @param allowanceInsurance Complementary service "Insurance" allowance
     */
    public void setAllowanceInsurance(ComplementaryServiceAllowance allowanceInsurance) {
        this.allowanceInsurance = allowanceInsurance;
    }

    /**
     * Gets the complementary service "To be called" allowance
     * @return Complementary service "To be called" allowance
     */
    public ComplementaryServiceAllowance getAllowanceToBeCalled() {
        return allowanceToBeCalled;
    }

    /**
     * Sets the complementary service "To be called" allowance
     * @param allowanceToBeCalled Complementary service "To be called" allowance
     */
    public void setAllowanceToBeCalled(ComplementaryServiceAllowance allowanceToBeCalled) {
        this.allowanceToBeCalled = allowanceToBeCalled;
    }

    /**
     * Gets the courier service name
     * @return Courier service name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the courier service name
     * @param name Courier service name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets courier service type ID
     * @return Courier service type ID
     */
    public long getTypeId() {
        return typeId;
    }

    /**
     * Sets the courier service type ID
     * @param typeId Courier service type ID
     */
    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }

}
