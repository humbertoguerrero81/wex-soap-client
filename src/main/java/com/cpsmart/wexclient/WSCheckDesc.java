
package com.cpsmart.wexclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSCheckDesc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSCheckDesc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="checkNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="clearedDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codeCard" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contractID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locationCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locationID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="locationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locationState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payee" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reauthLocation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="voided" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="referenceID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="confirmationID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCheckDesc", propOrder = {
    "amount",
    "checkNumber",
    "clearedDate",
    "codeCard",
    "contractID",
    "createDate",
    "locationCity",
    "locationID",
    "locationName",
    "locationState",
    "payee",
    "reauthLocation",
    "voided",
    "referenceID",
    "confirmationID"
})
public class WSCheckDesc {

    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double amount;
    @XmlElement(required = true, nillable = true)
    protected String checkNumber;
    @XmlElement(required = true, nillable = true)
    protected String clearedDate;
    @XmlElement(required = true, nillable = true)
    protected String codeCard;
    @XmlElement(required = true, nillable = true)
    protected String contractID;
    @XmlElement(required = true, nillable = true)
    protected String createDate;
    @XmlElement(required = true, nillable = true)
    protected String locationCity;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer locationID;
    @XmlElement(required = true, nillable = true)
    protected String locationName;
    @XmlElement(required = true, nillable = true)
    protected String locationState;
    @XmlElement(required = true, nillable = true)
    protected String payee;
    @XmlElement(required = true, nillable = true)
    protected String reauthLocation;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean voided;
    @XmlElement(required = true, nillable = true)
    protected String referenceID;
    @XmlElement(required = true, nillable = true)
    protected String confirmationID;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the clearedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearedDate() {
        return clearedDate;
    }

    /**
     * Sets the value of the clearedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearedDate(String value) {
        this.clearedDate = value;
    }

    /**
     * Gets the value of the codeCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeCard() {
        return codeCard;
    }

    /**
     * Sets the value of the codeCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeCard(String value) {
        this.codeCard = value;
    }

    /**
     * Gets the value of the contractID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractID() {
        return contractID;
    }

    /**
     * Sets the value of the contractID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractID(String value) {
        this.contractID = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDate(String value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the locationCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCity() {
        return locationCity;
    }

    /**
     * Sets the value of the locationCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCity(String value) {
        this.locationCity = value;
    }

    /**
     * Gets the value of the locationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocationID(Integer value) {
        this.locationID = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the locationState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationState() {
        return locationState;
    }

    /**
     * Sets the value of the locationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationState(String value) {
        this.locationState = value;
    }

    /**
     * Gets the value of the payee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayee() {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayee(String value) {
        this.payee = value;
    }

    /**
     * Gets the value of the reauthLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReauthLocation() {
        return reauthLocation;
    }

    /**
     * Sets the value of the reauthLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReauthLocation(String value) {
        this.reauthLocation = value;
    }

    /**
     * Gets the value of the voided property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoided() {
        return voided;
    }

    /**
     * Sets the value of the voided property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoided(Boolean value) {
        this.voided = value;
    }

    /**
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceID(String value) {
        this.referenceID = value;
    }

    /**
     * Gets the value of the confirmationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationID() {
        return confirmationID;
    }

    /**
     * Sets the value of the confirmationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationID(String value) {
        this.confirmationID = value;
    }

}
