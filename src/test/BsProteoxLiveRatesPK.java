/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Aarón Delgado
 */
@Embeddable
public class BsProteoxLiveRatesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "IDBASECURRENCY")
    private int idbasecurrency;
    @Basic(optional = false)
    @Column(name = "IDQUOTECURRENCY")
    private int idquotecurrency;

    public BsProteoxLiveRatesPK() {
    }

    public BsProteoxLiveRatesPK(int idbasecurrency, int idquotecurrency) {
        this.idbasecurrency = idbasecurrency;
        this.idquotecurrency = idquotecurrency;
    }

    public int getIdbasecurrency() {
        return idbasecurrency;
    }

    public void setIdbasecurrency(int idbasecurrency) {
        this.idbasecurrency = idbasecurrency;
    }

    public int getIdquotecurrency() {
        return idquotecurrency;
    }

    public void setIdquotecurrency(int idquotecurrency) {
        this.idquotecurrency = idquotecurrency;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idbasecurrency;
        hash += (int) idquotecurrency;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxLiveRatesPK)) {
            return false;
        }
        BsProteoxLiveRatesPK other = (BsProteoxLiveRatesPK) object;
        if (this.idbasecurrency != other.idbasecurrency) {
            return false;
        }
        if (this.idquotecurrency != other.idquotecurrency) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxLiveRatesPK[ idbasecurrency=" + idbasecurrency + ", idquotecurrency=" + idquotecurrency + " ]";
    }
    
}
