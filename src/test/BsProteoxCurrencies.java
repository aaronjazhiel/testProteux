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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Aarón Delgado
 */
@Entity
@Table(name = "BS_PROTEOX_CURRENCIES")
@NamedQueries({
    @NamedQuery(name = "BsProteoxCurrencies.findAll", query = "SELECT b FROM BsProteoxCurrencies b")})
public class BsProteoxCurrencies implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDCURRENCY")
    private Integer idcurrency;
    @Basic(optional = false)
    @Column(name = "CURRENCYORDER")
    private short currencyorder;
    @Basic(optional = false)
    @Column(name = "CODE")
    private String code;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "DIGITS")
    private short digits;
    @Basic(optional = false)
    @Column(name = "ROUNDING")
    private short rounding;
    @Column(name = "FIXINGDATE")
    private Integer fixingdate;
    @Column(name = "NDF")
    private Integer ndf;
    @Basic(optional = false)
    @Column(name = "SETTLEMENTCURRENCY")
    private short settlementcurrency;
    @Column(name = "WEIGHT")
    private Integer weight;
    @Column(name = "CCY_ORDER_TR_DESK")
    private Short ccyOrderTrDesk;
    @Column(name = "CCY_ORDER_SUPERDEX")
    private Short ccyOrderSuperdex;
    @Column(name = "CCY_ORDER_BSO")
    private Short ccyOrderBso;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bsProteoxCurrencies")
    private Collection<BsProteoxCurrencyPairs> bsProteoxCurrencyPairsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bsProteoxCurrencies1")
    private Collection<BsProteoxCurrencyPairs> bsProteoxCurrencyPairsCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcurrency")
    private Collection<BsProteoxPanels> bsProteoxPanelsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bsProteoxCurrencies")
    private Collection<BsProteoxLiveRates> bsProteoxLiveRatesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bsProteoxCurrencies1")
    private Collection<BsProteoxLiveRates> bsProteoxLiveRatesCollection1;
    @OneToMany(mappedBy = "idcontracurrency")
    private Collection<BsProteoxDealLegs> bsProteoxDealLegsCollection;
    @OneToMany(mappedBy = "iddealtcurrency")
    private Collection<BsProteoxDealLegs> bsProteoxDealLegsCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idprofitcurrency")
    private Collection<BsProteoxDealLegs> bsProteoxDealLegsCollection2;
    @OneToMany(mappedBy = "idquotecurrency")
    private Collection<BsProteoxWorkspaceItemBso> bsProteoxWorkspaceItemBsoCollection;
    @OneToMany(mappedBy = "idbasecurrency")
    private Collection<BsProteoxWorkspaceItemBso> bsProteoxWorkspaceItemBsoCollection1;
    @JoinColumn(name = "IDCALENDAR", referencedColumnName = "IDCALENDAR")
    @ManyToOne(optional = false)
    private BsProteoxCalendars idcalendar;
    @JoinColumn(name = "IDDATERULE", referencedColumnName = "IDDATERULE")
    @ManyToOne
    private BsProteoxDateRules iddaterule;
    @JoinColumn(name = "IDWEEKENDRULE", referencedColumnName = "IDWEEKENDRULE")
    @ManyToOne(optional = false)
    private BsProteoxWeekendRules idweekendrule;
    @OneToMany(mappedBy = "idbasecurrency")
    private Collection<BsProteoxDeals> bsProteoxDealsCollection;
    @OneToMany(mappedBy = "idquotecurrency")
    private Collection<BsProteoxDeals> bsProteoxDealsCollection1;

    public BsProteoxCurrencies() {
    }

    public BsProteoxCurrencies(Integer idcurrency) {
        this.idcurrency = idcurrency;
    }

    public BsProteoxCurrencies(Integer idcurrency, short currencyorder, String code, String name, short digits, short rounding, short settlementcurrency) {
        this.idcurrency = idcurrency;
        this.currencyorder = currencyorder;
        this.code = code;
        this.name = name;
        this.digits = digits;
        this.rounding = rounding;
        this.settlementcurrency = settlementcurrency;
    }

    public Integer getIdcurrency() {
        return idcurrency;
    }

    public void setIdcurrency(Integer idcurrency) {
        this.idcurrency = idcurrency;
    }

    public short getCurrencyorder() {
        return currencyorder;
    }

    public void setCurrencyorder(short currencyorder) {
        this.currencyorder = currencyorder;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getDigits() {
        return digits;
    }

    public void setDigits(short digits) {
        this.digits = digits;
    }

    public short getRounding() {
        return rounding;
    }

    public void setRounding(short rounding) {
        this.rounding = rounding;
    }

    public Integer getFixingdate() {
        return fixingdate;
    }

    public void setFixingdate(Integer fixingdate) {
        this.fixingdate = fixingdate;
    }

    public Integer getNdf() {
        return ndf;
    }

    public void setNdf(Integer ndf) {
        this.ndf = ndf;
    }

    public short getSettlementcurrency() {
        return settlementcurrency;
    }

    public void setSettlementcurrency(short settlementcurrency) {
        this.settlementcurrency = settlementcurrency;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Short getCcyOrderTrDesk() {
        return ccyOrderTrDesk;
    }

    public void setCcyOrderTrDesk(Short ccyOrderTrDesk) {
        this.ccyOrderTrDesk = ccyOrderTrDesk;
    }

    public Short getCcyOrderSuperdex() {
        return ccyOrderSuperdex;
    }

    public void setCcyOrderSuperdex(Short ccyOrderSuperdex) {
        this.ccyOrderSuperdex = ccyOrderSuperdex;
    }

    public Short getCcyOrderBso() {
        return ccyOrderBso;
    }

    public void setCcyOrderBso(Short ccyOrderBso) {
        this.ccyOrderBso = ccyOrderBso;
    }

    public Collection<BsProteoxCurrencyPairs> getBsProteoxCurrencyPairsCollection() {
        return bsProteoxCurrencyPairsCollection;
    }

    public void setBsProteoxCurrencyPairsCollection(Collection<BsProteoxCurrencyPairs> bsProteoxCurrencyPairsCollection) {
        this.bsProteoxCurrencyPairsCollection = bsProteoxCurrencyPairsCollection;
    }

    public Collection<BsProteoxCurrencyPairs> getBsProteoxCurrencyPairsCollection1() {
        return bsProteoxCurrencyPairsCollection1;
    }

    public void setBsProteoxCurrencyPairsCollection1(Collection<BsProteoxCurrencyPairs> bsProteoxCurrencyPairsCollection1) {
        this.bsProteoxCurrencyPairsCollection1 = bsProteoxCurrencyPairsCollection1;
    }

    public Collection<BsProteoxPanels> getBsProteoxPanelsCollection() {
        return bsProteoxPanelsCollection;
    }

    public void setBsProteoxPanelsCollection(Collection<BsProteoxPanels> bsProteoxPanelsCollection) {
        this.bsProteoxPanelsCollection = bsProteoxPanelsCollection;
    }

    public Collection<BsProteoxLiveRates> getBsProteoxLiveRatesCollection() {
        return bsProteoxLiveRatesCollection;
    }

    public void setBsProteoxLiveRatesCollection(Collection<BsProteoxLiveRates> bsProteoxLiveRatesCollection) {
        this.bsProteoxLiveRatesCollection = bsProteoxLiveRatesCollection;
    }

    public Collection<BsProteoxLiveRates> getBsProteoxLiveRatesCollection1() {
        return bsProteoxLiveRatesCollection1;
    }

    public void setBsProteoxLiveRatesCollection1(Collection<BsProteoxLiveRates> bsProteoxLiveRatesCollection1) {
        this.bsProteoxLiveRatesCollection1 = bsProteoxLiveRatesCollection1;
    }

    public Collection<BsProteoxDealLegs> getBsProteoxDealLegsCollection() {
        return bsProteoxDealLegsCollection;
    }

    public void setBsProteoxDealLegsCollection(Collection<BsProteoxDealLegs> bsProteoxDealLegsCollection) {
        this.bsProteoxDealLegsCollection = bsProteoxDealLegsCollection;
    }

    public Collection<BsProteoxDealLegs> getBsProteoxDealLegsCollection1() {
        return bsProteoxDealLegsCollection1;
    }

    public void setBsProteoxDealLegsCollection1(Collection<BsProteoxDealLegs> bsProteoxDealLegsCollection1) {
        this.bsProteoxDealLegsCollection1 = bsProteoxDealLegsCollection1;
    }

    public Collection<BsProteoxDealLegs> getBsProteoxDealLegsCollection2() {
        return bsProteoxDealLegsCollection2;
    }

    public void setBsProteoxDealLegsCollection2(Collection<BsProteoxDealLegs> bsProteoxDealLegsCollection2) {
        this.bsProteoxDealLegsCollection2 = bsProteoxDealLegsCollection2;
    }

    public Collection<BsProteoxWorkspaceItemBso> getBsProteoxWorkspaceItemBsoCollection() {
        return bsProteoxWorkspaceItemBsoCollection;
    }

    public void setBsProteoxWorkspaceItemBsoCollection(Collection<BsProteoxWorkspaceItemBso> bsProteoxWorkspaceItemBsoCollection) {
        this.bsProteoxWorkspaceItemBsoCollection = bsProteoxWorkspaceItemBsoCollection;
    }

    public Collection<BsProteoxWorkspaceItemBso> getBsProteoxWorkspaceItemBsoCollection1() {
        return bsProteoxWorkspaceItemBsoCollection1;
    }

    public void setBsProteoxWorkspaceItemBsoCollection1(Collection<BsProteoxWorkspaceItemBso> bsProteoxWorkspaceItemBsoCollection1) {
        this.bsProteoxWorkspaceItemBsoCollection1 = bsProteoxWorkspaceItemBsoCollection1;
    }

    public BsProteoxCalendars getIdcalendar() {
        return idcalendar;
    }

    public void setIdcalendar(BsProteoxCalendars idcalendar) {
        this.idcalendar = idcalendar;
    }

    public BsProteoxDateRules getIddaterule() {
        return iddaterule;
    }

    public void setIddaterule(BsProteoxDateRules iddaterule) {
        this.iddaterule = iddaterule;
    }

    public BsProteoxWeekendRules getIdweekendrule() {
        return idweekendrule;
    }

    public void setIdweekendrule(BsProteoxWeekendRules idweekendrule) {
        this.idweekendrule = idweekendrule;
    }

    public Collection<BsProteoxDeals> getBsProteoxDealsCollection() {
        return bsProteoxDealsCollection;
    }

    public void setBsProteoxDealsCollection(Collection<BsProteoxDeals> bsProteoxDealsCollection) {
        this.bsProteoxDealsCollection = bsProteoxDealsCollection;
    }

    public Collection<BsProteoxDeals> getBsProteoxDealsCollection1() {
        return bsProteoxDealsCollection1;
    }

    public void setBsProteoxDealsCollection1(Collection<BsProteoxDeals> bsProteoxDealsCollection1) {
        this.bsProteoxDealsCollection1 = bsProteoxDealsCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcurrency != null ? idcurrency.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxCurrencies)) {
            return false;
        }
        BsProteoxCurrencies other = (BsProteoxCurrencies) object;
        if ((this.idcurrency == null && other.idcurrency != null) || (this.idcurrency != null && !this.idcurrency.equals(other.idcurrency))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxCurrencies[ idcurrency=" + idcurrency + " ]";
    }
    
}
