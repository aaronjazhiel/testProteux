/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
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
@Table(name = "BS_PROTEOX_CL_PARR_SPOT")
@NamedQueries({
    @NamedQuery(name = "BsProteoxClParrSpot.findAll", query = "SELECT b FROM BsProteoxClParrSpot b")})
public class BsProteoxClParrSpot implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PARRILLA_SPOT")
    private BigDecimal idParrillaSpot;
    @Column(name = "PARRILLA_SPOT")
    private String parrillaSpot;
    @OneToMany(mappedBy = "idParrillaSpot")
    private Collection<BsProteoxClTradeClient> bsProteoxClTradeClientCollection;

    public BsProteoxClParrSpot() {
    }

    public BsProteoxClParrSpot(BigDecimal idParrillaSpot) {
        this.idParrillaSpot = idParrillaSpot;
    }

    public BigDecimal getIdParrillaSpot() {
        return idParrillaSpot;
    }

    public void setIdParrillaSpot(BigDecimal idParrillaSpot) {
        this.idParrillaSpot = idParrillaSpot;
    }

    public String getParrillaSpot() {
        return parrillaSpot;
    }

    public void setParrillaSpot(String parrillaSpot) {
        this.parrillaSpot = parrillaSpot;
    }

    public Collection<BsProteoxClTradeClient> getBsProteoxClTradeClientCollection() {
        return bsProteoxClTradeClientCollection;
    }

    public void setBsProteoxClTradeClientCollection(Collection<BsProteoxClTradeClient> bsProteoxClTradeClientCollection) {
        this.bsProteoxClTradeClientCollection = bsProteoxClTradeClientCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idParrillaSpot != null ? idParrillaSpot.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxClParrSpot)) {
            return false;
        }
        BsProteoxClParrSpot other = (BsProteoxClParrSpot) object;
        if ((this.idParrillaSpot == null && other.idParrillaSpot != null) || (this.idParrillaSpot != null && !this.idParrillaSpot.equals(other.idParrillaSpot))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxClParrSpot[ idParrillaSpot=" + idParrillaSpot + " ]";
    }
    
}
