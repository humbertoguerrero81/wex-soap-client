
package com.cpsmart.wexclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSCarrierGetsDiscountData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSCarrierGetsDiscountData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carrier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="getsDiscount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="carrierName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCarrierGetsDiscountData", propOrder = {
    "carrier",
    "getsDiscount",
    "carrierName",
    "modifiedDate"
})
public class WSCarrierGetsDiscountData {

    protected int carrier;
    @XmlElement(required = true)
    protected String getsDiscount;
    @XmlElement(required = true)
    protected String carrierName;
    @XmlElement(required = true)
    protected String modifiedDate;

    /**
     * Gets the value of the carrier property.
     * 
     */
    public int getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     */
    public void setCarrier(int value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the getsDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetsDiscount() {
        return getsDiscount;
    }

    /**
     * Sets the value of the getsDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetsDiscount(String value) {
        this.getsDiscount = value;
    }

    /**
     * Gets the value of the carrierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Sets the value of the carrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierName(String value) {
        this.carrierName = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedDate(String value) {
        this.modifiedDate = value;
    }

}
