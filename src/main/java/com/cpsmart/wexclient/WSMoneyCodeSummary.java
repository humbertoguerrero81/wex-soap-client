
package com.cpsmart.wexclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSMoneyCodeSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSMoneyCodeSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mcCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mcTotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="mcUsedTotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSMoneyCodeSummary", propOrder = {
    "mcCount",
    "mcTotal",
    "mcUsedTotal"
})
public class WSMoneyCodeSummary {

    protected int mcCount;
    protected double mcTotal;
    protected double mcUsedTotal;

    /**
     * Gets the value of the mcCount property.
     * 
     */
    public int getMcCount() {
        return mcCount;
    }

    /**
     * Sets the value of the mcCount property.
     * 
     */
    public void setMcCount(int value) {
        this.mcCount = value;
    }

    /**
     * Gets the value of the mcTotal property.
     * 
     */
    public double getMcTotal() {
        return mcTotal;
    }

    /**
     * Sets the value of the mcTotal property.
     * 
     */
    public void setMcTotal(double value) {
        this.mcTotal = value;
    }

    /**
     * Gets the value of the mcUsedTotal property.
     * 
     */
    public double getMcUsedTotal() {
        return mcUsedTotal;
    }

    /**
     * Sets the value of the mcUsedTotal property.
     * 
     */
    public void setMcUsedTotal(double value) {
        this.mcUsedTotal = value;
    }

}
