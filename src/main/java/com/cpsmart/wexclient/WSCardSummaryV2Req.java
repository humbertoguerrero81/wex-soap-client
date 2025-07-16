
package com.cpsmart.wexclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSCardSummaryV2Req complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSCardSummaryV2Req"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="payrUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="filter" type="{http://com.tch.cards.service/types}WSCardSummaryV2ReqArray"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCardSummaryV2Req", propOrder = {
    "payrUse",
    "filter"
})
public class WSCardSummaryV2Req {

    @XmlElementRef(name = "payrUse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payrUse;
    @XmlElement(required = true, nillable = true)
    protected WSCardSummaryV2ReqArray filter;

    /**
     * Gets the value of the payrUse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayrUse() {
        return payrUse;
    }

    /**
     * Sets the value of the payrUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayrUse(JAXBElement<String> value) {
        this.payrUse = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link WSCardSummaryV2ReqArray }
     *     
     */
    public WSCardSummaryV2ReqArray getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCardSummaryV2ReqArray }
     *     
     */
    public void setFilter(WSCardSummaryV2ReqArray value) {
        this.filter = value;
    }

}
