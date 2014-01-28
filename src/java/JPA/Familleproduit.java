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
@Table(name = "familleproduit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Familleproduit.findAll", query = "SELECT f FROM Familleproduit f"),
    @NamedQuery(name = "Familleproduit.findByIdfamilleproduit", query = "SELECT f FROM Familleproduit f WHERE f.idfamilleproduit = :idfamilleproduit"),
    @NamedQuery(name = "Familleproduit.findByLibelfamille", query = "SELECT f FROM Familleproduit f WHERE f.libelfamille = :libelfamille")})
public class Familleproduit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfamilleproduit")
    private Integer idfamilleproduit;
    @Size(max = 50)
    @Column(name = "libelfamille")
    private String libelfamille;
    @OneToMany(mappedBy = "idfamilleproduit")
    private Collection<Produit> produitCollection;
    @JoinColumn(name = "idclasse", referencedColumnName = "idclasse")
    @ManyToOne
    private Classe idclasse;

    public Familleproduit() {
    }

    public Familleproduit(Integer idfamilleproduit) {
        this.idfamilleproduit = idfamilleproduit;
    }

    public Integer getIdfamilleproduit() {
        return idfamilleproduit;
    }

    public void setIdfamilleproduit(Integer idfamilleproduit) {
        this.idfamilleproduit = idfamilleproduit;
    }

    public String getLibelfamille() {
        return libelfamille;
    }

    public void setLibelfamille(String libelfamille) {
        this.libelfamille = libelfamille;
    }

    @XmlTransient
    public Collection<Produit> getProduitCollection() {
        return produitCollection;
    }

    public void setProduitCollection(Collection<Produit> produitCollection) {
        this.produitCollection = produitCollection;
    }

    public Classe getIdclasse() {
        return idclasse;
    }

    public void setIdclasse(Classe idclasse) {
        this.idclasse = idclasse;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfamilleproduit != null ? idfamilleproduit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Familleproduit)) {
            return false;
        }
        Familleproduit other = (Familleproduit) object;
        if ((this.idfamilleproduit == null && other.idfamilleproduit != null) || (this.idfamilleproduit != null && !this.idfamilleproduit.equals(other.idfamilleproduit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Familleproduit[ idfamilleproduit=" + idfamilleproduit + " ]";
    }
    
}
