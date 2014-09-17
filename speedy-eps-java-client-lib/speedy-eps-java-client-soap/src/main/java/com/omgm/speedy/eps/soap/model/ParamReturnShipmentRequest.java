
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paramReturnShipmentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paramReturnShipmentRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amountInsuranceBase" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="fragile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="parcelsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="serviceTypeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p> This class is used to provide details for return shipment
 * 
 * @since 2.5.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramReturnShipmentRequest", propOrder = {
    "amountInsuranceBase",
    "fragile",
    "parcelsCount",
    "serviceTypeId"
})
public class ParamReturnShipmentRequest {

	/**
	 * Insurance base amount
	 * MANDATORY: NO
	 */
    protected Double amountInsuranceBase;
    
    /**
     * Fragile flag
     * MANDATORY: NO
     */
    protected Boolean fragile;
    
    /**
     * Number of parcels
     * MANDATORY: YES
     */
    protected int parcelsCount;
    
    /**
     * Service type id
     * MANDATORY: YES
     */
    protected long serviceTypeId;

    /**
     * Gets insurance base amount
     * @return Insurance base amount
     */
    public Double getAmountInsuranceBase() {
        return amountInsuranceBase;
    }

    /**
     * Sets the insurance base amount
     * @param amountInsuranceBase Insurance base amount
     */
    public void setAmountInsuranceBase(Double amountInsuranceBase) {
        this.amountInsuranceBase = amountInsuranceBase;
    }

    /**
     * Gets fragile flag
     * @return Fragile flag
     */
    public Boolean isFragile() {
        return fragile;
    }

    /**
     * Sets fragile flag
     * @param fragile Fragile flag
     */
    public void setFragile(Boolean fragile) {
        this.fragile = fragile;
    }

    /**
     * Gets number of parcels
     * @return Number of parcels
     */
    public int getParcelsCount() {
        return parcelsCount;
    }

    /**
     * Sets the number of parcels
     * @param parcelsCount Number of parcels
     */
    public void setParcelsCount(int parcelsCount) {
        this.parcelsCount = parcelsCount;
    }

    /**
     * Gets service type id
     * @return Service type id
     */
    public long getServiceTypeId() {
        return serviceTypeId;
    }

    /**
     * Sets service type id
     * @param serviceTypeId Service type id
     */
    public void setServiceTypeId(long serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }
}
