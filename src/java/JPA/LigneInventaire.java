/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JPA;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mrs2a
 */
@Entity
@Table(name = "ligne_inventaire")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LigneInventaire.findAll", query = "SELECT l FROM LigneInventaire l"),
    @NamedQuery(name = "LigneInventaire.findByIdligneInventaire", query = "SELECT l FROM LigneInventaire l WHERE l.idligneInventaire = :idligneInventaire"),
    @NamedQuery(name = "LigneInventaire.findByQte", query = "SELECT l FROM LigneInventaire l WHERE l.qte = :qte")})
public class LigneInventaire implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idligne_inventaire")
    private Integer idligneInventaire;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "qte")
    private BigDecimal qte;
    @JoinColumn(name = "idproduit", referencedColumnName = "idproduit")
    @ManyToOne
    private Produit idproduit;
    @JoinColumn(name = "idinventaire", referencedColumnName = "idinventaire")
    @ManyToOne
    private Inventaire idinventaire;

    public LigneInventaire() {
    }

    public LigneInventaire(Integer idligneInventaire) {
        this.idligneInventaire = idligneInventaire;
    }

    public Integer getIdligneInventaire() {
        return idligneInventaire;
    }

    public void setIdligneInventaire(Integer idligneInventaire) {
        this.idligneInventaire = idligneInventaire;
    }

    public BigDecimal getQte() {
        return qte;
    }

    public void setQte(BigDecimal qte) {
        this.qte = qte;
    }

    public Produit getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(Produit idproduit) {
        this.idproduit = idproduit;
    }

    public Inventaire getIdinventaire() {
        return idinventaire;
    }

    public void setIdinventaire(Inventaire idinventaire) {
        this.idinventaire = idinventaire;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idligneInventaire != null ? idligneInventaire.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LigneInventaire)) {
            return false;
        }
        LigneInventaire other = (LigneInventaire) object;
        if ((this.idligneInventaire == null && other.idligneInventaire != null) || (this.idligneInventaire != null && !this.idligneInventaire.equals(other.idligneInventaire))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.LigneInventaire[ idligneInventaire=" + idligneInventaire + " ]";
    }
    
}
