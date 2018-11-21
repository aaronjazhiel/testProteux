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
@Table(name = "BS_PROTEOX_CA3_SETTLMNT_DTL")
@NamedQueries({
    @NamedQuery(name = "BsProteoxCa3SettlmntDtl.findAll", query = "SELECT b FROM BsProteoxCa3SettlmntDtl b")})
public class BsProteoxCa3SettlmntDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_SETTLEMENT_DETAIL")
    private BigDecimal idSettlementDetail;
    @Column(name = "CCY")
    private String ccy;
    @Column(name = "NAME")
    private String name;
    @Column(name = "STANDARD")
    private String standard;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "VALUE")
    private String value;
    @JoinColumn(name = "ID_LEG", referencedColumnName = "ID_LEG")
    @ManyToOne
    private BsProteoxCa3Leg idLeg;

    public BsProteoxCa3SettlmntDtl() {
    }

    public BsProteoxCa3SettlmntDtl(BigDecimal idSettlementDetail) {
        this.idSettlementDetail = idSettlementDetail;
    }

    public BigDecimal getIdSettlementDetail() {
        return idSettlementDetail;
    }

    public void setIdSettlementDetail(BigDecimal idSettlementDetail) {
        this.idSettlementDetail = idSettlementDetail;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public BsProteoxCa3Leg getIdLeg() {
        return idLeg;
    }

    public void setIdLeg(BsProteoxCa3Leg idLeg) {
        this.idLeg = idLeg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSettlementDetail != null ? idSettlementDetail.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxCa3SettlmntDtl)) {
            return false;
        }
        BsProteoxCa3SettlmntDtl other = (BsProteoxCa3SettlmntDtl) object;
        if ((this.idSettlementDetail == null && other.idSettlementDetail != null) || (this.idSettlementDetail != null && !this.idSettlementDetail.equals(other.idSettlementDetail))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxCa3SettlmntDtl[ idSettlementDetail=" + idSettlementDetail + " ]";
    }
    
}
