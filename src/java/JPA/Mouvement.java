/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JPA;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mrs2a
 */
@Entity
@Table(name = "mouvement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mouvement.findAll", query = "SELECT m FROM Mouvement m"),
    @NamedQuery(name = "Mouvement.findByIdmouvement", query = "SELECT m FROM Mouvement m WHERE m.idmouvement = :idmouvement"),
    @NamedQuery(name = "Mouvement.findByMotif", query = "SELECT m FROM Mouvement m WHERE m.motif = :motif"),
    @NamedQuery(name = "Mouvement.findByDate", query = "SELECT m FROM Mouvement m WHERE m.date = :date"),
    @NamedQuery(name = "Mouvement.findByMontant", query = "SELECT m FROM Mouvement m WHERE m.montant = :montant")})
public class Mouvement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmouvement")
    private Integer idmouvement;
    @Size(max = 50)
    @Column(name = "motif")
    private String motif;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "montant")
    private BigDecimal montant;
    @JoinColumn(name = "idutilisateur", referencedColumnName = "idutilisateurs")
    @ManyToOne
    private Utilisateurs idutilisateur;
    @JoinColumn(name = "idcaisse", referencedColumnName = "idcaisse")
    @ManyToOne
    private Caisse idcaisse;

    public Mouvement() {
    }

    public Mouvement(Integer idmouvement) {
        this.idmouvement = idmouvement;
    }

    public Integer getIdmouvement() {
        return idmouvement;
    }

    public void setIdmouvement(Integer idmouvement) {
        this.idmouvement = idmouvement;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public Utilisateurs getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(Utilisateurs idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public Caisse getIdcaisse() {
        return idcaisse;
    }

    public void setIdcaisse(Caisse idcaisse) {
        this.idcaisse = idcaisse;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmouvement != null ? idmouvement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mouvement)) {
            return false;
        }
        Mouvement other = (Mouvement) object;
        if ((this.idmouvement == null && other.idmouvement != null) || (this.idmouvement != null && !this.idmouvement.equals(other.idmouvement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Mouvement[ idmouvement=" + idmouvement + " ]";
    }
    
}
