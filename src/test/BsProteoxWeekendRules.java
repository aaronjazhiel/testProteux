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
@Table(name = "BS_PROTEOX_WEEKEND_RULES")
@NamedQueries({
    @NamedQuery(name = "BsProteoxWeekendRules.findAll", query = "SELECT b FROM BsProteoxWeekendRules b")})
public class BsProteoxWeekendRules implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDWEEKENDRULE")
    private Short idweekendrule;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bsProteoxWeekendRules")
    private Collection<BsProteoxWeekendRuleDays> bsProteoxWeekendRuleDaysCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idweekendrule")
    private Collection<BsProteoxCurrencies> bsProteoxCurrenciesCollection;

    public BsProteoxWeekendRules() {
    }

    public BsProteoxWeekendRules(Short idweekendrule) {
        this.idweekendrule = idweekendrule;
    }

    public BsProteoxWeekendRules(Short idweekendrule, String name) {
        this.idweekendrule = idweekendrule;
        this.name = name;
    }

    public Short getIdweekendrule() {
        return idweekendrule;
    }

    public void setIdweekendrule(Short idweekendrule) {
        this.idweekendrule = idweekendrule;
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

    public Collection<BsProteoxWeekendRuleDays> getBsProteoxWeekendRuleDaysCollection() {
        return bsProteoxWeekendRuleDaysCollection;
    }

    public void setBsProteoxWeekendRuleDaysCollection(Collection<BsProteoxWeekendRuleDays> bsProteoxWeekendRuleDaysCollection) {
        this.bsProteoxWeekendRuleDaysCollection = bsProteoxWeekendRuleDaysCollection;
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
        hash += (idweekendrule != null ? idweekendrule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxWeekendRules)) {
            return false;
        }
        BsProteoxWeekendRules other = (BsProteoxWeekendRules) object;
        if ((this.idweekendrule == null && other.idweekendrule != null) || (this.idweekendrule != null && !this.idweekendrule.equals(other.idweekendrule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxWeekendRules[ idweekendrule=" + idweekendrule + " ]";
    }
    
}
