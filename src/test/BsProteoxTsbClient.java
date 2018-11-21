/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Aarón Delgado
 */
@Entity
@Table(name = "BS_PROTEOX_TSB_CLIENT")
@NamedQueries({
    @NamedQuery(name = "BsProteoxTsbClient.findAll", query = "SELECT b FROM BsProteoxTsbClient b")})
public class BsProteoxTsbClient implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDTSBCLIENT")
    private Long idtsbclient;
    @Basic(optional = false)
    @Column(name = "TSBCLIENTNAME")
    private String tsbclientname;
    @Basic(optional = false)
    @Column(name = "USERRET")
    private String userret;
    @Column(name = "GLOBALIDPREFIX")
    private String globalidprefix;

    public BsProteoxTsbClient() {
    }

    public BsProteoxTsbClient(Long idtsbclient) {
        this.idtsbclient = idtsbclient;
    }

    public BsProteoxTsbClient(Long idtsbclient, String tsbclientname, String userret) {
        this.idtsbclient = idtsbclient;
        this.tsbclientname = tsbclientname;
        this.userret = userret;
    }

    public Long getIdtsbclient() {
        return idtsbclient;
    }

    public void setIdtsbclient(Long idtsbclient) {
        this.idtsbclient = idtsbclient;
    }

    public String getTsbclientname() {
        return tsbclientname;
    }

    public void setTsbclientname(String tsbclientname) {
        this.tsbclientname = tsbclientname;
    }

    public String getUserret() {
        return userret;
    }

    public void setUserret(String userret) {
        this.userret = userret;
    }

    public String getGlobalidprefix() {
        return globalidprefix;
    }

    public void setGlobalidprefix(String globalidprefix) {
        this.globalidprefix = globalidprefix;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtsbclient != null ? idtsbclient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxTsbClient)) {
            return false;
        }
        BsProteoxTsbClient other = (BsProteoxTsbClient) object;
        if ((this.idtsbclient == null && other.idtsbclient != null) || (this.idtsbclient != null && !this.idtsbclient.equals(other.idtsbclient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxTsbClient[ idtsbclient=" + idtsbclient + " ]";
    }
    
}
