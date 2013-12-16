
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultMinMaxReal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultMinMaxReal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maxValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="minValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instances of this class are returned as a result of services for allowed float ranges of certain parameters
 * (f.e. getWightInterval)
 * 
 * @since 1.0.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultMinMaxReal", propOrder = {
    "maxValue",
    "minValue"
})
public class ResultMinMaxReal {

	/**
     * Max value
     */
    protected double maxValue;
    
    /**
     * Min value
     */
    protected double minValue;

    /**
     * Gets the max value
     * @return Max value
     */
    public double getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the max value
     * @param maxValue Max value
     */
    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * Gets the min value
     * @return Min value
     */
    public double getMinValue() {
        return minValue;
    }

    /**
     * Sets the min value
     * @param minValue Min value
     */
    public void setMinValue(double minValue) {
        this.minValue = minValue;
    }

}
