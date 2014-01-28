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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "client")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Client.findAll", query = "SELECT c FROM Client c"),
    @NamedQuery(name = "Client.findByIdclient", query = "SELECT c FROM Client c WHERE c.idclient = :idclient"),
    @NamedQuery(name = "Client.findByNomclient", query = "SELECT c FROM Client c WHERE c.nomclient = :nomclient"),
    @NamedQuery(name = "Client.findByContact", query = "SELECT c FROM Client c WHERE c.contact = :contact"),
    @NamedQuery(name = "Client.findByMatriculfiscal", query = "SELECT c FROM Client c WHERE c.matriculfiscal = :matriculfiscal"),
    @NamedQuery(name = "Client.findByAdresse", query = "SELECT c FROM Client c WHERE c.adresse = :adresse"),
    @NamedQuery(name = "Client.findByTel", query = "SELECT c FROM Client c WHERE c.tel = :tel"),
    @NamedQuery(name = "Client.findByFax", query = "SELECT c FROM Client c WHERE c.fax = :fax"),
    @NamedQuery(name = "Client.findByGsm", query = "SELECT c FROM Client c WHERE c.gsm = :gsm"),
    @NamedQuery(name = "Client.findByGsm2", query = "SELECT c FROM Client c WHERE c.gsm2 = :gsm2"),
    @NamedQuery(name = "Client.findByEmail", query = "SELECT c FROM Client c WHERE c.email = :email"),
    @NamedQuery(name = "Client.findByType", query = "SELECT c FROM Client c WHERE c.type = :type")})
public class Client implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idclient")
    private Integer idclient;
    @Size(max = 100)
    @Column(name = "nomclient")
    private String nomclient;
    @Size(max = 100)
    @Column(name = "contact")
    private String contact;
    @Size(max = 45)
    @Column(name = "matriculfiscal")
    private String matriculfiscal;
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
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email")
    private String email;
    @Size(max = 45)
    @Column(name = "type")
    private String type;
    @JoinColumn(name = "idsecteur", referencedColumnName = "idsecteurs")
    @ManyToOne
    private Secteurs idsecteur;
    @JoinColumn(name = "idcommercial", referencedColumnName = "idcommercial")
    @ManyToOne
    private Commercial idcommercial;
    @OneToMany(mappedBy = "idclient")
    private Collection<Retour> retourCollection;
    @OneToMany(mappedBy = "idclient")
    private Collection<BonDeSortie> bonDeSortieCollection;
    @OneToMany(mappedBy = "idclient")
    private Collection<ReglementVente> reglementVenteCollection;
    @OneToMany(mappedBy = "idclient")
    private Collection<Avoir> avoirCollection;
    @OneToMany(mappedBy = "idclient")
    private Collection<Devis> devisCollection;
    @OneToMany(mappedBy = "idclient")
    private Collection<BonDeLivraison> bonDeLivraisonCollection;
    @OneToMany(mappedBy = "idclient")
    private Collection<BlFaVente> blFaVenteCollection;

    public Client() {
    }

    public Client(Integer idclient) {
        this.idclient = idclient;
    }

    public Integer getIdclient() {
        return idclient;
    }

    public void setIdclient(Integer idclient) {
        this.idclient = idclient;
    }

    public String getNomclient() {
        return nomclient;
    }

    public void setNomclient(String nomclient) {
        this.nomclient = nomclient;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMatriculfiscal() {
        return matriculfiscal;
    }

    public void setMatriculfiscal(String matriculfiscal) {
        this.matriculfiscal = matriculfiscal;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Secteurs getIdsecteur() {
        return idsecteur;
    }

    public void setIdsecteur(Secteurs idsecteur) {
        this.idsecteur = idsecteur;
    }

    public Commercial getIdcommercial() {
        return idcommercial;
    }

    public void setIdcommercial(Commercial idcommercial) {
        this.idcommercial = idcommercial;
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
    public Collection<ReglementVente> getReglementVenteCollection() {
        return reglementVenteCollection;
    }

    public void setReglementVenteCollection(Collection<ReglementVente> reglementVenteCollection) {
        this.reglementVenteCollection = reglementVenteCollection;
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
        hash += (idclient != null ? idclient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.idclient == null && other.idclient != null) || (this.idclient != null && !this.idclient.equals(other.idclient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Client[ idclient=" + idclient + " ]";
    }
    
}
