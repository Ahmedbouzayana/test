/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JPA;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Mrs2a
 */
@Entity
@Table(name = "produit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produit.findAll", query = "SELECT p FROM Produit p"),
    @NamedQuery(name = "Produit.findByIdproduit", query = "SELECT p FROM Produit p WHERE p.idproduit = :idproduit"),
    @NamedQuery(name = "Produit.findByCodeabar", query = "SELECT p FROM Produit p WHERE p.codeabar = :codeabar"),
    @NamedQuery(name = "Produit.findByDesignation", query = "SELECT p FROM Produit p WHERE p.designation = :designation"),
    @NamedQuery(name = "Produit.findByTtva", query = "SELECT p FROM Produit p WHERE p.ttva = :ttva"),
    @NamedQuery(name = "Produit.findByPrixachatht", query = "SELECT p FROM Produit p WHERE p.prixachatht = :prixachatht"),
    @NamedQuery(name = "Produit.findByPrixachatttc", query = "SELECT p FROM Produit p WHERE p.prixachatttc = :prixachatttc"),
    @NamedQuery(name = "Produit.findByPrixventeht", query = "SELECT p FROM Produit p WHERE p.prixventeht = :prixventeht"),
    @NamedQuery(name = "Produit.findByPrixventettc", query = "SELECT p FROM Produit p WHERE p.prixventettc = :prixventettc"),
    @NamedQuery(name = "Produit.findByMarge", query = "SELECT p FROM Produit p WHERE p.marge = :marge"),
    @NamedQuery(name = "Produit.findByQte", query = "SELECT p FROM Produit p WHERE p.qte = :qte"),
    @NamedQuery(name = "Produit.findByFodec", query = "SELECT p FROM Produit p WHERE p.fodec = :fodec"),
    @NamedQuery(name = "Produit.findByDroitc", query = "SELECT p FROM Produit p WHERE p.droitc = :droitc"),
    @NamedQuery(name = "Produit.findByPrixventehtd", query = "SELECT p FROM Produit p WHERE p.prixventehtd = :prixventehtd"),
    @NamedQuery(name = "Produit.findByPrixventettcd", query = "SELECT p FROM Produit p WHERE p.prixventettcd = :prixventettcd"),
    @NamedQuery(name = "Produit.findByMarged", query = "SELECT p FROM Produit p WHERE p.marged = :marged"),
    @NamedQuery(name = "Produit.findByRemise", query = "SELECT p FROM Produit p WHERE p.remise = :remise"),
    @NamedQuery(name = "Produit.findByVoiture", query = "SELECT p FROM Produit p WHERE p.voiture = :voiture"),
    @NamedQuery(name = "Produit.findByPrixventenet", query = "SELECT p FROM Produit p WHERE p.prixventenet = :prixventenet")})
public class Produit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "idproduit")
    private String idproduit;
    @Size(max = 45)
    @Column(name = "codeabar")
    private String codeabar;
    @Size(max = 150)
    @Column(name = "designation")
    private String designation;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ttva")
    private BigDecimal ttva;
    @Column(name = "prixachatht")
    private BigDecimal prixachatht;
    @Column(name = "prixachatttc")
    private BigDecimal prixachatttc;
    @Column(name = "prixventeht")
    private BigDecimal prixventeht;
    @Column(name = "prixventettc")
    private BigDecimal prixventettc;
    @Column(name = "marge")
    private BigDecimal marge;
    @Column(name = "qte")
    private Integer qte;
    @Column(name = "fodec")
    private Integer fodec;
    @Column(name = "droitc")
    private Integer droitc;
    @Column(name = "prixventehtd")
    private BigDecimal prixventehtd;
    @Column(name = "prixventettcd")
    private BigDecimal prixventettcd;
    @Column(name = "marged")
    private BigDecimal marged;
    @Column(name = "remise")
    private BigDecimal remise;
    @Size(max = 255)
    @Column(name = "voiture")
    private String voiture;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prixventenet")
    private BigDecimal prixventenet;
    @OneToMany(mappedBy = "idproduit")
    private Collection<LigneFaAchat> ligneFaAchatCollection;
    @OneToMany(mappedBy = "idproduit")
    private Collection<LigneInventaire> ligneInventaireCollection;
    @OneToMany(mappedBy = "idproduit")
    private Collection<LigneBlFaVente> ligneBlFaVenteCollection;
    @OneToMany(mappedBy = "idproduit")
    private Collection<LigneAvoir> ligneAvoirCollection;
    @JoinColumn(name = "idfournisseur", referencedColumnName = "idfournisseur")
    @ManyToOne
    private Fournisseur idfournisseur;
    @JoinColumn(name = "idfamilleproduit", referencedColumnName = "idfamilleproduit")
    @ManyToOne
    private Familleproduit idfamilleproduit;
    @OneToMany(mappedBy = "idproduit")
    private Collection<LigneAvoirA> ligneAvoirACollection;
    @OneToMany(mappedBy = "idproduit")
    private Collection<Codeabarre> codeabarreCollection;
    @OneToMany(mappedBy = "idproduit")
    private Collection<LigneRetour> ligneRetourCollection;
    @OneToMany(mappedBy = "idproduit")
    private Collection<LigneRetourA> ligneRetourACollection;
    @OneToMany(mappedBy = "idproduit")
    private Collection<LigneDevis> ligneDevisCollection;
    @OneToMany(mappedBy = "idproduit")
    private Collection<LigneBonDeLivraison> ligneBonDeLivraisonCollection;
    @OneToMany(mappedBy = "idproduit")
    private Collection<LigneTiket> ligneTiketCollection;
    @OneToMany(mappedBy = "idproduit")
    private Collection<LigneBonDeSortie> ligneBonDeSortieCollection;
    @OneToMany(mappedBy = "idproduit")
    private Collection<LigneBrAchat> ligneBrAchatCollection;

    public Produit() {
    }

    public Produit(String idproduit) {
        this.idproduit = idproduit;
    }

    public Produit(String idproduit, BigDecimal prixventenet) {
        this.idproduit = idproduit;
        this.prixventenet = prixventenet;
    }

    public String getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(String idproduit) {
        this.idproduit = idproduit;
    }

    public String getCodeabar() {
        return codeabar;
    }

    public void setCodeabar(String codeabar) {
        this.codeabar = codeabar;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public BigDecimal getTtva() {
        return ttva;
    }

    public void setTtva(BigDecimal ttva) {
        this.ttva = ttva;
    }

    public BigDecimal getPrixachatht() {
        return prixachatht;
    }

    public void setPrixachatht(BigDecimal prixachatht) {
        this.prixachatht = prixachatht;
    }

    public BigDecimal getPrixachatttc() {
        return prixachatttc;
    }

    public void setPrixachatttc(BigDecimal prixachatttc) {
        this.prixachatttc = prixachatttc;
    }

    public BigDecimal getPrixventeht() {
        return prixventeht;
    }

    public void setPrixventeht(BigDecimal prixventeht) {
        this.prixventeht = prixventeht;
    }

    public BigDecimal getPrixventettc() {
        return prixventettc;
    }

    public void setPrixventettc(BigDecimal prixventettc) {
        this.prixventettc = prixventettc;
    }

    public BigDecimal getMarge() {
        return marge;
    }

    public void setMarge(BigDecimal marge) {
        this.marge = marge;
    }

    public Integer getQte() {
        return qte;
    }

    public void setQte(Integer qte) {
        this.qte = qte;
    }

    public Integer getFodec() {
        return fodec;
    }

    public void setFodec(Integer fodec) {
        this.fodec = fodec;
    }

    public Integer getDroitc() {
        return droitc;
    }

    public void setDroitc(Integer droitc) {
        this.droitc = droitc;
    }

    public BigDecimal getPrixventehtd() {
        return prixventehtd;
    }

    public void setPrixventehtd(BigDecimal prixventehtd) {
        this.prixventehtd = prixventehtd;
    }

    public BigDecimal getPrixventettcd() {
        return prixventettcd;
    }

    public void setPrixventettcd(BigDecimal prixventettcd) {
        this.prixventettcd = prixventettcd;
    }

    public BigDecimal getMarged() {
        return marged;
    }

    public void setMarged(BigDecimal marged) {
        this.marged = marged;
    }

    public BigDecimal getRemise() {
        return remise;
    }

    public void setRemise(BigDecimal remise) {
        this.remise = remise;
    }

    public String getVoiture() {
        return voiture;
    }

    public void setVoiture(String voiture) {
        this.voiture = voiture;
    }

    public BigDecimal getPrixventenet() {
        return prixventenet;
    }

    public void setPrixventenet(BigDecimal prixventenet) {
        this.prixventenet = prixventenet;
    }

    @XmlTransient
    public Collection<LigneFaAchat> getLigneFaAchatCollection() {
        return ligneFaAchatCollection;
    }

    public void setLigneFaAchatCollection(Collection<LigneFaAchat> ligneFaAchatCollection) {
        this.ligneFaAchatCollection = ligneFaAchatCollection;
    }

    @XmlTransient
    public Collection<LigneInventaire> getLigneInventaireCollection() {
        return ligneInventaireCollection;
    }

    public void setLigneInventaireCollection(Collection<LigneInventaire> ligneInventaireCollection) {
        this.ligneInventaireCollection = ligneInventaireCollection;
    }

    @XmlTransient
    public Collection<LigneBlFaVente> getLigneBlFaVenteCollection() {
        return ligneBlFaVenteCollection;
    }

    public void setLigneBlFaVenteCollection(Collection<LigneBlFaVente> ligneBlFaVenteCollection) {
        this.ligneBlFaVenteCollection = ligneBlFaVenteCollection;
    }

    @XmlTransient
    public Collection<LigneAvoir> getLigneAvoirCollection() {
        return ligneAvoirCollection;
    }

    public void setLigneAvoirCollection(Collection<LigneAvoir> ligneAvoirCollection) {
        this.ligneAvoirCollection = ligneAvoirCollection;
    }

    public Fournisseur getIdfournisseur() {
        return idfournisseur;
    }

    public void setIdfournisseur(Fournisseur idfournisseur) {
        this.idfournisseur = idfournisseur;
    }

    public Familleproduit getIdfamilleproduit() {
        return idfamilleproduit;
    }

    public void setIdfamilleproduit(Familleproduit idfamilleproduit) {
        this.idfamilleproduit = idfamilleproduit;
    }

    @XmlTransient
    public Collection<LigneAvoirA> getLigneAvoirACollection() {
        return ligneAvoirACollection;
    }

    public void setLigneAvoirACollection(Collection<LigneAvoirA> ligneAvoirACollection) {
        this.ligneAvoirACollection = ligneAvoirACollection;
    }

    @XmlTransient
    public Collection<Codeabarre> getCodeabarreCollection() {
        return codeabarreCollection;
    }

    public void setCodeabarreCollection(Collection<Codeabarre> codeabarreCollection) {
        this.codeabarreCollection = codeabarreCollection;
    }

    @XmlTransient
    public Collection<LigneRetour> getLigneRetourCollection() {
        return ligneRetourCollection;
    }

    public void setLigneRetourCollection(Collection<LigneRetour> ligneRetourCollection) {
        this.ligneRetourCollection = ligneRetourCollection;
    }

    @XmlTransient
    public Collection<LigneRetourA> getLigneRetourACollection() {
        return ligneRetourACollection;
    }

    public void setLigneRetourACollection(Collection<LigneRetourA> ligneRetourACollection) {
        this.ligneRetourACollection = ligneRetourACollection;
    }

    @XmlTransient
    public Collection<LigneDevis> getLigneDevisCollection() {
        return ligneDevisCollection;
    }

    public void setLigneDevisCollection(Collection<LigneDevis> ligneDevisCollection) {
        this.ligneDevisCollection = ligneDevisCollection;
    }

    @XmlTransient
    public Collection<LigneBonDeLivraison> getLigneBonDeLivraisonCollection() {
        return ligneBonDeLivraisonCollection;
    }

    public void setLigneBonDeLivraisonCollection(Collection<LigneBonDeLivraison> ligneBonDeLivraisonCollection) {
        this.ligneBonDeLivraisonCollection = ligneBonDeLivraisonCollection;
    }

    @XmlTransient
    public Collection<LigneTiket> getLigneTiketCollection() {
        return ligneTiketCollection;
    }

    public void setLigneTiketCollection(Collection<LigneTiket> ligneTiketCollection) {
        this.ligneTiketCollection = ligneTiketCollection;
    }

    @XmlTransient
    public Collection<LigneBonDeSortie> getLigneBonDeSortieCollection() {
        return ligneBonDeSortieCollection;
    }

    public void setLigneBonDeSortieCollection(Collection<LigneBonDeSortie> ligneBonDeSortieCollection) {
        this.ligneBonDeSortieCollection = ligneBonDeSortieCollection;
    }

    @XmlTransient
    public Collection<LigneBrAchat> getLigneBrAchatCollection() {
        return ligneBrAchatCollection;
    }

    public void setLigneBrAchatCollection(Collection<LigneBrAchat> ligneBrAchatCollection) {
        this.ligneBrAchatCollection = ligneBrAchatCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproduit != null ? idproduit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) object;
        if ((this.idproduit == null && other.idproduit != null) || (this.idproduit != null && !this.idproduit.equals(other.idproduit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Produit[ idproduit=" + idproduit + " ]";
    }
    
}
