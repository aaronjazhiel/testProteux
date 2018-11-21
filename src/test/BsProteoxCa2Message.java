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
@Table(name = "BS_PROTEOX_CA2_MESSAGE")
@NamedQueries({
    @NamedQuery(name = "BsProteoxCa2Message.findAll", query = "SELECT b FROM BsProteoxCa2Message b")})
public class BsProteoxCa2Message implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDCA2MESSAGE")
    private Long idca2message;
    @Basic(optional = false)
    @Column(name = "IDCONTEXTTYPE")
    private long idcontexttype;
    @Basic(optional = false)
    @Column(name = "IDLOCALE")
    private int idlocale;
    @Basic(optional = false)
    @Column(name = "MESSAGE")
    private String message;
    @Column(name = "ACTIVE")
    private Short active;
    @JoinColumn(name = "IDCA2KEY", referencedColumnName = "IDCA2KEY")
    @ManyToOne(optional = false)
    private BsProteoxCa2Key idca2key;

    public BsProteoxCa2Message() {
    }

    public BsProteoxCa2Message(Long idca2message) {
        this.idca2message = idca2message;
    }

    public BsProteoxCa2Message(Long idca2message, long idcontexttype, int idlocale, String message) {
        this.idca2message = idca2message;
        this.idcontexttype = idcontexttype;
        this.idlocale = idlocale;
        this.message = message;
    }

    public Long getIdca2message() {
        return idca2message;
    }

    public void setIdca2message(Long idca2message) {
        this.idca2message = idca2message;
    }

    public long getIdcontexttype() {
        return idcontexttype;
    }

    public void setIdcontexttype(long idcontexttype) {
        this.idcontexttype = idcontexttype;
    }

    public int getIdlocale() {
        return idlocale;
    }

    public void setIdlocale(int idlocale) {
        this.idlocale = idlocale;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    public BsProteoxCa2Key getIdca2key() {
        return idca2key;
    }

    public void setIdca2key(BsProteoxCa2Key idca2key) {
        this.idca2key = idca2key;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idca2message != null ? idca2message.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxCa2Message)) {
            return false;
        }
        BsProteoxCa2Message other = (BsProteoxCa2Message) object;
        if ((this.idca2message == null && other.idca2message != null) || (this.idca2message != null && !this.idca2message.equals(other.idca2message))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxCa2Message[ idca2message=" + idca2message + " ]";
    }
    
}
