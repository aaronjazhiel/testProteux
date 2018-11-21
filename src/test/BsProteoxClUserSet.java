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
@Table(name = "BS_PROTEOX_CL_USER_SET")
@NamedQueries({
    @NamedQuery(name = "BsProteoxClUserSet.findAll", query = "SELECT b FROM BsProteoxClUserSet b")})
public class BsProteoxClUserSet implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_USER_SET")
    private BigDecimal idUserSet;
    @JoinColumn(name = "ID_DISTRIBUCION", referencedColumnName = "ID_TIPO_DISTRIBUCION")
    @ManyToOne
    private BsProteoxClDistribucion idDistribucion;
    @JoinColumn(name = "ID_USER_2TRADE", referencedColumnName = "IDUSER2TRADE")
    @ManyToOne
    private BsProteox2tradeUsers idUser2trade;

    public BsProteoxClUserSet() {
    }

    public BsProteoxClUserSet(BigDecimal idUserSet) {
        this.idUserSet = idUserSet;
    }

    public BigDecimal getIdUserSet() {
        return idUserSet;
    }

    public void setIdUserSet(BigDecimal idUserSet) {
        this.idUserSet = idUserSet;
    }

    public BsProteoxClDistribucion getIdDistribucion() {
        return idDistribucion;
    }

    public void setIdDistribucion(BsProteoxClDistribucion idDistribucion) {
        this.idDistribucion = idDistribucion;
    }

    public BsProteox2tradeUsers getIdUser2trade() {
        return idUser2trade;
    }

    public void setIdUser2trade(BsProteox2tradeUsers idUser2trade) {
        this.idUser2trade = idUser2trade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUserSet != null ? idUserSet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxClUserSet)) {
            return false;
        }
        BsProteoxClUserSet other = (BsProteoxClUserSet) object;
        if ((this.idUserSet == null && other.idUserSet != null) || (this.idUserSet != null && !this.idUserSet.equals(other.idUserSet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxClUserSet[ idUserSet=" + idUserSet + " ]";
    }
    
}
