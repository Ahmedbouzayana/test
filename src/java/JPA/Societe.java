/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JPA;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mrs2a
 */
@Entity
@Table(name = "societe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Societe.findAll", query = "SELECT s FROM Societe s"),
    @NamedQuery(name = "Societe.findByIdsociete", query = "SELECT s FROM Societe s WHERE s.idsociete = :idsociete"),
    @NamedQuery(name = "Societe.findByNom", query = "SELECT s FROM Societe s WHERE s.nom = :nom"),
    @NamedQuery(name = "Societe.findByAdresse", query = "SELECT s FROM Societe s WHERE s.adresse = :adresse"),
    @NamedQuery(name = "Societe.findByVille", query = "SELECT s FROM Societe s WHERE s.ville = :ville"),
    @NamedQuery(name = "Societe.findByTel", query = "SELECT s FROM Societe s WHERE s.tel = :tel"),
    @NamedQuery(name = "Societe.findByFax", query = "SELECT s FROM Societe s WHERE s.fax = :fax"),
    @NamedQuery(name = "Societe.findByGsm", query = "SELECT s FROM Societe s WHERE s.gsm = :gsm"),
    @NamedQuery(name = "Societe.findByMail", query = "SELECT s FROM Societe s WHERE s.mail = :mail"),
    @NamedQuery(name = "Societe.findBySite", query = "SELECT s FROM Societe s WHERE s.site = :site")})
public class Societe implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idsociete")
    private Integer idsociete;
    @Size(max = 100)
    @Column(name = "nom")
    private String nom;
    @Size(max = 100)
    @Column(name = "adresse")
    private String adresse;
    @Size(max = 45)
    @Column(name = "ville")
    private String ville;
    @Size(max = 45)
    @Column(name = "tel")
    private String tel;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "fax")
    private String fax;
    @Size(max = 45)
    @Column(name = "gsm")
    private String gsm;
    @Size(max = 45)
    @Column(name = "mail")
    private String mail;
    @Size(max = 45)
    @Column(name = "site")
    private String site;

    public Societe() {
    }

    public Societe(Integer idsociete) {
        this.idsociete = idsociete;
    }

    public Integer getIdsociete() {
        return idsociete;
    }

    public void setIdsociete(Integer idsociete) {
        this.idsociete = idsociete;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsociete != null ? idsociete.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Societe)) {
            return false;
        }
        Societe other = (Societe) object;
        if ((this.idsociete == null && other.idsociete != null) || (this.idsociete != null && !this.idsociete.equals(other.idsociete))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Societe[ idsociete=" + idsociete + " ]";
    }
    
}
