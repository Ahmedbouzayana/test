/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JPA;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mrs2a
 */
@Entity
@Table(name = "client_fed")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClientFed.findAll", query = "SELECT c FROM ClientFed c"),
    @NamedQuery(name = "ClientFed.findByIdclientfed", query = "SELECT c FROM ClientFed c WHERE c.idclientfed = :idclientfed"),
    @NamedQuery(name = "ClientFed.findByNomprenom", query = "SELECT c FROM ClientFed c WHERE c.nomprenom = :nomprenom"),
    @NamedQuery(name = "ClientFed.findByDatadenaiss", query = "SELECT c FROM ClientFed c WHERE c.datadenaiss = :datadenaiss"),
    @NamedQuery(name = "ClientFed.findByVille", query = "SELECT c FROM ClientFed c WHERE c.ville = :ville"),
    @NamedQuery(name = "ClientFed.findByAdresse", query = "SELECT c FROM ClientFed c WHERE c.adresse = :adresse"),
    @NamedQuery(name = "ClientFed.findByTel", query = "SELECT c FROM ClientFed c WHERE c.tel = :tel"),
    @NamedQuery(name = "ClientFed.findByGsm", query = "SELECT c FROM ClientFed c WHERE c.gsm = :gsm"),
    @NamedQuery(name = "ClientFed.findByGsm2", query = "SELECT c FROM ClientFed c WHERE c.gsm2 = :gsm2"),
    @NamedQuery(name = "ClientFed.findByMail", query = "SELECT c FROM ClientFed c WHERE c.mail = :mail"),
    @NamedQuery(name = "ClientFed.findByTremise", query = "SELECT c FROM ClientFed c WHERE c.tremise = :tremise"),
    @NamedQuery(name = "ClientFed.findByHistorique", query = "SELECT c FROM ClientFed c WHERE c.historique = :historique"),
    @NamedQuery(name = "ClientFed.findByObjectifs", query = "SELECT c FROM ClientFed c WHERE c.objectifs = :objectifs"),
    @NamedQuery(name = "ClientFed.findByRmsobjectifs", query = "SELECT c FROM ClientFed c WHERE c.rmsobjectifs = :rmsobjectifs"),
    @NamedQuery(name = "ClientFed.findByResultat", query = "SELECT c FROM ClientFed c WHERE c.resultat = :resultat"),
    @NamedQuery(name = "ClientFed.findByCivilite", query = "SELECT c FROM ClientFed c WHERE c.civilite = :civilite")})
public class ClientFed implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idclientfed")
    private Integer idclientfed;
    @Size(max = 200)
    @Column(name = "nomprenom")
    private String nomprenom;
    @Column(name = "datadenaiss")
    @Temporal(TemporalType.DATE)
    private Date datadenaiss;
    @Size(max = 45)
    @Column(name = "ville")
    private String ville;
    @Size(max = 45)
    @Column(name = "adresse")
    private String adresse;
    @Size(max = 45)
    @Column(name = "tel")
    private String tel;
    @Size(max = 45)
    @Column(name = "gsm")
    private String gsm;
    @Size(max = 45)
    @Column(name = "gsm2")
    private String gsm2;
    @Size(max = 100)
    @Column(name = "mail")
    private String mail;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "tremise")
    private BigDecimal tremise;
    @Column(name = "historique")
    private BigDecimal historique;
    @Column(name = "objectifs")
    private BigDecimal objectifs;
    @Column(name = "rmsobjectifs")
    private BigDecimal rmsobjectifs;
    @Column(name = "resultat")
    private BigDecimal resultat;
    @Size(max = 45)
    @Column(name = "civilite")
    private String civilite;

    public ClientFed() {
    }

    public ClientFed(Integer idclientfed) {
        this.idclientfed = idclientfed;
    }

    public Integer getIdclientfed() {
        return idclientfed;
    }

    public void setIdclientfed(Integer idclientfed) {
        this.idclientfed = idclientfed;
    }

    public String getNomprenom() {
        return nomprenom;
    }

    public void setNomprenom(String nomprenom) {
        this.nomprenom = nomprenom;
    }

    public Date getDatadenaiss() {
        return datadenaiss;
    }

    public void setDatadenaiss(Date datadenaiss) {
        this.datadenaiss = datadenaiss;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }

    public String getGsm2() {
        return gsm2;
    }

    public void setGsm2(String gsm2) {
        this.gsm2 = gsm2;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public BigDecimal getTremise() {
        return tremise;
    }

    public void setTremise(BigDecimal tremise) {
        this.tremise = tremise;
    }

    public BigDecimal getHistorique() {
        return historique;
    }

    public void setHistorique(BigDecimal historique) {
        this.historique = historique;
    }

    public BigDecimal getObjectifs() {
        return objectifs;
    }

    public void setObjectifs(BigDecimal objectifs) {
        this.objectifs = objectifs;
    }

    public BigDecimal getRmsobjectifs() {
        return rmsobjectifs;
    }

    public void setRmsobjectifs(BigDecimal rmsobjectifs) {
        this.rmsobjectifs = rmsobjectifs;
    }

    public BigDecimal getResultat() {
        return resultat;
    }

    public void setResultat(BigDecimal resultat) {
        this.resultat = resultat;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idclientfed != null ? idclientfed.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientFed)) {
            return false;
        }
        ClientFed other = (ClientFed) object;
        if ((this.idclientfed == null && other.idclientfed != null) || (this.idclientfed != null && !this.idclientfed.equals(other.idclientfed))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.ClientFed[ idclientfed=" + idclientfed + " ]";
    }
    
}
