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
@Table(name = "BS_PROTEOX_DEAL_LEG_TYPE")
@NamedQueries({
    @NamedQuery(name = "BsProteoxDealLegType.findAll", query = "SELECT b FROM BsProteoxDealLegType b")})
public class BsProteoxDealLegType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDDEALLEGTYPE")
    private Long iddeallegtype;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PRODUCTTYPE")
    private String producttype;
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany(mappedBy = "iddeallegtype")
    private Collection<BsProteoxDealLegs> bsProteoxDealLegsCollection;

    public BsProteoxDealLegType() {
    }

    public BsProteoxDealLegType(Long iddeallegtype) {
        this.iddeallegtype = iddeallegtype;
    }

    public Long getIddeallegtype() {
        return iddeallegtype;
    }

    public void setIddeallegtype(Long iddeallegtype) {
        this.iddeallegtype = iddeallegtype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<BsProteoxDealLegs> getBsProteoxDealLegsCollection() {
        return bsProteoxDealLegsCollection;
    }

    public void setBsProteoxDealLegsCollection(Collection<BsProteoxDealLegs> bsProteoxDealLegsCollection) {
        this.bsProteoxDealLegsCollection = bsProteoxDealLegsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddeallegtype != null ? iddeallegtype.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxDealLegType)) {
            return false;
        }
        BsProteoxDealLegType other = (BsProteoxDealLegType) object;
        if ((this.iddeallegtype == null && other.iddeallegtype != null) || (this.iddeallegtype != null && !this.iddeallegtype.equals(other.iddeallegtype))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxDealLegType[ iddeallegtype=" + iddeallegtype + " ]";
    }
    
}
