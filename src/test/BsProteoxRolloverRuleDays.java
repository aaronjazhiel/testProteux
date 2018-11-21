/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "BS_PROTEOX_ROLLOVER_RULE_DAYS")
@NamedQueries({
    @NamedQuery(name = "BsProteoxRolloverRuleDays.findAll", query = "SELECT b FROM BsProteoxRolloverRuleDays b")})
public class BsProteoxRolloverRuleDays implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BsProteoxRolloverRuleDaysPK bsProteoxRolloverRuleDaysPK;
    @Column(name = "TIMEHM")
    private String timehm;
    @Column(name = "DAYS")
    private String days;
    @JoinColumn(name = "IDROLLOVERRULE", referencedColumnName = "IDROLLOVERRULE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private BsProteoxRolloverRules bsProteoxRolloverRules;

    public BsProteoxRolloverRuleDays() {
    }

    public BsProteoxRolloverRuleDays(BsProteoxRolloverRuleDaysPK bsProteoxRolloverRuleDaysPK) {
        this.bsProteoxRolloverRuleDaysPK = bsProteoxRolloverRuleDaysPK;
    }

    public BsProteoxRolloverRuleDays(int idrolloverrule, Date timedate) {
        this.bsProteoxRolloverRuleDaysPK = new BsProteoxRolloverRuleDaysPK(idrolloverrule, timedate);
    }

    public BsProteoxRolloverRuleDaysPK getBsProteoxRolloverRuleDaysPK() {
        return bsProteoxRolloverRuleDaysPK;
    }

    public void setBsProteoxRolloverRuleDaysPK(BsProteoxRolloverRuleDaysPK bsProteoxRolloverRuleDaysPK) {
        this.bsProteoxRolloverRuleDaysPK = bsProteoxRolloverRuleDaysPK;
    }

    public String getTimehm() {
        return timehm;
    }

    public void setTimehm(String timehm) {
        this.timehm = timehm;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public BsProteoxRolloverRules getBsProteoxRolloverRules() {
        return bsProteoxRolloverRules;
    }

    public void setBsProteoxRolloverRules(BsProteoxRolloverRules bsProteoxRolloverRules) {
        this.bsProteoxRolloverRules = bsProteoxRolloverRules;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bsProteoxRolloverRuleDaysPK != null ? bsProteoxRolloverRuleDaysPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxRolloverRuleDays)) {
            return false;
        }
        BsProteoxRolloverRuleDays other = (BsProteoxRolloverRuleDays) object;
        if ((this.bsProteoxRolloverRuleDaysPK == null && other.bsProteoxRolloverRuleDaysPK != null) || (this.bsProteoxRolloverRuleDaysPK != null && !this.bsProteoxRolloverRuleDaysPK.equals(other.bsProteoxRolloverRuleDaysPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxRolloverRuleDays[ bsProteoxRolloverRuleDaysPK=" + bsProteoxRolloverRuleDaysPK + " ]";
    }
    
}
