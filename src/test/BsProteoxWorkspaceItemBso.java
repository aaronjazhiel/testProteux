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
@Table(name = "BS_PROTEOX_WORKSPACE_ITEM_BSO")
@NamedQueries({
    @NamedQuery(name = "BsProteoxWorkspaceItemBso.findAll", query = "SELECT b FROM BsProteoxWorkspaceItemBso b")})
public class BsProteoxWorkspaceItemBso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDITEM")
    private Long iditem;
    @JoinColumn(name = "IDQUOTECURRENCY", referencedColumnName = "IDCURRENCY")
    @ManyToOne
    private BsProteoxCurrencies idquotecurrency;
    @JoinColumn(name = "IDBASECURRENCY", referencedColumnName = "IDCURRENCY")
    @ManyToOne
    private BsProteoxCurrencies idbasecurrency;
    @JoinColumn(name = "IDWORKSPACE", referencedColumnName = "IDWORKSPACE")
    @ManyToOne(optional = false)
    private BsProteoxWorkspacesBso idworkspace;

    public BsProteoxWorkspaceItemBso() {
    }

    public BsProteoxWorkspaceItemBso(Long iditem) {
        this.iditem = iditem;
    }

    public Long getIditem() {
        return iditem;
    }

    public void setIditem(Long iditem) {
        this.iditem = iditem;
    }

    public BsProteoxCurrencies getIdquotecurrency() {
        return idquotecurrency;
    }

    public void setIdquotecurrency(BsProteoxCurrencies idquotecurrency) {
        this.idquotecurrency = idquotecurrency;
    }

    public BsProteoxCurrencies getIdbasecurrency() {
        return idbasecurrency;
    }

    public void setIdbasecurrency(BsProteoxCurrencies idbasecurrency) {
        this.idbasecurrency = idbasecurrency;
    }

    public BsProteoxWorkspacesBso getIdworkspace() {
        return idworkspace;
    }

    public void setIdworkspace(BsProteoxWorkspacesBso idworkspace) {
        this.idworkspace = idworkspace;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iditem != null ? iditem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxWorkspaceItemBso)) {
            return false;
        }
        BsProteoxWorkspaceItemBso other = (BsProteoxWorkspaceItemBso) object;
        if ((this.iditem == null && other.iditem != null) || (this.iditem != null && !this.iditem.equals(other.iditem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxWorkspaceItemBso[ iditem=" + iditem + " ]";
    }
    
}
