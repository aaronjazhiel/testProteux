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
@Table(name = "BS_PROTEOX_CALENDARS")
@NamedQueries({
    @NamedQuery(name = "BsProteoxCalendars.findAll", query = "SELECT b FROM BsProteoxCalendars b")})
public class BsProteoxCalendars implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDCALENDAR")
    private Long idcalendar;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bsProteoxCalendars")
    private Collection<BsProteoxHolidays> bsProteoxHolidaysCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcalendar")
    private Collection<BsProteoxCurrencies> bsProteoxCurrenciesCollection;

    public BsProteoxCalendars() {
    }

    public BsProteoxCalendars(Long idcalendar) {
        this.idcalendar = idcalendar;
    }

    public BsProteoxCalendars(Long idcalendar, String name) {
        this.idcalendar = idcalendar;
        this.name = name;
    }

    public Long getIdcalendar() {
        return idcalendar;
    }

    public void setIdcalendar(Long idcalendar) {
        this.idcalendar = idcalendar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<BsProteoxHolidays> getBsProteoxHolidaysCollection() {
        return bsProteoxHolidaysCollection;
    }

    public void setBsProteoxHolidaysCollection(Collection<BsProteoxHolidays> bsProteoxHolidaysCollection) {
        this.bsProteoxHolidaysCollection = bsProteoxHolidaysCollection;
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
        hash += (idcalendar != null ? idcalendar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxCalendars)) {
            return false;
        }
        BsProteoxCalendars other = (BsProteoxCalendars) object;
        if ((this.idcalendar == null && other.idcalendar != null) || (this.idcalendar != null && !this.idcalendar.equals(other.idcalendar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxCalendars[ idcalendar=" + idcalendar + " ]";
    }
    
}
