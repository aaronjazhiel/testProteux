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
@Table(name = "BS_PROTEOX_CA2_KEY")
@NamedQueries({
    @NamedQuery(name = "BsProteoxCa2Key.findAll", query = "SELECT b FROM BsProteoxCa2Key b")})
public class BsProteoxCa2Key implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDCA2KEY")
    private Long idca2key;
    @Column(name = "CODE")
    private String code;
    @Basic(optional = false)
    @Column(name = "TEXT")
    private String text;
    @Column(name = "ACTIVE")
    private Short active;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idca2key")
    private Collection<BsProteoxCa2Message> bsProteoxCa2MessageCollection;

    public BsProteoxCa2Key() {
    }

    public BsProteoxCa2Key(Long idca2key) {
        this.idca2key = idca2key;
    }

    public BsProteoxCa2Key(Long idca2key, String text) {
        this.idca2key = idca2key;
        this.text = text;
    }

    public Long getIdca2key() {
        return idca2key;
    }

    public void setIdca2key(Long idca2key) {
        this.idca2key = idca2key;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    public Collection<BsProteoxCa2Message> getBsProteoxCa2MessageCollection() {
        return bsProteoxCa2MessageCollection;
    }

    public void setBsProteoxCa2MessageCollection(Collection<BsProteoxCa2Message> bsProteoxCa2MessageCollection) {
        this.bsProteoxCa2MessageCollection = bsProteoxCa2MessageCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idca2key != null ? idca2key.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxCa2Key)) {
            return false;
        }
        BsProteoxCa2Key other = (BsProteoxCa2Key) object;
        if ((this.idca2key == null && other.idca2key != null) || (this.idca2key != null && !this.idca2key.equals(other.idca2key))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxCa2Key[ idca2key=" + idca2key + " ]";
    }
    
}
