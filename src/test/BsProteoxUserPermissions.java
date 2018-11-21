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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Aarón Delgado
 */
@Entity
@Table(name = "BS_PROTEOX_USER_PERMISSIONS")
@NamedQueries({
    @NamedQuery(name = "BsProteoxUserPermissions.findAll", query = "SELECT b FROM BsProteoxUserPermissions b")})
public class BsProteoxUserPermissions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDUSERPERMISSION")
    private Long iduserpermission;
    @Basic(optional = false)
    @Column(name = "TICKETMODE")
    private short ticketmode;
    @Basic(optional = false)
    @Column(name = "MODIFY_CLIENT_MARKUP")
    private short modifyClientMarkup;
    @JoinColumn(name = "IDUSER", referencedColumnName = "IDUSER2TRADE")
    @OneToOne(optional = false)
    private BsProteox2tradeUsers iduser;

    public BsProteoxUserPermissions() {
    }

    public BsProteoxUserPermissions(Long iduserpermission) {
        this.iduserpermission = iduserpermission;
    }

    public BsProteoxUserPermissions(Long iduserpermission, short ticketmode, short modifyClientMarkup) {
        this.iduserpermission = iduserpermission;
        this.ticketmode = ticketmode;
        this.modifyClientMarkup = modifyClientMarkup;
    }

    public Long getIduserpermission() {
        return iduserpermission;
    }

    public void setIduserpermission(Long iduserpermission) {
        this.iduserpermission = iduserpermission;
    }

    public short getTicketmode() {
        return ticketmode;
    }

    public void setTicketmode(short ticketmode) {
        this.ticketmode = ticketmode;
    }

    public short getModifyClientMarkup() {
        return modifyClientMarkup;
    }

    public void setModifyClientMarkup(short modifyClientMarkup) {
        this.modifyClientMarkup = modifyClientMarkup;
    }

    public BsProteox2tradeUsers getIduser() {
        return iduser;
    }

    public void setIduser(BsProteox2tradeUsers iduser) {
        this.iduser = iduser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iduserpermission != null ? iduserpermission.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxUserPermissions)) {
            return false;
        }
        BsProteoxUserPermissions other = (BsProteoxUserPermissions) object;
        if ((this.iduserpermission == null && other.iduserpermission != null) || (this.iduserpermission != null && !this.iduserpermission.equals(other.iduserpermission))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxUserPermissions[ iduserpermission=" + iduserpermission + " ]";
    }
    
}
