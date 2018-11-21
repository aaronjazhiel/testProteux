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
@Table(name = "BS_PROTEOX_CL_TRADE_CLIENT")
@NamedQueries({
    @NamedQuery(name = "BsProteoxClTradeClient.findAll", query = "SELECT b FROM BsProteoxClTradeClient b")})
public class BsProteoxClTradeClient implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_TRADE_CLIENT")
    private BigDecimal idTradeClient;
    @Column(name = "RET_TRADE_CLIENT")
    private String retTradeClient;
    @Column(name = "RET_TRADE_CLIENT_SUPERDEX")
    private String retTradeClientSuperdex;
    @JoinColumn(name = "ID_TIPO_DISTRIBUCION", referencedColumnName = "ID_TIPO_DISTRIBUCION")
    @ManyToOne
    private BsProteoxClDistribucion idTipoDistribucion;
    @JoinColumn(name = "ID_PARRILLA_FWD", referencedColumnName = "ID_PARRILLA_FWD")
    @ManyToOne
    private BsProteoxClParrFwd idParrillaFwd;
    @JoinColumn(name = "ID_PARRILLA_SPOT", referencedColumnName = "ID_PARRILLA_SPOT")
    @ManyToOne
    private BsProteoxClParrSpot idParrillaSpot;

    public BsProteoxClTradeClient() {
    }

    public BsProteoxClTradeClient(BigDecimal idTradeClient) {
        this.idTradeClient = idTradeClient;
    }

    public BigDecimal getIdTradeClient() {
        return idTradeClient;
    }

    public void setIdTradeClient(BigDecimal idTradeClient) {
        this.idTradeClient = idTradeClient;
    }

    public String getRetTradeClient() {
        return retTradeClient;
    }

    public void setRetTradeClient(String retTradeClient) {
        this.retTradeClient = retTradeClient;
    }

    public String getRetTradeClientSuperdex() {
        return retTradeClientSuperdex;
    }

    public void setRetTradeClientSuperdex(String retTradeClientSuperdex) {
        this.retTradeClientSuperdex = retTradeClientSuperdex;
    }

    public BsProteoxClDistribucion getIdTipoDistribucion() {
        return idTipoDistribucion;
    }

    public void setIdTipoDistribucion(BsProteoxClDistribucion idTipoDistribucion) {
        this.idTipoDistribucion = idTipoDistribucion;
    }

    public BsProteoxClParrFwd getIdParrillaFwd() {
        return idParrillaFwd;
    }

    public void setIdParrillaFwd(BsProteoxClParrFwd idParrillaFwd) {
        this.idParrillaFwd = idParrillaFwd;
    }

    public BsProteoxClParrSpot getIdParrillaSpot() {
        return idParrillaSpot;
    }

    public void setIdParrillaSpot(BsProteoxClParrSpot idParrillaSpot) {
        this.idParrillaSpot = idParrillaSpot;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTradeClient != null ? idTradeClient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxClTradeClient)) {
            return false;
        }
        BsProteoxClTradeClient other = (BsProteoxClTradeClient) object;
        if ((this.idTradeClient == null && other.idTradeClient != null) || (this.idTradeClient != null && !this.idTradeClient.equals(other.idTradeClient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxClTradeClient[ idTradeClient=" + idTradeClient + " ]";
    }
    
}
