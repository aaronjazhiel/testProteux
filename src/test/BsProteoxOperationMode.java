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
@Table(name = "BS_PROTEOX_OPERATION_MODE")
@NamedQueries({
    @NamedQuery(name = "BsProteoxOperationMode.findAll", query = "SELECT b FROM BsProteoxOperationMode b")})
public class BsProteoxOperationMode implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDMODE")
    private BigDecimal idmode;
    @Column(name = "MODE_NAME")
    private String modeName;
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany(mappedBy = "idmode")
    private Collection<BsProteoxOperations> bsProteoxOperationsCollection;

    public BsProteoxOperationMode() {
    }

    public BsProteoxOperationMode(BigDecimal idmode) {
        this.idmode = idmode;
    }

    public BigDecimal getIdmode() {
        return idmode;
    }

    public void setIdmode(BigDecimal idmode) {
        this.idmode = idmode;
    }

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<BsProteoxOperations> getBsProteoxOperationsCollection() {
        return bsProteoxOperationsCollection;
    }

    public void setBsProteoxOperationsCollection(Collection<BsProteoxOperations> bsProteoxOperationsCollection) {
        this.bsProteoxOperationsCollection = bsProteoxOperationsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmode != null ? idmode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxOperationMode)) {
            return false;
        }
        BsProteoxOperationMode other = (BsProteoxOperationMode) object;
        if ((this.idmode == null && other.idmode != null) || (this.idmode != null && !this.idmode.equals(other.idmode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxOperationMode[ idmode=" + idmode + " ]";
    }
    
}
