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
@Table(name = "BS_PROTEOX_USER_MAILS")
@NamedQueries({
    @NamedQuery(name = "BsProteoxUserMails.findAll", query = "SELECT b FROM BsProteoxUserMails b")})
public class BsProteoxUserMails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDUSERMAIL")
    private Long idusermail;
    @Basic(optional = false)
    @Column(name = "MAIL")
    private String mail;
    @Column(name = "USER_AUTH")
    private String userAuth;
    @Column(name = "PASS_AUTH")
    private String passAuth;
    @OneToMany(mappedBy = "idusermail")
    private Collection<BsProteox2tradeUsers> bsProteox2tradeUsersCollection;

    public BsProteoxUserMails() {
    }

    public BsProteoxUserMails(Long idusermail) {
        this.idusermail = idusermail;
    }

    public BsProteoxUserMails(Long idusermail, String mail) {
        this.idusermail = idusermail;
        this.mail = mail;
    }

    public Long getIdusermail() {
        return idusermail;
    }

    public void setIdusermail(Long idusermail) {
        this.idusermail = idusermail;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(String userAuth) {
        this.userAuth = userAuth;
    }

    public String getPassAuth() {
        return passAuth;
    }

    public void setPassAuth(String passAuth) {
        this.passAuth = passAuth;
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
        hash += (idusermail != null ? idusermail.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxUserMails)) {
            return false;
        }
        BsProteoxUserMails other = (BsProteoxUserMails) object;
        if ((this.idusermail == null && other.idusermail != null) || (this.idusermail != null && !this.idusermail.equals(other.idusermail))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxUserMails[ idusermail=" + idusermail + " ]";
    }
    
}
