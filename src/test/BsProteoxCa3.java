/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Aarón Delgado
 */
@Entity
@Table(name = "BS_PROTEOX_CA3")
@NamedQueries({
    @NamedQuery(name = "BsProteoxCa3.findAll", query = "SELECT b FROM BsProteoxCa3 b")})
public class BsProteoxCa3 implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CA3")
    private BigDecimal idCa3;
    @Column(name = "EQUIV_TYPE")
    private String equivType;
    @Column(name = "PRIVATE")
    private String private1;
    @Column(name = "B2B")
    private String b2b;
    @Column(name = "BASE_AMOUNT_DPS")
    private BigDecimal baseAmountDps;
    @Column(name = "CCY")
    private String ccy;
    @Column(name = "CCY1")
    private String ccy1;
    @Column(name = "CCY2")
    private String ccy2;
    @Column(name = "CENTER")
    private String center;
    @Column(name = "CHANNEL")
    private String channel;
    @Column(name = "CITY")
    private String city;
    @Column(name = "CONTRACT_CODE")
    private String contractCode;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "COVERAGE")
    private String coverage;
    @Column(name = "CREDIT_AUTHORISATION_TYPE")
    private String creditAuthorisationType;
    @Column(name = "CREDIT_CCY")
    private String creditCcy;
    @Column(name = "DEAL_DATE")
    private String dealDate;
    @Column(name = "DEAL_DAY")
    private String dealDay;
    @Column(name = "DEAL_TIME")
    private String dealTime;
    @Column(name = "ENTITY_CODE")
    private String entityCode;
    @Column(name = "EXECUTION_STYLE")
    private String executionStyle;
    @Column(name = "FAX")
    private String fax;
    @Column(name = "FEED_SOURCE_ID")
    private String feedSourceId;
    @Column(name = "FWD_DPS")
    private BigDecimal fwdDps;
    @Column(name = "FX_CROSS_DEAL_TYPE")
    private String fxCrossDealType;
    @Column(name = "GID_ID")
    private String gidId;
    @Column(name = "INCOMPETITION")
    private String incompetition;
    @Column(name = "INSTRUMENT")
    private String instrument;
    @Column(name = "ISSUING_CUSTOMER_NUMPERSON")
    private String issuingCustomerNumperson;
    @Column(name = "LEG_ID_PARENT")
    private String legIdParent;
    @Column(name = "LINE1")
    private String line1;
    @Column(name = "LINE2")
    private String line2;
    @Column(name = "MAKER_GROUP_ID")
    private String makerGroupId;
    @Column(name = "MAKER_ID")
    private String makerId;
    @Column(name = "MAKER_LEGAL_ADDRESS_CITY")
    private String makerLegalAddressCity;
    @Column(name = "MAKER_NAME")
    private String makerName;
    @Column(name = "MARKET_MEMO")
    private String marketMemo;
    @Column(name = "MARKUP_COMPLETE")
    private String markupComplete;
    @Column(name = "MIFID_AUTH_CODE")
    private String mifidAuthCode;
    @Column(name = "NET_TYPE")
    private String netType;
    @Column(name = "NODE")
    private String node;
    @Column(name = "NON_NEGOTIATED")
    private String nonNegotiated;
    @Column(name = "PARENT_DEAL_DATE")
    private String parentDealDate;
    @Column(name = "PARENT_DEAL_TIME")
    private String parentDealTime;
    @Column(name = "PARENT_LEG_ID")
    private String parentLegId;
    @Column(name = "PARENT_REFERENCE")
    private String parentReference;
    @Column(name = "PARENT_REQ_ID")
    private String parentReqId;
    @Column(name = "PARENT_VALUE")
    private String parentValue;
    @Column(name = "PAYMENT_METHOD")
    private String paymentMethod;
    @Column(name = "POSTCODE")
    private String postcode;
    @Column(name = "PRODUCT_TYPE")
    private String productType;
    @Column(name = "PROFIT_AMOUNT")
    private Double profitAmount;
    @Column(name = "PROXY_FULL_NAME")
    private String proxyFullName;
    @Column(name = "PROXY_GROUP_FULL_NAME")
    private String proxyGroupFullName;
    @Column(name = "PROXY_GROUP_ID")
    private String proxyGroupId;
    @Column(name = "PROXY_GROUP_NAME")
    private String proxyGroupName;
    @Column(name = "PROXY_ID")
    private String proxyId;
    @Column(name = "PROXY_NAME")
    private String proxyName;
    @Column(name = "RATE1_NUM")
    private BigDecimal rate1Num;
    @Column(name = "RATE1_PAIR")
    private String rate1Pair;
    @Column(name = "RATE1_VALUE")
    private Double rate1Value;
    @Column(name = "RATE2_NUM")
    private BigDecimal rate2Num;
    @Column(name = "RATE2_PAIR")
    private String rate2Pair;
    @Column(name = "RATE2_VALUE")
    private Double rate2Value;
    @Column(name = "RECIPIENT")
    private String recipient;
    @Column(name = "REF")
    private String ref;
    @Column(name = "REQUEST_ID")
    private String requestId;
    @Column(name = "RISK_AMOUNT")
    private Double riskAmount;
    @Column(name = "RISK_CCY")
    private String riskCcy;
    @Column(name = "SIGNATORY")
    private String signatory;
    @Column(name = "SOURCE")
    private String source;
    @Column(name = "STATE")
    private String state;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "SUBMIT_ID")
    private String submitId;
    @Column(name = "SUPPORTED_PAYMENT_NUM")
    private BigDecimal supportedPaymentNum;
    @Column(name = "SUPPORTED_PAYMENT_VALUE")
    private String supportedPaymentValue;
    @Column(name = "TAKER_EMAIL")
    private String takerEmail;
    @Column(name = "TAKER_FAX")
    private String takerFax;
    @Column(name = "TAKER_FULL_NAME")
    private String takerFullName;
    @Column(name = "TAKER_GROUP_CONTACT_NAME")
    private String takerGroupContactName;
    @Column(name = "TAKER_GROUP_COUNTER_PARTY_ID")
    private String takerGroupCounterPartyId;
    @Column(name = "TAKER_GROUP_EXTERNAL_REF_ID")
    private String takerGroupExternalRefId;
    @Column(name = "TAKER_GROUP_FULL_NAME")
    private String takerGroupFullName;
    @Column(name = "TAKER_GROUP_ID")
    private String takerGroupId;
    @Column(name = "TAKER_GROUP_NAME")
    private String takerGroupName;
    @Column(name = "TAKER_GROUP_SHORT_NAME")
    private String takerGroupShortName;
    @Column(name = "TAKER_ID")
    private String takerId;
    @Column(name = "TAKER_LEGAL_FULL_NAME")
    private String takerLegalFullName;
    @Column(name = "TAKER_LEGAL_MEMO")
    private String takerLegalMemo;
    @Column(name = "TAKER_MEMO")
    private String takerMemo;
    @Column(name = "TAKER_NAME")
    private String takerName;
    @Column(name = "TAKER_TELEPHONE")
    private String takerTelephone;
    @Column(name = "TAKER_VERSION")
    private String takerVersion;
    @Column(name = "TARGET")
    private String target;
    @Column(name = "TELEPHONE")
    private String telephone;
    @Column(name = "TERMS_AMOUNT_DPS")
    private BigDecimal termsAmountDps;
    @Column(name = "TICKET_TYPE")
    private String ticketType;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "VERSION_TYPE")
    private String versionType;
    @Column(name = "VERSION_VALUE")
    private String versionValue;
    @Column(name = "REQUEST_TIME")
    private String requestTime;
    @Column(name = "PRICE_TIME")
    private String priceTime;
    @OneToMany(mappedBy = "idCa3")
    private Collection<BsProteoxCa3Leg> bsProteoxCa3LegCollection;

    public BsProteoxCa3() {
    }

    public BsProteoxCa3(BigDecimal idCa3) {
        this.idCa3 = idCa3;
    }

    public BigDecimal getIdCa3() {
        return idCa3;
    }

    public void setIdCa3(BigDecimal idCa3) {
        this.idCa3 = idCa3;
    }

    public String getEquivType() {
        return equivType;
    }

    public void setEquivType(String equivType) {
        this.equivType = equivType;
    }

    public String getPrivate1() {
        return private1;
    }

    public void setPrivate1(String private1) {
        this.private1 = private1;
    }

    public String getB2b() {
        return b2b;
    }

    public void setB2b(String b2b) {
        this.b2b = b2b;
    }

    public BigDecimal getBaseAmountDps() {
        return baseAmountDps;
    }

    public void setBaseAmountDps(BigDecimal baseAmountDps) {
        this.baseAmountDps = baseAmountDps;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getCcy1() {
        return ccy1;
    }

    public void setCcy1(String ccy1) {
        this.ccy1 = ccy1;
    }

    public String getCcy2() {
        return ccy2;
    }

    public void setCcy2(String ccy2) {
        this.ccy2 = ccy2;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCoverage() {
        return coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    public String getCreditAuthorisationType() {
        return creditAuthorisationType;
    }

    public void setCreditAuthorisationType(String creditAuthorisationType) {
        this.creditAuthorisationType = creditAuthorisationType;
    }

    public String getCreditCcy() {
        return creditCcy;
    }

    public void setCreditCcy(String creditCcy) {
        this.creditCcy = creditCcy;
    }

    public String getDealDate() {
        return dealDate;
    }

    public void setDealDate(String dealDate) {
        this.dealDate = dealDate;
    }

    public String getDealDay() {
        return dealDay;
    }

    public void setDealDay(String dealDay) {
        this.dealDay = dealDay;
    }

    public String getDealTime() {
        return dealTime;
    }

    public void setDealTime(String dealTime) {
        this.dealTime = dealTime;
    }

    public String getEntityCode() {
        return entityCode;
    }

    public void setEntityCode(String entityCode) {
        this.entityCode = entityCode;
    }

    public String getExecutionStyle() {
        return executionStyle;
    }

    public void setExecutionStyle(String executionStyle) {
        this.executionStyle = executionStyle;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getFeedSourceId() {
        return feedSourceId;
    }

    public void setFeedSourceId(String feedSourceId) {
        this.feedSourceId = feedSourceId;
    }

    public BigDecimal getFwdDps() {
        return fwdDps;
    }

    public void setFwdDps(BigDecimal fwdDps) {
        this.fwdDps = fwdDps;
    }

    public String getFxCrossDealType() {
        return fxCrossDealType;
    }

    public void setFxCrossDealType(String fxCrossDealType) {
        this.fxCrossDealType = fxCrossDealType;
    }

    public String getGidId() {
        return gidId;
    }

    public void setGidId(String gidId) {
        this.gidId = gidId;
    }

    public String getIncompetition() {
        return incompetition;
    }

    public void setIncompetition(String incompetition) {
        this.incompetition = incompetition;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getIssuingCustomerNumperson() {
        return issuingCustomerNumperson;
    }

    public void setIssuingCustomerNumperson(String issuingCustomerNumperson) {
        this.issuingCustomerNumperson = issuingCustomerNumperson;
    }

    public String getLegIdParent() {
        return legIdParent;
    }

    public void setLegIdParent(String legIdParent) {
        this.legIdParent = legIdParent;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getMakerGroupId() {
        return makerGroupId;
    }

    public void setMakerGroupId(String makerGroupId) {
        this.makerGroupId = makerGroupId;
    }

    public String getMakerId() {
        return makerId;
    }

    public void setMakerId(String makerId) {
        this.makerId = makerId;
    }

    public String getMakerLegalAddressCity() {
        return makerLegalAddressCity;
    }

    public void setMakerLegalAddressCity(String makerLegalAddressCity) {
        this.makerLegalAddressCity = makerLegalAddressCity;
    }

    public String getMakerName() {
        return makerName;
    }

    public void setMakerName(String makerName) {
        this.makerName = makerName;
    }

    public String getMarketMemo() {
        return marketMemo;
    }

    public void setMarketMemo(String marketMemo) {
        this.marketMemo = marketMemo;
    }

    public String getMarkupComplete() {
        return markupComplete;
    }

    public void setMarkupComplete(String markupComplete) {
        this.markupComplete = markupComplete;
    }

    public String getMifidAuthCode() {
        return mifidAuthCode;
    }

    public void setMifidAuthCode(String mifidAuthCode) {
        this.mifidAuthCode = mifidAuthCode;
    }

    public String getNetType() {
        return netType;
    }

    public void setNetType(String netType) {
        this.netType = netType;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getNonNegotiated() {
        return nonNegotiated;
    }

    public void setNonNegotiated(String nonNegotiated) {
        this.nonNegotiated = nonNegotiated;
    }

    public String getParentDealDate() {
        return parentDealDate;
    }

    public void setParentDealDate(String parentDealDate) {
        this.parentDealDate = parentDealDate;
    }

    public String getParentDealTime() {
        return parentDealTime;
    }

    public void setParentDealTime(String parentDealTime) {
        this.parentDealTime = parentDealTime;
    }

    public String getParentLegId() {
        return parentLegId;
    }

    public void setParentLegId(String parentLegId) {
        this.parentLegId = parentLegId;
    }

    public String getParentReference() {
        return parentReference;
    }

    public void setParentReference(String parentReference) {
        this.parentReference = parentReference;
    }

    public String getParentReqId() {
        return parentReqId;
    }

    public void setParentReqId(String parentReqId) {
        this.parentReqId = parentReqId;
    }

    public String getParentValue() {
        return parentValue;
    }

    public void setParentValue(String parentValue) {
        this.parentValue = parentValue;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Double getProfitAmount() {
        return profitAmount;
    }

    public void setProfitAmount(Double profitAmount) {
        this.profitAmount = profitAmount;
    }

    public String getProxyFullName() {
        return proxyFullName;
    }

    public void setProxyFullName(String proxyFullName) {
        this.proxyFullName = proxyFullName;
    }

    public String getProxyGroupFullName() {
        return proxyGroupFullName;
    }

    public void setProxyGroupFullName(String proxyGroupFullName) {
        this.proxyGroupFullName = proxyGroupFullName;
    }

    public String getProxyGroupId() {
        return proxyGroupId;
    }

    public void setProxyGroupId(String proxyGroupId) {
        this.proxyGroupId = proxyGroupId;
    }

    public String getProxyGroupName() {
        return proxyGroupName;
    }

    public void setProxyGroupName(String proxyGroupName) {
        this.proxyGroupName = proxyGroupName;
    }

    public String getProxyId() {
        return proxyId;
    }

    public void setProxyId(String proxyId) {
        this.proxyId = proxyId;
    }

    public String getProxyName() {
        return proxyName;
    }

    public void setProxyName(String proxyName) {
        this.proxyName = proxyName;
    }

    public BigDecimal getRate1Num() {
        return rate1Num;
    }

    public void setRate1Num(BigDecimal rate1Num) {
        this.rate1Num = rate1Num;
    }

    public String getRate1Pair() {
        return rate1Pair;
    }

    public void setRate1Pair(String rate1Pair) {
        this.rate1Pair = rate1Pair;
    }

    public Double getRate1Value() {
        return rate1Value;
    }

    public void setRate1Value(Double rate1Value) {
        this.rate1Value = rate1Value;
    }

    public BigDecimal getRate2Num() {
        return rate2Num;
    }

    public void setRate2Num(BigDecimal rate2Num) {
        this.rate2Num = rate2Num;
    }

    public String getRate2Pair() {
        return rate2Pair;
    }

    public void setRate2Pair(String rate2Pair) {
        this.rate2Pair = rate2Pair;
    }

    public Double getRate2Value() {
        return rate2Value;
    }

    public void setRate2Value(Double rate2Value) {
        this.rate2Value = rate2Value;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Double getRiskAmount() {
        return riskAmount;
    }

    public void setRiskAmount(Double riskAmount) {
        this.riskAmount = riskAmount;
    }

    public String getRiskCcy() {
        return riskCcy;
    }

    public void setRiskCcy(String riskCcy) {
        this.riskCcy = riskCcy;
    }

    public String getSignatory() {
        return signatory;
    }

    public void setSignatory(String signatory) {
        this.signatory = signatory;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubmitId() {
        return submitId;
    }

    public void setSubmitId(String submitId) {
        this.submitId = submitId;
    }

    public BigDecimal getSupportedPaymentNum() {
        return supportedPaymentNum;
    }

    public void setSupportedPaymentNum(BigDecimal supportedPaymentNum) {
        this.supportedPaymentNum = supportedPaymentNum;
    }

    public String getSupportedPaymentValue() {
        return supportedPaymentValue;
    }

    public void setSupportedPaymentValue(String supportedPaymentValue) {
        this.supportedPaymentValue = supportedPaymentValue;
    }

    public String getTakerEmail() {
        return takerEmail;
    }

    public void setTakerEmail(String takerEmail) {
        this.takerEmail = takerEmail;
    }

    public String getTakerFax() {
        return takerFax;
    }

    public void setTakerFax(String takerFax) {
        this.takerFax = takerFax;
    }

    public String getTakerFullName() {
        return takerFullName;
    }

    public void setTakerFullName(String takerFullName) {
        this.takerFullName = takerFullName;
    }

    public String getTakerGroupContactName() {
        return takerGroupContactName;
    }

    public void setTakerGroupContactName(String takerGroupContactName) {
        this.takerGroupContactName = takerGroupContactName;
    }

    public String getTakerGroupCounterPartyId() {
        return takerGroupCounterPartyId;
    }

    public void setTakerGroupCounterPartyId(String takerGroupCounterPartyId) {
        this.takerGroupCounterPartyId = takerGroupCounterPartyId;
    }

    public String getTakerGroupExternalRefId() {
        return takerGroupExternalRefId;
    }

    public void setTakerGroupExternalRefId(String takerGroupExternalRefId) {
        this.takerGroupExternalRefId = takerGroupExternalRefId;
    }

    public String getTakerGroupFullName() {
        return takerGroupFullName;
    }

    public void setTakerGroupFullName(String takerGroupFullName) {
        this.takerGroupFullName = takerGroupFullName;
    }

    public String getTakerGroupId() {
        return takerGroupId;
    }

    public void setTakerGroupId(String takerGroupId) {
        this.takerGroupId = takerGroupId;
    }

    public String getTakerGroupName() {
        return takerGroupName;
    }

    public void setTakerGroupName(String takerGroupName) {
        this.takerGroupName = takerGroupName;
    }

    public String getTakerGroupShortName() {
        return takerGroupShortName;
    }

    public void setTakerGroupShortName(String takerGroupShortName) {
        this.takerGroupShortName = takerGroupShortName;
    }

    public String getTakerId() {
        return takerId;
    }

    public void setTakerId(String takerId) {
        this.takerId = takerId;
    }

    public String getTakerLegalFullName() {
        return takerLegalFullName;
    }

    public void setTakerLegalFullName(String takerLegalFullName) {
        this.takerLegalFullName = takerLegalFullName;
    }

    public String getTakerLegalMemo() {
        return takerLegalMemo;
    }

    public void setTakerLegalMemo(String takerLegalMemo) {
        this.takerLegalMemo = takerLegalMemo;
    }

    public String getTakerMemo() {
        return takerMemo;
    }

    public void setTakerMemo(String takerMemo) {
        this.takerMemo = takerMemo;
    }

    public String getTakerName() {
        return takerName;
    }

    public void setTakerName(String takerName) {
        this.takerName = takerName;
    }

    public String getTakerTelephone() {
        return takerTelephone;
    }

    public void setTakerTelephone(String takerTelephone) {
        this.takerTelephone = takerTelephone;
    }

    public String getTakerVersion() {
        return takerVersion;
    }

    public void setTakerVersion(String takerVersion) {
        this.takerVersion = takerVersion;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public BigDecimal getTermsAmountDps() {
        return termsAmountDps;
    }

    public void setTermsAmountDps(BigDecimal termsAmountDps) {
        this.termsAmountDps = termsAmountDps;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersionType() {
        return versionType;
    }

    public void setVersionType(String versionType) {
        this.versionType = versionType;
    }

    public String getVersionValue() {
        return versionValue;
    }

    public void setVersionValue(String versionValue) {
        this.versionValue = versionValue;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public String getPriceTime() {
        return priceTime;
    }

    public void setPriceTime(String priceTime) {
        this.priceTime = priceTime;
    }

    public Collection<BsProteoxCa3Leg> getBsProteoxCa3LegCollection() {
        return bsProteoxCa3LegCollection;
    }

    public void setBsProteoxCa3LegCollection(Collection<BsProteoxCa3Leg> bsProteoxCa3LegCollection) {
        this.bsProteoxCa3LegCollection = bsProteoxCa3LegCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCa3 != null ? idCa3.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxCa3)) {
            return false;
        }
        BsProteoxCa3 other = (BsProteoxCa3) object;
        if ((this.idCa3 == null && other.idCa3 != null) || (this.idCa3 != null && !this.idCa3.equals(other.idCa3))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxCa3[ idCa3=" + idCa3 + " ]";
    }
    
}
