/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
@Table(name = "BS_PROTEOX_USER_PREFERENCES")
@NamedQueries({
    @NamedQuery(name = "BsProteoxUserPreferences.findAll", query = "SELECT b FROM BsProteoxUserPreferences b")})
public class BsProteoxUserPreferences implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDUSERPREFERENCES")
    private Integer iduserpreferences;
    @Basic(optional = false)
    @Column(name = "DECIMALCHAR")
    private String decimalchar;
    @Basic(optional = false)
    @Column(name = "THOUSANDCHAR")
    private String thousandchar;
    @Basic(optional = false)
    @Column(name = "WINDOWTYPE")
    private short windowtype;
    @Basic(optional = false)
    @Column(name = "DATEFORMAT")
    private String dateformat;
    @Column(name = "FIRSTDAYOFWEEK")
    private Short firstdayofweek;
    @Column(name = "IDLOCALE")
    private Integer idlocale;
    @JoinColumn(name = "IDBSOVIEWTYPE", referencedColumnName = "IDBSOVIEWTYPE")
    @ManyToOne
    private BsProteoxBsoViewType idbsoviewtype;
    @OneToMany(mappedBy = "iduserpreferences")
    private Collection<BsProteox2tradeUsers> bsProteox2tradeUsersCollection;
    @OneToMany(mappedBy = "iduserpreferences")
    private Collection<BsProteoxVipUsersBso> bsProteoxVipUsersBsoCollection;

    public BsProteoxUserPreferences() {
    }

    public BsProteoxUserPreferences(Integer iduserpreferences) {
        this.iduserpreferences = iduserpreferences;
    }

    public BsProteoxUserPreferences(Integer iduserpreferences, String decimalchar, String thousandchar, short windowtype, String dateformat) {
        this.iduserpreferences = iduserpreferences;
        this.decimalchar = decimalchar;
        this.thousandchar = thousandchar;
        this.windowtype = windowtype;
        this.dateformat = dateformat;
    }

    public Integer getIduserpreferences() {
        return iduserpreferences;
    }

    public void setIduserpreferences(Integer iduserpreferences) {
        this.iduserpreferences = iduserpreferences;
    }

    public String getDecimalchar() {
        return decimalchar;
    }

    public void setDecimalchar(String decimalchar) {
        this.decimalchar = decimalchar;
    }

    public String getThousandchar() {
        return thousandchar;
    }

    public void setThousandchar(String thousandchar) {
        this.thousandchar = thousandchar;
    }

    public short getWindowtype() {
        return windowtype;
    }

    public void setWindowtype(short windowtype) {
        this.windowtype = windowtype;
    }

    public String getDateformat() {
        return dateformat;
    }

    public void setDateformat(String dateformat) {
        this.dateformat = dateformat;
    }

    public Short getFirstdayofweek() {
        return firstdayofweek;
    }

    public void setFirstdayofweek(Short firstdayofweek) {
        this.firstdayofweek = firstdayofweek;
    }

    public Integer getIdlocale() {
        return idlocale;
    }

    public void setIdlocale(Integer idlocale) {
        this.idlocale = idlocale;
    }

    public BsProteoxBsoViewType getIdbsoviewtype() {
        return idbsoviewtype;
    }

    public void setIdbsoviewtype(BsProteoxBsoViewType idbsoviewtype) {
        this.idbsoviewtype = idbsoviewtype;
    }

    public Collection<BsProteox2tradeUsers> getBsProteox2tradeUsersCollection() {
        return bsProteox2tradeUsersCollection;
    }

    public void setBsProteox2tradeUsersCollection(Collection<BsProteox2tradeUsers> bsProteox2tradeUsersCollection) {
        this.bsProteox2tradeUsersCollection = bsProteox2tradeUsersCollection;
    }

    public Collection<BsProteoxVipUsersBso> getBsProteoxVipUsersBsoCollection() {
        return bsProteoxVipUsersBsoCollection;
    }

    public void setBsProteoxVipUsersBsoCollection(Collection<BsProteoxVipUsersBso> bsProteoxVipUsersBsoCollection) {
        this.bsProteoxVipUsersBsoCollection = bsProteoxVipUsersBsoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iduserpreferences != null ? iduserpreferences.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxUserPreferences)) {
            return false;
        }
        BsProteoxUserPreferences other = (BsProteoxUserPreferences) object;
        if ((this.iduserpreferences == null && other.iduserpreferences != null) || (this.iduserpreferences != null && !this.iduserpreferences.equals(other.iduserpreferences))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxUserPreferences[ iduserpreferences=" + iduserpreferences + " ]";
    }
    
}
