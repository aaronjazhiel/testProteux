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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Aarón Delgado
 */
@Entity
@Table(name = "BS_PROTEOX_CA3_LEG")
@NamedQueries({
    @NamedQuery(name = "BsProteoxCa3Leg.findAll", query = "SELECT b FROM BsProteoxCa3Leg b")})
public class BsProteoxCa3Leg implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_LEG")
    private BigDecimal idLeg;
    @Column(name = "ACCOUNT_ID")
    private String accountId;
    @Column(name = "ACCOUNT_LONG_NAME")
    private String accountLongName;
    @Column(name = "ALL_IN")
    private Double allIn;
    @Column(name = "AMOUNT_OUTSTANDING")
    private Double amountOutstanding;
    @Column(name = "BUY")
    private Double buy;
    @Column(name = "CCY")
    private String ccy;
    @Column(name = "CONTRA_AMOUNT")
    private Double contraAmount;
    @Column(name = "CONTRA_AMOUNT_OUTSTANDING")
    private Double contraAmountOutstanding;
    @Column(name = "CREDIT_AMOUNT")
    private Double creditAmount;
    @Column(name = "DEALT_AMOUNT")
    private Double dealtAmount;
    @Column(name = "DEALT_CCY")
    private String dealtCcy;
    @Column(name = "EQUIV_AMOUNT")
    private Double equivAmount;
    @Column(name = "EQUIV_RATES_PAIR")
    private String equivRatesPair;
    @Column(name = "EQUIV_RATES_NUM")
    private BigDecimal equivRatesNum;
    @Column(name = "EQUIV_RATES_VALUE")
    private Double equivRatesValue;
    @Column(name = "FWDS")
    private Double fwds;
    @Column(name = "LEG_AMOUNT_OUTSTANDING")
    private Double legAmountOutstanding;
    @Column(name = "LEG_CONTRA_AMOUNT")
    private Double legContraAmount;
    @Column(name = "LEG_CREDIT_AMOUNT")
    private Double legCreditAmount;
    @Column(name = "LEG_DEALT_AMOUNT")
    private Double legDealtAmount;
    @Column(name = "LEG_RISK_AMOUNT")
    private Double legRiskAmount;
    @Column(name = "LEG_TAKER_BUYS_BASE")
    private String legTakerBuysBase;
    @Column(name = "MAKER_ACCOUNT")
    private String makerAccount;
    @Column(name = "NUM_LEG")
    private BigDecimal numLeg;
    @Column(name = "PROFIT_AMOUNT")
    private Double profitAmount;
    @Column(name = "REQUIREMENT_TAKER_BUYS_BASE")
    private String requirementTakerBuysBase;
    @Column(name = "REQUIREMENTS")
    private BigDecimal requirements;
    @Column(name = "RISK_AMOUNT")
    private Double riskAmount;
    @Column(name = "SELL")
    private Double sell;
    @Column(name = "SPOT")
    private Double spot;
    @Column(name = "SPOT_DATE")
    private String spotDate;
    @Column(name = "START_DATE_TYPE")
    private String startDateType;
    @Column(name = "START_DATE_VALUE")
    private String startDateValue;
    @Column(name = "TAKER_ACCOUNT")
    private String takerAccount;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "VALUE_DATE_TYPE")
    private String valueDateType;
    @Column(name = "VALUE_DATE_VALUE")
    private String valueDateValue;
    @Column(name = "RET_PRICE")
    private String retPrice;
    @OneToMany(mappedBy = "idLeg")
    private Collection<BsProteoxCa3CrossComponent> bsProteoxCa3CrossComponentCollection;
    @JoinColumn(name = "ID_CA3", referencedColumnName = "ID_CA3")
    @ManyToOne
    private BsProteoxCa3 idCa3;
    @OneToMany(mappedBy = "idLeg")
    private Collection<BsProteoxCa3SettlmntDtl> bsProteoxCa3SettlmntDtlCollection;

    public BsProteoxCa3Leg() {
    }

    public BsProteoxCa3Leg(BigDecimal idLeg) {
        this.idLeg = idLeg;
    }

    public BigDecimal getIdLeg() {
        return idLeg;
    }

    public void setIdLeg(BigDecimal idLeg) {
        this.idLeg = idLeg;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountLongName() {
        return accountLongName;
    }

    public void setAccountLongName(String accountLongName) {
        this.accountLongName = accountLongName;
    }

    public Double getAllIn() {
        return allIn;
    }

    public void setAllIn(Double allIn) {
        this.allIn = allIn;
    }

    public Double getAmountOutstanding() {
        return amountOutstanding;
    }

    public void setAmountOutstanding(Double amountOutstanding) {
        this.amountOutstanding = amountOutstanding;
    }

    public Double getBuy() {
        return buy;
    }

    public void setBuy(Double buy) {
        this.buy = buy;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public Double getContraAmount() {
        return contraAmount;
    }

    public void setContraAmount(Double contraAmount) {
        this.contraAmount = contraAmount;
    }

    public Double getContraAmountOutstanding() {
        return contraAmountOutstanding;
    }

    public void setContraAmountOutstanding(Double contraAmountOutstanding) {
        this.contraAmountOutstanding = contraAmountOutstanding;
    }

    public Double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public Double getDealtAmount() {
        return dealtAmount;
    }

    public void setDealtAmount(Double dealtAmount) {
        this.dealtAmount = dealtAmount;
    }

    public String getDealtCcy() {
        return dealtCcy;
    }

    public void setDealtCcy(String dealtCcy) {
        this.dealtCcy = dealtCcy;
    }

    public Double getEquivAmount() {
        return equivAmount;
    }

    public void setEquivAmount(Double equivAmount) {
        this.equivAmount = equivAmount;
    }

    public String getEquivRatesPair() {
        return equivRatesPair;
    }

    public void setEquivRatesPair(String equivRatesPair) {
        this.equivRatesPair = equivRatesPair;
    }

    public BigDecimal getEquivRatesNum() {
        return equivRatesNum;
    }

    public void setEquivRatesNum(BigDecimal equivRatesNum) {
        this.equivRatesNum = equivRatesNum;
    }

    public Double getEquivRatesValue() {
        return equivRatesValue;
    }

    public void setEquivRatesValue(Double equivRatesValue) {
        this.equivRatesValue = equivRatesValue;
    }

    public Double getFwds() {
        return fwds;
    }

    public void setFwds(Double fwds) {
        this.fwds = fwds;
    }

    public Double getLegAmountOutstanding() {
        return legAmountOutstanding;
    }

    public void setLegAmountOutstanding(Double legAmountOutstanding) {
        this.legAmountOutstanding = legAmountOutstanding;
    }

    public Double getLegContraAmount() {
        return legContraAmount;
    }

    public void setLegContraAmount(Double legContraAmount) {
        this.legContraAmount = legContraAmount;
    }

    public Double getLegCreditAmount() {
        return legCreditAmount;
    }

    public void setLegCreditAmount(Double legCreditAmount) {
        this.legCreditAmount = legCreditAmount;
    }

    public Double getLegDealtAmount() {
        return legDealtAmount;
    }

    public void setLegDealtAmount(Double legDealtAmount) {
        this.legDealtAmount = legDealtAmount;
    }

    public Double getLegRiskAmount() {
        return legRiskAmount;
    }

    public void setLegRiskAmount(Double legRiskAmount) {
        this.legRiskAmount = legRiskAmount;
    }

    public String getLegTakerBuysBase() {
        return legTakerBuysBase;
    }

    public void setLegTakerBuysBase(String legTakerBuysBase) {
        this.legTakerBuysBase = legTakerBuysBase;
    }

    public String getMakerAccount() {
        return makerAccount;
    }

    public void setMakerAccount(String makerAccount) {
        this.makerAccount = makerAccount;
    }

    public BigDecimal getNumLeg() {
        return numLeg;
    }

    public void setNumLeg(BigDecimal numLeg) {
        this.numLeg = numLeg;
    }

    public Double getProfitAmount() {
        return profitAmount;
    }

    public void setProfitAmount(Double profitAmount) {
        this.profitAmount = profitAmount;
    }

    public String getRequirementTakerBuysBase() {
        return requirementTakerBuysBase;
    }

    public void setRequirementTakerBuysBase(String requirementTakerBuysBase) {
        this.requirementTakerBuysBase = requirementTakerBuysBase;
    }

    public BigDecimal getRequirements() {
        return requirements;
    }

    public void setRequirements(BigDecimal requirements) {
        this.requirements = requirements;
    }

    public Double getRiskAmount() {
        return riskAmount;
    }

    public void setRiskAmount(Double riskAmount) {
        this.riskAmount = riskAmount;
    }

    public Double getSell() {
        return sell;
    }

    public void setSell(Double sell) {
        this.sell = sell;
    }

    public Double getSpot() {
        return spot;
    }

    public void setSpot(Double spot) {
        this.spot = spot;
    }

    public String getSpotDate() {
        return spotDate;
    }

    public void setSpotDate(String spotDate) {
        this.spotDate = spotDate;
    }

    public String getStartDateType() {
        return startDateType;
    }

    public void setStartDateType(String startDateType) {
        this.startDateType = startDateType;
    }

    public String getStartDateValue() {
        return startDateValue;
    }

    public void setStartDateValue(String startDateValue) {
        this.startDateValue = startDateValue;
    }

    public String getTakerAccount() {
        return takerAccount;
    }

    public void setTakerAccount(String takerAccount) {
        this.takerAccount = takerAccount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValueDateType() {
        return valueDateType;
    }

    public void setValueDateType(String valueDateType) {
        this.valueDateType = valueDateType;
    }

    public String getValueDateValue() {
        return valueDateValue;
    }

    public void setValueDateValue(String valueDateValue) {
        this.valueDateValue = valueDateValue;
    }

    public String getRetPrice() {
        return retPrice;
    }

    public void setRetPrice(String retPrice) {
        this.retPrice = retPrice;
    }

    public Collection<BsProteoxCa3CrossComponent> getBsProteoxCa3CrossComponentCollection() {
        return bsProteoxCa3CrossComponentCollection;
    }

    public void setBsProteoxCa3CrossComponentCollection(Collection<BsProteoxCa3CrossComponent> bsProteoxCa3CrossComponentCollection) {
        this.bsProteoxCa3CrossComponentCollection = bsProteoxCa3CrossComponentCollection;
    }

    public BsProteoxCa3 getIdCa3() {
        return idCa3;
    }

    public void setIdCa3(BsProteoxCa3 idCa3) {
        this.idCa3 = idCa3;
    }

    public Collection<BsProteoxCa3SettlmntDtl> getBsProteoxCa3SettlmntDtlCollection() {
        return bsProteoxCa3SettlmntDtlCollection;
    }

    public void setBsProteoxCa3SettlmntDtlCollection(Collection<BsProteoxCa3SettlmntDtl> bsProteoxCa3SettlmntDtlCollection) {
        this.bsProteoxCa3SettlmntDtlCollection = bsProteoxCa3SettlmntDtlCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLeg != null ? idLeg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxCa3Leg)) {
            return false;
        }
        BsProteoxCa3Leg other = (BsProteoxCa3Leg) object;
        if ((this.idLeg == null && other.idLeg != null) || (this.idLeg != null && !this.idLeg.equals(other.idLeg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxCa3Leg[ idLeg=" + idLeg + " ]";
    }
    
}
