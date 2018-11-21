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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Aarón Delgado
 */
@Entity
@Table(name = "BS_PROTEOX_VIP_USERS_BSO")
@NamedQueries({
    @NamedQuery(name = "BsProteoxVipUsersBso.findAll", query = "SELECT b FROM BsProteoxVipUsersBso b")})
public class BsProteoxVipUsersBso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDUSER2TRADE")
    private Long iduser2trade;
    @Basic(optional = false)
    @Column(name = "NIF")
    private String nif;
    @Column(name = "NAME")
    private String name;
    @JoinColumn(name = "IDUSERPREFERENCES", referencedColumnName = "IDUSERPREFERENCES")
    @ManyToOne
    private BsProteoxUserPreferences iduserpreferences;

    public BsProteoxVipUsersBso() {
    }

    public BsProteoxVipUsersBso(Long iduser2trade) {
        this.iduser2trade = iduser2trade;
    }

    public BsProteoxVipUsersBso(Long iduser2trade, String nif) {
        this.iduser2trade = iduser2trade;
        this.nif = nif;
    }

    public Long getIduser2trade() {
        return iduser2trade;
    }

    public void setIduser2trade(Long iduser2trade) {
        this.iduser2trade = iduser2trade;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BsProteoxUserPreferences getIduserpreferences() {
        return iduserpreferences;
    }

    public void setIduserpreferences(BsProteoxUserPreferences iduserpreferences) {
        this.iduserpreferences = iduserpreferences;
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
        if (!(object instanceof BsProteoxVipUsersBso)) {
            return false;
        }
        BsProteoxVipUsersBso other = (BsProteoxVipUsersBso) object;
        if ((this.iduser2trade == null && other.iduser2trade != null) || (this.iduser2trade != null && !this.iduser2trade.equals(other.iduser2trade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxVipUsersBso[ iduser2trade=" + iduser2trade + " ]";
    }
    
}
