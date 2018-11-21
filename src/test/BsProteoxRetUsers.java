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
@Table(name = "BS_PROTEOX_RET_USERS")
@NamedQueries({
    @NamedQuery(name = "BsProteoxRetUsers.findAll", query = "SELECT b FROM BsProteoxRetUsers b")})
public class BsProteoxRetUsers implements Serializable {

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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iduserret")
    private Collection<BsProteox2tradeUsers> bsProteox2tradeUsersCollection;

    public BsProteoxRetUsers() {
    }

    public BsProteoxRetUsers(Long iduserret) {
        this.iduserret = iduserret;
    }

    public BsProteoxRetUsers(Long iduserret, String userret, String password) {
        this.iduserret = iduserret;
        this.userret = userret;
        this.password = password;
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

    public Collection<BsProteox2tradeUsers> getBsProteox2tradeUsersCollection() {
        return bsProteox2tradeUsersCollection;
    }

    public void setBsProteox2tradeUsersCollection(Collection<BsProteox2tradeUsers> bsProteox2tradeUsersCollection) {
        this.bsProteox2tradeUsersCollection = bsProteox2tradeUsersCollection;
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
        if (!(object instanceof BsProteoxRetUsers)) {
            return false;
        }
        BsProteoxRetUsers other = (BsProteoxRetUsers) object;
        if ((this.iduserret == null && other.iduserret != null) || (this.iduserret != null && !this.iduserret.equals(other.iduserret))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxRetUsers[ iduserret=" + iduserret + " ]";
    }
    
}
