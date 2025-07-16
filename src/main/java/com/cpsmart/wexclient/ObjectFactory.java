
package com.cpsmart.wexclient;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cpsmart.wexclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WSCardRefreshingLimitsDataDayCntLimit_QNAME = new QName("", "dayCntLimit");
    private final static QName _WSCardRefreshingLimitsDataDayAmtLimit_QNAME = new QName("", "dayAmtLimit");
    private final static QName _WSCardRefreshingLimitsDataWeekCntLimit_QNAME = new QName("", "weekCntLimit");
    private final static QName _WSCardRefreshingLimitsDataWeekAmtLimit_QNAME = new QName("", "weekAmtLimit");
    private final static QName _WSCardRefreshingLimitsDataMonCntLimit_QNAME = new QName("", "monCntLimit");
    private final static QName _WSCardRefreshingLimitsDataMonAmtLimit_QNAME = new QName("", "monAmtLimit");
    private final static QName _WSCardSummaryV2ReqPayrUse_QNAME = new QName("", "payrUse");
    private final static QName _WSCardSummaryReqType_QNAME = new QName("", "type");
    private final static QName _WSCardSummaryReqSearchParam_QNAME = new QName("", "searchParam");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cpsmart.wexclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WSCard }
     * 
     */
    public WSCard createWSCard() {
        return new WSCard();
    }

    /**
     * Create an instance of {@link WSCardv2 }
     * 
     */
    public WSCardv2 createWSCardv2() {
        return new WSCardv2();
    }

    /**
     * Create an instance of {@link WSCardSummary }
     * 
     */
    public WSCardSummary createWSCardSummary() {
        return new WSCardSummary();
    }

    /**
     * Create an instance of {@link WSCardSummaryReq }
     * 
     */
    public WSCardSummaryReq createWSCardSummaryReq() {
        return new WSCardSummaryReq();
    }

    /**
     * Create an instance of {@link WSCardSummaryV2Req }
     * 
     */
    public WSCardSummaryV2Req createWSCardSummaryV2Req() {
        return new WSCardSummaryV2Req();
    }

    /**
     * Create an instance of {@link WSCardSummaryV2ReqArray }
     * 
     */
    public WSCardSummaryV2ReqArray createWSCardSummaryV2ReqArray() {
        return new WSCardSummaryV2ReqArray();
    }

    /**
     * Create an instance of {@link WSCardSummaryV2ReqClause }
     * 
     */
    public WSCardSummaryV2ReqClause createWSCardSummaryV2ReqClause() {
        return new WSCardSummaryV2ReqClause();
    }

    /**
     * Create an instance of {@link WSCardHeader }
     * 
     */
    public WSCardHeader createWSCardHeader() {
        return new WSCardHeader();
    }

    /**
     * Create an instance of {@link WSSmartPayDriver }
     * 
     */
    public WSSmartPayDriver createWSSmartPayDriver() {
        return new WSSmartPayDriver();
    }

    /**
     * Create an instance of {@link WSCardInfo }
     * 
     */
    public WSCardInfo createWSCardInfo() {
        return new WSCardInfo();
    }

    /**
     * Create an instance of {@link WSCardLimit }
     * 
     */
    public WSCardLimit createWSCardLimit() {
        return new WSCardLimit();
    }

    /**
     * Create an instance of {@link WSCardLimitv2 }
     * 
     */
    public WSCardLimitv2 createWSCardLimitv2() {
        return new WSCardLimitv2();
    }

    /**
     * Create an instance of {@link WSPolicyLimit }
     * 
     */
    public WSPolicyLimit createWSPolicyLimit() {
        return new WSPolicyLimit();
    }

    /**
     * Create an instance of {@link WSCardTimeRestriction }
     * 
     */
    public WSCardTimeRestriction createWSCardTimeRestriction() {
        return new WSCardTimeRestriction();
    }

    /**
     * Create an instance of {@link WSCardDescription }
     * 
     */
    public WSCardDescription createWSCardDescription() {
        return new WSCardDescription();
    }

    /**
     * Create an instance of {@link WSCashRecord }
     * 
     */
    public WSCashRecord createWSCashRecord() {
        return new WSCashRecord();
    }

    /**
     * Create an instance of {@link WSCashRecordV2 }
     * 
     */
    public WSCashRecordV2 createWSCashRecordV2() {
        return new WSCashRecordV2();
    }

    /**
     * Create an instance of {@link WSContract }
     * 
     */
    public WSContract createWSContract() {
        return new WSContract();
    }

    /**
     * Create an instance of {@link WSMoneyCodeHistRec }
     * 
     */
    public WSMoneyCodeHistRec createWSMoneyCodeHistRec() {
        return new WSMoneyCodeHistRec();
    }

    /**
     * Create an instance of {@link WSMoneyCodeHistRecV2 }
     * 
     */
    public WSMoneyCodeHistRecV2 createWSMoneyCodeHistRecV2() {
        return new WSMoneyCodeHistRecV2();
    }

    /**
     * Create an instance of {@link WSMoneyCodeById }
     * 
     */
    public WSMoneyCodeById createWSMoneyCodeById() {
        return new WSMoneyCodeById();
    }

    /**
     * Create an instance of {@link MoneyCodeUseById }
     * 
     */
    public MoneyCodeUseById createMoneyCodeUseById() {
        return new MoneyCodeUseById();
    }

    /**
     * Create an instance of {@link MoneyCodeHistUse }
     * 
     */
    public MoneyCodeHistUse createMoneyCodeHistUse() {
        return new MoneyCodeHistUse();
    }

    /**
     * Create an instance of {@link WSMoneyCodeUse }
     * 
     */
    public WSMoneyCodeUse createWSMoneyCodeUse() {
        return new WSMoneyCodeUse();
    }

    /**
     * Create an instance of {@link WSMoneyCodeUseV2 }
     * 
     */
    public WSMoneyCodeUseV2 createWSMoneyCodeUseV2() {
        return new WSMoneyCodeUseV2();
    }

    /**
     * Create an instance of {@link WSPolicy }
     * 
     */
    public WSPolicy createWSPolicy() {
        return new WSPolicy();
    }

    /**
     * Create an instance of {@link WSSitePolicyList }
     * 
     */
    public WSSitePolicyList createWSSitePolicyList() {
        return new WSSitePolicyList();
    }

    /**
     * Create an instance of {@link WSPolicyHeader }
     * 
     */
    public WSPolicyHeader createWSPolicyHeader() {
        return new WSPolicyHeader();
    }

    /**
     * Create an instance of {@link WSPolicyDescription }
     * 
     */
    public WSPolicyDescription createWSPolicyDescription() {
        return new WSPolicyDescription();
    }

    /**
     * Create an instance of {@link WSConfirmationDesc }
     * 
     */
    public WSConfirmationDesc createWSConfirmationDesc() {
        return new WSConfirmationDesc();
    }

    /**
     * Create an instance of {@link WSSitePolicyDescription }
     * 
     */
    public WSSitePolicyDescription createWSSitePolicyDescription() {
        return new WSSitePolicyDescription();
    }

    /**
     * Create an instance of {@link WSProductGroup }
     * 
     */
    public WSProductGroup createWSProductGroup() {
        return new WSProductGroup();
    }

    /**
     * Create an instance of {@link WSProduct }
     * 
     */
    public WSProduct createWSProduct() {
        return new WSProduct();
    }

    /**
     * Create an instance of {@link WSTransLocation }
     * 
     */
    public WSTransLocation createWSTransLocation() {
        return new WSTransLocation();
    }

    /**
     * Create an instance of {@link WSTransaction }
     * 
     */
    public WSTransaction createWSTransaction() {
        return new WSTransaction();
    }

    /**
     * Create an instance of {@link WSTransactionV2 }
     * 
     */
    public WSTransactionV2 createWSTransactionV2() {
        return new WSTransactionV2();
    }

    /**
     * Create an instance of {@link WSTransactionV3 }
     * 
     */
    public WSTransactionV3 createWSTransactionV3() {
        return new WSTransactionV3();
    }

    /**
     * Create an instance of {@link WSTransactionExt }
     * 
     */
    public WSTransactionExt createWSTransactionExt() {
        return new WSTransactionExt();
    }

    /**
     * Create an instance of {@link WSTransExtLoc }
     * 
     */
    public WSTransExtLoc createWSTransExtLoc() {
        return new WSTransExtLoc();
    }

    /**
     * Create an instance of {@link WSMCTransExtLoc }
     * 
     */
    public WSMCTransExtLoc createWSMCTransExtLoc() {
        return new WSMCTransExtLoc();
    }

    /**
     * Create an instance of {@link WSMCTransExtLocV2 }
     * 
     */
    public WSMCTransExtLocV2 createWSMCTransExtLocV2() {
        return new WSMCTransExtLocV2();
    }

    /**
     * Create an instance of {@link WSMCTransExtLocV3 }
     * 
     */
    public WSMCTransExtLocV3 createWSMCTransExtLocV3() {
        return new WSMCTransExtLocV3();
    }

    /**
     * Create an instance of {@link WSTransTaxes }
     * 
     */
    public WSTransTaxes createWSTransTaxes() {
        return new WSTransTaxes();
    }

    /**
     * Create an instance of {@link WSTransactionLineItemExt }
     * 
     */
    public WSTransactionLineItemExt createWSTransactionLineItemExt() {
        return new WSTransactionLineItemExt();
    }

    /**
     * Create an instance of {@link WSTransLineTax }
     * 
     */
    public WSTransLineTax createWSTransLineTax() {
        return new WSTransLineTax();
    }

    /**
     * Create an instance of {@link WSMetaData }
     * 
     */
    public WSMetaData createWSMetaData() {
        return new WSMetaData();
    }

    /**
     * Create an instance of {@link WSFleetMemo }
     * 
     */
    public WSFleetMemo createWSFleetMemo() {
        return new WSFleetMemo();
    }

    /**
     * Create an instance of {@link WSTransactionCarmsStmt }
     * 
     */
    public WSTransactionCarmsStmt createWSTransactionCarmsStmt() {
        return new WSTransactionCarmsStmt();
    }

    /**
     * Create an instance of {@link WSTransactionInfo }
     * 
     */
    public WSTransactionInfo createWSTransactionInfo() {
        return new WSTransactionInfo();
    }

    /**
     * Create an instance of {@link WSTransactionLineItem }
     * 
     */
    public WSTransactionLineItem createWSTransactionLineItem() {
        return new WSTransactionLineItem();
    }

    /**
     * Create an instance of {@link WSMoneyCode }
     * 
     */
    public WSMoneyCode createWSMoneyCode() {
        return new WSMoneyCode();
    }

    /**
     * Create an instance of {@link WSSmartPayTransferAccount }
     * 
     */
    public WSSmartPayTransferAccount createWSSmartPayTransferAccount() {
        return new WSSmartPayTransferAccount();
    }

    /**
     * Create an instance of {@link WSSmartPayTransferDefinition }
     * 
     */
    public WSSmartPayTransferDefinition createWSSmartPayTransferDefinition() {
        return new WSSmartPayTransferDefinition();
    }

    /**
     * Create an instance of {@link WSSmartPayScheduledTransferDefinition }
     * 
     */
    public WSSmartPayScheduledTransferDefinition createWSSmartPayScheduledTransferDefinition() {
        return new WSSmartPayScheduledTransferDefinition();
    }

    /**
     * Create an instance of {@link WSSmartPayScheduledTransfer }
     * 
     */
    public WSSmartPayScheduledTransfer createWSSmartPayScheduledTransfer() {
        return new WSSmartPayScheduledTransfer();
    }

    /**
     * Create an instance of {@link WSTransSummary }
     * 
     */
    public WSTransSummary createWSTransSummary() {
        return new WSTransSummary();
    }

    /**
     * Create an instance of {@link WSMoneyCodeSummary }
     * 
     */
    public WSMoneyCodeSummary createWSMoneyCodeSummary() {
        return new WSMoneyCodeSummary();
    }

    /**
     * Create an instance of {@link WSCarrierInfo }
     * 
     */
    public WSCarrierInfo createWSCarrierInfo() {
        return new WSCarrierInfo();
    }

    /**
     * Create an instance of {@link WSLocationGroup }
     * 
     */
    public WSLocationGroup createWSLocationGroup() {
        return new WSLocationGroup();
    }

    /**
     * Create an instance of {@link WSLocationGroupDescription }
     * 
     */
    public WSLocationGroupDescription createWSLocationGroupDescription() {
        return new WSLocationGroupDescription();
    }

    /**
     * Create an instance of {@link WSCreditLimits }
     * 
     */
    public WSCreditLimits createWSCreditLimits() {
        return new WSCreditLimits();
    }

    /**
     * Create an instance of {@link WSTranReject }
     * 
     */
    public WSTranReject createWSTranReject() {
        return new WSTranReject();
    }

    /**
     * Create an instance of {@link WSTranRejectSearch }
     * 
     */
    public WSTranRejectSearch createWSTranRejectSearch() {
        return new WSTranRejectSearch();
    }

    /**
     * Create an instance of {@link WSLastMileage }
     * 
     */
    public WSLastMileage createWSLastMileage() {
        return new WSLastMileage();
    }

    /**
     * Create an instance of {@link WSLastMileageSearch }
     * 
     */
    public WSLastMileageSearch createWSLastMileageSearch() {
        return new WSLastMileageSearch();
    }

    /**
     * Create an instance of {@link WSLocationSearch }
     * 
     */
    public WSLocationSearch createWSLocationSearch() {
        return new WSLocationSearch();
    }

    /**
     * Create an instance of {@link WSLocation }
     * 
     */
    public WSLocation createWSLocation() {
        return new WSLocation();
    }

    /**
     * Create an instance of {@link WSGeoPriceLocation }
     * 
     */
    public WSGeoPriceLocation createWSGeoPriceLocation() {
        return new WSGeoPriceLocation();
    }

    /**
     * Create an instance of {@link WSSmartPayAchTransfer }
     * 
     */
    public WSSmartPayAchTransfer createWSSmartPayAchTransfer() {
        return new WSSmartPayAchTransfer();
    }

    /**
     * Create an instance of {@link WSVerifySmartPayTransfer }
     * 
     */
    public WSVerifySmartPayTransfer createWSVerifySmartPayTransfer() {
        return new WSVerifySmartPayTransfer();
    }

    /**
     * Create an instance of {@link WSSmartPayTransferHistory }
     * 
     */
    public WSSmartPayTransferHistory createWSSmartPayTransferHistory() {
        return new WSSmartPayTransferHistory();
    }

    /**
     * Create an instance of {@link WSMobileSecurity }
     * 
     */
    public WSMobileSecurity createWSMobileSecurity() {
        return new WSMobileSecurity();
    }

    /**
     * Create an instance of {@link WSManagedFuelDriver }
     * 
     */
    public WSManagedFuelDriver createWSManagedFuelDriver() {
        return new WSManagedFuelDriver();
    }

    /**
     * Create an instance of {@link WSManagedFuel }
     * 
     */
    public WSManagedFuel createWSManagedFuel() {
        return new WSManagedFuel();
    }

    /**
     * Create an instance of {@link WSAllCashAvail }
     * 
     */
    public WSAllCashAvail createWSAllCashAvail() {
        return new WSAllCashAvail();
    }

    /**
     * Create an instance of {@link WSRequestStatus }
     * 
     */
    public WSRequestStatus createWSRequestStatus() {
        return new WSRequestStatus();
    }

    /**
     * Create an instance of {@link WSRegisterCheckAuthorization }
     * 
     */
    public WSRegisterCheckAuthorization createWSRegisterCheckAuthorization() {
        return new WSRegisterCheckAuthorization();
    }

    /**
     * Create an instance of {@link WSRegisteredCheckAuthorizationResponse }
     * 
     */
    public WSRegisteredCheckAuthorizationResponse createWSRegisteredCheckAuthorizationResponse() {
        return new WSRegisteredCheckAuthorizationResponse();
    }

    /**
     * Create an instance of {@link WSRegisteredCheckAuthorizationResults }
     * 
     */
    public WSRegisteredCheckAuthorizationResults createWSRegisteredCheckAuthorizationResults() {
        return new WSRegisteredCheckAuthorizationResults();
    }

    /**
     * Create an instance of {@link WSOrderType }
     * 
     */
    public WSOrderType createWSOrderType() {
        return new WSOrderType();
    }

    /**
     * Create an instance of {@link WSOrderTypesResponse }
     * 
     */
    public WSOrderTypesResponse createWSOrderTypesResponse() {
        return new WSOrderTypesResponse();
    }

    /**
     * Create an instance of {@link WSOrderStyle }
     * 
     */
    public WSOrderStyle createWSOrderStyle() {
        return new WSOrderStyle();
    }

    /**
     * Create an instance of {@link WSOrderStylesResponse }
     * 
     */
    public WSOrderStylesResponse createWSOrderStylesResponse() {
        return new WSOrderStylesResponse();
    }

    /**
     * Create an instance of {@link WSOrderAllowedValue }
     * 
     */
    public WSOrderAllowedValue createWSOrderAllowedValue() {
        return new WSOrderAllowedValue();
    }

    /**
     * Create an instance of {@link WSOrderChoice }
     * 
     */
    public WSOrderChoice createWSOrderChoice() {
        return new WSOrderChoice();
    }

    /**
     * Create an instance of {@link WSOrderChoicesResponse }
     * 
     */
    public WSOrderChoicesResponse createWSOrderChoicesResponse() {
        return new WSOrderChoicesResponse();
    }

    /**
     * Create an instance of {@link WSIvrLoginRoleParam }
     * 
     */
    public WSIvrLoginRoleParam createWSIvrLoginRoleParam() {
        return new WSIvrLoginRoleParam();
    }

    /**
     * Create an instance of {@link WSIvrLoginRole }
     * 
     */
    public WSIvrLoginRole createWSIvrLoginRole() {
        return new WSIvrLoginRole();
    }

    /**
     * Create an instance of {@link WSIvrLoginRoles }
     * 
     */
    public WSIvrLoginRoles createWSIvrLoginRoles() {
        return new WSIvrLoginRoles();
    }

    /**
     * Create an instance of {@link WSIvrLoginWithPinResponse }
     * 
     */
    public WSIvrLoginWithPinResponse createWSIvrLoginWithPinResponse() {
        return new WSIvrLoginWithPinResponse();
    }

    /**
     * Create an instance of {@link WSIvrLoginChangePinResponse }
     * 
     */
    public WSIvrLoginChangePinResponse createWSIvrLoginChangePinResponse() {
        return new WSIvrLoginChangePinResponse();
    }

    /**
     * Create an instance of {@link WSOrderProp }
     * 
     */
    public WSOrderProp createWSOrderProp() {
        return new WSOrderProp();
    }

    /**
     * Create an instance of {@link WSOrderCardProp }
     * 
     */
    public WSOrderCardProp createWSOrderCardProp() {
        return new WSOrderCardProp();
    }

    /**
     * Create an instance of {@link WSOrderCard }
     * 
     */
    public WSOrderCard createWSOrderCard() {
        return new WSOrderCard();
    }

    /**
     * Create an instance of {@link WSCreateAndSubmitOrderData }
     * 
     */
    public WSCreateAndSubmitOrderData createWSCreateAndSubmitOrderData() {
        return new WSCreateAndSubmitOrderData();
    }

    /**
     * Create an instance of {@link WSNewOrderData }
     * 
     */
    public WSNewOrderData createWSNewOrderData() {
        return new WSNewOrderData();
    }

    /**
     * Create an instance of {@link WSUpdOrderData }
     * 
     */
    public WSUpdOrderData createWSUpdOrderData() {
        return new WSUpdOrderData();
    }

    /**
     * Create an instance of {@link WSUpdOrderCardsData }
     * 
     */
    public WSUpdOrderCardsData createWSUpdOrderCardsData() {
        return new WSUpdOrderCardsData();
    }

    /**
     * Create an instance of {@link WSGetOrderData }
     * 
     */
    public WSGetOrderData createWSGetOrderData() {
        return new WSGetOrderData();
    }

    /**
     * Create an instance of {@link WSGetOrderCardsData }
     * 
     */
    public WSGetOrderCardsData createWSGetOrderCardsData() {
        return new WSGetOrderCardsData();
    }

    /**
     * Create an instance of {@link WSFindOrderSummaryFilter }
     * 
     */
    public WSFindOrderSummaryFilter createWSFindOrderSummaryFilter() {
        return new WSFindOrderSummaryFilter();
    }

    /**
     * Create an instance of {@link WSOrderSummary }
     * 
     */
    public WSOrderSummary createWSOrderSummary() {
        return new WSOrderSummary();
    }

    /**
     * Create an instance of {@link WSFindOrderSummaryData }
     * 
     */
    public WSFindOrderSummaryData createWSFindOrderSummaryData() {
        return new WSFindOrderSummaryData();
    }

    /**
     * Create an instance of {@link WSPolicyRefreshingLimitsData }
     * 
     */
    public WSPolicyRefreshingLimitsData createWSPolicyRefreshingLimitsData() {
        return new WSPolicyRefreshingLimitsData();
    }

    /**
     * Create an instance of {@link WSCardRefreshingLimitsData }
     * 
     */
    public WSCardRefreshingLimitsData createWSCardRefreshingLimitsData() {
        return new WSCardRefreshingLimitsData();
    }

    /**
     * Create an instance of {@link WSCarrierGetsDiscount }
     * 
     */
    public WSCarrierGetsDiscount createWSCarrierGetsDiscount() {
        return new WSCarrierGetsDiscount();
    }

    /**
     * Create an instance of {@link WSCarrierGetsDiscountData }
     * 
     */
    public WSCarrierGetsDiscountData createWSCarrierGetsDiscountData() {
        return new WSCarrierGetsDiscountData();
    }

    /**
     * Create an instance of {@link WSChildTranReject }
     * 
     */
    public WSChildTranReject createWSChildTranReject() {
        return new WSChildTranReject();
    }

    /**
     * Create an instance of {@link WSAllowedOrderType }
     * 
     */
    public WSAllowedOrderType createWSAllowedOrderType() {
        return new WSAllowedOrderType();
    }

    /**
     * Create an instance of {@link WSAllowedOrderTypesResponse }
     * 
     */
    public WSAllowedOrderTypesResponse createWSAllowedOrderTypesResponse() {
        return new WSAllowedOrderTypesResponse();
    }

    /**
     * Create an instance of {@link WSIssueNewPayrollCardData }
     * 
     */
    public WSIssueNewPayrollCardData createWSIssueNewPayrollCardData() {
        return new WSIssueNewPayrollCardData();
    }

    /**
     * Create an instance of {@link WSIssueNewPersonalizedPayrollCardData }
     * 
     */
    public WSIssueNewPersonalizedPayrollCardData createWSIssueNewPersonalizedPayrollCardData() {
        return new WSIssueNewPersonalizedPayrollCardData();
    }

    /**
     * Create an instance of {@link WSReissueDamagedCardData }
     * 
     */
    public WSReissueDamagedCardData createWSReissueDamagedCardData() {
        return new WSReissueDamagedCardData();
    }

    /**
     * Create an instance of {@link WSReplaceLostOrStolenCardData }
     * 
     */
    public WSReplaceLostOrStolenCardData createWSReplaceLostOrStolenCardData() {
        return new WSReplaceLostOrStolenCardData();
    }

    /**
     * Create an instance of {@link WSCreateInfoLimitCardData }
     * 
     */
    public WSCreateInfoLimitCardData createWSCreateInfoLimitCardData() {
        return new WSCreateInfoLimitCardData();
    }

    /**
     * Create an instance of {@link WSDeleteInfoLimitCardData }
     * 
     */
    public WSDeleteInfoLimitCardData createWSDeleteInfoLimitCardData() {
        return new WSDeleteInfoLimitCardData();
    }

    /**
     * Create an instance of {@link WSMonCodesInfo }
     * 
     */
    public WSMonCodesInfo createWSMonCodesInfo() {
        return new WSMonCodesInfo();
    }

    /**
     * Create an instance of {@link WSCheckDesc }
     * 
     */
    public WSCheckDesc createWSCheckDesc() {
        return new WSCheckDesc();
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link DoubleArray }
     * 
     */
    public DoubleArray createDoubleArray() {
        return new DoubleArray();
    }

    /**
     * Create an instance of {@link IntArray }
     * 
     */
    public IntArray createIntArray() {
        return new IntArray();
    }

    /**
     * Create an instance of {@link WSCardDescriptionArray }
     * 
     */
    public WSCardDescriptionArray createWSCardDescriptionArray() {
        return new WSCardDescriptionArray();
    }

    /**
     * Create an instance of {@link WSCashRecordArray }
     * 
     */
    public WSCashRecordArray createWSCashRecordArray() {
        return new WSCashRecordArray();
    }

    /**
     * Create an instance of {@link WSCashRecordArrayV2 }
     * 
     */
    public WSCashRecordArrayV2 createWSCashRecordArrayV2() {
        return new WSCashRecordArrayV2();
    }

    /**
     * Create an instance of {@link WSContractArray }
     * 
     */
    public WSContractArray createWSContractArray() {
        return new WSContractArray();
    }

    /**
     * Create an instance of {@link WSMoneyCodeUseArray }
     * 
     */
    public WSMoneyCodeUseArray createWSMoneyCodeUseArray() {
        return new WSMoneyCodeUseArray();
    }

    /**
     * Create an instance of {@link WSMoneyCodeUseArrayV2 }
     * 
     */
    public WSMoneyCodeUseArrayV2 createWSMoneyCodeUseArrayV2() {
        return new WSMoneyCodeUseArrayV2();
    }

    /**
     * Create an instance of {@link WSMoneyCodeHistRecArray }
     * 
     */
    public WSMoneyCodeHistRecArray createWSMoneyCodeHistRecArray() {
        return new WSMoneyCodeHistRecArray();
    }

    /**
     * Create an instance of {@link WSMoneyCodeHistRecArrayV2 }
     * 
     */
    public WSMoneyCodeHistRecArrayV2 createWSMoneyCodeHistRecArrayV2() {
        return new WSMoneyCodeHistRecArrayV2();
    }

    /**
     * Create an instance of {@link WSPolicyDescriptionArray }
     * 
     */
    public WSPolicyDescriptionArray createWSPolicyDescriptionArray() {
        return new WSPolicyDescriptionArray();
    }

    /**
     * Create an instance of {@link WSSitePolicyDescriptionArray }
     * 
     */
    public WSSitePolicyDescriptionArray createWSSitePolicyDescriptionArray() {
        return new WSSitePolicyDescriptionArray();
    }

    /**
     * Create an instance of {@link WSProductGroupArray }
     * 
     */
    public WSProductGroupArray createWSProductGroupArray() {
        return new WSProductGroupArray();
    }

    /**
     * Create an instance of {@link WSProductArray }
     * 
     */
    public WSProductArray createWSProductArray() {
        return new WSProductArray();
    }

    /**
     * Create an instance of {@link WSTransLocationArray }
     * 
     */
    public WSTransLocationArray createWSTransLocationArray() {
        return new WSTransLocationArray();
    }

    /**
     * Create an instance of {@link WSTransactionArray }
     * 
     */
    public WSTransactionArray createWSTransactionArray() {
        return new WSTransactionArray();
    }

    /**
     * Create an instance of {@link WSTransactionArrayV2 }
     * 
     */
    public WSTransactionArrayV2 createWSTransactionArrayV2() {
        return new WSTransactionArrayV2();
    }

    /**
     * Create an instance of {@link WSTransactionArrayV3 }
     * 
     */
    public WSTransactionArrayV3 createWSTransactionArrayV3() {
        return new WSTransactionArrayV3();
    }

    /**
     * Create an instance of {@link WSChecksArray }
     * 
     */
    public WSChecksArray createWSChecksArray() {
        return new WSChecksArray();
    }

    /**
     * Create an instance of {@link WSOneChildCarrierTransactionArray }
     * 
     */
    public WSOneChildCarrierTransactionArray createWSOneChildCarrierTransactionArray() {
        return new WSOneChildCarrierTransactionArray();
    }

    /**
     * Create an instance of {@link WSTransactionExtArray }
     * 
     */
    public WSTransactionExtArray createWSTransactionExtArray() {
        return new WSTransactionExtArray();
    }

    /**
     * Create an instance of {@link WSTransExtLocArray }
     * 
     */
    public WSTransExtLocArray createWSTransExtLocArray() {
        return new WSTransExtLocArray();
    }

    /**
     * Create an instance of {@link WSMCTransExtLocArray }
     * 
     */
    public WSMCTransExtLocArray createWSMCTransExtLocArray() {
        return new WSMCTransExtLocArray();
    }

    /**
     * Create an instance of {@link WSMCTransExtLocV2Array }
     * 
     */
    public WSMCTransExtLocV2Array createWSMCTransExtLocV2Array() {
        return new WSMCTransExtLocV2Array();
    }

    /**
     * Create an instance of {@link WSMCTransExtLocV3Array }
     * 
     */
    public WSMCTransExtLocV3Array createWSMCTransExtLocV3Array() {
        return new WSMCTransExtLocV3Array();
    }

    /**
     * Create an instance of {@link WSSmartPayTransferAccountArray }
     * 
     */
    public WSSmartPayTransferAccountArray createWSSmartPayTransferAccountArray() {
        return new WSSmartPayTransferAccountArray();
    }

    /**
     * Create an instance of {@link WSSmartPayScheduledTransferArray }
     * 
     */
    public WSSmartPayScheduledTransferArray createWSSmartPayScheduledTransferArray() {
        return new WSSmartPayScheduledTransferArray();
    }

    /**
     * Create an instance of {@link WSLocationGroupArray }
     * 
     */
    public WSLocationGroupArray createWSLocationGroupArray() {
        return new WSLocationGroupArray();
    }

    /**
     * Create an instance of {@link WSLocationGroupDescriptionArray }
     * 
     */
    public WSLocationGroupDescriptionArray createWSLocationGroupDescriptionArray() {
        return new WSLocationGroupDescriptionArray();
    }

    /**
     * Create an instance of {@link WSCardSummaryArray }
     * 
     */
    public WSCardSummaryArray createWSCardSummaryArray() {
        return new WSCardSummaryArray();
    }

    /**
     * Create an instance of {@link WSTranRejectArray }
     * 
     */
    public WSTranRejectArray createWSTranRejectArray() {
        return new WSTranRejectArray();
    }

    /**
     * Create an instance of {@link WSLastMileageArray }
     * 
     */
    public WSLastMileageArray createWSLastMileageArray() {
        return new WSLastMileageArray();
    }

    /**
     * Create an instance of {@link WSLocationArray }
     * 
     */
    public WSLocationArray createWSLocationArray() {
        return new WSLocationArray();
    }

    /**
     * Create an instance of {@link WSGeoPriceLocationArray }
     * 
     */
    public WSGeoPriceLocationArray createWSGeoPriceLocationArray() {
        return new WSGeoPriceLocationArray();
    }

    /**
     * Create an instance of {@link WSSmartPayTransferHistoryArray }
     * 
     */
    public WSSmartPayTransferHistoryArray createWSSmartPayTransferHistoryArray() {
        return new WSSmartPayTransferHistoryArray();
    }

    /**
     * Create an instance of {@link WSMobileSecurityArray }
     * 
     */
    public WSMobileSecurityArray createWSMobileSecurityArray() {
        return new WSMobileSecurityArray();
    }

    /**
     * Create an instance of {@link WSAllCashAvailArray }
     * 
     */
    public WSAllCashAvailArray createWSAllCashAvailArray() {
        return new WSAllCashAvailArray();
    }

    /**
     * Create an instance of {@link WSCarrierGetsDiscountArray }
     * 
     */
    public WSCarrierGetsDiscountArray createWSCarrierGetsDiscountArray() {
        return new WSCarrierGetsDiscountArray();
    }

    /**
     * Create an instance of {@link WSCarrierGetsDiscountDataArray }
     * 
     */
    public WSCarrierGetsDiscountDataArray createWSCarrierGetsDiscountDataArray() {
        return new WSCarrierGetsDiscountDataArray();
    }

    /**
     * Create an instance of {@link WSChildTranRejectArray }
     * 
     */
    public WSChildTranRejectArray createWSChildTranRejectArray() {
        return new WSChildTranRejectArray();
    }

    /**
     * Create an instance of {@link WSMonCodesInfoArray }
     * 
     */
    public WSMonCodesInfoArray createWSMonCodesInfoArray() {
        return new WSMonCodesInfoArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "dayCntLimit", scope = WSCardRefreshingLimitsData.class)
    public JAXBElement<BigInteger> createWSCardRefreshingLimitsDataDayCntLimit(BigInteger value) {
        return new JAXBElement<BigInteger>(_WSCardRefreshingLimitsDataDayCntLimit_QNAME, BigInteger.class, WSCardRefreshingLimitsData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "dayAmtLimit", scope = WSCardRefreshingLimitsData.class)
    public JAXBElement<BigInteger> createWSCardRefreshingLimitsDataDayAmtLimit(BigInteger value) {
        return new JAXBElement<BigInteger>(_WSCardRefreshingLimitsDataDayAmtLimit_QNAME, BigInteger.class, WSCardRefreshingLimitsData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "weekCntLimit", scope = WSCardRefreshingLimitsData.class)
    public JAXBElement<BigInteger> createWSCardRefreshingLimitsDataWeekCntLimit(BigInteger value) {
        return new JAXBElement<BigInteger>(_WSCardRefreshingLimitsDataWeekCntLimit_QNAME, BigInteger.class, WSCardRefreshingLimitsData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "weekAmtLimit", scope = WSCardRefreshingLimitsData.class)
    public JAXBElement<BigInteger> createWSCardRefreshingLimitsDataWeekAmtLimit(BigInteger value) {
        return new JAXBElement<BigInteger>(_WSCardRefreshingLimitsDataWeekAmtLimit_QNAME, BigInteger.class, WSCardRefreshingLimitsData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "monCntLimit", scope = WSCardRefreshingLimitsData.class)
    public JAXBElement<BigInteger> createWSCardRefreshingLimitsDataMonCntLimit(BigInteger value) {
        return new JAXBElement<BigInteger>(_WSCardRefreshingLimitsDataMonCntLimit_QNAME, BigInteger.class, WSCardRefreshingLimitsData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "monAmtLimit", scope = WSCardRefreshingLimitsData.class)
    public JAXBElement<BigInteger> createWSCardRefreshingLimitsDataMonAmtLimit(BigInteger value) {
        return new JAXBElement<BigInteger>(_WSCardRefreshingLimitsDataMonAmtLimit_QNAME, BigInteger.class, WSCardRefreshingLimitsData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "dayCntLimit", scope = WSPolicyRefreshingLimitsData.class)
    public JAXBElement<BigInteger> createWSPolicyRefreshingLimitsDataDayCntLimit(BigInteger value) {
        return new JAXBElement<BigInteger>(_WSCardRefreshingLimitsDataDayCntLimit_QNAME, BigInteger.class, WSPolicyRefreshingLimitsData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "dayAmtLimit", scope = WSPolicyRefreshingLimitsData.class)
    public JAXBElement<BigInteger> createWSPolicyRefreshingLimitsDataDayAmtLimit(BigInteger value) {
        return new JAXBElement<BigInteger>(_WSCardRefreshingLimitsDataDayAmtLimit_QNAME, BigInteger.class, WSPolicyRefreshingLimitsData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "weekCntLimit", scope = WSPolicyRefreshingLimitsData.class)
    public JAXBElement<BigInteger> createWSPolicyRefreshingLimitsDataWeekCntLimit(BigInteger value) {
        return new JAXBElement<BigInteger>(_WSCardRefreshingLimitsDataWeekCntLimit_QNAME, BigInteger.class, WSPolicyRefreshingLimitsData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "weekAmtLimit", scope = WSPolicyRefreshingLimitsData.class)
    public JAXBElement<BigInteger> createWSPolicyRefreshingLimitsDataWeekAmtLimit(BigInteger value) {
        return new JAXBElement<BigInteger>(_WSCardRefreshingLimitsDataWeekAmtLimit_QNAME, BigInteger.class, WSPolicyRefreshingLimitsData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "monCntLimit", scope = WSPolicyRefreshingLimitsData.class)
    public JAXBElement<BigInteger> createWSPolicyRefreshingLimitsDataMonCntLimit(BigInteger value) {
        return new JAXBElement<BigInteger>(_WSCardRefreshingLimitsDataMonCntLimit_QNAME, BigInteger.class, WSPolicyRefreshingLimitsData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "monAmtLimit", scope = WSPolicyRefreshingLimitsData.class)
    public JAXBElement<BigInteger> createWSPolicyRefreshingLimitsDataMonAmtLimit(BigInteger value) {
        return new JAXBElement<BigInteger>(_WSCardRefreshingLimitsDataMonAmtLimit_QNAME, BigInteger.class, WSPolicyRefreshingLimitsData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "payrUse", scope = WSCardSummaryV2Req.class)
    public JAXBElement<String> createWSCardSummaryV2ReqPayrUse(String value) {
        return new JAXBElement<String>(_WSCardSummaryV2ReqPayrUse_QNAME, String.class, WSCardSummaryV2Req.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "type", scope = WSCardSummaryReq.class)
    public JAXBElement<String> createWSCardSummaryReqType(String value) {
        return new JAXBElement<String>(_WSCardSummaryReqType_QNAME, String.class, WSCardSummaryReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "searchParam", scope = WSCardSummaryReq.class)
    public JAXBElement<String> createWSCardSummaryReqSearchParam(String value) {
        return new JAXBElement<String>(_WSCardSummaryReqSearchParam_QNAME, String.class, WSCardSummaryReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "payrUse", scope = WSCardSummaryReq.class)
    public JAXBElement<String> createWSCardSummaryReqPayrUse(String value) {
        return new JAXBElement<String>(_WSCardSummaryV2ReqPayrUse_QNAME, String.class, WSCardSummaryReq.class, value);
    }

}
