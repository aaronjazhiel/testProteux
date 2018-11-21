/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
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
@Table(name = "BS_PROTEOX_DATE_RULES")
@NamedQueries({
    @NamedQuery(name = "BsProteoxDateRules.findAll", query = "SELECT b FROM BsProteoxDateRules b")})
public class BsProteoxDateRules implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDDATERULE")
    private Long iddaterule;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "SPOTDAYS")
    private short spotdays;
    @Basic(optional = false)
    @Column(name = "COUNTUSDHOLIDAYS")
    private short countusdholidays;
    @OneToMany(mappedBy = "iddaterule")
    private Collection<BsProteoxCurrencyPairs> bsProteoxCurrencyPairsCollection;
    @OneToMany(mappedBy = "iddaterule")
    private Collection<BsProteoxCurrencies> bsProteoxCurrenciesCollection;

    public BsProteoxDateRules() {
    }

    public BsProteoxDateRules(Long iddaterule) {
        this.iddaterule = iddaterule;
    }

    public BsProteoxDateRules(Long iddaterule, String name, short spotdays, short countusdholidays) {
        this.iddaterule = iddaterule;
        this.name = name;
        this.spotdays = spotdays;
        this.countusdholidays = countusdholidays;
    }

    public Long getIddaterule() {
        return iddaterule;
    }

    public void setIddaterule(Long iddaterule) {
        this.iddaterule = iddaterule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getSpotdays() {
        return spotdays;
    }

    public void setSpotdays(short spotdays) {
        this.spotdays = spotdays;
    }

    public short getCountusdholidays() {
        return countusdholidays;
    }

    public void setCountusdholidays(short countusdholidays) {
        this.countusdholidays = countusdholidays;
    }

    public Collection<BsProteoxCurrencyPairs> getBsProteoxCurrencyPairsCollection() {
        return bsProteoxCurrencyPairsCollection;
    }

    public void setBsProteoxCurrencyPairsCollection(Collection<BsProteoxCurrencyPairs> bsProteoxCurrencyPairsCollection) {
        this.bsProteoxCurrencyPairsCollection = bsProteoxCurrencyPairsCollection;
    }

    public Collection<BsProteoxCurrencies> getBsProteoxCurrenciesCollection() {
        return bsProteoxCurrenciesCollection;
    }

    public void setBsProteoxCurrenciesCollection(Collection<BsProteoxCurrencies> bsProteoxCurrenciesCollection) {
        this.bsProteoxCurrenciesCollection = bsProteoxCurrenciesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddaterule != null ? iddaterule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxDateRules)) {
            return false;
        }
        BsProteoxDateRules other = (BsProteoxDateRules) object;
        if ((this.iddaterule == null && other.iddaterule != null) || (this.iddaterule != null && !this.iddaterule.equals(other.iddaterule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxDateRules[ iddaterule=" + iddaterule + " ]";
    }
    
}
