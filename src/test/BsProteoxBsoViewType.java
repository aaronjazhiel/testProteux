/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
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
@Table(name = "BS_PROTEOX_BSO_VIEW_TYPE")
@NamedQueries({
    @NamedQuery(name = "BsProteoxBsoViewType.findAll", query = "SELECT b FROM BsProteoxBsoViewType b")})
public class BsProteoxBsoViewType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDBSOVIEWTYPE")
    private Long idbsoviewtype;
    @Column(name = "BSOVIEWTYPE")
    private String bsoviewtype;
    @Column(name = "BSOVIEWDESCRIPTION")
    private String bsoviewdescription;
    @OneToMany(mappedBy = "idbsoviewtype")
    private Collection<BsProteoxUserPreferences> bsProteoxUserPreferencesCollection;

    public BsProteoxBsoViewType() {
    }

    public BsProteoxBsoViewType(Long idbsoviewtype) {
        this.idbsoviewtype = idbsoviewtype;
    }

    public Long getIdbsoviewtype() {
        return idbsoviewtype;
    }

    public void setIdbsoviewtype(Long idbsoviewtype) {
        this.idbsoviewtype = idbsoviewtype;
    }

    public String getBsoviewtype() {
        return bsoviewtype;
    }

    public void setBsoviewtype(String bsoviewtype) {
        this.bsoviewtype = bsoviewtype;
    }

    public String getBsoviewdescription() {
        return bsoviewdescription;
    }

    public void setBsoviewdescription(String bsoviewdescription) {
        this.bsoviewdescription = bsoviewdescription;
    }

    public Collection<BsProteoxUserPreferences> getBsProteoxUserPreferencesCollection() {
        return bsProteoxUserPreferencesCollection;
    }

    public void setBsProteoxUserPreferencesCollection(Collection<BsProteoxUserPreferences> bsProteoxUserPreferencesCollection) {
        this.bsProteoxUserPreferencesCollection = bsProteoxUserPreferencesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbsoviewtype != null ? idbsoviewtype.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxBsoViewType)) {
            return false;
        }
        BsProteoxBsoViewType other = (BsProteoxBsoViewType) object;
        if ((this.idbsoviewtype == null && other.idbsoviewtype != null) || (this.idbsoviewtype != null && !this.idbsoviewtype.equals(other.idbsoviewtype))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxBsoViewType[ idbsoviewtype=" + idbsoviewtype + " ]";
    }
    
}
