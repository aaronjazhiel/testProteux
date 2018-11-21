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
@Table(name = "BS_PROTEOX_TENORS")
@NamedQueries({
    @NamedQuery(name = "BsProteoxTenors.findAll", query = "SELECT b FROM BsProteoxTenors b")})
public class BsProteoxTenors implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDTENOR")
    private Integer idtenor;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Column(name = "DATEOFFSET")
    private String dateoffset;
    @Column(name = "VISIBLE")
    private Short visible;
    @Column(name = "DATEORDER")
    private Integer dateorder;
    @OneToMany(mappedBy = "mintenor")
    private Collection<BsProteoxCurrencyPairs> bsProteoxCurrencyPairsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtenor")
    private Collection<BsProteoxPanels> bsProteoxPanelsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtenor")
    private Collection<BsProteoxWorkspacesBso> bsProteoxWorkspacesBsoCollection;
    @JoinColumn(name = "IDOPERATION", referencedColumnName = "IDOPERATION")
    @ManyToOne
    private BsProteoxOperations idoperation;

    public BsProteoxTenors() {
    }

    public BsProteoxTenors(Integer idtenor) {
        this.idtenor = idtenor;
    }

    public BsProteoxTenors(Integer idtenor, String name) {
        this.idtenor = idtenor;
        this.name = name;
    }

    public Integer getIdtenor() {
        return idtenor;
    }

    public void setIdtenor(Integer idtenor) {
        this.idtenor = idtenor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateoffset() {
        return dateoffset;
    }

    public void setDateoffset(String dateoffset) {
        this.dateoffset = dateoffset;
    }

    public Short getVisible() {
        return visible;
    }

    public void setVisible(Short visible) {
        this.visible = visible;
    }

    public Integer getDateorder() {
        return dateorder;
    }

    public void setDateorder(Integer dateorder) {
        this.dateorder = dateorder;
    }

    public Collection<BsProteoxCurrencyPairs> getBsProteoxCurrencyPairsCollection() {
        return bsProteoxCurrencyPairsCollection;
    }

    public void setBsProteoxCurrencyPairsCollection(Collection<BsProteoxCurrencyPairs> bsProteoxCurrencyPairsCollection) {
        this.bsProteoxCurrencyPairsCollection = bsProteoxCurrencyPairsCollection;
    }

    public Collection<BsProteoxPanels> getBsProteoxPanelsCollection() {
        return bsProteoxPanelsCollection;
    }

    public void setBsProteoxPanelsCollection(Collection<BsProteoxPanels> bsProteoxPanelsCollection) {
        this.bsProteoxPanelsCollection = bsProteoxPanelsCollection;
    }

    public Collection<BsProteoxWorkspacesBso> getBsProteoxWorkspacesBsoCollection() {
        return bsProteoxWorkspacesBsoCollection;
    }

    public void setBsProteoxWorkspacesBsoCollection(Collection<BsProteoxWorkspacesBso> bsProteoxWorkspacesBsoCollection) {
        this.bsProteoxWorkspacesBsoCollection = bsProteoxWorkspacesBsoCollection;
    }

    public BsProteoxOperations getIdoperation() {
        return idoperation;
    }

    public void setIdoperation(BsProteoxOperations idoperation) {
        this.idoperation = idoperation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtenor != null ? idtenor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxTenors)) {
            return false;
        }
        BsProteoxTenors other = (BsProteoxTenors) object;
        if ((this.idtenor == null && other.idtenor != null) || (this.idtenor != null && !this.idtenor.equals(other.idtenor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxTenors[ idtenor=" + idtenor + " ]";
    }
    
}
