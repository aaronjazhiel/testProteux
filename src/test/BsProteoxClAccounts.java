/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "BS_PROTEOX_CL_ACCOUNTS")
@NamedQueries({
    @NamedQuery(name = "BsProteoxClAccounts.findAll", query = "SELECT b FROM BsProteoxClAccounts b")})
public class BsProteoxClAccounts implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ACCOUNT")
    private BigDecimal idAccount;
    @Column(name = "ACCOUNT_VALUE")
    private String accountValue;
    @JoinColumn(name = "ID_GENERIC_CLIENT", referencedColumnName = "ID_GENERIC_CLIENT")
    @ManyToOne
    private BsProteoxClGenericClients idGenericClient;

    public BsProteoxClAccounts() {
    }

    public BsProteoxClAccounts(BigDecimal idAccount) {
        this.idAccount = idAccount;
    }

    public BigDecimal getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(BigDecimal idAccount) {
        this.idAccount = idAccount;
    }

    public String getAccountValue() {
        return accountValue;
    }

    public void setAccountValue(String accountValue) {
        this.accountValue = accountValue;
    }

    public BsProteoxClGenericClients getIdGenericClient() {
        return idGenericClient;
    }

    public void setIdGenericClient(BsProteoxClGenericClients idGenericClient) {
        this.idGenericClient = idGenericClient;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAccount != null ? idAccount.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxClAccounts)) {
            return false;
        }
        BsProteoxClAccounts other = (BsProteoxClAccounts) object;
        if ((this.idAccount == null && other.idAccount != null) || (this.idAccount != null && !this.idAccount.equals(other.idAccount))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxClAccounts[ idAccount=" + idAccount + " ]";
    }
    
}
