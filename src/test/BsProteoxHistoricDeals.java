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
@Table(name = "BS_PROTEOX_HISTORIC_DEALS")
@NamedQueries({
    @NamedQuery(name = "BsProteoxHistoricDeals.findAll", query = "SELECT b FROM BsProteoxHistoricDeals b")})
public class BsProteoxHistoricDeals implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "CAMBSPOT")
    private String cambspot;
    @Column(name = "CAMBFORW")
    private String cambforw;
    @Column(name = "CAMBCLI")
    private String cambcli;
    @Column(name = "DIVBASE")
    private String divbase;
    @Column(name = "DIVCOTIZ")
    private String divcotiz;
    @Column(name = "FECHAALTA")
    private String fechaalta;
    @Column(name = "FECHAVTO")
    private String fechavto;
    @Column(name = "FECINIVTO")
    private String fecinivto;
    @Column(name = "GID")
    private String gid;
    @Column(name = "IMPPTEDIVCO")
    private String impptedivco;
    @Column(name = "IMPINIDIVBA")
    private String impinidivba;
    @Column(name = "IMPINIDIVCO")
    private String impinidivco;
    @Column(name = "IMPPTEDIVBA")
    private String impptedivba;
    @Column(name = "REFOPER")
    private String refoper;
    @Column(name = "SITUOPER")
    private String situoper;
    @Column(name = "TIPOOPER")
    private String tipooper;
    @Column(name = "TIPOPROD")
    private String tipoprod;
    @Column(name = "USUALTA")
    private String usualta;
    @Column(name = "ACCOUNT")
    private String account;
    @Column(name = "NOMINALCOMPRAINI")
    private String nominalcompraini;
    @Column(name = "NOMINALVENTAINI")
    private String nominalventaini;
    @Column(name = "CANALCAPTURA")
    private String canalcaptura;
    @Column(name = "MARGENOPERACION")
    private String margenoperacion;
    @Column(name = "MARGENOPERACIONX100")
    private String margenoperacionx100;
    @Column(name = "FECHADECISION")
    private String fechadecision;
    @Column(name = "VALORMERCADO")
    private String valormercado;
    @Column(name = "STRIKE")
    private String strike;
    @Column(name = "IMPDISDIVCO")
    private String impdisdivco;
    @Column(name = "IMPDISDIVBA")
    private String impdisdivba;
    @Column(name = "COVERAGE")
    private String coverage;
    @Column(name = "ISSUER")
    private String issuer;
    @Column(name = "SIGNER")
    private String signer;
    @Column(name = "FECVTOORIG")
    private String fecvtoorig;
    @Column(name = "FECHALIQ")
    private String fechaliq;
    @Column(name = "CLIENT")
    private String client;
    @Column(name = "NIF")
    private String nif;

    public BsProteoxHistoricDeals() {
    }

    public BsProteoxHistoricDeals(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCambspot() {
        return cambspot;
    }

    public void setCambspot(String cambspot) {
        this.cambspot = cambspot;
    }

    public String getCambforw() {
        return cambforw;
    }

    public void setCambforw(String cambforw) {
        this.cambforw = cambforw;
    }

    public String getCambcli() {
        return cambcli;
    }

    public void setCambcli(String cambcli) {
        this.cambcli = cambcli;
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

    public String getFechaalta() {
        return fechaalta;
    }

    public void setFechaalta(String fechaalta) {
        this.fechaalta = fechaalta;
    }

    public String getFechavto() {
        return fechavto;
    }

    public void setFechavto(String fechavto) {
        this.fechavto = fechavto;
    }

    public String getFecinivto() {
        return fecinivto;
    }

    public void setFecinivto(String fecinivto) {
        this.fecinivto = fecinivto;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getImpptedivco() {
        return impptedivco;
    }

    public void setImpptedivco(String impptedivco) {
        this.impptedivco = impptedivco;
    }

    public String getImpinidivba() {
        return impinidivba;
    }

    public void setImpinidivba(String impinidivba) {
        this.impinidivba = impinidivba;
    }

    public String getImpinidivco() {
        return impinidivco;
    }

    public void setImpinidivco(String impinidivco) {
        this.impinidivco = impinidivco;
    }

    public String getImpptedivba() {
        return impptedivba;
    }

    public void setImpptedivba(String impptedivba) {
        this.impptedivba = impptedivba;
    }

    public String getRefoper() {
        return refoper;
    }

    public void setRefoper(String refoper) {
        this.refoper = refoper;
    }

    public String getSituoper() {
        return situoper;
    }

    public void setSituoper(String situoper) {
        this.situoper = situoper;
    }

    public String getTipooper() {
        return tipooper;
    }

    public void setTipooper(String tipooper) {
        this.tipooper = tipooper;
    }

    public String getTipoprod() {
        return tipoprod;
    }

    public void setTipoprod(String tipoprod) {
        this.tipoprod = tipoprod;
    }

    public String getUsualta() {
        return usualta;
    }

    public void setUsualta(String usualta) {
        this.usualta = usualta;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getNominalcompraini() {
        return nominalcompraini;
    }

    public void setNominalcompraini(String nominalcompraini) {
        this.nominalcompraini = nominalcompraini;
    }

    public String getNominalventaini() {
        return nominalventaini;
    }

    public void setNominalventaini(String nominalventaini) {
        this.nominalventaini = nominalventaini;
    }

    public String getCanalcaptura() {
        return canalcaptura;
    }

    public void setCanalcaptura(String canalcaptura) {
        this.canalcaptura = canalcaptura;
    }

    public String getMargenoperacion() {
        return margenoperacion;
    }

    public void setMargenoperacion(String margenoperacion) {
        this.margenoperacion = margenoperacion;
    }

    public String getMargenoperacionx100() {
        return margenoperacionx100;
    }

    public void setMargenoperacionx100(String margenoperacionx100) {
        this.margenoperacionx100 = margenoperacionx100;
    }

    public String getFechadecision() {
        return fechadecision;
    }

    public void setFechadecision(String fechadecision) {
        this.fechadecision = fechadecision;
    }

    public String getValormercado() {
        return valormercado;
    }

    public void setValormercado(String valormercado) {
        this.valormercado = valormercado;
    }

    public String getStrike() {
        return strike;
    }

    public void setStrike(String strike) {
        this.strike = strike;
    }

    public String getImpdisdivco() {
        return impdisdivco;
    }

    public void setImpdisdivco(String impdisdivco) {
        this.impdisdivco = impdisdivco;
    }

    public String getImpdisdivba() {
        return impdisdivba;
    }

    public void setImpdisdivba(String impdisdivba) {
        this.impdisdivba = impdisdivba;
    }

    public String getCoverage() {
        return coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getSigner() {
        return signer;
    }

    public void setSigner(String signer) {
        this.signer = signer;
    }

    public String getFecvtoorig() {
        return fecvtoorig;
    }

    public void setFecvtoorig(String fecvtoorig) {
        this.fecvtoorig = fecvtoorig;
    }

    public String getFechaliq() {
        return fechaliq;
    }

    public void setFechaliq(String fechaliq) {
        this.fechaliq = fechaliq;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
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
        if (!(object instanceof BsProteoxHistoricDeals)) {
            return false;
        }
        BsProteoxHistoricDeals other = (BsProteoxHistoricDeals) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxHistoricDeals[ id=" + id + " ]";
    }
    
}
