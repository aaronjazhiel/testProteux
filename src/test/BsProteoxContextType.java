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
@Table(name = "BS_PROTEOX_CONTEXT_TYPE")
@NamedQueries({
    @NamedQuery(name = "BsProteoxContextType.findAll", query = "SELECT b FROM BsProteoxContextType b")})
public class BsProteoxContextType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDCONTEXTTYPE")
    private Long idcontexttype;
    @Basic(optional = false)
    @Column(name = "TYPE")
    private String type;
    @Basic(optional = false)
    @Column(name = "CONTEXT")
    private String context;
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcontexttype")
    private Collection<BsProteoxSecurityContext> bsProteoxSecurityContextCollection;

    public BsProteoxContextType() {
    }

    public BsProteoxContextType(Long idcontexttype) {
        this.idcontexttype = idcontexttype;
    }

    public BsProteoxContextType(Long idcontexttype, String type, String context) {
        this.idcontexttype = idcontexttype;
        this.type = type;
        this.context = context;
    }

    public Long getIdcontexttype() {
        return idcontexttype;
    }

    public void setIdcontexttype(Long idcontexttype) {
        this.idcontexttype = idcontexttype;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<BsProteoxSecurityContext> getBsProteoxSecurityContextCollection() {
        return bsProteoxSecurityContextCollection;
    }

    public void setBsProteoxSecurityContextCollection(Collection<BsProteoxSecurityContext> bsProteoxSecurityContextCollection) {
        this.bsProteoxSecurityContextCollection = bsProteoxSecurityContextCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcontexttype != null ? idcontexttype.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxContextType)) {
            return false;
        }
        BsProteoxContextType other = (BsProteoxContextType) object;
        if ((this.idcontexttype == null && other.idcontexttype != null) || (this.idcontexttype != null && !this.idcontexttype.equals(other.idcontexttype))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxContextType[ idcontexttype=" + idcontexttype + " ]";
    }
    
}
