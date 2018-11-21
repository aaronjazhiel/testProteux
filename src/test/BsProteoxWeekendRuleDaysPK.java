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
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Aarón Delgado
 */
@Embeddable
public class BsProteoxWeekendRuleDaysPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "IDWEEKENDRULE")
    private int idweekendrule;
    @Basic(optional = false)
    @Column(name = "TIMEDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timedate;

    public BsProteoxWeekendRuleDaysPK() {
    }

    public BsProteoxWeekendRuleDaysPK(int idweekendrule, Date timedate) {
        this.idweekendrule = idweekendrule;
        this.timedate = timedate;
    }

    public int getIdweekendrule() {
        return idweekendrule;
    }

    public void setIdweekendrule(int idweekendrule) {
        this.idweekendrule = idweekendrule;
    }

    public Date getTimedate() {
        return timedate;
    }

    public void setTimedate(Date timedate) {
        this.timedate = timedate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idweekendrule;
        hash += (timedate != null ? timedate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxWeekendRuleDaysPK)) {
            return false;
        }
        BsProteoxWeekendRuleDaysPK other = (BsProteoxWeekendRuleDaysPK) object;
        if (this.idweekendrule != other.idweekendrule) {
            return false;
        }
        if ((this.timedate == null && other.timedate != null) || (this.timedate != null && !this.timedate.equals(other.timedate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxWeekendRuleDaysPK[ idweekendrule=" + idweekendrule + ", timedate=" + timedate + " ]";
    }
    
}
