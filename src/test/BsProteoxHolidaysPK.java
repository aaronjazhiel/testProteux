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
public class BsProteoxHolidaysPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "IDCALENDAR")
    private long idcalendar;
    @Basic(optional = false)
    @Column(name = "HOLIDAY")
    @Temporal(TemporalType.TIMESTAMP)
    private Date holiday;

    public BsProteoxHolidaysPK() {
    }

    public BsProteoxHolidaysPK(long idcalendar, Date holiday) {
        this.idcalendar = idcalendar;
        this.holiday = holiday;
    }

    public long getIdcalendar() {
        return idcalendar;
    }

    public void setIdcalendar(long idcalendar) {
        this.idcalendar = idcalendar;
    }

    public Date getHoliday() {
        return holiday;
    }

    public void setHoliday(Date holiday) {
        this.holiday = holiday;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idcalendar;
        hash += (holiday != null ? holiday.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxHolidaysPK)) {
            return false;
        }
        BsProteoxHolidaysPK other = (BsProteoxHolidaysPK) object;
        if (this.idcalendar != other.idcalendar) {
            return false;
        }
        if ((this.holiday == null && other.holiday != null) || (this.holiday != null && !this.holiday.equals(other.holiday))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxHolidaysPK[ idcalendar=" + idcalendar + ", holiday=" + holiday + " ]";
    }
    
}
