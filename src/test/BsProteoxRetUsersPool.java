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
@Table(name = "BS_PROTEOX_RET_USERS_POOL")
@NamedQueries({
    @NamedQuery(name = "BsProteoxRetUsersPool.findAll", query = "SELECT b FROM BsProteoxRetUsersPool b")})
public class BsProteoxRetUsersPool implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDUSERRET")
    private Long iduserret;
    @Basic(optional = false)
    @Column(name = "USERRET")
    private String userret;
    @Basic(optional = false)
    @Column(name = "PASSWORD")
    private String password;
    @Basic(optional = false)
    @Column(name = "DEFAULTRETCLIENT")
    private String defaultretclient;
    @Column(name = "TRADING")
    private Short trading;
    @Column(name = "SUBSCRIPTION")
    private Short subscription;
    @Basic(optional = false)
    @Column(name = "CONTEXT")
    private String context;
    @Basic(optional = false)
    @Column(name = "NODE")
    private short node;

    public BsProteoxRetUsersPool() {
    }

    public BsProteoxRetUsersPool(Long iduserret) {
        this.iduserret = iduserret;
    }

    public BsProteoxRetUsersPool(Long iduserret, String userret, String password, String defaultretclient, String context, short node) {
        this.iduserret = iduserret;
        this.userret = userret;
        this.password = password;
        this.defaultretclient = defaultretclient;
        this.context = context;
        this.node = node;
    }

    public Long getIduserret() {
        return iduserret;
    }

    public void setIduserret(Long iduserret) {
        this.iduserret = iduserret;
    }

    public String getUserret() {
        return userret;
    }

    public void setUserret(String userret) {
        this.userret = userret;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDefaultretclient() {
        return defaultretclient;
    }

    public void setDefaultretclient(String defaultretclient) {
        this.defaultretclient = defaultretclient;
    }

    public Short getTrading() {
        return trading;
    }

    public void setTrading(Short trading) {
        this.trading = trading;
    }

    public Short getSubscription() {
        return subscription;
    }

    public void setSubscription(Short subscription) {
        this.subscription = subscription;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public short getNode() {
        return node;
    }

    public void setNode(short node) {
        this.node = node;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iduserret != null ? iduserret.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxRetUsersPool)) {
            return false;
        }
        BsProteoxRetUsersPool other = (BsProteoxRetUsersPool) object;
        if ((this.iduserret == null && other.iduserret != null) || (this.iduserret != null && !this.iduserret.equals(other.iduserret))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxRetUsersPool[ iduserret=" + iduserret + " ]";
    }
    
}
