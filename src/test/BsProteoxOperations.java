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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Aarón Delgado
 */
@Entity
@Table(name = "BS_PROTEOX_OPERATIONS")
@NamedQueries({
    @NamedQuery(name = "BsProteoxOperations.findAll", query = "SELECT b FROM BsProteoxOperations b")})
public class BsProteoxOperations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDOPERATION")
    private Short idoperation;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Column(name = "PRODUCTTYPE")
    private String producttype;
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bsProteoxOperations")
    private Collection<BsProteoxCurrencyPairs> bsProteoxCurrencyPairsCollection;
    @JoinColumn(name = "IDMODE", referencedColumnName = "IDMODE")
    @ManyToOne
    private BsProteoxOperationMode idmode;
    @OneToMany(mappedBy = "idoperation")
    private Collection<BsProteoxTenors> bsProteoxTenorsCollection;
    @OneToMany(mappedBy = "idproducttype")
    private Collection<BsProteoxDeals> bsProteoxDealsCollection;

    public BsProteoxOperations() {
    }

    public BsProteoxOperations(Short idoperation) {
        this.idoperation = idoperation;
    }

    public BsProteoxOperations(Short idoperation, String name) {
        this.idoperation = idoperation;
        this.name = name;
    }

    public Short getIdoperation() {
        return idoperation;
    }

    public void setIdoperation(Short idoperation) {
        this.idoperation = idoperation;
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

    public Collection<BsProteoxCurrencyPairs> getBsProteoxCurrencyPairsCollection() {
        return bsProteoxCurrencyPairsCollection;
    }

    public void setBsProteoxCurrencyPairsCollection(Collection<BsProteoxCurrencyPairs> bsProteoxCurrencyPairsCollection) {
        this.bsProteoxCurrencyPairsCollection = bsProteoxCurrencyPairsCollection;
    }

    public BsProteoxOperationMode getIdmode() {
        return idmode;
    }

    public void setIdmode(BsProteoxOperationMode idmode) {
        this.idmode = idmode;
    }

    public Collection<BsProteoxTenors> getBsProteoxTenorsCollection() {
        return bsProteoxTenorsCollection;
    }

    public void setBsProteoxTenorsCollection(Collection<BsProteoxTenors> bsProteoxTenorsCollection) {
        this.bsProteoxTenorsCollection = bsProteoxTenorsCollection;
    }

    public Collection<BsProteoxDeals> getBsProteoxDealsCollection() {
        return bsProteoxDealsCollection;
    }

    public void setBsProteoxDealsCollection(Collection<BsProteoxDeals> bsProteoxDealsCollection) {
        this.bsProteoxDealsCollection = bsProteoxDealsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idoperation != null ? idoperation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxOperations)) {
            return false;
        }
        BsProteoxOperations other = (BsProteoxOperations) object;
        if ((this.idoperation == null && other.idoperation != null) || (this.idoperation != null && !this.idoperation.equals(other.idoperation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxOperations[ idoperation=" + idoperation + " ]";
    }
    
}
