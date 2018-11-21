/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Aarón Delgado
 */
@Entity
@Table(name = "BS_PROTEOX_DEALS")
@NamedQueries({
    @NamedQuery(name = "BsProteoxDeals.findAll", query = "SELECT b FROM BsProteoxDeals b")})
public class BsProteoxDeals implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDDEAL")
    private BigDecimal iddeal;
    @Column(name = "CLIENT")
    private String client;
    @Column(name = "DEALSTATUS")
    private String dealstatus;
    @Column(name = "TRADER")
    private String trader;
    @Basic(optional = false)
    @Column(name = "TRADEDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tradedate;
    @Column(name = "RETID")
    private String retid;
    @Column(name = "VALIDITY")
    private Short validity;
    @Column(name = "GLOBALID")
    private String globalid;
    @Column(name = "PARENTNAIREFERENCE")
    private String parentnaireference;
    @Column(name = "ACTIVE")
    private Short active;
    @Column(name = "MARKUPCOMPLETE")
    private Short markupcomplete;
    @Column(name = "CA2STATUS")
    private String ca2status;
    @Column(name = "PROVIDER")
    private String provider;
    @Column(name = "PARENTGLOBALID")
    private String parentglobalid;
    @Column(name = "CLIENTNIF")
    private String clientnif;
    @Column(name = "FORMATTED_CLIENTNAME")
    private String formattedClientname;
    @Column(name = "AGENT_NIF")
    private String agentNif;
    @Column(name = "TGR_ACCOUNT")
    private String tgrAccount;
    @Column(name = "CANCELLATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cancellationDate;
    @Column(name = "RFQ_TIME")
    private String rfqTime;
    @Column(name = "COVERAGE")
    private String coverage;
    @Column(name = "BLOCKED")
    private Short blocked;
    @Column(name = "ENCRYPTED")
    private Short encrypted;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddeal")
    private Collection<BsProteoxDealLegs> bsProteoxDealLegsCollection;
    @JoinColumn(name = "CHANNEL", referencedColumnName = "IDCHANNEL")
    @ManyToOne
    private BsProteoxChannels channel;
    @JoinColumn(name = "IDBASECURRENCY", referencedColumnName = "IDCURRENCY")
    @ManyToOne
    private BsProteoxCurrencies idbasecurrency;
    @JoinColumn(name = "IDQUOTECURRENCY", referencedColumnName = "IDCURRENCY")
    @ManyToOne
    private BsProteoxCurrencies idquotecurrency;
    @OneToMany(mappedBy = "parentiddeal")
    private Collection<BsProteoxDeals> bsProteoxDealsCollection;
    @JoinColumn(name = "PARENTIDDEAL", referencedColumnName = "IDDEAL")
    @ManyToOne
    private BsProteoxDeals parentiddeal;
    @JoinColumn(name = "IDPRODUCTTYPE", referencedColumnName = "IDOPERATION")
    @ManyToOne
    private BsProteoxOperations idproducttype;
    @JoinColumn(name = "IDUSER", referencedColumnName = "IDUSER2TRADE")
    @ManyToOne
    private BsProteox2tradeUsers iduser;

    public BsProteoxDeals() {
    }

    public BsProteoxDeals(BigDecimal iddeal) {
        this.iddeal = iddeal;
    }

    public BsProteoxDeals(BigDecimal iddeal, Date tradedate) {
        this.iddeal = iddeal;
        this.tradedate = tradedate;
    }

    public BigDecimal getIddeal() {
        return iddeal;
    }

    public void setIddeal(BigDecimal iddeal) {
        this.iddeal = iddeal;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getDealstatus() {
        return dealstatus;
    }

    public void setDealstatus(String dealstatus) {
        this.dealstatus = dealstatus;
    }

    public String getTrader() {
        return trader;
    }

    public void setTrader(String trader) {
        this.trader = trader;
    }

    public Date getTradedate() {
        return tradedate;
    }

    public void setTradedate(Date tradedate) {
        this.tradedate = tradedate;
    }

    public String getRetid() {
        return retid;
    }

    public void setRetid(String retid) {
        this.retid = retid;
    }

    public Short getValidity() {
        return validity;
    }

    public void setValidity(Short validity) {
        this.validity = validity;
    }

    public String getGlobalid() {
        return globalid;
    }

    public void setGlobalid(String globalid) {
        this.globalid = globalid;
    }

    public String getParentnaireference() {
        return parentnaireference;
    }

    public void setParentnaireference(String parentnaireference) {
        this.parentnaireference = parentnaireference;
    }

    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    public Short getMarkupcomplete() {
        return markupcomplete;
    }

    public void setMarkupcomplete(Short markupcomplete) {
        this.markupcomplete = markupcomplete;
    }

    public String getCa2status() {
        return ca2status;
    }

    public void setCa2status(String ca2status) {
        this.ca2status = ca2status;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getParentglobalid() {
        return parentglobalid;
    }

    public void setParentglobalid(String parentglobalid) {
        this.parentglobalid = parentglobalid;
    }

    public String getClientnif() {
        return clientnif;
    }

    public void setClientnif(String clientnif) {
        this.clientnif = clientnif;
    }

    public String getFormattedClientname() {
        return formattedClientname;
    }

    public void setFormattedClientname(String formattedClientname) {
        this.formattedClientname = formattedClientname;
    }

    public String getAgentNif() {
        return agentNif;
    }

    public void setAgentNif(String agentNif) {
        this.agentNif = agentNif;
    }

    public String getTgrAccount() {
        return tgrAccount;
    }

    public void setTgrAccount(String tgrAccount) {
        this.tgrAccount = tgrAccount;
    }

    public Date getCancellationDate() {
        return cancellationDate;
    }

    public void setCancellationDate(Date cancellationDate) {
        this.cancellationDate = cancellationDate;
    }

    public String getRfqTime() {
        return rfqTime;
    }

    public void setRfqTime(String rfqTime) {
        this.rfqTime = rfqTime;
    }

    public String getCoverage() {
        return coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    public Short getBlocked() {
        return blocked;
    }

    public void setBlocked(Short blocked) {
        this.blocked = blocked;
    }

    public Short getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(Short encrypted) {
        this.encrypted = encrypted;
    }

    public Collection<BsProteoxDealLegs> getBsProteoxDealLegsCollection() {
        return bsProteoxDealLegsCollection;
    }

    public void setBsProteoxDealLegsCollection(Collection<BsProteoxDealLegs> bsProteoxDealLegsCollection) {
        this.bsProteoxDealLegsCollection = bsProteoxDealLegsCollection;
    }

    public BsProteoxChannels getChannel() {
        return channel;
    }

    public void setChannel(BsProteoxChannels channel) {
        this.channel = channel;
    }

    public BsProteoxCurrencies getIdbasecurrency() {
        return idbasecurrency;
    }

    public void setIdbasecurrency(BsProteoxCurrencies idbasecurrency) {
        this.idbasecurrency = idbasecurrency;
    }

    public BsProteoxCurrencies getIdquotecurrency() {
        return idquotecurrency;
    }

    public void setIdquotecurrency(BsProteoxCurrencies idquotecurrency) {
        this.idquotecurrency = idquotecurrency;
    }

    public Collection<BsProteoxDeals> getBsProteoxDealsCollection() {
        return bsProteoxDealsCollection;
    }

    public void setBsProteoxDealsCollection(Collection<BsProteoxDeals> bsProteoxDealsCollection) {
        this.bsProteoxDealsCollection = bsProteoxDealsCollection;
    }

    public BsProteoxDeals getParentiddeal() {
        return parentiddeal;
    }

    public void setParentiddeal(BsProteoxDeals parentiddeal) {
        this.parentiddeal = parentiddeal;
    }

    public BsProteoxOperations getIdproducttype() {
        return idproducttype;
    }

    public void setIdproducttype(BsProteoxOperations idproducttype) {
        this.idproducttype = idproducttype;
    }

    public BsProteox2tradeUsers getIduser() {
        return iduser;
    }

    public void setIduser(BsProteox2tradeUsers iduser) {
        this.iduser = iduser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddeal != null ? iddeal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxDeals)) {
            return false;
        }
        BsProteoxDeals other = (BsProteoxDeals) object;
        if ((this.iddeal == null && other.iddeal != null) || (this.iddeal != null && !this.iddeal.equals(other.iddeal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxDeals[ iddeal=" + iddeal + " ]";
    }
    
}
