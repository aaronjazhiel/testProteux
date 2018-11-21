/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
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

/**
 *
 * @author Aarón Delgado
 */
@Entity
@Table(name = "BS_PROTEOX_WEEKEND_RULE_DAYS")
@NamedQueries({
    @NamedQuery(name = "BsProteoxWeekendRuleDays.findAll", query = "SELECT b FROM BsProteoxWeekendRuleDays b")})
public class BsProteoxWeekendRuleDays implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BsProteoxWeekendRuleDaysPK bsProteoxWeekendRuleDaysPK;
    @Column(name = "DAYS")
    private String days;
    @Basic(optional = false)
    @Column(name = "COUNTASBUSINESSDAY")
    private short countasbusinessday;
    @JoinColumn(name = "IDWEEKENDRULE", referencedColumnName = "IDWEEKENDRULE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private BsProteoxWeekendRules bsProteoxWeekendRules;

    public BsProteoxWeekendRuleDays() {
    }

    public BsProteoxWeekendRuleDays(BsProteoxWeekendRuleDaysPK bsProteoxWeekendRuleDaysPK) {
        this.bsProteoxWeekendRuleDaysPK = bsProteoxWeekendRuleDaysPK;
    }

    public BsProteoxWeekendRuleDays(BsProteoxWeekendRuleDaysPK bsProteoxWeekendRuleDaysPK, short countasbusinessday) {
        this.bsProteoxWeekendRuleDaysPK = bsProteoxWeekendRuleDaysPK;
        this.countasbusinessday = countasbusinessday;
    }

    public BsProteoxWeekendRuleDays(int idweekendrule, Date timedate) {
        this.bsProteoxWeekendRuleDaysPK = new BsProteoxWeekendRuleDaysPK(idweekendrule, timedate);
    }

    public BsProteoxWeekendRuleDaysPK getBsProteoxWeekendRuleDaysPK() {
        return bsProteoxWeekendRuleDaysPK;
    }

    public void setBsProteoxWeekendRuleDaysPK(BsProteoxWeekendRuleDaysPK bsProteoxWeekendRuleDaysPK) {
        this.bsProteoxWeekendRuleDaysPK = bsProteoxWeekendRuleDaysPK;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public short getCountasbusinessday() {
        return countasbusinessday;
    }

    public void setCountasbusinessday(short countasbusinessday) {
        this.countasbusinessday = countasbusinessday;
    }

    public BsProteoxWeekendRules getBsProteoxWeekendRules() {
        return bsProteoxWeekendRules;
    }

    public void setBsProteoxWeekendRules(BsProteoxWeekendRules bsProteoxWeekendRules) {
        this.bsProteoxWeekendRules = bsProteoxWeekendRules;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bsProteoxWeekendRuleDaysPK != null ? bsProteoxWeekendRuleDaysPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxWeekendRuleDays)) {
            return false;
        }
        BsProteoxWeekendRuleDays other = (BsProteoxWeekendRuleDays) object;
        if ((this.bsProteoxWeekendRuleDaysPK == null && other.bsProteoxWeekendRuleDaysPK != null) || (this.bsProteoxWeekendRuleDaysPK != null && !this.bsProteoxWeekendRuleDaysPK.equals(other.bsProteoxWeekendRuleDaysPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxWeekendRuleDays[ bsProteoxWeekendRuleDaysPK=" + bsProteoxWeekendRuleDaysPK + " ]";
    }
    
}
