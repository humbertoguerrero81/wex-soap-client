
package com.cpsmart.wexclient;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSCardRefreshingLimitsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSCardRefreshingLimitsData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="refreshingLimitSource" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dayCntLimit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="dayAmtLimit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="weekCntLimit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="weekAmtLimit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="monCntLimit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="monAmtLimit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCardRefreshingLimitsData", propOrder = {
    "refreshingLimitSource",
    "dayCntLimit",
    "dayAmtLimit",
    "weekCntLimit",
    "weekAmtLimit",
    "monCntLimit",
    "monAmtLimit"
})
public class WSCardRefreshingLimitsData {

    @XmlElement(required = true)
    protected String refreshingLimitSource;
    @XmlElementRef(name = "dayCntLimit", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> dayCntLimit;
    @XmlElementRef(name = "dayAmtLimit", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> dayAmtLimit;
    @XmlElementRef(name = "weekCntLimit", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> weekCntLimit;
    @XmlElementRef(name = "weekAmtLimit", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> weekAmtLimit;
    @XmlElementRef(name = "monCntLimit", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> monCntLimit;
    @XmlElementRef(name = "monAmtLimit", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> monAmtLimit;

    /**
     * Gets the value of the refreshingLimitSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefreshingLimitSource() {
        return refreshingLimitSource;
    }

    /**
     * Sets the value of the refreshingLimitSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefreshingLimitSource(String value) {
        this.refreshingLimitSource = value;
    }

    /**
     * Gets the value of the dayCntLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getDayCntLimit() {
        return dayCntLimit;
    }

    /**
     * Sets the value of the dayCntLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setDayCntLimit(JAXBElement<BigInteger> value) {
        this.dayCntLimit = value;
    }

    /**
     * Gets the value of the dayAmtLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getDayAmtLimit() {
        return dayAmtLimit;
    }

    /**
     * Sets the value of the dayAmtLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setDayAmtLimit(JAXBElement<BigInteger> value) {
        this.dayAmtLimit = value;
    }

    /**
     * Gets the value of the weekCntLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getWeekCntLimit() {
        return weekCntLimit;
    }

    /**
     * Sets the value of the weekCntLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setWeekCntLimit(JAXBElement<BigInteger> value) {
        this.weekCntLimit = value;
    }

    /**
     * Gets the value of the weekAmtLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getWeekAmtLimit() {
        return weekAmtLimit;
    }

    /**
     * Sets the value of the weekAmtLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setWeekAmtLimit(JAXBElement<BigInteger> value) {
        this.weekAmtLimit = value;
    }

    /**
     * Gets the value of the monCntLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getMonCntLimit() {
        return monCntLimit;
    }

    /**
     * Sets the value of the monCntLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setMonCntLimit(JAXBElement<BigInteger> value) {
        this.monCntLimit = value;
    }

    /**
     * Gets the value of the monAmtLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getMonAmtLimit() {
        return monAmtLimit;
    }

    /**
     * Sets the value of the monAmtLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setMonAmtLimit(JAXBElement<BigInteger> value) {
        this.monAmtLimit = value;
    }

}
