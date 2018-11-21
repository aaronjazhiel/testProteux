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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "BS_PROTEOX_LIVE_RATES")
@NamedQueries({
    @NamedQuery(name = "BsProteoxLiveRates.findAll", query = "SELECT b FROM BsProteoxLiveRates b")})
public class BsProteoxLiveRates implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BsProteoxLiveRatesPK bsProteoxLiveRatesPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BID")
    private BigDecimal bid;
    @Column(name = "ASK")
    private BigDecimal ask;
    @Basic(optional = false)
    @Column(name = "TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    @JoinColumn(name = "IDBASECURRENCY", referencedColumnName = "IDCURRENCY", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private BsProteoxCurrencies bsProteoxCurrencies;
    @JoinColumn(name = "IDQUOTECURRENCY", referencedColumnName = "IDCURRENCY", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private BsProteoxCurrencies bsProteoxCurrencies1;

    public BsProteoxLiveRates() {
    }

    public BsProteoxLiveRates(BsProteoxLiveRatesPK bsProteoxLiveRatesPK) {
        this.bsProteoxLiveRatesPK = bsProteoxLiveRatesPK;
    }

    public BsProteoxLiveRates(BsProteoxLiveRatesPK bsProteoxLiveRatesPK, Date timeStamp) {
        this.bsProteoxLiveRatesPK = bsProteoxLiveRatesPK;
        this.timeStamp = timeStamp;
    }

    public BsProteoxLiveRates(int idbasecurrency, int idquotecurrency) {
        this.bsProteoxLiveRatesPK = new BsProteoxLiveRatesPK(idbasecurrency, idquotecurrency);
    }

    public BsProteoxLiveRatesPK getBsProteoxLiveRatesPK() {
        return bsProteoxLiveRatesPK;
    }

    public void setBsProteoxLiveRatesPK(BsProteoxLiveRatesPK bsProteoxLiveRatesPK) {
        this.bsProteoxLiveRatesPK = bsProteoxLiveRatesPK;
    }

    public BigDecimal getBid() {
        return bid;
    }

    public void setBid(BigDecimal bid) {
        this.bid = bid;
    }

    public BigDecimal getAsk() {
        return ask;
    }

    public void setAsk(BigDecimal ask) {
        this.ask = ask;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public BsProteoxCurrencies getBsProteoxCurrencies() {
        return bsProteoxCurrencies;
    }

    public void setBsProteoxCurrencies(BsProteoxCurrencies bsProteoxCurrencies) {
        this.bsProteoxCurrencies = bsProteoxCurrencies;
    }

    public BsProteoxCurrencies getBsProteoxCurrencies1() {
        return bsProteoxCurrencies1;
    }

    public void setBsProteoxCurrencies1(BsProteoxCurrencies bsProteoxCurrencies1) {
        this.bsProteoxCurrencies1 = bsProteoxCurrencies1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bsProteoxLiveRatesPK != null ? bsProteoxLiveRatesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxLiveRates)) {
            return false;
        }
        BsProteoxLiveRates other = (BsProteoxLiveRates) object;
        if ((this.bsProteoxLiveRatesPK == null && other.bsProteoxLiveRatesPK != null) || (this.bsProteoxLiveRatesPK != null && !this.bsProteoxLiveRatesPK.equals(other.bsProteoxLiveRatesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxLiveRates[ bsProteoxLiveRatesPK=" + bsProteoxLiveRatesPK + " ]";
    }
    
}
