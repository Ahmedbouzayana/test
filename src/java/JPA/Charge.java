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
@Table(name = "charge")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Charge.findAll", query = "SELECT c FROM Charge c"),
    @NamedQuery(name = "Charge.findByIdcharge", query = "SELECT c FROM Charge c WHERE c.idcharge = :idcharge"),
    @NamedQuery(name = "Charge.findByMotif", query = "SELECT c FROM Charge c WHERE c.motif = :motif"),
    @NamedQuery(name = "Charge.findByMontant", query = "SELECT c FROM Charge c WHERE c.montant = :montant"),
    @NamedQuery(name = "Charge.findByMontantRegler", query = "SELECT c FROM Charge c WHERE c.montantRegler = :montantRegler"),
    @NamedQuery(name = "Charge.findByIdutilisateur", query = "SELECT c FROM Charge c WHERE c.idutilisateur = :idutilisateur"),
    @NamedQuery(name = "Charge.findByDatech", query = "SELECT c FROM Charge c WHERE c.datech = :datech"),
    @NamedQuery(name = "Charge.findByIdcom", query = "SELECT c FROM Charge c WHERE c.idcom = :idcom")})
public class Charge implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcharge")
    private Integer idcharge;
    @Size(max = 45)
    @Column(name = "motif")
    private String motif;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "montant")
    private BigDecimal montant;
    @Column(name = "montant_regler")
    private BigDecimal montantRegler;
    @Column(name = "idutilisateur")
    private Integer idutilisateur;
    @Column(name = "datech")
    @Temporal(TemporalType.DATE)
    private Date datech;
    @Column(name = "idcom")
    private Integer idcom;

    public Charge() {
    }

    public Charge(Integer idcharge) {
        this.idcharge = idcharge;
    }

    public Integer getIdcharge() {
        return idcharge;
    }

    public void setIdcharge(Integer idcharge) {
        this.idcharge = idcharge;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public BigDecimal getMontantRegler() {
        return montantRegler;
    }

    public void setMontantRegler(BigDecimal montantRegler) {
        this.montantRegler = montantRegler;
    }

    public Integer getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(Integer idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public Date getDatech() {
        return datech;
    }

    public void setDatech(Date datech) {
        this.datech = datech;
    }

    public Integer getIdcom() {
        return idcom;
    }

    public void setIdcom(Integer idcom) {
        this.idcom = idcom;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcharge != null ? idcharge.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Charge)) {
            return false;
        }
        Charge other = (Charge) object;
        if ((this.idcharge == null && other.idcharge != null) || (this.idcharge != null && !this.idcharge.equals(other.idcharge))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Charge[ idcharge=" + idcharge + " ]";
    }
    
}
