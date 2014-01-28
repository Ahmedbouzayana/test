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
@Table(name = "secteurs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Secteurs.findAll", query = "SELECT s FROM Secteurs s"),
    @NamedQuery(name = "Secteurs.findByIdsecteurs", query = "SELECT s FROM Secteurs s WHERE s.idsecteurs = :idsecteurs"),
    @NamedQuery(name = "Secteurs.findBySecteur", query = "SELECT s FROM Secteurs s WHERE s.secteur = :secteur")})
public class Secteurs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsecteurs")
    private Integer idsecteurs;
    @Size(max = 100)
    @Column(name = "secteur")
    private String secteur;
    @OneToMany(mappedBy = "idsecteur")
    private Collection<Client> clientCollection;

    public Secteurs() {
    }

    public Secteurs(Integer idsecteurs) {
        this.idsecteurs = idsecteurs;
    }

    public Integer getIdsecteurs() {
        return idsecteurs;
    }

    public void setIdsecteurs(Integer idsecteurs) {
        this.idsecteurs = idsecteurs;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    @XmlTransient
    public Collection<Client> getClientCollection() {
        return clientCollection;
    }

    public void setClientCollection(Collection<Client> clientCollection) {
        this.clientCollection = clientCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsecteurs != null ? idsecteurs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Secteurs)) {
            return false;
        }
        Secteurs other = (Secteurs) object;
        if ((this.idsecteurs == null && other.idsecteurs != null) || (this.idsecteurs != null && !this.idsecteurs.equals(other.idsecteurs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Secteurs[ idsecteurs=" + idsecteurs + " ]";
    }
    
}
