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
public class BsProteoxRolloverRuleDaysPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "IDROLLOVERRULE")
    private int idrolloverrule;
    @Basic(optional = false)
    @Column(name = "TIMEDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timedate;

    public BsProteoxRolloverRuleDaysPK() {
    }

    public BsProteoxRolloverRuleDaysPK(int idrolloverrule, Date timedate) {
        this.idrolloverrule = idrolloverrule;
        this.timedate = timedate;
    }

    public int getIdrolloverrule() {
        return idrolloverrule;
    }

    public void setIdrolloverrule(int idrolloverrule) {
        this.idrolloverrule = idrolloverrule;
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
        hash += (int) idrolloverrule;
        hash += (timedate != null ? timedate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxRolloverRuleDaysPK)) {
            return false;
        }
        BsProteoxRolloverRuleDaysPK other = (BsProteoxRolloverRuleDaysPK) object;
        if (this.idrolloverrule != other.idrolloverrule) {
            return false;
        }
        if ((this.timedate == null && other.timedate != null) || (this.timedate != null && !this.timedate.equals(other.timedate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxRolloverRuleDaysPK[ idrolloverrule=" + idrolloverrule + ", timedate=" + timedate + " ]";
    }
    
}
