/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "BS_PROTEOX_CL_GENERIC_SET")
@NamedQueries({
    @NamedQuery(name = "BsProteoxClGenericSet.findAll", query = "SELECT b FROM BsProteoxClGenericSet b")})
public class BsProteoxClGenericSet implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_GENERIC_SET")
    private BigDecimal idGenericSet;
    @JoinColumn(name = "ID_DISTRIBUTION", referencedColumnName = "ID_TIPO_DISTRIBUCION")
    @ManyToOne
    private BsProteoxClDistribucion idDistribution;
    @JoinColumn(name = "ID_GENERIC_CLIENT", referencedColumnName = "ID_GENERIC_CLIENT")
    @ManyToOne
    private BsProteoxClGenericClients idGenericClient;

    public BsProteoxClGenericSet() {
    }

    public BsProteoxClGenericSet(BigDecimal idGenericSet) {
        this.idGenericSet = idGenericSet;
    }

    public BigDecimal getIdGenericSet() {
        return idGenericSet;
    }

    public void setIdGenericSet(BigDecimal idGenericSet) {
        this.idGenericSet = idGenericSet;
    }

    public BsProteoxClDistribucion getIdDistribution() {
        return idDistribution;
    }

    public void setIdDistribution(BsProteoxClDistribucion idDistribution) {
        this.idDistribution = idDistribution;
    }

    public BsProteoxClGenericClients getIdGenericClient() {
        return idGenericClient;
    }

    public void setIdGenericClient(BsProteoxClGenericClients idGenericClient) {
        this.idGenericClient = idGenericClient;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGenericSet != null ? idGenericSet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxClGenericSet)) {
            return false;
        }
        BsProteoxClGenericSet other = (BsProteoxClGenericSet) object;
        if ((this.idGenericSet == null && other.idGenericSet != null) || (this.idGenericSet != null && !this.idGenericSet.equals(other.idGenericSet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxClGenericSet[ idGenericSet=" + idGenericSet + " ]";
    }
    
}
