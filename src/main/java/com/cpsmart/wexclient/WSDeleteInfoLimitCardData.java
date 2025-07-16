
package com.cpsmart.wexclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSDeleteInfoLimitCardData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSDeleteInfoLimitCardData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="policyNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="infoId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reportValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSDeleteInfoLimitCardData", propOrder = {
    "policyNumber",
    "infoId",
    "reportValue"
})
public class WSDeleteInfoLimitCardData {

    protected int policyNumber;
    @XmlElement(required = true, nillable = true)
    protected String infoId;
    @XmlElement(required = true, nillable = true)
    protected String reportValue;

    /**
     * Gets the value of the policyNumber property.
     * 
     */
    public int getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the value of the policyNumber property.
     * 
     */
    public void setPolicyNumber(int value) {
        this.policyNumber = value;
    }

    /**
     * Gets the value of the infoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoId() {
        return infoId;
    }

    /**
     * Sets the value of the infoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoId(String value) {
        this.infoId = value;
    }

    /**
     * Gets the value of the reportValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportValue() {
        return reportValue;
    }

    /**
     * Sets the value of the reportValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportValue(String value) {
        this.reportValue = value;
    }

}
