/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Aarón Delgado
 */
@Entity
@Table(name = "BS_PROTEOX_DO1")
@NamedQueries({
    @NamedQuery(name = "BsProteoxDo1.findAll", query = "SELECT b FROM BsProteoxDo1 b")})
public class BsProteoxDo1 implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDDO1")
    private BigDecimal iddo1;
    @Basic(optional = false)
    @Column(name = "IDDEAL")
    private BigInteger iddeal;
    @Basic(optional = false)
    @Lob
    @Column(name = "DO1OBJECT")
    private Serializable do1object;

    public BsProteoxDo1() {
    }

    public BsProteoxDo1(BigDecimal iddo1) {
        this.iddo1 = iddo1;
    }

    public BsProteoxDo1(BigDecimal iddo1, BigInteger iddeal, Serializable do1object) {
        this.iddo1 = iddo1;
        this.iddeal = iddeal;
        this.do1object = do1object;
    }

    public BigDecimal getIddo1() {
        return iddo1;
    }

    public void setIddo1(BigDecimal iddo1) {
        this.iddo1 = iddo1;
    }

    public BigInteger getIddeal() {
        return iddeal;
    }

    public void setIddeal(BigInteger iddeal) {
        this.iddeal = iddeal;
    }

    public Serializable getDo1object() {
        return do1object;
    }

    public void setDo1object(Serializable do1object) {
        this.do1object = do1object;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddo1 != null ? iddo1.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxDo1)) {
            return false;
        }
        BsProteoxDo1 other = (BsProteoxDo1) object;
        if ((this.iddo1 == null && other.iddo1 != null) || (this.iddo1 != null && !this.iddo1.equals(other.iddo1))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxDo1[ iddo1=" + iddo1 + " ]";
    }
    
}
