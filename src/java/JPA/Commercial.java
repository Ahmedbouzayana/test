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
@Table(name = "commercial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Commercial.findAll", query = "SELECT c FROM Commercial c"),
    @NamedQuery(name = "Commercial.findByIdcommercial", query = "SELECT c FROM Commercial c WHERE c.idcommercial = :idcommercial"),
    @NamedQuery(name = "Commercial.findByNom", query = "SELECT c FROM Commercial c WHERE c.nom = :nom"),
    @NamedQuery(name = "Commercial.findByPrenom", query = "SELECT c FROM Commercial c WHERE c.prenom = :prenom"),
    @NamedQuery(name = "Commercial.findByGsm", query = "SELECT c FROM Commercial c WHERE c.gsm = :gsm"),
    @NamedQuery(name = "Commercial.findByGsm2", query = "SELECT c FROM Commercial c WHERE c.gsm2 = :gsm2")})
public class Commercial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcommercial")
    private Integer idcommercial;
    @Size(max = 45)
    @Column(name = "nom")
    private String nom;
    @Size(max = 45)
    @Column(name = "prenom")
    private String prenom;
    @Size(max = 45)
    @Column(name = "gsm")
    private String gsm;
    @Size(max = 45)
    @Column(name = "gsm2")
    private String gsm2;
    @OneToMany(mappedBy = "idcommercial")
    private Collection<Client> clientCollection;
    @OneToMany(mappedBy = "idcommercial")
    private Collection<Retour> retourCollection;
    @OneToMany(mappedBy = "idcommercial")
    private Collection<BonDeSortie> bonDeSortieCollection;
    @OneToMany(mappedBy = "idcommercial")
    private Collection<Avoir> avoirCollection;
    @OneToMany(mappedBy = "idcommercial")
    private Collection<Devis> devisCollection;
    @OneToMany(mappedBy = "idcommercial")
    private Collection<BonDeLivraison> bonDeLivraisonCollection;
    @OneToMany(mappedBy = "idcommercial")
    private Collection<BlFaVente> blFaVenteCollection;

    public Commercial() {
    }

    public Commercial(Integer idcommercial) {
        this.idcommercial = idcommercial;
    }

    public Integer getIdcommercial() {
        return idcommercial;
    }

    public void setIdcommercial(Integer idcommercial) {
        this.idcommercial = idcommercial;
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

    @XmlTransient
    public Collection<Client> getClientCollection() {
        return clientCollection;
    }

    public void setClientCollection(Collection<Client> clientCollection) {
        this.clientCollection = clientCollection;
    }

    @XmlTransient
    public Collection<Retour> getRetourCollection() {
        return retourCollection;
    }

    public void setRetourCollection(Collection<Retour> retourCollection) {
        this.retourCollection = retourCollection;
    }

    @XmlTransient
    public Collection<BonDeSortie> getBonDeSortieCollection() {
        return bonDeSortieCollection;
    }

    public void setBonDeSortieCollection(Collection<BonDeSortie> bonDeSortieCollection) {
        this.bonDeSortieCollection = bonDeSortieCollection;
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
    public Collection<BlFaVente> getBlFaVenteCollection() {
        return blFaVenteCollection;
    }

    public void setBlFaVenteCollection(Collection<BlFaVente> blFaVenteCollection) {
        this.blFaVenteCollection = blFaVenteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcommercial != null ? idcommercial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Commercial)) {
            return false;
        }
        Commercial other = (Commercial) object;
        if ((this.idcommercial == null && other.idcommercial != null) || (this.idcommercial != null && !this.idcommercial.equals(other.idcommercial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Commercial[ idcommercial=" + idcommercial + " ]";
    }
    
}
