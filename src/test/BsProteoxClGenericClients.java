/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "BS_PROTEOX_CL_GENERIC_CLIENTS")
@NamedQueries({
    @NamedQuery(name = "BsProteoxClGenericClients.findAll", query = "SELECT b FROM BsProteoxClGenericClients b")})
public class BsProteoxClGenericClients implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_GENERIC_CLIENT")
    private BigDecimal idGenericClient;
    @Column(name = "CLIENT_NAME")
    private String clientName;
    @Column(name = "RET_CLIENT_NAME")
    private String retClientName;
    @OneToMany(mappedBy = "idGenericClient")
    private Collection<BsProteoxClGenericSet> bsProteoxClGenericSetCollection;
    @OneToMany(mappedBy = "idGenericClient")
    private Collection<BsProteoxClAccounts> bsProteoxClAccountsCollection;

    public BsProteoxClGenericClients() {
    }

    public BsProteoxClGenericClients(BigDecimal idGenericClient) {
        this.idGenericClient = idGenericClient;
    }

    public BigDecimal getIdGenericClient() {
        return idGenericClient;
    }

    public void setIdGenericClient(BigDecimal idGenericClient) {
        this.idGenericClient = idGenericClient;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getRetClientName() {
        return retClientName;
    }

    public void setRetClientName(String retClientName) {
        this.retClientName = retClientName;
    }

    public Collection<BsProteoxClGenericSet> getBsProteoxClGenericSetCollection() {
        return bsProteoxClGenericSetCollection;
    }

    public void setBsProteoxClGenericSetCollection(Collection<BsProteoxClGenericSet> bsProteoxClGenericSetCollection) {
        this.bsProteoxClGenericSetCollection = bsProteoxClGenericSetCollection;
    }

    public Collection<BsProteoxClAccounts> getBsProteoxClAccountsCollection() {
        return bsProteoxClAccountsCollection;
    }

    public void setBsProteoxClAccountsCollection(Collection<BsProteoxClAccounts> bsProteoxClAccountsCollection) {
        this.bsProteoxClAccountsCollection = bsProteoxClAccountsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGenericClient != null ? idGenericClient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxClGenericClients)) {
            return false;
        }
        BsProteoxClGenericClients other = (BsProteoxClGenericClients) object;
        if ((this.idGenericClient == null && other.idGenericClient != null) || (this.idGenericClient != null && !this.idGenericClient.equals(other.idGenericClient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxClGenericClients[ idGenericClient=" + idGenericClient + " ]";
    }
    
}
