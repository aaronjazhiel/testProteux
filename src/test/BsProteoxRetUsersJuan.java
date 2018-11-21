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
@Table(name = "BS_PROTEOX_RET_USERS_JUAN")
@NamedQueries({
    @NamedQuery(name = "BsProteoxRetUsersJuan.findAll", query = "SELECT b FROM BsProteoxRetUsersJuan b")})
public class BsProteoxRetUsersJuan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDUSERRET")
    private Long iduserret;
    @Column(name = "USERRET")
    private String userret;
    @Column(name = "PASSWORD")
    private String password;

    public BsProteoxRetUsersJuan() {
    }

    public BsProteoxRetUsersJuan(Long iduserret) {
        this.iduserret = iduserret;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iduserret != null ? iduserret.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxRetUsersJuan)) {
            return false;
        }
        BsProteoxRetUsersJuan other = (BsProteoxRetUsersJuan) object;
        if ((this.iduserret == null && other.iduserret != null) || (this.iduserret != null && !this.iduserret.equals(other.iduserret))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxRetUsersJuan[ iduserret=" + iduserret + " ]";
    }
    
}
