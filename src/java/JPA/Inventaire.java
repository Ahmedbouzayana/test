/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JPA;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Mrs2a
 */
@Entity
@Table(name = "inventaire")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inventaire.findAll", query = "SELECT i FROM Inventaire i"),
    @NamedQuery(name = "Inventaire.findByIdinventaire", query = "SELECT i FROM Inventaire i WHERE i.idinventaire = :idinventaire"),
    @NamedQuery(name = "Inventaire.findByDateinv", query = "SELECT i FROM Inventaire i WHERE i.dateinv = :dateinv"),
    @NamedQuery(name = "Inventaire.findByValeurdestock", query = "SELECT i FROM Inventaire i WHERE i.valeurdestock = :valeurdestock")})
public class Inventaire implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idinventaire")
    private Integer idinventaire;
    @Column(name = "dateinv")
    @Temporal(TemporalType.DATE)
    private Date dateinv;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valeurdestock")
    private BigDecimal valeurdestock;
    @OneToMany(mappedBy = "idinventaire")
    private Collection<LigneInventaire> ligneInventaireCollection;
    @JoinColumn(name = "idutilisateur", referencedColumnName = "idutilisateurs")
    @ManyToOne
    private Utilisateurs idutilisateur;

    public Inventaire() {
    }

    public Inventaire(Integer idinventaire) {
        this.idinventaire = idinventaire;
    }

    public Integer getIdinventaire() {
        return idinventaire;
    }

    public void setIdinventaire(Integer idinventaire) {
        this.idinventaire = idinventaire;
    }

    public Date getDateinv() {
        return dateinv;
    }

    public void setDateinv(Date dateinv) {
        this.dateinv = dateinv;
    }

    public BigDecimal getValeurdestock() {
        return valeurdestock;
    }

    public void setValeurdestock(BigDecimal valeurdestock) {
        this.valeurdestock = valeurdestock;
    }

    @XmlTransient
    public Collection<LigneInventaire> getLigneInventaireCollection() {
        return ligneInventaireCollection;
    }

    public void setLigneInventaireCollection(Collection<LigneInventaire> ligneInventaireCollection) {
        this.ligneInventaireCollection = ligneInventaireCollection;
    }

    public Utilisateurs getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(Utilisateurs idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idinventaire != null ? idinventaire.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventaire)) {
            return false;
        }
        Inventaire other = (Inventaire) object;
        if ((this.idinventaire == null && other.idinventaire != null) || (this.idinventaire != null && !this.idinventaire.equals(other.idinventaire))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Inventaire[ idinventaire=" + idinventaire + " ]";
    }
    
}
