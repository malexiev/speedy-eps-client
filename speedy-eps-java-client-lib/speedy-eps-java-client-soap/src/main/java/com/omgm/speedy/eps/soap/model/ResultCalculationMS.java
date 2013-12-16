
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultCalculationMS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultCalculationMS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultInfo" type="{http://ver01.eps.speedy.sirma.com/}resultCalculation" minOccurs="0"/>
 *         &lt;element name="serviceTypeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instances of this class are returned as a result of calculation Speedy web service requestst for multiple services
 * 
 * @since 1.0.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultCalculationMS", propOrder = {
    "errorDescription",
    "resultInfo",
    "serviceTypeId"
})
public class ResultCalculationMS {

	/**
     * Validation error during calculation attempt
     */
    protected String errorDescription;
    
    /**
     * The result of calculation (in case no error has occurred)
     */
    protected ResultCalculation resultInfo;
    
    /**
     * Courier service type id
     */
    protected long serviceTypeId;

    /**
     * Gets the validation error during calculation attempt
     * @return Validation error during calculation attempt
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * Sets the validation error during calculation attempt
     * @param errorDescription Validation error during calculation attempt
     */
    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    /**
     * Gets the result of calculation (in case no error has occurred)
     * @return The result of calculation
     */
    public ResultCalculation getResultInfo() {
        return resultInfo;
    }

    /**
     * Sets the result of calculation (in case no error has occurred)
     * @param resultInfo The result of calculation
     */
    public void setResultInfo(ResultCalculation resultInfo) {
        this.resultInfo = resultInfo;
    }

    /**
     * Gets the courier service type id
     * @return Courier service type id
     */
    public long getServiceTypeId() {
        return serviceTypeId;
    }

    /**
     * Sets the courier service type id
     * @param serviceTypeId Courier service type id
     */
    public void setServiceTypeId(long serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

}
