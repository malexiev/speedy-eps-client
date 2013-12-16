
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
 * <p>Instances of this class are used as a parameter for createPDF documents web service methods
 * 
 * @since 1.0.0
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

	/**
     * Only allowed for type 25. A list of additional (second) barcodes to be printed on the bottom of each label in the PDF document.
     * Note that the additional barcodes take some extra space so the label height for type 25 is greater than the label height for type 20.
     * Each element in the list corresponds to the element of 'ids' with the same index (position).
     * MANDATORY: NO
     */
    @XmlElement(nillable = true)
    protected List<ParamBarcodeInfo> additionalBarcodes;
    
    /**
     * Only allowed for type 25.
     * Specifies the barcode format to be used for additionalBarcodes.
     * Accepts the following values: 'CODE128', 'EAN13', 'EAN8', 'UPC-A', 'UPC-E'
     * MANDATORY: NO
     */
    protected String additionalBarcodesFormat;
    @XmlElement(nillable = true)
    
    /**
     * List of IDs.
     * For type 10 only the BOL number is needed.
     * For types 20 and 25 one or more parcel IDs are expected (parcels must be of a single BOL).
     * MANDATORY: YES
     */
    protected List<Long> ids;
    
    /**
     * Specifies if embedded JavaScript code for direct printing to be generated (works for Adobe Acrobat Reader only).
     * MANDATORY: YES
     */
    protected boolean includeAutoPrintJS;
    
    /**
     * The printer name. If empty, the default printer is to be used. Only applicable if includeAutoPrintJS = true.
     * MANDATORY: NO
     */
    protected String printerName;
    
    /**
     * The document type (10 - BOL; 20 - labels; 25 - labels with additional barcode)
     * MANDATORY: YES
     */
    protected int type;

    /**
     * Gets the additionalBarcodes.
     * Only allowed for type 25. A list of additional (second) barcodes to be printed on the bottom of each label in the PDF document.
     * Note that the additional barcodes take some extra space so the label height for type 25 is greater than the label height for type 20.
     * Each element in the list corresponds to the element of 'ids' with the same index (position).
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
     * Gets the additional barcodes format
     * @return Additional barcodes format
     */
    public String getAdditionalBarcodesFormat() {
        return additionalBarcodesFormat;
    }

    /**
     * Sets the additional barcodes format.
     * Only allowed for type 25.
     * Specifies the barcode format to be used for additionalBarcodes.
     * Accepts the following values: 'CODE128', 'EAN13', 'EAN8', 'UPC-A', 'UPC-E'
     * @param additionalBarcodesFormat Additional barcodes format
     */
    public void setAdditionalBarcodesFormat(String additionalBarcodesFormat) {
        this.additionalBarcodesFormat = additionalBarcodesFormat;
    }

    /**
     * Gets the list of IDs.
     * For type 10 only the BOL number is needed.
     * For types 20 and 25 one or more parcel IDs are expected (parcels must be of a single BOL).
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
     * Gets the includeAutoPrintJS flag value - indicates if embedded 
     * JavaScript code for direct printing to be generated (works for Adobe Acrobat Reader only).
     * @return Include auto-print JS flag value 
     */
    public boolean isIncludeAutoPrintJS() {
        return includeAutoPrintJS;
    }

    /**
     * Sets the includeAutoPrintJS flag value.
     * Specifies if embedded JavaScript code for direct printing to be generated (works for Adobe Acrobat Reader only).
     * @param includeAutoPrintJS Include auto-print JS flag value 
     */
    public void setIncludeAutoPrintJS(boolean value) {
        this.includeAutoPrintJS = value;
    }

    /**
     * Gets the printer name 
     * Only applicable if includeAutoPrintJS = true. 
     * @return Printer name
     */
    public String getPrinterName() {
        return printerName;
    }

    /**
     * Sets the printer name
     * If empty, the default printer is to be used.
     * Only applicable if includeAutoPrintJS = true. 
     * @param printerName Printer name to be used for printing
     */
    public void setPrinterName(String printerName) {
        this.printerName = printerName;
    }

    /**
     * Gets the document type (10 - BOL; 20 - labels; 25 - labels with additional barcode)
     * @return Document type
     */
    public int getType() {
        return type;
    }

    /**
     * Sets the document type (10 - BOL; 20 - labels; 25 - labels with additional barcode)
     * @param type Document type
     */
    public void setType(int type) {
        this.type = type;
    }

}
