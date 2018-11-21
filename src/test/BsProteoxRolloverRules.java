/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
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
@Table(name = "BS_PROTEOX_ROLLOVER_RULES")
@NamedQueries({
    @NamedQuery(name = "BsProteoxRolloverRules.findAll", query = "SELECT b FROM BsProteoxRolloverRules b")})
public class BsProteoxRolloverRules implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDROLLOVERRULE")
    private Short idrolloverrule;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "UTCTIMEZONE")
    private short utctimezone;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idrolloverrule")
    private Collection<BsProteoxCurrencyPairs> bsProteoxCurrencyPairsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bsProteoxRolloverRules")
    private Collection<BsProteoxRolloverRuleDays> bsProteoxRolloverRuleDaysCollection;

    public BsProteoxRolloverRules() {
    }

    public BsProteoxRolloverRules(Short idrolloverrule) {
        this.idrolloverrule = idrolloverrule;
    }

    public BsProteoxRolloverRules(Short idrolloverrule, String name, short utctimezone) {
        this.idrolloverrule = idrolloverrule;
        this.name = name;
        this.utctimezone = utctimezone;
    }

    public Short getIdrolloverrule() {
        return idrolloverrule;
    }

    public void setIdrolloverrule(Short idrolloverrule) {
        this.idrolloverrule = idrolloverrule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public short getUtctimezone() {
        return utctimezone;
    }

    public void setUtctimezone(short utctimezone) {
        this.utctimezone = utctimezone;
    }

    public Collection<BsProteoxCurrencyPairs> getBsProteoxCurrencyPairsCollection() {
        return bsProteoxCurrencyPairsCollection;
    }

    public void setBsProteoxCurrencyPairsCollection(Collection<BsProteoxCurrencyPairs> bsProteoxCurrencyPairsCollection) {
        this.bsProteoxCurrencyPairsCollection = bsProteoxCurrencyPairsCollection;
    }

    public Collection<BsProteoxRolloverRuleDays> getBsProteoxRolloverRuleDaysCollection() {
        return bsProteoxRolloverRuleDaysCollection;
    }

    public void setBsProteoxRolloverRuleDaysCollection(Collection<BsProteoxRolloverRuleDays> bsProteoxRolloverRuleDaysCollection) {
        this.bsProteoxRolloverRuleDaysCollection = bsProteoxRolloverRuleDaysCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrolloverrule != null ? idrolloverrule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxRolloverRules)) {
            return false;
        }
        BsProteoxRolloverRules other = (BsProteoxRolloverRules) object;
        if ((this.idrolloverrule == null && other.idrolloverrule != null) || (this.idrolloverrule != null && !this.idrolloverrule.equals(other.idrolloverrule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxRolloverRules[ idrolloverrule=" + idrolloverrule + " ]";
    }
    
}
