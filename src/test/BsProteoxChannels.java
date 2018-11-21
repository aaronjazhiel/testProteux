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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Aarón Delgado
 */
@Entity
@Table(name = "BS_PROTEOX_CHANNELS")
@NamedQueries({
    @NamedQuery(name = "BsProteoxChannels.findAll", query = "SELECT b FROM BsProteoxChannels b")})
public class BsProteoxChannels implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDCHANNEL")
    private Long idchannel;
    @Basic(optional = false)
    @Column(name = "CHANNEL")
    private String channel;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany(mappedBy = "channel")
    private Collection<BsProteoxDeals> bsProteoxDealsCollection;

    public BsProteoxChannels() {
    }

    public BsProteoxChannels(Long idchannel) {
        this.idchannel = idchannel;
    }

    public BsProteoxChannels(Long idchannel, String channel, String description) {
        this.idchannel = idchannel;
        this.channel = channel;
        this.description = description;
    }

    public Long getIdchannel() {
        return idchannel;
    }

    public void setIdchannel(Long idchannel) {
        this.idchannel = idchannel;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<BsProteoxDeals> getBsProteoxDealsCollection() {
        return bsProteoxDealsCollection;
    }

    public void setBsProteoxDealsCollection(Collection<BsProteoxDeals> bsProteoxDealsCollection) {
        this.bsProteoxDealsCollection = bsProteoxDealsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idchannel != null ? idchannel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxChannels)) {
            return false;
        }
        BsProteoxChannels other = (BsProteoxChannels) object;
        if ((this.idchannel == null && other.idchannel != null) || (this.idchannel != null && !this.idchannel.equals(other.idchannel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxChannels[ idchannel=" + idchannel + " ]";
    }
    
}
