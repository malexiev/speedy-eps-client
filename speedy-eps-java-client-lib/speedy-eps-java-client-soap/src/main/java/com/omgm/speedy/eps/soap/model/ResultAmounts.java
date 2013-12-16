
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instance of this class are returned as a results of calculation
 * 
 * @since 1.0.0
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
    "vat"
})
public class ResultAmounts {

    /**
     * The "Cash on delivery" amount to be paid to the sender
     */
    protected double codBase;
    
    /**
     * The price of the "Cash on delivery" complementary service
     */
    protected double codPremium;
    
    /**
     * The PERCENTAGE of additional discount
     */
    protected double discPcntAdditional;
    
    /**
     * The PERCENTAGE of fixed discount
     */
    protected double discPcntFixed;
    
    /**
     * The PERCENTAGE of the "to be called" complementary service
     */
    protected double discPcntToBeCalled;
    
    /**
     * The PERCENTAGE of the "brought to office" complementary service
     */
    protected double discPcntToOffice;
    
    /**
     * (NEGATIVE value) Additional discount
     */
    protected double discountAdditional;
    
    /**
     * (NEGATIVE value) Fixed discount value
     */
    protected double discountFixed;
    
    /**
     * (NEGATIVE value) Discount for the "To be called" complementary service
     */
    protected double discountToBeCalled;

    /**
     * (NEGATIVE value) Discount for shipments delivered to a Speedy office by the sender
     */
    protected double discountToOffice;

    /**
     * The amount of the "Fixed time for delivery" complementary service
     */
    protected double fixedTimeDelivery;
    
    /**
     * Fuel surcharge
     */
    protected double fuelSurcharge;
    
    /**
     * The real value of the shipment
     */
    protected double insuranceBase;
    
    /**
     * The insurance premium (i.e. the price of the "Insurance" complementary service)
     */
    protected double insurancePremium;
    
    /**
     * Island surcharge (international shipments)
     */
    protected double islandSurcharge;
    
    /**
     * The net price (of the courier service only; w/o discounts, complementary services, VAT etc.)
     */
    protected double net;
    
    /**
     * Packings value
     */
    protected double packings;
    
    /**
     * The PERCENTAGE of fuel surcharge
     */
    protected double pcntFuelSurcharge;
    
    /**
     * The total amount
     */
    protected double total;
    
    /**
     * The amount of the "Additional charges for loading/unloading operations" complementary service
     */
    protected double tro;
    
    /**
     * VAT (Value added tax)
     */
    protected double vat;

    /**
     * Gets the "Cash on delivery" amount to be paid to the sender
     * @return The "Cash on delivery" amount to be paid to the sender
     */
    public double getCodBase() {
        return codBase;
    }

    /**
     * Sets the "Cash on delivery" amount to be paid to the sender
     * @param codBase The "Cash on delivery" amount to be paid to the sender
     */
    public void setCodBase(double codBase) {
        this.codBase = codBase;
    }

    /**
     * Gets the price of the "Cash on delivery" complementary service
     * @return The price of the "Cash on delivery" complementary service
     */
    public double getCodPremium() {
        return codPremium;
    }

    /**
     * Sets the price of the "Cash on delivery" complementary service
     * @param codPremium The price of the "Cash on delivery" complementary service
     */
    public void setCodPremium(double codPremium) {
        this.codPremium = codPremium;
    }

    /**
     * Gets The PERCENTAGE of additional discount
     * @return The PERCENTAGE of additional discount
     */
    public double getDiscPcntAdditional() {
        return discPcntAdditional;
    }

    /**
     * Sets the PERCENTAGE of additional discount
     * @param discPcntAdditional The PERCENTAGE of additional discount
     */
    public void setDiscPcntAdditional(double discPcntAdditional) {
        this.discPcntAdditional = discPcntAdditional;
    }

    /**
     * Gets the PERCENTAGE of fixed discount
     * @return The PERCENTAGE of fixed discount
     */
    public double getDiscPcntFixed() {
        return discPcntFixed;
    }

    /**
     * Sets the PERCENTAGE of fixed discount
     * @param discPcntFixed The PERCENTAGE of fixed discount
     */
    public void setDiscPcntFixed(double discPcntFixed) {
        this.discPcntFixed = discPcntFixed;
    }

    /**
     * Gets the PERCENTAGE of the "to be called" complementary service
     * @return The PERCENTAGE of the "to be called" complementary service
     */
    public double getDiscPcntToBeCalled() {
        return discPcntToBeCalled;
    }

    /**
     * Sets the PERCENTAGE of the "to be called" complementary service
     * @param discPcntToBeCalled The PERCENTAGE of the "to be called" complementary service
     */
    public void setDiscPcntToBeCalled(double discPcntToBeCalled) {
        this.discPcntToBeCalled = discPcntToBeCalled;
    }

    /**
     * Gets the PERCENTAGE of the "brought to office" complementary service
     * @return The PERCENTAGE of the "brought to office" complementary service
     */
    public double getDiscPcntToOffice() {
        return discPcntToOffice;
    }

    /**
     * Sets the PERCENTAGE of the "brought to office" complementary service
     * @param discPcntToOffice The PERCENTAGE of the "brought to office" complementary service
     */
    public void setDiscPcntToOffice(double discPcntToOffice) {
        this.discPcntToOffice = discPcntToOffice;
    }

    /**
     * Gets the additional discount (NEGATIVE value) 
     * @return Additional discount (NEGATIVE value) 
     */
    public double getDiscountAdditional() {
        return discountAdditional;
    }

    /**
     * Sets the additional discount (NEGATIVE value) 
     * @param discountAdditional Additional discount (NEGATIVE value) 
     */
    public void setDiscountAdditional(double discountAdditional) {
        this.discountAdditional = discountAdditional;
    }

    /**
     * Gets the fixed discount value (NEGATIVE value)
     * @return Fixed discount value (NEGATIVE value)
     */
    public double getDiscountFixed() {
        return discountFixed;
    }

    /**
     * Sets the fixed discount value (NEGATIVE value)
     * @param discountFixed Fixed discount value (NEGATIVE value)
     */
    public void setDiscountFixed(double discountFixed) {
        this.discountFixed = discountFixed;
    }

    /**
     * Gets discount for the "To be called" complementary service (NEGATIVE value)
     * @return Discount for the "To be called" complementary service (NEGATIVE value)
     */
    public double getDiscountToBeCalled() {
        return discountToBeCalled;
    }

    /**
     * Sets the discount for the "To be called" complementary service (NEGATIVE value)
     * @param discountToBeCalled Discount for the "To be called" complementary service (NEGATIVE value)
     */
    public void setDiscountToBeCalled(double discountToBeCalled) {
        this.discountToBeCalled = discountToBeCalled;
    }

    /**
     * Gets discount for shipments delivered to a Speedy office by the sender (NEGATIVE value)
     * @return Discount for shipments delivered to a Speedy office by the sender (NEGATIVE value)
     */
    public double getDiscountToOffice() {
        return discountToOffice;
    }

    /**
     * Sets the discount for shipments delivered to a Speedy office by the sender (NEGATIVE value)
     * @param discountToOffice Discount for shipments delivered to a Speedy office by the sender (NEGATIVE value)
     */
    public void setDiscountToOffice(double discountToOffice) {
        this.discountToOffice = discountToOffice;
    }

    /**
     * Gets the amount of the "Fixed time for delivery" complementary service
     * @return The amount of the "Fixed time for delivery" complementary service
     */
    public double getFixedTimeDelivery() {
        return fixedTimeDelivery;
    }

    /**
     * Sets the amount of the "Fixed time for delivery" complementary service
     * @param fixedTimeDelivery The amount of the "Fixed time for delivery" complementary service
     */
    public void setFixedTimeDelivery(double fixedTimeDelivery) {
        this.fixedTimeDelivery = fixedTimeDelivery;
    }

    /**
     * Gets fuel surcharge
     * @return Fuel surcharge
     */
    public double getFuelSurcharge() {
        return fuelSurcharge;
    }

    /**
     * Sets the fuel surcharge
     * @param fuelSurcharge Fuel surcharge
     */
    public void setFuelSurcharge(double fuelSurcharge) {
        this.fuelSurcharge = fuelSurcharge;
    }

    /**
     * Gets the real value of the shipment
     * @return The real value of the shipment
     */
    public double getInsuranceBase() {
        return insuranceBase;
    }

    /**
     * Sets the real value of the shipment
     * @param insuranceBase The real value of the shipment
     */
    public void setInsuranceBase(double insuranceBase) {
        this.insuranceBase = insuranceBase;
    }

    /**
     * Gets the insurance premium (i.e. the price of the "Insurance" complementary service)
     * @return The insurance premium (i.e. the price of the "Insurance" complementary service)
     */
    public double getInsurancePremium() {
        return insurancePremium;
    }

    /**
     * Sets the insurance premium (i.e. the price of the "Insurance" complementary service)
     * @param insurancePremium The insurance premium (i.e. the price of the "Insurance" complementary service)
     */
    public void setInsurancePremium(double insurancePremium) {
        this.insurancePremium = insurancePremium;
    }

    /**
     * Gets the island surcharge (international shipments)
     * @return Island surcharge (international shipments)
     */
    public double getIslandSurcharge() {
        return islandSurcharge;
    }

    /**
     * Sets the Island surcharge (international shipments)
     * @param islandSurcharge Island surcharge (international shipments)
     */
    public void setIslandSurcharge(double islandSurcharge) {
        this.islandSurcharge = islandSurcharge;
    }

    /**
     * Gets the net price (of the courier service only; w/o discounts, complementary services, VAT etc.)
     * @return The net price (of the courier service only; w/o discounts, complementary services, VAT etc.)
     */
    public double getNet() {
        return net;
    }

    /**
     * Sets the net price (of the courier service only; w/o discounts, complementary services, VAT etc.)
     * @param net The net price (of the courier service only; w/o discounts, complementary services, VAT etc.)
     */
    public void setNet(double net) {
        this.net = net;
    }

    /**
     * Gets the packings value
     * @return Packings value
     */
    public double getPackings() {
        return packings;
    }

    /**
     * Sets the packings value
     * @param packings Packings value
     */
    public void setPackings(double packings) {
        this.packings = packings;
    }

    /**
     * Gets the PERCENTAGE of fuel surcharge
     * @return The PERCENTAGE of fuel surcharge
     */
    public double getPcntFuelSurcharge() {
        return pcntFuelSurcharge;
    }

    /**
     * Sets the PERCENTAGE of fuel surcharge
     * @param pcntFuelSurcharge The PERCENTAGE of fuel surcharge
     */
    public void setPcntFuelSurcharge(double pcntFuelSurcharge) {
        this.pcntFuelSurcharge = pcntFuelSurcharge;
    }

    /**
     * Gets the total amount
     * @return The total amount
     */
    public double getTotal() {
        return total;
    }

    /**
     * Sets the total amount
     * @param total The total amount
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * Gets the amount of the "Additional charges for loading/unloading operations" complementary service
     * @param The amount of the "Additional charges for loading/unloading operations" complementary service
     */
    public double getTro() {
        return tro;
    }

    /**
     * Sets the amount of the "Additional charges for loading/unloading operations" complementary service
     * @param tro The amount of the "Additional charges for loading/unloading operations" complementary service
     */
    public void setTro(double tro) {
        this.tro = tro;
    }

    /**
     * Gets the VAT (Value added tax)
     * @return VAT (Value added tax)
     */
    public double getVat() {
        return vat;
    }

    /**
     * Sets the VAT (Value added tax)
     * @param vat VAT (Value added tax)
     */
    public void setVat(double vat) {
        this.vat = vat;
    }

}
