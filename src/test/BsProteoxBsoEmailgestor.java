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
@Table(name = "BS_PROTEOX_BSO_EMAILGESTOR")
@NamedQueries({
    @NamedQuery(name = "BsProteoxBsoEmailgestor.findAll", query = "SELECT b FROM BsProteoxBsoEmailgestor b")})
public class BsProteoxBsoEmailgestor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDEMAILGESTOR")
    private Integer idemailgestor;
    @Column(name = "CLIENTNIF")
    private String clientnif;
    @Column(name = "EMAILGESTOR")
    private String emailgestor;

    public BsProteoxBsoEmailgestor() {
    }

    public BsProteoxBsoEmailgestor(Integer idemailgestor) {
        this.idemailgestor = idemailgestor;
    }

    public Integer getIdemailgestor() {
        return idemailgestor;
    }

    public void setIdemailgestor(Integer idemailgestor) {
        this.idemailgestor = idemailgestor;
    }

    public String getClientnif() {
        return clientnif;
    }

    public void setClientnif(String clientnif) {
        this.clientnif = clientnif;
    }

    public String getEmailgestor() {
        return emailgestor;
    }

    public void setEmailgestor(String emailgestor) {
        this.emailgestor = emailgestor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idemailgestor != null ? idemailgestor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxBsoEmailgestor)) {
            return false;
        }
        BsProteoxBsoEmailgestor other = (BsProteoxBsoEmailgestor) object;
        if ((this.idemailgestor == null && other.idemailgestor != null) || (this.idemailgestor != null && !this.idemailgestor.equals(other.idemailgestor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxBsoEmailgestor[ idemailgestor=" + idemailgestor + " ]";
    }
    
}
