
package com.omgm.speedy.eps.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paramPDF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paramPDF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalBarcodes" type="{http://ver01.eps.speedy.sirma.com/}paramBarcodeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="additionalBarcodesFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ids" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="includeAutoPrintJS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="printerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramPDF", propOrder = {
    "additionalBarcodes",
    "additionalBarcodesFormat",
    "ids",
    "includeAutoPrintJS",
    "printerName",
    "type"
})
public class ParamPDF {

    @XmlElement(nillable = true)
    protected List<ParamBarcodeInfo> additionalBarcodes;
    protected String additionalBarcodesFormat;
    @XmlElement(nillable = true)
    protected List<Long> ids;
    protected boolean includeAutoPrintJS;
    protected String printerName;
    protected int type;

    /**
     * Gets the value of the additionalBarcodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalBarcodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalBarcodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamBarcodeInfo }
     * 
     * 
     */
    public List<ParamBarcodeInfo> getAdditionalBarcodes() {
        if (additionalBarcodes == null) {
            additionalBarcodes = new ArrayList<ParamBarcodeInfo>();
        }
        return this.additionalBarcodes;
    }

    /**
     * Gets the value of the additionalBarcodesFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalBarcodesFormat() {
        return additionalBarcodesFormat;
    }

    /**
     * Sets the value of the additionalBarcodesFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalBarcodesFormat(String value) {
        this.additionalBarcodesFormat = value;
    }

    /**
     * Gets the value of the ids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getIds() {
        if (ids == null) {
            ids = new ArrayList<Long>();
        }
        return this.ids;
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

    /**
     * Gets the value of the printerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinterName() {
        return printerName;
    }

    /**
     * Sets the value of the printerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinterName(String value) {
        this.printerName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

}
