/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "BS_PROTEOX_RATE_RULES")
@NamedQueries({
    @NamedQuery(name = "BsProteoxRateRules.findAll", query = "SELECT b FROM BsProteoxRateRules b")})
public class BsProteoxRateRules implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDRATERULE")
    private Long idraterule;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Column(name = "SPOTDPS")
    private Short spotdps;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SPOTINCREMENT")
    private BigDecimal spotincrement;
    @Column(name = "SPOTSCALE")
    private BigDecimal spotscale;
    @Column(name = "FWDDPS")
    private Short fwddps;
    @Column(name = "FWDSCALE")
    private BigInteger fwdscale;
    @Column(name = "FWDINCREMENT")
    private BigInteger fwdincrement;
    @Basic(optional = false)
    @Column(name = "RATEDIGITS")
    private short ratedigits;
    @Basic(optional = false)
    @Column(name = "PIPVALUE")
    private short pipvalue;
    @Column(name = "PIPVALUEDEC")
    private BigInteger pipvaluedec;
    @Basic(optional = false)
    @Column(name = "PIPDIGITS")
    private short pipdigits;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idraterule")
    private Collection<BsProteoxCurrencyPairs> bsProteoxCurrencyPairsCollection;

    public BsProteoxRateRules() {
    }

    public BsProteoxRateRules(Long idraterule) {
        this.idraterule = idraterule;
    }

    public BsProteoxRateRules(Long idraterule, String name, short ratedigits, short pipvalue, short pipdigits) {
        this.idraterule = idraterule;
        this.name = name;
        this.ratedigits = ratedigits;
        this.pipvalue = pipvalue;
        this.pipdigits = pipdigits;
    }

    public Long getIdraterule() {
        return idraterule;
    }

    public void setIdraterule(Long idraterule) {
        this.idraterule = idraterule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getSpotdps() {
        return spotdps;
    }

    public void setSpotdps(Short spotdps) {
        this.spotdps = spotdps;
    }

    public BigDecimal getSpotincrement() {
        return spotincrement;
    }

    public void setSpotincrement(BigDecimal spotincrement) {
        this.spotincrement = spotincrement;
    }

    public BigDecimal getSpotscale() {
        return spotscale;
    }

    public void setSpotscale(BigDecimal spotscale) {
        this.spotscale = spotscale;
    }

    public Short getFwddps() {
        return fwddps;
    }

    public void setFwddps(Short fwddps) {
        this.fwddps = fwddps;
    }

    public BigInteger getFwdscale() {
        return fwdscale;
    }

    public void setFwdscale(BigInteger fwdscale) {
        this.fwdscale = fwdscale;
    }

    public BigInteger getFwdincrement() {
        return fwdincrement;
    }

    public void setFwdincrement(BigInteger fwdincrement) {
        this.fwdincrement = fwdincrement;
    }

    public short getRatedigits() {
        return ratedigits;
    }

    public void setRatedigits(short ratedigits) {
        this.ratedigits = ratedigits;
    }

    public short getPipvalue() {
        return pipvalue;
    }

    public void setPipvalue(short pipvalue) {
        this.pipvalue = pipvalue;
    }

    public BigInteger getPipvaluedec() {
        return pipvaluedec;
    }

    public void setPipvaluedec(BigInteger pipvaluedec) {
        this.pipvaluedec = pipvaluedec;
    }

    public short getPipdigits() {
        return pipdigits;
    }

    public void setPipdigits(short pipdigits) {
        this.pipdigits = pipdigits;
    }

    public Collection<BsProteoxCurrencyPairs> getBsProteoxCurrencyPairsCollection() {
        return bsProteoxCurrencyPairsCollection;
    }

    public void setBsProteoxCurrencyPairsCollection(Collection<BsProteoxCurrencyPairs> bsProteoxCurrencyPairsCollection) {
        this.bsProteoxCurrencyPairsCollection = bsProteoxCurrencyPairsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idraterule != null ? idraterule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxRateRules)) {
            return false;
        }
        BsProteoxRateRules other = (BsProteoxRateRules) object;
        if ((this.idraterule == null && other.idraterule != null) || (this.idraterule != null && !this.idraterule.equals(other.idraterule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxRateRules[ idraterule=" + idraterule + " ]";
    }
    
}
