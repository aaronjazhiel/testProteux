/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "BS_PROTEOX_CURRENCY_PAIRS")
@NamedQueries({
    @NamedQuery(name = "BsProteoxCurrencyPairs.findAll", query = "SELECT b FROM BsProteoxCurrencyPairs b")})
public class BsProteoxCurrencyPairs implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BsProteoxCurrencyPairsPK bsProteoxCurrencyPairsPK;
    @Basic(optional = false)
    @Column(name = "CURRENCYPAIRSORDER")
    private short currencypairsorder;
    @Column(name = "HOLIDAYOFFSET")
    private Short holidayoffset;
    @JoinColumn(name = "IDBASECURRENCY", referencedColumnName = "IDCURRENCY", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private BsProteoxCurrencies bsProteoxCurrencies;
    @JoinColumn(name = "IDQUOTECURRENCY", referencedColumnName = "IDCURRENCY", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private BsProteoxCurrencies bsProteoxCurrencies1;
    @JoinColumn(name = "IDDATERULE", referencedColumnName = "IDDATERULE")
    @ManyToOne
    private BsProteoxDateRules iddaterule;
    @JoinColumn(name = "IDOPERATION", referencedColumnName = "IDOPERATION", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private BsProteoxOperations bsProteoxOperations;
    @JoinColumn(name = "IDRATERULE", referencedColumnName = "IDRATERULE")
    @ManyToOne(optional = false)
    private BsProteoxRateRules idraterule;
    @JoinColumn(name = "IDROLLOVERRULE", referencedColumnName = "IDROLLOVERRULE")
    @ManyToOne(optional = false)
    private BsProteoxRolloverRules idrolloverrule;
    @JoinColumn(name = "MINTENOR", referencedColumnName = "IDTENOR")
    @ManyToOne
    private BsProteoxTenors mintenor;

    public BsProteoxCurrencyPairs() {
    }

    public BsProteoxCurrencyPairs(BsProteoxCurrencyPairsPK bsProteoxCurrencyPairsPK) {
        this.bsProteoxCurrencyPairsPK = bsProteoxCurrencyPairsPK;
    }

    public BsProteoxCurrencyPairs(BsProteoxCurrencyPairsPK bsProteoxCurrencyPairsPK, short currencypairsorder) {
        this.bsProteoxCurrencyPairsPK = bsProteoxCurrencyPairsPK;
        this.currencypairsorder = currencypairsorder;
    }

    public BsProteoxCurrencyPairs(int idbasecurrency, int idquotecurrency, short idoperation) {
        this.bsProteoxCurrencyPairsPK = new BsProteoxCurrencyPairsPK(idbasecurrency, idquotecurrency, idoperation);
    }

    public BsProteoxCurrencyPairsPK getBsProteoxCurrencyPairsPK() {
        return bsProteoxCurrencyPairsPK;
    }

    public void setBsProteoxCurrencyPairsPK(BsProteoxCurrencyPairsPK bsProteoxCurrencyPairsPK) {
        this.bsProteoxCurrencyPairsPK = bsProteoxCurrencyPairsPK;
    }

    public short getCurrencypairsorder() {
        return currencypairsorder;
    }

    public void setCurrencypairsorder(short currencypairsorder) {
        this.currencypairsorder = currencypairsorder;
    }

    public Short getHolidayoffset() {
        return holidayoffset;
    }

    public void setHolidayoffset(Short holidayoffset) {
        this.holidayoffset = holidayoffset;
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

    public BsProteoxDateRules getIddaterule() {
        return iddaterule;
    }

    public void setIddaterule(BsProteoxDateRules iddaterule) {
        this.iddaterule = iddaterule;
    }

    public BsProteoxOperations getBsProteoxOperations() {
        return bsProteoxOperations;
    }

    public void setBsProteoxOperations(BsProteoxOperations bsProteoxOperations) {
        this.bsProteoxOperations = bsProteoxOperations;
    }

    public BsProteoxRateRules getIdraterule() {
        return idraterule;
    }

    public void setIdraterule(BsProteoxRateRules idraterule) {
        this.idraterule = idraterule;
    }

    public BsProteoxRolloverRules getIdrolloverrule() {
        return idrolloverrule;
    }

    public void setIdrolloverrule(BsProteoxRolloverRules idrolloverrule) {
        this.idrolloverrule = idrolloverrule;
    }

    public BsProteoxTenors getMintenor() {
        return mintenor;
    }

    public void setMintenor(BsProteoxTenors mintenor) {
        this.mintenor = mintenor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bsProteoxCurrencyPairsPK != null ? bsProteoxCurrencyPairsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxCurrencyPairs)) {
            return false;
        }
        BsProteoxCurrencyPairs other = (BsProteoxCurrencyPairs) object;
        if ((this.bsProteoxCurrencyPairsPK == null && other.bsProteoxCurrencyPairsPK != null) || (this.bsProteoxCurrencyPairsPK != null && !this.bsProteoxCurrencyPairsPK.equals(other.bsProteoxCurrencyPairsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxCurrencyPairs[ bsProteoxCurrencyPairsPK=" + bsProteoxCurrencyPairsPK + " ]";
    }
    
}
