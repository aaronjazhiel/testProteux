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
@Table(name = "BS_PROTEOX_PANELS")
@NamedQueries({
    @NamedQuery(name = "BsProteoxPanels.findAll", query = "SELECT b FROM BsProteoxPanels b")})
public class BsProteoxPanels implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDPANEL")
    private Long idpanel;
    @Basic(optional = false)
    @Column(name = "IDWORKSPACE")
    private long idworkspace;
    @Basic(optional = false)
    @Column(name = "IDBASECURRENCY")
    private int idbasecurrency;
    @Basic(optional = false)
    @Column(name = "IDQUOTECURRENCY")
    private int idquotecurrency;
    @Column(name = "SCREENORDER")
    private Integer screenorder;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "BROKENDATE")
    private String brokendate;
    @JoinColumn(name = "IDCURRENCY", referencedColumnName = "IDCURRENCY")
    @ManyToOne(optional = false)
    private BsProteoxCurrencies idcurrency;
    @JoinColumn(name = "IDTENOR", referencedColumnName = "IDTENOR")
    @ManyToOne(optional = false)
    private BsProteoxTenors idtenor;

    public BsProteoxPanels() {
    }

    public BsProteoxPanels(Long idpanel) {
        this.idpanel = idpanel;
    }

    public BsProteoxPanels(Long idpanel, long idworkspace, int idbasecurrency, int idquotecurrency) {
        this.idpanel = idpanel;
        this.idworkspace = idworkspace;
        this.idbasecurrency = idbasecurrency;
        this.idquotecurrency = idquotecurrency;
    }

    public Long getIdpanel() {
        return idpanel;
    }

    public void setIdpanel(Long idpanel) {
        this.idpanel = idpanel;
    }

    public long getIdworkspace() {
        return idworkspace;
    }

    public void setIdworkspace(long idworkspace) {
        this.idworkspace = idworkspace;
    }

    public int getIdbasecurrency() {
        return idbasecurrency;
    }

    public void setIdbasecurrency(int idbasecurrency) {
        this.idbasecurrency = idbasecurrency;
    }

    public int getIdquotecurrency() {
        return idquotecurrency;
    }

    public void setIdquotecurrency(int idquotecurrency) {
        this.idquotecurrency = idquotecurrency;
    }

    public Integer getScreenorder() {
        return screenorder;
    }

    public void setScreenorder(Integer screenorder) {
        this.screenorder = screenorder;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getBrokendate() {
        return brokendate;
    }

    public void setBrokendate(String brokendate) {
        this.brokendate = brokendate;
    }

    public BsProteoxCurrencies getIdcurrency() {
        return idcurrency;
    }

    public void setIdcurrency(BsProteoxCurrencies idcurrency) {
        this.idcurrency = idcurrency;
    }

    public BsProteoxTenors getIdtenor() {
        return idtenor;
    }

    public void setIdtenor(BsProteoxTenors idtenor) {
        this.idtenor = idtenor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpanel != null ? idpanel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxPanels)) {
            return false;
        }
        BsProteoxPanels other = (BsProteoxPanels) object;
        if ((this.idpanel == null && other.idpanel != null) || (this.idpanel != null && !this.idpanel.equals(other.idpanel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxPanels[ idpanel=" + idpanel + " ]";
    }
    
}
