
package com.cpsmart.wexclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSCarrierGetsDiscount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSCarrierGetsDiscount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carrier" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="getsDiscount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCarrierGetsDiscount", propOrder = {
    "carrier",
    "getsDiscount"
})
public class WSCarrierGetsDiscount {

    protected int carrier;
    @XmlElement(required = true)
    protected String getsDiscount;

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

}
