/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "BS_PROTEOX_HOLIDAYS")
@NamedQueries({
    @NamedQuery(name = "BsProteoxHolidays.findAll", query = "SELECT b FROM BsProteoxHolidays b")})
public class BsProteoxHolidays implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BsProteoxHolidaysPK bsProteoxHolidaysPK;
    @JoinColumn(name = "IDCALENDAR", referencedColumnName = "IDCALENDAR", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private BsProteoxCalendars bsProteoxCalendars;

    public BsProteoxHolidays() {
    }

    public BsProteoxHolidays(BsProteoxHolidaysPK bsProteoxHolidaysPK) {
        this.bsProteoxHolidaysPK = bsProteoxHolidaysPK;
    }

    public BsProteoxHolidays(long idcalendar, Date holiday) {
        this.bsProteoxHolidaysPK = new BsProteoxHolidaysPK(idcalendar, holiday);
    }

    public BsProteoxHolidaysPK getBsProteoxHolidaysPK() {
        return bsProteoxHolidaysPK;
    }

    public void setBsProteoxHolidaysPK(BsProteoxHolidaysPK bsProteoxHolidaysPK) {
        this.bsProteoxHolidaysPK = bsProteoxHolidaysPK;
    }

    public BsProteoxCalendars getBsProteoxCalendars() {
        return bsProteoxCalendars;
    }

    public void setBsProteoxCalendars(BsProteoxCalendars bsProteoxCalendars) {
        this.bsProteoxCalendars = bsProteoxCalendars;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bsProteoxHolidaysPK != null ? bsProteoxHolidaysPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxHolidays)) {
            return false;
        }
        BsProteoxHolidays other = (BsProteoxHolidays) object;
        if ((this.bsProteoxHolidaysPK == null && other.bsProteoxHolidaysPK != null) || (this.bsProteoxHolidaysPK != null && !this.bsProteoxHolidaysPK.equals(other.bsProteoxHolidaysPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxHolidays[ bsProteoxHolidaysPK=" + bsProteoxHolidaysPK + " ]";
    }
    
}
