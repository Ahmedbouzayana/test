/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JPA;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Mrs2a
 */
@Entity
@Table(name = "fournisseur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fournisseur.findAll", query = "SELECT f FROM Fournisseur f"),
    @NamedQuery(name = "Fournisseur.findByIdfournisseur", query = "SELECT f FROM Fournisseur f WHERE f.idfournisseur = :idfournisseur"),
    @NamedQuery(name = "Fournisseur.findByNomfrs", query = "SELECT f FROM Fournisseur f WHERE f.nomfrs = :nomfrs"),
    @NamedQuery(name = "Fournisseur.findByMatriculefiscal", query = "SELECT f FROM Fournisseur f WHERE f.matriculefiscal = :matriculefiscal"),
    @NamedQuery(name = "Fournisseur.findByContact", query = "SELECT f FROM Fournisseur f WHERE f.contact = :contact"),
    @NamedQuery(name = "Fournisseur.findByAdresse", query = "SELECT f FROM Fournisseur f WHERE f.adresse = :adresse"),
    @NamedQuery(name = "Fournisseur.findByTel", query = "SELECT f FROM Fournisseur f WHERE f.tel = :tel"),
    @NamedQuery(name = "Fournisseur.findByFax", query = "SELECT f FROM Fournisseur f WHERE f.fax = :fax"),
    @NamedQuery(name = "Fournisseur.findByGsm", query = "SELECT f FROM Fournisseur f WHERE f.gsm = :gsm"),
    @NamedQuery(name = "Fournisseur.findByGsm2", query = "SELECT f FROM Fournisseur f WHERE f.gsm2 = :gsm2"),
    @NamedQuery(name = "Fournisseur.findByMail", query = "SELECT f FROM Fournisseur f WHERE f.mail = :mail"),
    @NamedQuery(name = "Fournisseur.findBySite", query = "SELECT f FROM Fournisseur f WHERE f.site = :site")})
public class Fournisseur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfournisseur")
    private Integer idfournisseur;
    @Size(max = 100)
    @Column(name = "nomfrs")
    private String nomfrs;
    @Size(max = 45)
    @Column(name = "matriculefiscal")
    private String matriculefiscal;
    @Size(max = 100)
    @Column(name = "contact")
    private String contact;
    @Size(max = 100)
    @Column(name = "adresse")
    private String adresse;
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
    @Column(name = "gsm2")
    private String gsm2;
    @Size(max = 45)
    @Column(name = "mail")
    private String mail;
    @Size(max = 45)
    @Column(name = "site")
    private String site;
    @OneToMany(mappedBy = "idfournisseur")
    private Collection<AvoirA> avoirACollection;
    @OneToMany(mappedBy = "idfrs")
    private Collection<BrAchat> brAchatCollection;
    @OneToMany(mappedBy = "idfournisseur")
    private Collection<Produit> produitCollection;
    @OneToMany(mappedBy = "idfrs")
    private Collection<FaAchat> faAchatCollection;
    @OneToMany(mappedBy = "idfrs")
    private Collection<ReglementAchat> reglementAchatCollection;
    @OneToMany(mappedBy = "idfournisseur")
    private Collection<RetourA> retourACollection;

    public Fournisseur() {
    }

    public Fournisseur(Integer idfournisseur) {
        this.idfournisseur = idfournisseur;
    }

    public Integer getIdfournisseur() {
        return idfournisseur;
    }

    public void setIdfournisseur(Integer idfournisseur) {
        this.idfournisseur = idfournisseur;
    }

    public String getNomfrs() {
        return nomfrs;
    }

    public void setNomfrs(String nomfrs) {
        this.nomfrs = nomfrs;
    }

    public String getMatriculefiscal() {
        return matriculefiscal;
    }

    public void setMatriculefiscal(String matriculefiscal) {
        this.matriculefiscal = matriculefiscal;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @XmlTransient
    public Collection<AvoirA> getAvoirACollection() {
        return avoirACollection;
    }

    public void setAvoirACollection(Collection<AvoirA> avoirACollection) {
        this.avoirACollection = avoirACollection;
    }

    @XmlTransient
    public Collection<BrAchat> getBrAchatCollection() {
        return brAchatCollection;
    }

    public void setBrAchatCollection(Collection<BrAchat> brAchatCollection) {
        this.brAchatCollection = brAchatCollection;
    }

    @XmlTransient
    public Collection<Produit> getProduitCollection() {
        return produitCollection;
    }

    public void setProduitCollection(Collection<Produit> produitCollection) {
        this.produitCollection = produitCollection;
    }

    @XmlTransient
    public Collection<FaAchat> getFaAchatCollection() {
        return faAchatCollection;
    }

    public void setFaAchatCollection(Collection<FaAchat> faAchatCollection) {
        this.faAchatCollection = faAchatCollection;
    }

    @XmlTransient
    public Collection<ReglementAchat> getReglementAchatCollection() {
        return reglementAchatCollection;
    }

    public void setReglementAchatCollection(Collection<ReglementAchat> reglementAchatCollection) {
        this.reglementAchatCollection = reglementAchatCollection;
    }

    @XmlTransient
    public Collection<RetourA> getRetourACollection() {
        return retourACollection;
    }

    public void setRetourACollection(Collection<RetourA> retourACollection) {
        this.retourACollection = retourACollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfournisseur != null ? idfournisseur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fournisseur)) {
            return false;
        }
        Fournisseur other = (Fournisseur) object;
        if ((this.idfournisseur == null && other.idfournisseur != null) || (this.idfournisseur != null && !this.idfournisseur.equals(other.idfournisseur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Fournisseur[ idfournisseur=" + idfournisseur + " ]";
    }
    
}
