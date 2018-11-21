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
@Table(name = "BS_PROTEOX_LOCALES")
@NamedQueries({
    @NamedQuery(name = "BsProteoxLocales.findAll", query = "SELECT b FROM BsProteoxLocales b")})
public class BsProteoxLocales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDLOCALE")
    private Integer idlocale;
    @Basic(optional = false)
    @Column(name = "LANGUAGE")
    private String language;
    @Basic(optional = false)
    @Column(name = "LANGUAGETAG")
    private String languagetag;

    public BsProteoxLocales() {
    }

    public BsProteoxLocales(Integer idlocale) {
        this.idlocale = idlocale;
    }

    public BsProteoxLocales(Integer idlocale, String language, String languagetag) {
        this.idlocale = idlocale;
        this.language = language;
        this.languagetag = languagetag;
    }

    public Integer getIdlocale() {
        return idlocale;
    }

    public void setIdlocale(Integer idlocale) {
        this.idlocale = idlocale;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguagetag() {
        return languagetag;
    }

    public void setLanguagetag(String languagetag) {
        this.languagetag = languagetag;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlocale != null ? idlocale.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxLocales)) {
            return false;
        }
        BsProteoxLocales other = (BsProteoxLocales) object;
        if ((this.idlocale == null && other.idlocale != null) || (this.idlocale != null && !this.idlocale.equals(other.idlocale))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxLocales[ idlocale=" + idlocale + " ]";
    }
    
}
