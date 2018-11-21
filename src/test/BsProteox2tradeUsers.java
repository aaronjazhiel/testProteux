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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Aarón Delgado
 */
@Entity
@Table(name = "BS_PROTEOX_2TRADE_USERS")
@NamedQueries({
    @NamedQuery(name = "BsProteox2tradeUsers.findAll", query = "SELECT b FROM BsProteox2tradeUsers b")})
public class BsProteox2tradeUsers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDUSER2TRADE")
    private Long iduser2trade;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "BLOCKED")
    private Short blocked;
    @OneToMany(mappedBy = "idUser2trade")
    private Collection<BsProteoxClUserSet> bsProteoxClUserSetCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "iduser")
    private BsProteoxUserPermissions bsProteoxUserPermissions;
    @JoinColumn(name = "IDUSERRET", referencedColumnName = "IDUSERRET")
    @ManyToOne(optional = false)
    private BsProteoxRetUsers iduserret;
    @JoinColumn(name = "IDUSERMAIL", referencedColumnName = "IDUSERMAIL")
    @ManyToOne
    private BsProteoxUserMails idusermail;
    @JoinColumn(name = "IDUSERPREFERENCES", referencedColumnName = "IDUSERPREFERENCES")
    @ManyToOne
    private BsProteoxUserPreferences iduserpreferences;
    @OneToMany(mappedBy = "iduser")
    private Collection<BsProteoxWorkspaces> bsProteoxWorkspacesCollection;
    @OneToMany(mappedBy = "iduser")
    private Collection<BsProteoxDeals> bsProteoxDealsCollection;

    public BsProteox2tradeUsers() {
    }

    public BsProteox2tradeUsers(Long iduser2trade) {
        this.iduser2trade = iduser2trade;
    }

    public BsProteox2tradeUsers(Long iduser2trade, String name, String surname) {
        this.iduser2trade = iduser2trade;
        this.name = name;
        this.surname = surname;
    }

    public Long getIduser2trade() {
        return iduser2trade;
    }

    public void setIduser2trade(Long iduser2trade) {
        this.iduser2trade = iduser2trade;
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

    public Short getBlocked() {
        return blocked;
    }

    public void setBlocked(Short blocked) {
        this.blocked = blocked;
    }

    public Collection<BsProteoxClUserSet> getBsProteoxClUserSetCollection() {
        return bsProteoxClUserSetCollection;
    }

    public void setBsProteoxClUserSetCollection(Collection<BsProteoxClUserSet> bsProteoxClUserSetCollection) {
        this.bsProteoxClUserSetCollection = bsProteoxClUserSetCollection;
    }

    public BsProteoxUserPermissions getBsProteoxUserPermissions() {
        return bsProteoxUserPermissions;
    }

    public void setBsProteoxUserPermissions(BsProteoxUserPermissions bsProteoxUserPermissions) {
        this.bsProteoxUserPermissions = bsProteoxUserPermissions;
    }

    public BsProteoxRetUsers getIduserret() {
        return iduserret;
    }

    public void setIduserret(BsProteoxRetUsers iduserret) {
        this.iduserret = iduserret;
    }

    public BsProteoxUserMails getIdusermail() {
        return idusermail;
    }

    public void setIdusermail(BsProteoxUserMails idusermail) {
        this.idusermail = idusermail;
    }

    public BsProteoxUserPreferences getIduserpreferences() {
        return iduserpreferences;
    }

    public void setIduserpreferences(BsProteoxUserPreferences iduserpreferences) {
        this.iduserpreferences = iduserpreferences;
    }

    public Collection<BsProteoxWorkspaces> getBsProteoxWorkspacesCollection() {
        return bsProteoxWorkspacesCollection;
    }

    public void setBsProteoxWorkspacesCollection(Collection<BsProteoxWorkspaces> bsProteoxWorkspacesCollection) {
        this.bsProteoxWorkspacesCollection = bsProteoxWorkspacesCollection;
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
        hash += (iduser2trade != null ? iduser2trade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteox2tradeUsers)) {
            return false;
        }
        BsProteox2tradeUsers other = (BsProteox2tradeUsers) object;
        if ((this.iduser2trade == null && other.iduser2trade != null) || (this.iduser2trade != null && !this.iduser2trade.equals(other.iduser2trade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteox2tradeUsers[ iduser2trade=" + iduser2trade + " ]";
    }
    
}
