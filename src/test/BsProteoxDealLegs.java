/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Aarón Delgado
 */
@Entity
@Table(name = "BS_PROTEOX_DEAL_LEGS")
@NamedQueries({
    @NamedQuery(name = "BsProteoxDealLegs.findAll", query = "SELECT b FROM BsProteoxDealLegs b")})
public class BsProteoxDealLegs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDDEALLEG")
    private Long iddealleg;
    @Basic(optional = false)
    @Column(name = "IDTENOR")
    private int idtenor;
    @Column(name = "DIRECTION")
    private String direction;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "CONTRAAMOUNT")
    private BigDecimal contraamount;
    @Basic(optional = false)
    @Column(name = "VALUEDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date valuedate;
    @Column(name = "FIXINGDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fixingdate;
    @Column(name = "SPOTDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date spotdate;
    @Column(name = "MARKETSPOTPRICE")
    private BigDecimal marketspotprice;
    @Column(name = "MARKETFORWARDPOINTS")
    private BigDecimal marketforwardpoints;
    @Column(name = "MARKETPRICE")
    private BigDecimal marketprice;
    @Column(name = "TRADINGSPOTPRICE")
    private BigDecimal tradingspotprice;
    @Column(name = "TRADINGFORWARDPOINTS")
    private BigDecimal tradingforwardpoints;
    @Column(name = "TRADINGPRICE")
    private BigDecimal tradingprice;
    @Column(name = "SPOTPRICE")
    private BigDecimal spotprice;
    @Column(name = "FORWARDPOINTS")
    private BigDecimal forwardpoints;
    @Column(name = "FINALPRICE")
    private BigDecimal finalprice;
    @Column(name = "CUSTOMERSPOTMARKUP")
    private BigDecimal customerspotmarkup;
    @Column(name = "VOLUMESPOTMARKUP")
    private BigDecimal volumespotmarkup;
    @Column(name = "TOTALSPOTMARKUP")
    private BigDecimal totalspotmarkup;
    @Column(name = "CUSTOMERFORWARDMARKUP")
    private BigDecimal customerforwardmarkup;
    @Column(name = "VOLUMEFORWARDMARKUP")
    private BigDecimal volumeforwardmarkup;
    @Column(name = "TOTALFORWARDMARKUP")
    private BigDecimal totalforwardmarkup;
    @Column(name = "PROFIT")
    private BigDecimal profit;
    @Column(name = "CONTRAAMOUNTOUTSTANDING")
    private BigDecimal contraamountoutstanding;
    @Column(name = "DEALTAMOUNTOUTSTANDING")
    private BigDecimal dealtamountoutstanding;
    @Column(name = "STARTDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startdate;
    @Column(name = "ACCOUNT")
    private String account;
    @Column(name = "PROFITTOTAL")
    private BigDecimal profittotal;
    @Column(name = "SWAPPOINTS")
    private BigDecimal swappoints;
    @Column(name = "FWD_PTS_ALLIN")
    private BigDecimal fwdPtsAllin;
    @JoinColumn(name = "IDCONTRACURRENCY", referencedColumnName = "IDCURRENCY")
    @ManyToOne
    private BsProteoxCurrencies idcontracurrency;
    @JoinColumn(name = "IDDEALTCURRENCY", referencedColumnName = "IDCURRENCY")
    @ManyToOne
    private BsProteoxCurrencies iddealtcurrency;
    @JoinColumn(name = "IDPROFITCURRENCY", referencedColumnName = "IDCURRENCY")
    @ManyToOne(optional = false)
    private BsProteoxCurrencies idprofitcurrency;
    @JoinColumn(name = "IDDEALLEGTYPE", referencedColumnName = "IDDEALLEGTYPE")
    @ManyToOne
    private BsProteoxDealLegType iddeallegtype;
    @JoinColumn(name = "IDDEAL", referencedColumnName = "IDDEAL")
    @ManyToOne(optional = false)
    private BsProteoxDeals iddeal;

    public BsProteoxDealLegs() {
    }

    public BsProteoxDealLegs(Long iddealleg) {
        this.iddealleg = iddealleg;
    }

    public BsProteoxDealLegs(Long iddealleg, int idtenor, BigDecimal amount, Date valuedate) {
        this.iddealleg = iddealleg;
        this.idtenor = idtenor;
        this.amount = amount;
        this.valuedate = valuedate;
    }

    public Long getIddealleg() {
        return iddealleg;
    }

    public void setIddealleg(Long iddealleg) {
        this.iddealleg = iddealleg;
    }

    public int getIdtenor() {
        return idtenor;
    }

    public void setIdtenor(int idtenor) {
        this.idtenor = idtenor;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getContraamount() {
        return contraamount;
    }

    public void setContraamount(BigDecimal contraamount) {
        this.contraamount = contraamount;
    }

    public Date getValuedate() {
        return valuedate;
    }

    public void setValuedate(Date valuedate) {
        this.valuedate = valuedate;
    }

    public Date getFixingdate() {
        return fixingdate;
    }

    public void setFixingdate(Date fixingdate) {
        this.fixingdate = fixingdate;
    }

    public Date getSpotdate() {
        return spotdate;
    }

    public void setSpotdate(Date spotdate) {
        this.spotdate = spotdate;
    }

    public BigDecimal getMarketspotprice() {
        return marketspotprice;
    }

    public void setMarketspotprice(BigDecimal marketspotprice) {
        this.marketspotprice = marketspotprice;
    }

    public BigDecimal getMarketforwardpoints() {
        return marketforwardpoints;
    }

    public void setMarketforwardpoints(BigDecimal marketforwardpoints) {
        this.marketforwardpoints = marketforwardpoints;
    }

    public BigDecimal getMarketprice() {
        return marketprice;
    }

    public void setMarketprice(BigDecimal marketprice) {
        this.marketprice = marketprice;
    }

    public BigDecimal getTradingspotprice() {
        return tradingspotprice;
    }

    public void setTradingspotprice(BigDecimal tradingspotprice) {
        this.tradingspotprice = tradingspotprice;
    }

    public BigDecimal getTradingforwardpoints() {
        return tradingforwardpoints;
    }

    public void setTradingforwardpoints(BigDecimal tradingforwardpoints) {
        this.tradingforwardpoints = tradingforwardpoints;
    }

    public BigDecimal getTradingprice() {
        return tradingprice;
    }

    public void setTradingprice(BigDecimal tradingprice) {
        this.tradingprice = tradingprice;
    }

    public BigDecimal getSpotprice() {
        return spotprice;
    }

    public void setSpotprice(BigDecimal spotprice) {
        this.spotprice = spotprice;
    }

    public BigDecimal getForwardpoints() {
        return forwardpoints;
    }

    public void setForwardpoints(BigDecimal forwardpoints) {
        this.forwardpoints = forwardpoints;
    }

    public BigDecimal getFinalprice() {
        return finalprice;
    }

    public void setFinalprice(BigDecimal finalprice) {
        this.finalprice = finalprice;
    }

    public BigDecimal getCustomerspotmarkup() {
        return customerspotmarkup;
    }

    public void setCustomerspotmarkup(BigDecimal customerspotmarkup) {
        this.customerspotmarkup = customerspotmarkup;
    }

    public BigDecimal getVolumespotmarkup() {
        return volumespotmarkup;
    }

    public void setVolumespotmarkup(BigDecimal volumespotmarkup) {
        this.volumespotmarkup = volumespotmarkup;
    }

    public BigDecimal getTotalspotmarkup() {
        return totalspotmarkup;
    }

    public void setTotalspotmarkup(BigDecimal totalspotmarkup) {
        this.totalspotmarkup = totalspotmarkup;
    }

    public BigDecimal getCustomerforwardmarkup() {
        return customerforwardmarkup;
    }

    public void setCustomerforwardmarkup(BigDecimal customerforwardmarkup) {
        this.customerforwardmarkup = customerforwardmarkup;
    }

    public BigDecimal getVolumeforwardmarkup() {
        return volumeforwardmarkup;
    }

    public void setVolumeforwardmarkup(BigDecimal volumeforwardmarkup) {
        this.volumeforwardmarkup = volumeforwardmarkup;
    }

    public BigDecimal getTotalforwardmarkup() {
        return totalforwardmarkup;
    }

    public void setTotalforwardmarkup(BigDecimal totalforwardmarkup) {
        this.totalforwardmarkup = totalforwardmarkup;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    public BigDecimal getContraamountoutstanding() {
        return contraamountoutstanding;
    }

    public void setContraamountoutstanding(BigDecimal contraamountoutstanding) {
        this.contraamountoutstanding = contraamountoutstanding;
    }

    public BigDecimal getDealtamountoutstanding() {
        return dealtamountoutstanding;
    }

    public void setDealtamountoutstanding(BigDecimal dealtamountoutstanding) {
        this.dealtamountoutstanding = dealtamountoutstanding;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public BigDecimal getProfittotal() {
        return profittotal;
    }

    public void setProfittotal(BigDecimal profittotal) {
        this.profittotal = profittotal;
    }

    public BigDecimal getSwappoints() {
        return swappoints;
    }

    public void setSwappoints(BigDecimal swappoints) {
        this.swappoints = swappoints;
    }

    public BigDecimal getFwdPtsAllin() {
        return fwdPtsAllin;
    }

    public void setFwdPtsAllin(BigDecimal fwdPtsAllin) {
        this.fwdPtsAllin = fwdPtsAllin;
    }

    public BsProteoxCurrencies getIdcontracurrency() {
        return idcontracurrency;
    }

    public void setIdcontracurrency(BsProteoxCurrencies idcontracurrency) {
        this.idcontracurrency = idcontracurrency;
    }

    public BsProteoxCurrencies getIddealtcurrency() {
        return iddealtcurrency;
    }

    public void setIddealtcurrency(BsProteoxCurrencies iddealtcurrency) {
        this.iddealtcurrency = iddealtcurrency;
    }

    public BsProteoxCurrencies getIdprofitcurrency() {
        return idprofitcurrency;
    }

    public void setIdprofitcurrency(BsProteoxCurrencies idprofitcurrency) {
        this.idprofitcurrency = idprofitcurrency;
    }

    public BsProteoxDealLegType getIddeallegtype() {
        return iddeallegtype;
    }

    public void setIddeallegtype(BsProteoxDealLegType iddeallegtype) {
        this.iddeallegtype = iddeallegtype;
    }

    public BsProteoxDeals getIddeal() {
        return iddeal;
    }

    public void setIddeal(BsProteoxDeals iddeal) {
        this.iddeal = iddeal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddealleg != null ? iddealleg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxDealLegs)) {
            return false;
        }
        BsProteoxDealLegs other = (BsProteoxDealLegs) object;
        if ((this.iddealleg == null && other.iddealleg != null) || (this.iddealleg != null && !this.iddealleg.equals(other.iddealleg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxDealLegs[ iddealleg=" + iddealleg + " ]";
    }
    
}
