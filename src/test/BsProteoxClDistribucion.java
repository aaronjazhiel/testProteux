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
@Table(name = "BS_PROTEOX_CL_DISTRIBUCION")
@NamedQueries({
    @NamedQuery(name = "BsProteoxClDistribucion.findAll", query = "SELECT b FROM BsProteoxClDistribucion b")})
public class BsProteoxClDistribucion implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_TIPO_DISTRIBUCION")
    private BigDecimal idTipoDistribucion;
    @Column(name = "TIPO_DISTRIBUCION")
    private String tipoDistribucion;
    @OneToMany(mappedBy = "idDistribucion")
    private Collection<BsProteoxClUserSet> bsProteoxClUserSetCollection;
    @OneToMany(mappedBy = "idDistribution")
    private Collection<BsProteoxClGenericSet> bsProteoxClGenericSetCollection;
    @OneToMany(mappedBy = "idTipoDistribucion")
    private Collection<BsProteoxClTradeClient> bsProteoxClTradeClientCollection;

    public BsProteoxClDistribucion() {
    }

    public BsProteoxClDistribucion(BigDecimal idTipoDistribucion) {
        this.idTipoDistribucion = idTipoDistribucion;
    }

    public BigDecimal getIdTipoDistribucion() {
        return idTipoDistribucion;
    }

    public void setIdTipoDistribucion(BigDecimal idTipoDistribucion) {
        this.idTipoDistribucion = idTipoDistribucion;
    }

    public String getTipoDistribucion() {
        return tipoDistribucion;
    }

    public void setTipoDistribucion(String tipoDistribucion) {
        this.tipoDistribucion = tipoDistribucion;
    }

    public Collection<BsProteoxClUserSet> getBsProteoxClUserSetCollection() {
        return bsProteoxClUserSetCollection;
    }

    public void setBsProteoxClUserSetCollection(Collection<BsProteoxClUserSet> bsProteoxClUserSetCollection) {
        this.bsProteoxClUserSetCollection = bsProteoxClUserSetCollection;
    }

    public Collection<BsProteoxClGenericSet> getBsProteoxClGenericSetCollection() {
        return bsProteoxClGenericSetCollection;
    }

    public void setBsProteoxClGenericSetCollection(Collection<BsProteoxClGenericSet> bsProteoxClGenericSetCollection) {
        this.bsProteoxClGenericSetCollection = bsProteoxClGenericSetCollection;
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
        hash += (idTipoDistribucion != null ? idTipoDistribucion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxClDistribucion)) {
            return false;
        }
        BsProteoxClDistribucion other = (BsProteoxClDistribucion) object;
        if ((this.idTipoDistribucion == null && other.idTipoDistribucion != null) || (this.idTipoDistribucion != null && !this.idTipoDistribucion.equals(other.idTipoDistribucion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxClDistribucion[ idTipoDistribucion=" + idTipoDistribucion + " ]";
    }
    
}
