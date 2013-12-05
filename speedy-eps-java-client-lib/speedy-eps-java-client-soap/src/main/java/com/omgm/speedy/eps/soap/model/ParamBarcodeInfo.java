
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paramBarcodeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paramBarcodeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="barcodeLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="barcodeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instance of this class are used as parameters for providing barcode inpuit fot pdf generation web service calls
 * 
 * @since 1.0.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramBarcodeInfo", propOrder = {
    "barcodeLabel",
    "barcodeValue"
})
public class ParamBarcodeInfo {

	/**
     * Barcode value. For barcode formats other than 'CODE128' it must contain digits only.
     * MANDATORY: YES
     */
    protected String barcodeLabel;
    
    /**
     * Barcode label. It is printed just below the barcode image.
     * For barcode formats other than 'CODE128' barcodeLabel must be equal to barcodeValue.
     * MANDATORY: NO
     */
    protected String barcodeValue;

    /**
     * Gets the barcodeLabel
     * @return Barcode label
     */
    public String getBarcodeLabel() {
        return barcodeLabel;
    }

    /**
     * Sets the barcodeLabel
     * @param barcodeLabel Barcode label
     */
    public void setBarcodeLabel(String barcodeLabel) {
        this.barcodeLabel = barcodeLabel;
    }

    /**
     * Gets the barcodeValue
     * @return Barcode value
     */
    public String getBarcodeValue() {
        return barcodeValue;
    }

    /**
     * Sets the barcodeValue
     * @param barcodeValue Barcode value
     */
    public void setBarcodeValue(String barcodeValue) {
        this.barcodeValue = barcodeValue;
    }

}
