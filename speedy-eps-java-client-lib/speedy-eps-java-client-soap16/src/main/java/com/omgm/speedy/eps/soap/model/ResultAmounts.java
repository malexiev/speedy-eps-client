
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultAmounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultAmounts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codBase" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="codPremium" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="discPcntAdditional" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="discPcntFixed" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="discPcntToBeCalled" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="discPcntToOffice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="discountAdditional" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="discountFixed" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="discountToBeCalled" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="discountToOffice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fixedTimeDelivery" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fuelSurcharge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="insuranceBase" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="insurancePremium" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="islandSurcharge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="net" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="packings" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="pcntFuelSurcharge" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tro" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="vat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="discPcntRetShipment" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="discountRetShipment" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="specialDelivery" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultAmounts", propOrder = {
    "codBase",
    "codPremium",
    "discPcntAdditional",
    "discPcntFixed",
    "discPcntToBeCalled",
    "discPcntToOffice",
    "discountAdditional",
    "discountFixed",
    "discountToBeCalled",
    "discountToOffice",
    "fixedTimeDelivery",
    "fuelSurcharge",
    "insuranceBase",
    "insurancePremium",
    "islandSurcharge",
    "net",
    "packings",
    "pcntFuelSurcharge",
    "total",
    "tro",
    "vat",
    "discPcntRetShipment",
    "discountRetShipment",
    "specialDelivery"
})
public class ResultAmounts {

    protected double codBase;
    protected double codPremium;
    protected double discPcntAdditional;
    protected double discPcntFixed;
    protected double discPcntToBeCalled;
    protected double discPcntToOffice;
    protected double discountAdditional;
    protected double discountFixed;
    protected double discountToBeCalled;
    protected double discountToOffice;
    protected double fixedTimeDelivery;
    protected double fuelSurcharge;
    protected double insuranceBase;
    protected double insurancePremium;
    protected double islandSurcharge;
    protected double net;
    protected double packings;
    protected double pcntFuelSurcharge;
    protected double total;
    protected double tro;
    protected double vat;
    protected double discPcntRetShipment;
    protected double discountRetShipment;
    protected double specialDelivery;

    /**
     * Gets the value of the codBase property.
     * 
     */
    public double getCodBase() {
        return codBase;
    }

    /**
     * Sets the value of the codBase property.
     * 
     */
    public void setCodBase(double value) {
        this.codBase = value;
    }

    /**
     * Gets the value of the codPremium property.
     * 
     */
    public double getCodPremium() {
        return codPremium;
    }

    /**
     * Sets the value of the codPremium property.
     * 
     */
    public void setCodPremium(double value) {
        this.codPremium = value;
    }

    /**
     * Gets the value of the discPcntAdditional property.
     * 
     */
    public double getDiscPcntAdditional() {
        return discPcntAdditional;
    }

    /**
     * Sets the value of the discPcntAdditional property.
     * 
     */
    public void setDiscPcntAdditional(double value) {
        this.discPcntAdditional = value;
    }

    /**
     * Gets the value of the discPcntFixed property.
     * 
     */
    public double getDiscPcntFixed() {
        return discPcntFixed;
    }

    /**
     * Sets the value of the discPcntFixed property.
     * 
     */
    public void setDiscPcntFixed(double value) {
        this.discPcntFixed = value;
    }

    /**
     * Gets the value of the discPcntToBeCalled property.
     * 
     */
    public double getDiscPcntToBeCalled() {
        return discPcntToBeCalled;
    }

    /**
     * Sets the value of the discPcntToBeCalled property.
     * 
     */
    public void setDiscPcntToBeCalled(double value) {
        this.discPcntToBeCalled = value;
    }

    /**
     * Gets the value of the discPcntToOffice property.
     * 
     */
    public double getDiscPcntToOffice() {
        return discPcntToOffice;
    }

    /**
     * Sets the value of the discPcntToOffice property.
     * 
     */
    public void setDiscPcntToOffice(double value) {
        this.discPcntToOffice = value;
    }

    /**
     * Gets the value of the discountAdditional property.
     * 
     */
    public double getDiscountAdditional() {
        return discountAdditional;
    }

    /**
     * Sets the value of the discountAdditional property.
     * 
     */
    public void setDiscountAdditional(double value) {
        this.discountAdditional = value;
    }

    /**
     * Gets the value of the discountFixed property.
     * 
     */
    public double getDiscountFixed() {
        return discountFixed;
    }

    /**
     * Sets the value of the discountFixed property.
     * 
     */
    public void setDiscountFixed(double value) {
        this.discountFixed = value;
    }

    /**
     * Gets the value of the discountToBeCalled property.
     * 
     */
    public double getDiscountToBeCalled() {
        return discountToBeCalled;
    }

    /**
     * Sets the value of the discountToBeCalled property.
     * 
     */
    public void setDiscountToBeCalled(double value) {
        this.discountToBeCalled = value;
    }

    /**
     * Gets the value of the discountToOffice property.
     * 
     */
    public double getDiscountToOffice() {
        return discountToOffice;
    }

    /**
     * Sets the value of the discountToOffice property.
     * 
     */
    public void setDiscountToOffice(double value) {
        this.discountToOffice = value;
    }

    /**
     * Gets the value of the fixedTimeDelivery property.
     * 
     */
    public double getFixedTimeDelivery() {
        return fixedTimeDelivery;
    }

    /**
     * Sets the value of the fixedTimeDelivery property.
     * 
     */
    public void setFixedTimeDelivery(double value) {
        this.fixedTimeDelivery = value;
    }

    /**
     * Gets the value of the fuelSurcharge property.
     * 
     */
    public double getFuelSurcharge() {
        return fuelSurcharge;
    }

    /**
     * Sets the value of the fuelSurcharge property.
     * 
     */
    public void setFuelSurcharge(double value) {
        this.fuelSurcharge = value;
    }

    /**
     * Gets the value of the insuranceBase property.
     * 
     */
    public double getInsuranceBase() {
        return insuranceBase;
    }

    /**
     * Sets the value of the insuranceBase property.
     * 
     */
    public void setInsuranceBase(double value) {
        this.insuranceBase = value;
    }

    /**
     * Gets the value of the insurancePremium property.
     * 
     */
    public double getInsurancePremium() {
        return insurancePremium;
    }

    /**
     * Sets the value of the insurancePremium property.
     * 
     */
    public void setInsurancePremium(double value) {
        this.insurancePremium = value;
    }

    /**
     * Gets the value of the islandSurcharge property.
     * 
     */
    public double getIslandSurcharge() {
        return islandSurcharge;
    }

    /**
     * Sets the value of the islandSurcharge property.
     * 
     */
    public void setIslandSurcharge(double value) {
        this.islandSurcharge = value;
    }

    /**
     * Gets the value of the net property.
     * 
     */
    public double getNet() {
        return net;
    }

    /**
     * Sets the value of the net property.
     * 
     */
    public void setNet(double value) {
        this.net = value;
    }

    /**
     * Gets the value of the packings property.
     * 
     */
    public double getPackings() {
        return packings;
    }

    /**
     * Sets the value of the packings property.
     * 
     */
    public void setPackings(double value) {
        this.packings = value;
    }

    /**
     * Gets the value of the pcntFuelSurcharge property.
     * 
     */
    public double getPcntFuelSurcharge() {
        return pcntFuelSurcharge;
    }

    /**
     * Sets the value of the pcntFuelSurcharge property.
     * 
     */
    public void setPcntFuelSurcharge(double value) {
        this.pcntFuelSurcharge = value;
    }

    /**
     * Gets the value of the total property.
     * 
     */
    public double getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     */
    public void setTotal(double value) {
        this.total = value;
    }

    /**
     * Gets the value of the tro property.
     * 
     */
    public double getTro() {
        return tro;
    }

    /**
     * Sets the value of the tro property.
     * 
     */
    public void setTro(double value) {
        this.tro = value;
    }

    /**
     * Gets the value of the vat property.
     * 
     */
    public double getVat() {
        return vat;
    }

    /**
     * Sets the value of the vat property.
     * 
     */
    public void setVat(double value) {
        this.vat = value;
    }

    /**
     * Gets the value of the discPcntRetShipment property.
     * 
     */
    public double getDiscPcntRetShipment() {
        return discPcntRetShipment;
    }

    /**
     * Sets the value of the discPcntRetShipment property.
     * 
     */
    public void setDiscPcntRetShipment(double value) {
        this.discPcntRetShipment = value;
    }

    /**
     * Gets the value of the discountRetShipment property.
     * 
     */
    public double getDiscountRetShipment() {
        return discountRetShipment;
    }

    /**
     * Sets the value of the discountRetShipment property.
     * 
     */
    public void setDiscountRetShipment(double value) {
        this.discountRetShipment = value;
    }

    /**
     * Gets the value of the specialDelivery property.
     * 
     */
    public double getSpecialDelivery() {
        return specialDelivery;
    }

    /**
     * Sets the value of the specialDelivery property.
     * 
     */
    public void setSpecialDelivery(double value) {
        this.specialDelivery = value;
    }

}
