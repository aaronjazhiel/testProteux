/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Aarón Delgado
 */
@Entity
@Table(name = "BS_PROTEOX_CA3_CROSS_COMPONENT")
@NamedQueries({
    @NamedQuery(name = "BsProteoxCa3CrossComponent.findAll", query = "SELECT b FROM BsProteoxCa3CrossComponent b")})
public class BsProteoxCa3CrossComponent implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CROSS_COMPONENT")
    private BigDecimal idCrossComponent;
    @Column(name = "BASE_FWD_MARKUP")
    private Double baseFwdMarkup;
    @Column(name = "BASE_SPOT_MARKUP")
    private Double baseSpotMarkup;
    @Column(name = "BRANCH_FWD_MARKUP")
    private Double branchFwdMarkup;
    @Column(name = "BRANCH_SPOT_MARKUP")
    private Double branchSpotMarkup;
    @Column(name = "CCY_PAIR")
    private String ccyPair;
    @Column(name = "CORE_MARKET_FWD_PTS")
    private Double coreMarketFwdPts;
    @Column(name = "CORE_MARKET_SPOT_PRICE")
    private Double coreMarketSpotPrice;
    @Column(name = "CORE_TAKER_SPOT_PRICE")
    private Double coreTakerSpotPrice;
    @Column(name = "CUSTOMER_FWD_MARKUP")
    private Double customerFwdMarkup;
    @Column(name = "CUSTOMER_SPOT_MARKUP")
    private Double customerSpotMarkup;
    @Column(name = "DPS")
    private BigDecimal dps;
    @Column(name = "FWD_DPS")
    private BigDecimal fwdDps;
    @Column(name = "FWD_MARKUP")
    private Double fwdMarkup;
    @Column(name = "FWD_SCALE_DPS")
    private BigDecimal fwdScaleDps;
    @Column(name = "INDICATIVE_QUOTE_ALL_IN")
    private Double indicativeQuoteAllIn;
    @Column(name = "INDICATIVE_QUOTE_FWD_PTS")
    private Double indicativeQuoteFwdPts;
    @Column(name = "INDICATIVE_QUOTE_SPOT_PRICE")
    private Double indicativeQuoteSpotPrice;
    @Column(name = "MARKET_FWD_PTS")
    private Double marketFwdPts;
    @Column(name = "MARKET_SPOT_PRICE")
    private Double marketSpotPrice;
    @Column(name = "QUOTE_ALL_IN")
    private Double quoteAllIn;
    @Column(name = "QUOTE_FWD_PTS")
    private Double quoteFwdPts;
    @Column(name = "QUOTE_SPOT_PRICE")
    private Double quoteSpotPrice;
    @Column(name = "SIDE")
    private String side;
    @Column(name = "SPOT_MARKUP")
    private Double spotMarkup;
    @Column(name = "UNIT_QUOTATION")
    private BigDecimal unitQuotation;
    @Column(name = "VOLUME_FWD_MARKUP")
    private Double volumeFwdMarkup;
    @Column(name = "VOLUME_SPOT_MARKUP")
    private Double volumeSpotMarkup;
    @JoinColumn(name = "ID_LEG", referencedColumnName = "ID_LEG")
    @ManyToOne
    private BsProteoxCa3Leg idLeg;

    public BsProteoxCa3CrossComponent() {
    }

    public BsProteoxCa3CrossComponent(BigDecimal idCrossComponent) {
        this.idCrossComponent = idCrossComponent;
    }

    public BigDecimal getIdCrossComponent() {
        return idCrossComponent;
    }

    public void setIdCrossComponent(BigDecimal idCrossComponent) {
        this.idCrossComponent = idCrossComponent;
    }

    public Double getBaseFwdMarkup() {
        return baseFwdMarkup;
    }

    public void setBaseFwdMarkup(Double baseFwdMarkup) {
        this.baseFwdMarkup = baseFwdMarkup;
    }

    public Double getBaseSpotMarkup() {
        return baseSpotMarkup;
    }

    public void setBaseSpotMarkup(Double baseSpotMarkup) {
        this.baseSpotMarkup = baseSpotMarkup;
    }

    public Double getBranchFwdMarkup() {
        return branchFwdMarkup;
    }

    public void setBranchFwdMarkup(Double branchFwdMarkup) {
        this.branchFwdMarkup = branchFwdMarkup;
    }

    public Double getBranchSpotMarkup() {
        return branchSpotMarkup;
    }

    public void setBranchSpotMarkup(Double branchSpotMarkup) {
        this.branchSpotMarkup = branchSpotMarkup;
    }

    public String getCcyPair() {
        return ccyPair;
    }

    public void setCcyPair(String ccyPair) {
        this.ccyPair = ccyPair;
    }

    public Double getCoreMarketFwdPts() {
        return coreMarketFwdPts;
    }

    public void setCoreMarketFwdPts(Double coreMarketFwdPts) {
        this.coreMarketFwdPts = coreMarketFwdPts;
    }

    public Double getCoreMarketSpotPrice() {
        return coreMarketSpotPrice;
    }

    public void setCoreMarketSpotPrice(Double coreMarketSpotPrice) {
        this.coreMarketSpotPrice = coreMarketSpotPrice;
    }

    public Double getCoreTakerSpotPrice() {
        return coreTakerSpotPrice;
    }

    public void setCoreTakerSpotPrice(Double coreTakerSpotPrice) {
        this.coreTakerSpotPrice = coreTakerSpotPrice;
    }

    public Double getCustomerFwdMarkup() {
        return customerFwdMarkup;
    }

    public void setCustomerFwdMarkup(Double customerFwdMarkup) {
        this.customerFwdMarkup = customerFwdMarkup;
    }

    public Double getCustomerSpotMarkup() {
        return customerSpotMarkup;
    }

    public void setCustomerSpotMarkup(Double customerSpotMarkup) {
        this.customerSpotMarkup = customerSpotMarkup;
    }

    public BigDecimal getDps() {
        return dps;
    }

    public void setDps(BigDecimal dps) {
        this.dps = dps;
    }

    public BigDecimal getFwdDps() {
        return fwdDps;
    }

    public void setFwdDps(BigDecimal fwdDps) {
        this.fwdDps = fwdDps;
    }

    public Double getFwdMarkup() {
        return fwdMarkup;
    }

    public void setFwdMarkup(Double fwdMarkup) {
        this.fwdMarkup = fwdMarkup;
    }

    public BigDecimal getFwdScaleDps() {
        return fwdScaleDps;
    }

    public void setFwdScaleDps(BigDecimal fwdScaleDps) {
        this.fwdScaleDps = fwdScaleDps;
    }

    public Double getIndicativeQuoteAllIn() {
        return indicativeQuoteAllIn;
    }

    public void setIndicativeQuoteAllIn(Double indicativeQuoteAllIn) {
        this.indicativeQuoteAllIn = indicativeQuoteAllIn;
    }

    public Double getIndicativeQuoteFwdPts() {
        return indicativeQuoteFwdPts;
    }

    public void setIndicativeQuoteFwdPts(Double indicativeQuoteFwdPts) {
        this.indicativeQuoteFwdPts = indicativeQuoteFwdPts;
    }

    public Double getIndicativeQuoteSpotPrice() {
        return indicativeQuoteSpotPrice;
    }

    public void setIndicativeQuoteSpotPrice(Double indicativeQuoteSpotPrice) {
        this.indicativeQuoteSpotPrice = indicativeQuoteSpotPrice;
    }

    public Double getMarketFwdPts() {
        return marketFwdPts;
    }

    public void setMarketFwdPts(Double marketFwdPts) {
        this.marketFwdPts = marketFwdPts;
    }

    public Double getMarketSpotPrice() {
        return marketSpotPrice;
    }

    public void setMarketSpotPrice(Double marketSpotPrice) {
        this.marketSpotPrice = marketSpotPrice;
    }

    public Double getQuoteAllIn() {
        return quoteAllIn;
    }

    public void setQuoteAllIn(Double quoteAllIn) {
        this.quoteAllIn = quoteAllIn;
    }

    public Double getQuoteFwdPts() {
        return quoteFwdPts;
    }

    public void setQuoteFwdPts(Double quoteFwdPts) {
        this.quoteFwdPts = quoteFwdPts;
    }

    public Double getQuoteSpotPrice() {
        return quoteSpotPrice;
    }

    public void setQuoteSpotPrice(Double quoteSpotPrice) {
        this.quoteSpotPrice = quoteSpotPrice;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public Double getSpotMarkup() {
        return spotMarkup;
    }

    public void setSpotMarkup(Double spotMarkup) {
        this.spotMarkup = spotMarkup;
    }

    public BigDecimal getUnitQuotation() {
        return unitQuotation;
    }

    public void setUnitQuotation(BigDecimal unitQuotation) {
        this.unitQuotation = unitQuotation;
    }

    public Double getVolumeFwdMarkup() {
        return volumeFwdMarkup;
    }

    public void setVolumeFwdMarkup(Double volumeFwdMarkup) {
        this.volumeFwdMarkup = volumeFwdMarkup;
    }

    public Double getVolumeSpotMarkup() {
        return volumeSpotMarkup;
    }

    public void setVolumeSpotMarkup(Double volumeSpotMarkup) {
        this.volumeSpotMarkup = volumeSpotMarkup;
    }

    public BsProteoxCa3Leg getIdLeg() {
        return idLeg;
    }

    public void setIdLeg(BsProteoxCa3Leg idLeg) {
        this.idLeg = idLeg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCrossComponent != null ? idCrossComponent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxCa3CrossComponent)) {
            return false;
        }
        BsProteoxCa3CrossComponent other = (BsProteoxCa3CrossComponent) object;
        if ((this.idCrossComponent == null && other.idCrossComponent != null) || (this.idCrossComponent != null && !this.idCrossComponent.equals(other.idCrossComponent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxCa3CrossComponent[ idCrossComponent=" + idCrossComponent + " ]";
    }
    
}
