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
@Table(name = "utilisateurs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Utilisateurs.findAll", query = "SELECT u FROM Utilisateurs u"),
    @NamedQuery(name = "Utilisateurs.findByIdutilisateurs", query = "SELECT u FROM Utilisateurs u WHERE u.idutilisateurs = :idutilisateurs"),
    @NamedQuery(name = "Utilisateurs.findByNom", query = "SELECT u FROM Utilisateurs u WHERE u.nom = :nom"),
    @NamedQuery(name = "Utilisateurs.findByPrenom", query = "SELECT u FROM Utilisateurs u WHERE u.prenom = :prenom"),
    @NamedQuery(name = "Utilisateurs.findByLogin", query = "SELECT u FROM Utilisateurs u WHERE u.login = :login"),
    @NamedQuery(name = "Utilisateurs.findByMdp", query = "SELECT u FROM Utilisateurs u WHERE u.mdp = :mdp"),
    @NamedQuery(name = "Utilisateurs.findByGsm", query = "SELECT u FROM Utilisateurs u WHERE u.gsm = :gsm"),
    @NamedQuery(name = "Utilisateurs.findByType", query = "SELECT u FROM Utilisateurs u WHERE u.type = :type")})
public class Utilisateurs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idutilisateurs")
    private Integer idutilisateurs;
    @Size(max = 45)
    @Column(name = "nom")
    private String nom;
    @Size(max = 45)
    @Column(name = "prenom")
    private String prenom;
    @Size(max = 45)
    @Column(name = "login")
    private String login;
    @Size(max = 45)
    @Column(name = "mdp")
    private String mdp;
    @Size(max = 45)
    @Column(name = "gsm")
    private String gsm;
    @Size(max = 45)
    @Column(name = "type")
    private String type;
    @OneToMany(mappedBy = "idutilisateur")
    private Collection<Reglementtiket> reglementtiketCollection;
    @OneToMany(mappedBy = "idutilisateur")
    private Collection<Retour> retourCollection;
    @OneToMany(mappedBy = "idutilisateur")
    private Collection<AvoirA> avoirACollection;
    @OneToMany(mappedBy = "idutilisateur")
    private Collection<Inventaire> inventaireCollection;
    @OneToMany(mappedBy = "idutilisateur")
    private Collection<BonDeSortie> bonDeSortieCollection;
    @OneToMany(mappedBy = "idutilisateur")
    private Collection<Mouvement> mouvementCollection;
    @OneToMany(mappedBy = "idutilisateur")
    private Collection<Tiket> tiketCollection;
    @OneToMany(mappedBy = "idutilisateur")
    private Collection<BrAchat> brAchatCollection;
    @OneToMany(mappedBy = "idutilisateur")
    private Collection<Caisse> caisseCollection;
    @OneToMany(mappedBy = "idutilisateur")
    private Collection<ReglementVente> reglementVenteCollection;
    @OneToMany(mappedBy = "idutilisateur")
    private Collection<FaAchat> faAchatCollection;
    @OneToMany(mappedBy = "idutilisateur")
    private Collection<ReglementAchat> reglementAchatCollection;
    @OneToMany(mappedBy = "idutilisateur")
    private Collection<Avoir> avoirCollection;
    @OneToMany(mappedBy = "idutilisateur")
    private Collection<Devis> devisCollection;
    @OneToMany(mappedBy = "idutilisateur")
    private Collection<BonDeLivraison> bonDeLivraisonCollection;
    @OneToMany(mappedBy = "idutilisateur")
    private Collection<RetourA> retourACollection;
    @OneToMany(mappedBy = "idutilisateur")
    private Collection<BlFaVente> blFaVenteCollection;

    public Utilisateurs() {
    }

    public Utilisateurs(Integer idutilisateurs) {
        this.idutilisateurs = idutilisateurs;
    }

    public Integer getIdutilisateurs() {
        return idutilisateurs;
    }

    public void setIdutilisateurs(Integer idutilisateurs) {
        this.idutilisateurs = idutilisateurs;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlTransient
    public Collection<Reglementtiket> getReglementtiketCollection() {
        return reglementtiketCollection;
    }

    public void setReglementtiketCollection(Collection<Reglementtiket> reglementtiketCollection) {
        this.reglementtiketCollection = reglementtiketCollection;
    }

    @XmlTransient
    public Collection<Retour> getRetourCollection() {
        return retourCollection;
    }

    public void setRetourCollection(Collection<Retour> retourCollection) {
        this.retourCollection = retourCollection;
    }

    @XmlTransient
    public Collection<AvoirA> getAvoirACollection() {
        return avoirACollection;
    }

    public void setAvoirACollection(Collection<AvoirA> avoirACollection) {
        this.avoirACollection = avoirACollection;
    }

    @XmlTransient
    public Collection<Inventaire> getInventaireCollection() {
        return inventaireCollection;
    }

    public void setInventaireCollection(Collection<Inventaire> inventaireCollection) {
        this.inventaireCollection = inventaireCollection;
    }

    @XmlTransient
    public Collection<BonDeSortie> getBonDeSortieCollection() {
        return bonDeSortieCollection;
    }

    public void setBonDeSortieCollection(Collection<BonDeSortie> bonDeSortieCollection) {
        this.bonDeSortieCollection = bonDeSortieCollection;
    }

    @XmlTransient
    public Collection<Mouvement> getMouvementCollection() {
        return mouvementCollection;
    }

    public void setMouvementCollection(Collection<Mouvement> mouvementCollection) {
        this.mouvementCollection = mouvementCollection;
    }

    @XmlTransient
    public Collection<Tiket> getTiketCollection() {
        return tiketCollection;
    }

    public void setTiketCollection(Collection<Tiket> tiketCollection) {
        this.tiketCollection = tiketCollection;
    }

    @XmlTransient
    public Collection<BrAchat> getBrAchatCollection() {
        return brAchatCollection;
    }

    public void setBrAchatCollection(Collection<BrAchat> brAchatCollection) {
        this.brAchatCollection = brAchatCollection;
    }

    @XmlTransient
    public Collection<Caisse> getCaisseCollection() {
        return caisseCollection;
    }

    public void setCaisseCollection(Collection<Caisse> caisseCollection) {
        this.caisseCollection = caisseCollection;
    }

    @XmlTransient
    public Collection<ReglementVente> getReglementVenteCollection() {
        return reglementVenteCollection;
    }

    public void setReglementVenteCollection(Collection<ReglementVente> reglementVenteCollection) {
        this.reglementVenteCollection = reglementVenteCollection;
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
    public Collection<Avoir> getAvoirCollection() {
        return avoirCollection;
    }

    public void setAvoirCollection(Collection<Avoir> avoirCollection) {
        this.avoirCollection = avoirCollection;
    }

    @XmlTransient
    public Collection<Devis> getDevisCollection() {
        return devisCollection;
    }

    public void setDevisCollection(Collection<Devis> devisCollection) {
        this.devisCollection = devisCollection;
    }

    @XmlTransient
    public Collection<BonDeLivraison> getBonDeLivraisonCollection() {
        return bonDeLivraisonCollection;
    }

    public void setBonDeLivraisonCollection(Collection<BonDeLivraison> bonDeLivraisonCollection) {
        this.bonDeLivraisonCollection = bonDeLivraisonCollection;
    }

    @XmlTransient
    public Collection<RetourA> getRetourACollection() {
        return retourACollection;
    }

    public void setRetourACollection(Collection<RetourA> retourACollection) {
        this.retourACollection = retourACollection;
    }

    @XmlTransient
    public Collection<BlFaVente> getBlFaVenteCollection() {
        return blFaVenteCollection;
    }

    public void setBlFaVenteCollection(Collection<BlFaVente> blFaVenteCollection) {
        this.blFaVenteCollection = blFaVenteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idutilisateurs != null ? idutilisateurs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateurs)) {
            return false;
        }
        Utilisateurs other = (Utilisateurs) object;
        if ((this.idutilisateurs == null && other.idutilisateurs != null) || (this.idutilisateurs != null && !this.idutilisateurs.equals(other.idutilisateurs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Utilisateurs[ idutilisateurs=" + idutilisateurs + " ]";
    }
    
}
