/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Aarón Delgado
 */
@Entity
@Table(name = "BS_PROTEOX_HISTORIC_DEALS_D")
@NamedQueries({
    @NamedQuery(name = "BsProteoxHistoricDealsD.findAll", query = "SELECT b FROM BsProteoxHistoricDealsD b")})
public class BsProteoxHistoricDealsD implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "GID")
    private String gid;
    @Column(name = "REFOPER")
    private Long refoper;
    @Column(name = "FECHAALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaalta;
    @Column(name = "FECHAVTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechavto;
    @Column(name = "DIVBASE")
    private String divbase;
    @Column(name = "DIVCOTIZ")
    private String divcotiz;
    @Column(name = "IMPPTEDIVBA")
    private BigDecimal impptedivba;
    @Column(name = "IMPPTEDIVCO")
    private BigDecimal impptedivco;
    @Column(name = "IMPINIDIVBA")
    private BigDecimal impinidivba;
    @Column(name = "IMPINIDIVCO")
    private BigDecimal impinidivco;
    @Column(name = "EMPRCTAVTA")
    private String emprctavta;
    @Column(name = "CENTCTAVTA")
    private String centctavta;
    @Column(name = "TIPOCTAVTA")
    private String tipoctavta;
    @Column(name = "NUMECTAVTA")
    private String numectavta;
    @Column(name = "TIPOPROD")
    private String tipoprod;
    @Column(name = "DIRECTION")
    private String direction;
    @Column(name = "TIPOOPER")
    private String tipooper;
    @Column(name = "SITUOPER")
    private Character situoper;
    @Column(name = "CAMBCLI")
    private BigDecimal cambcli;
    @Column(name = "CAMBFORW")
    private BigDecimal cambforw;
    @Column(name = "CAMBSPOT")
    private BigDecimal cambspot;
    @Column(name = "STARTDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startdate;
    @Column(name = "NOMINALCOMPRAINI")
    private BigDecimal nominalcompraini;
    @Column(name = "NOMINALVENTAINI")
    private BigDecimal nominalventaini;
    @Column(name = "CANALCAPTURA")
    private String canalcaptura;
    @Column(name = "MARGENOPERACION")
    private BigDecimal margenoperacion;
    @Column(name = "MARGENOPERACIONX100")
    private BigDecimal margenoperacionx100;
    @Column(name = "FECHADECISION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechadecision;
    @Column(name = "VALORMERCADO")
    private BigDecimal valormercado;
    @Column(name = "STRIKE")
    private String strike;
    @Column(name = "ACCOUNT")
    private String account;
    @Column(name = "USUALTA")
    private String usualta;
    @Column(name = "POSTTRADEACTIONS")
    private BigInteger posttradeactions;
    @Column(name = "CLIENT")
    private String client;

    public BsProteoxHistoricDealsD() {
    }

    public BsProteoxHistoricDealsD(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public Long getRefoper() {
        return refoper;
    }

    public void setRefoper(Long refoper) {
        this.refoper = refoper;
    }

    public Date getFechaalta() {
        return fechaalta;
    }

    public void setFechaalta(Date fechaalta) {
        this.fechaalta = fechaalta;
    }

    public Date getFechavto() {
        return fechavto;
    }

    public void setFechavto(Date fechavto) {
        this.fechavto = fechavto;
    }

    public String getDivbase() {
        return divbase;
    }

    public void setDivbase(String divbase) {
        this.divbase = divbase;
    }

    public String getDivcotiz() {
        return divcotiz;
    }

    public void setDivcotiz(String divcotiz) {
        this.divcotiz = divcotiz;
    }

    public BigDecimal getImpptedivba() {
        return impptedivba;
    }

    public void setImpptedivba(BigDecimal impptedivba) {
        this.impptedivba = impptedivba;
    }

    public BigDecimal getImpptedivco() {
        return impptedivco;
    }

    public void setImpptedivco(BigDecimal impptedivco) {
        this.impptedivco = impptedivco;
    }

    public BigDecimal getImpinidivba() {
        return impinidivba;
    }

    public void setImpinidivba(BigDecimal impinidivba) {
        this.impinidivba = impinidivba;
    }

    public BigDecimal getImpinidivco() {
        return impinidivco;
    }

    public void setImpinidivco(BigDecimal impinidivco) {
        this.impinidivco = impinidivco;
    }

    public String getEmprctavta() {
        return emprctavta;
    }

    public void setEmprctavta(String emprctavta) {
        this.emprctavta = emprctavta;
    }

    public String getCentctavta() {
        return centctavta;
    }

    public void setCentctavta(String centctavta) {
        this.centctavta = centctavta;
    }

    public String getTipoctavta() {
        return tipoctavta;
    }

    public void setTipoctavta(String tipoctavta) {
        this.tipoctavta = tipoctavta;
    }

    public String getNumectavta() {
        return numectavta;
    }

    public void setNumectavta(String numectavta) {
        this.numectavta = numectavta;
    }

    public String getTipoprod() {
        return tipoprod;
    }

    public void setTipoprod(String tipoprod) {
        this.tipoprod = tipoprod;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getTipooper() {
        return tipooper;
    }

    public void setTipooper(String tipooper) {
        this.tipooper = tipooper;
    }

    public Character getSituoper() {
        return situoper;
    }

    public void setSituoper(Character situoper) {
        this.situoper = situoper;
    }

    public BigDecimal getCambcli() {
        return cambcli;
    }

    public void setCambcli(BigDecimal cambcli) {
        this.cambcli = cambcli;
    }

    public BigDecimal getCambforw() {
        return cambforw;
    }

    public void setCambforw(BigDecimal cambforw) {
        this.cambforw = cambforw;
    }

    public BigDecimal getCambspot() {
        return cambspot;
    }

    public void setCambspot(BigDecimal cambspot) {
        this.cambspot = cambspot;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public BigDecimal getNominalcompraini() {
        return nominalcompraini;
    }

    public void setNominalcompraini(BigDecimal nominalcompraini) {
        this.nominalcompraini = nominalcompraini;
    }

    public BigDecimal getNominalventaini() {
        return nominalventaini;
    }

    public void setNominalventaini(BigDecimal nominalventaini) {
        this.nominalventaini = nominalventaini;
    }

    public String getCanalcaptura() {
        return canalcaptura;
    }

    public void setCanalcaptura(String canalcaptura) {
        this.canalcaptura = canalcaptura;
    }

    public BigDecimal getMargenoperacion() {
        return margenoperacion;
    }

    public void setMargenoperacion(BigDecimal margenoperacion) {
        this.margenoperacion = margenoperacion;
    }

    public BigDecimal getMargenoperacionx100() {
        return margenoperacionx100;
    }

    public void setMargenoperacionx100(BigDecimal margenoperacionx100) {
        this.margenoperacionx100 = margenoperacionx100;
    }

    public Date getFechadecision() {
        return fechadecision;
    }

    public void setFechadecision(Date fechadecision) {
        this.fechadecision = fechadecision;
    }

    public BigDecimal getValormercado() {
        return valormercado;
    }

    public void setValormercado(BigDecimal valormercado) {
        this.valormercado = valormercado;
    }

    public String getStrike() {
        return strike;
    }

    public void setStrike(String strike) {
        this.strike = strike;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUsualta() {
        return usualta;
    }

    public void setUsualta(String usualta) {
        this.usualta = usualta;
    }

    public BigInteger getPosttradeactions() {
        return posttradeactions;
    }

    public void setPosttradeactions(BigInteger posttradeactions) {
        this.posttradeactions = posttradeactions;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxHistoricDealsD)) {
            return false;
        }
        BsProteoxHistoricDealsD other = (BsProteoxHistoricDealsD) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxHistoricDealsD[ id=" + id + " ]";
    }
    
}
