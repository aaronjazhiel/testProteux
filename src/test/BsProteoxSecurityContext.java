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
@Table(name = "BS_PROTEOX_SECURITY_CONTEXT")
@NamedQueries({
    @NamedQuery(name = "BsProteoxSecurityContext.findAll", query = "SELECT b FROM BsProteoxSecurityContext b")})
public class BsProteoxSecurityContext implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDSECURITYCONTEXT")
    private Long idsecuritycontext;
    @Basic(optional = false)
    @Column(name = "HOST")
    private String host;
    @Basic(optional = false)
    @Column(name = "PORT")
    private long port;
    @Column(name = "DESCRIPTION")
    private String description;
    @JoinColumn(name = "IDCONTEXTTYPE", referencedColumnName = "IDCONTEXTTYPE")
    @ManyToOne(optional = false)
    private BsProteoxContextType idcontexttype;

    public BsProteoxSecurityContext() {
    }

    public BsProteoxSecurityContext(Long idsecuritycontext) {
        this.idsecuritycontext = idsecuritycontext;
    }

    public BsProteoxSecurityContext(Long idsecuritycontext, String host, long port) {
        this.idsecuritycontext = idsecuritycontext;
        this.host = host;
        this.port = port;
    }

    public Long getIdsecuritycontext() {
        return idsecuritycontext;
    }

    public void setIdsecuritycontext(Long idsecuritycontext) {
        this.idsecuritycontext = idsecuritycontext;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public long getPort() {
        return port;
    }

    public void setPort(long port) {
        this.port = port;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BsProteoxContextType getIdcontexttype() {
        return idcontexttype;
    }

    public void setIdcontexttype(BsProteoxContextType idcontexttype) {
        this.idcontexttype = idcontexttype;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsecuritycontext != null ? idsecuritycontext.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxSecurityContext)) {
            return false;
        }
        BsProteoxSecurityContext other = (BsProteoxSecurityContext) object;
        if ((this.idsecuritycontext == null && other.idsecuritycontext != null) || (this.idsecuritycontext != null && !this.idsecuritycontext.equals(other.idsecuritycontext))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxSecurityContext[ idsecuritycontext=" + idsecuritycontext + " ]";
    }
    
}
