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
@Table(name = "BS_PROTEOX_CLIENTS")
@NamedQueries({
    @NamedQuery(name = "BsProteoxClients.findAll", query = "SELECT b FROM BsProteoxClients b")})
public class BsProteoxClients implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDCLIENT")
    private Long idclient;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "SURNAME")
    private String surname;
    @OneToMany(mappedBy = "idclient")
    private Collection<BsProteoxWorkspacesBso> bsProteoxWorkspacesBsoCollection;
    @OneToMany(mappedBy = "idclient")
    private Collection<BsProteoxWorkspaces> bsProteoxWorkspacesCollection;

    public BsProteoxClients() {
    }

    public BsProteoxClients(Long idclient) {
        this.idclient = idclient;
    }

    public BsProteoxClients(Long idclient, String name, String surname) {
        this.idclient = idclient;
        this.name = name;
        this.surname = surname;
    }

    public Long getIdclient() {
        return idclient;
    }

    public void setIdclient(Long idclient) {
        this.idclient = idclient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Collection<BsProteoxWorkspacesBso> getBsProteoxWorkspacesBsoCollection() {
        return bsProteoxWorkspacesBsoCollection;
    }

    public void setBsProteoxWorkspacesBsoCollection(Collection<BsProteoxWorkspacesBso> bsProteoxWorkspacesBsoCollection) {
        this.bsProteoxWorkspacesBsoCollection = bsProteoxWorkspacesBsoCollection;
    }

    public Collection<BsProteoxWorkspaces> getBsProteoxWorkspacesCollection() {
        return bsProteoxWorkspacesCollection;
    }

    public void setBsProteoxWorkspacesCollection(Collection<BsProteoxWorkspaces> bsProteoxWorkspacesCollection) {
        this.bsProteoxWorkspacesCollection = bsProteoxWorkspacesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idclient != null ? idclient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxClients)) {
            return false;
        }
        BsProteoxClients other = (BsProteoxClients) object;
        if ((this.idclient == null && other.idclient != null) || (this.idclient != null && !this.idclient.equals(other.idclient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxClients[ idclient=" + idclient + " ]";
    }
    
}
