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
public class BsProteoxCurrencyPairsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "IDBASECURRENCY")
    private int idbasecurrency;
    @Basic(optional = false)
    @Column(name = "IDQUOTECURRENCY")
    private int idquotecurrency;
    @Basic(optional = false)
    @Column(name = "IDOPERATION")
    private short idoperation;

    public BsProteoxCurrencyPairsPK() {
    }

    public BsProteoxCurrencyPairsPK(int idbasecurrency, int idquotecurrency, short idoperation) {
        this.idbasecurrency = idbasecurrency;
        this.idquotecurrency = idquotecurrency;
        this.idoperation = idoperation;
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

    public short getIdoperation() {
        return idoperation;
    }

    public void setIdoperation(short idoperation) {
        this.idoperation = idoperation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idbasecurrency;
        hash += (int) idquotecurrency;
        hash += (int) idoperation;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxCurrencyPairsPK)) {
            return false;
        }
        BsProteoxCurrencyPairsPK other = (BsProteoxCurrencyPairsPK) object;
        if (this.idbasecurrency != other.idbasecurrency) {
            return false;
        }
        if (this.idquotecurrency != other.idquotecurrency) {
            return false;
        }
        if (this.idoperation != other.idoperation) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxCurrencyPairsPK[ idbasecurrency=" + idbasecurrency + ", idquotecurrency=" + idquotecurrency + ", idoperation=" + idoperation + " ]";
    }
    
}
