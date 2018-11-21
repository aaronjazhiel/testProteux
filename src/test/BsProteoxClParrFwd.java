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
@Table(name = "BS_PROTEOX_CL_PARR_FWD")
@NamedQueries({
    @NamedQuery(name = "BsProteoxClParrFwd.findAll", query = "SELECT b FROM BsProteoxClParrFwd b")})
public class BsProteoxClParrFwd implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PARRILLA_FWD")
    private BigDecimal idParrillaFwd;
    @Column(name = "PARRILLA_FWD")
    private String parrillaFwd;
    @OneToMany(mappedBy = "idParrillaFwd")
    private Collection<BsProteoxClTradeClient> bsProteoxClTradeClientCollection;

    public BsProteoxClParrFwd() {
    }

    public BsProteoxClParrFwd(BigDecimal idParrillaFwd) {
        this.idParrillaFwd = idParrillaFwd;
    }

    public BigDecimal getIdParrillaFwd() {
        return idParrillaFwd;
    }

    public void setIdParrillaFwd(BigDecimal idParrillaFwd) {
        this.idParrillaFwd = idParrillaFwd;
    }

    public String getParrillaFwd() {
        return parrillaFwd;
    }

    public void setParrillaFwd(String parrillaFwd) {
        this.parrillaFwd = parrillaFwd;
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
        hash += (idParrillaFwd != null ? idParrillaFwd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxClParrFwd)) {
            return false;
        }
        BsProteoxClParrFwd other = (BsProteoxClParrFwd) object;
        if ((this.idParrillaFwd == null && other.idParrillaFwd != null) || (this.idParrillaFwd != null && !this.idParrillaFwd.equals(other.idParrillaFwd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxClParrFwd[ idParrillaFwd=" + idParrillaFwd + " ]";
    }
    
}
