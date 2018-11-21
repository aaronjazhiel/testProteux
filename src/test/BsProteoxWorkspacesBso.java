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
@Table(name = "BS_PROTEOX_WORKSPACES_BSO")
@NamedQueries({
    @NamedQuery(name = "BsProteoxWorkspacesBso.findAll", query = "SELECT b FROM BsProteoxWorkspacesBso b")})
public class BsProteoxWorkspacesBso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDWORKSPACE")
    private Long idworkspace;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "SELECTED")
    private short selected;
    @Column(name = "COMMON")
    private Short common;
    @JoinColumn(name = "IDCLIENT", referencedColumnName = "IDCLIENT")
    @ManyToOne
    private BsProteoxClients idclient;
    @JoinColumn(name = "IDTENOR", referencedColumnName = "IDTENOR")
    @ManyToOne(optional = false)
    private BsProteoxTenors idtenor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idworkspace")
    private Collection<BsProteoxWorkspaceItemBso> bsProteoxWorkspaceItemBsoCollection;

    public BsProteoxWorkspacesBso() {
    }

    public BsProteoxWorkspacesBso(Long idworkspace) {
        this.idworkspace = idworkspace;
    }

    public BsProteoxWorkspacesBso(Long idworkspace, String name, short selected) {
        this.idworkspace = idworkspace;
        this.name = name;
        this.selected = selected;
    }

    public Long getIdworkspace() {
        return idworkspace;
    }

    public void setIdworkspace(Long idworkspace) {
        this.idworkspace = idworkspace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getSelected() {
        return selected;
    }

    public void setSelected(short selected) {
        this.selected = selected;
    }

    public Short getCommon() {
        return common;
    }

    public void setCommon(Short common) {
        this.common = common;
    }

    public BsProteoxClients getIdclient() {
        return idclient;
    }

    public void setIdclient(BsProteoxClients idclient) {
        this.idclient = idclient;
    }

    public BsProteoxTenors getIdtenor() {
        return idtenor;
    }

    public void setIdtenor(BsProteoxTenors idtenor) {
        this.idtenor = idtenor;
    }

    public Collection<BsProteoxWorkspaceItemBso> getBsProteoxWorkspaceItemBsoCollection() {
        return bsProteoxWorkspaceItemBsoCollection;
    }

    public void setBsProteoxWorkspaceItemBsoCollection(Collection<BsProteoxWorkspaceItemBso> bsProteoxWorkspaceItemBsoCollection) {
        this.bsProteoxWorkspaceItemBsoCollection = bsProteoxWorkspaceItemBsoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idworkspace != null ? idworkspace.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxWorkspacesBso)) {
            return false;
        }
        BsProteoxWorkspacesBso other = (BsProteoxWorkspacesBso) object;
        if ((this.idworkspace == null && other.idworkspace != null) || (this.idworkspace != null && !this.idworkspace.equals(other.idworkspace))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxWorkspacesBso[ idworkspace=" + idworkspace + " ]";
    }
    
}
