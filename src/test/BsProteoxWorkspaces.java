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
@Table(name = "BS_PROTEOX_WORKSPACES")
@NamedQueries({
    @NamedQuery(name = "BsProteoxWorkspaces.findAll", query = "SELECT b FROM BsProteoxWorkspaces b")})
public class BsProteoxWorkspaces implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDWORKSPACE")
    private Long idworkspace;
    @Column(name = "TEMPLATE_NAME")
    private String templateName;
    @Column(name = "COMMON_TEMPLATE")
    private Short commonTemplate;
    @Column(name = "USER_TEMPLATE")
    private Short userTemplate;
    @Column(name = "DEFAULT_WORKSPACE")
    private Short defaultWorkspace;
    @Column(name = "CLIENT_TEMPLATE")
    private Short clientTemplate;
    @JoinColumn(name = "IDCLIENT", referencedColumnName = "IDCLIENT")
    @ManyToOne
    private BsProteoxClients idclient;
    @JoinColumn(name = "IDUSER", referencedColumnName = "IDUSER2TRADE")
    @ManyToOne
    private BsProteox2tradeUsers iduser;

    public BsProteoxWorkspaces() {
    }

    public BsProteoxWorkspaces(Long idworkspace) {
        this.idworkspace = idworkspace;
    }

    public Long getIdworkspace() {
        return idworkspace;
    }

    public void setIdworkspace(Long idworkspace) {
        this.idworkspace = idworkspace;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Short getCommonTemplate() {
        return commonTemplate;
    }

    public void setCommonTemplate(Short commonTemplate) {
        this.commonTemplate = commonTemplate;
    }

    public Short getUserTemplate() {
        return userTemplate;
    }

    public void setUserTemplate(Short userTemplate) {
        this.userTemplate = userTemplate;
    }

    public Short getDefaultWorkspace() {
        return defaultWorkspace;
    }

    public void setDefaultWorkspace(Short defaultWorkspace) {
        this.defaultWorkspace = defaultWorkspace;
    }

    public Short getClientTemplate() {
        return clientTemplate;
    }

    public void setClientTemplate(Short clientTemplate) {
        this.clientTemplate = clientTemplate;
    }

    public BsProteoxClients getIdclient() {
        return idclient;
    }

    public void setIdclient(BsProteoxClients idclient) {
        this.idclient = idclient;
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
        hash += (idworkspace != null ? idworkspace.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BsProteoxWorkspaces)) {
            return false;
        }
        BsProteoxWorkspaces other = (BsProteoxWorkspaces) object;
        if ((this.idworkspace == null && other.idworkspace != null) || (this.idworkspace != null && !this.idworkspace.equals(other.idworkspace))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.BsProteoxWorkspaces[ idworkspace=" + idworkspace + " ]";
    }
    
}
