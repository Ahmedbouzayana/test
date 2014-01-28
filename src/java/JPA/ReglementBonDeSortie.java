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
@Table(name = "reglement_bon_de_sortie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReglementBonDeSortie.findAll", query = "SELECT r FROM ReglementBonDeSortie r"),
    @NamedQuery(name = "ReglementBonDeSortie.findByIdreglementBonDeSortie", query = "SELECT r FROM ReglementBonDeSortie r WHERE r.idreglementBonDeSortie = :idreglementBonDeSortie"),
    @NamedQuery(name = "ReglementBonDeSortie.findByMode", query = "SELECT r FROM ReglementBonDeSortie r WHERE r.mode = :mode"),
    @NamedQuery(name = "ReglementBonDeSortie.findByDate", query = "SELECT r FROM ReglementBonDeSortie r WHERE r.date = :date"),
    @NamedQuery(name = "ReglementBonDeSortie.findByDateechance", query = "SELECT r FROM ReglementBonDeSortie r WHERE r.dateechance = :dateechance"),
    @NamedQuery(name = "ReglementBonDeSortie.findByMontant", query = "SELECT r FROM ReglementBonDeSortie r WHERE r.montant = :montant"),
    @NamedQuery(name = "ReglementBonDeSortie.findByIdclient", query = "SELECT r FROM ReglementBonDeSortie r WHERE r.idclient = :idclient"),
    @NamedQuery(name = "ReglementBonDeSortie.findByIdutilisateur", query = "SELECT r FROM ReglementBonDeSortie r WHERE r.idutilisateur = :idutilisateur"),
    @NamedQuery(name = "ReglementBonDeSortie.findByIdbondesortie", query = "SELECT r FROM ReglementBonDeSortie r WHERE r.idbondesortie = :idbondesortie")})
public class ReglementBonDeSortie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreglement_bon_de_sortie")
    private Integer idreglementBonDeSortie;
    @Size(max = 45)
    @Column(name = "mode")
    private String mode;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "dateechance")
    @Temporal(TemporalType.DATE)
    private Date dateechance;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "montant")
    private BigDecimal montant;
    @Column(name = "idclient")
    private Integer idclient;
    @Column(name = "idutilisateur")
    private Integer idutilisateur;
    @Column(name = "idbondesortie")
    private Integer idbondesortie;

    public ReglementBonDeSortie() {
    }

    public ReglementBonDeSortie(Integer idreglementBonDeSortie) {
        this.idreglementBonDeSortie = idreglementBonDeSortie;
    }

    public Integer getIdreglementBonDeSortie() {
        return idreglementBonDeSortie;
    }

    public void setIdreglementBonDeSortie(Integer idreglementBonDeSortie) {
        this.idreglementBonDeSortie = idreglementBonDeSortie;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDateechance() {
        return dateechance;
    }

    public void setDateechance(Date dateechance) {
        this.dateechance = dateechance;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public Integer getIdclient() {
        return idclient;
    }

    public void setIdclient(Integer idclient) {
        this.idclient = idclient;
    }

    public Integer getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(Integer idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public Integer getIdbondesortie() {
        return idbondesortie;
    }

    public void setIdbondesortie(Integer idbondesortie) {
        this.idbondesortie = idbondesortie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreglementBonDeSortie != null ? idreglementBonDeSortie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReglementBonDeSortie)) {
            return false;
        }
        ReglementBonDeSortie other = (ReglementBonDeSortie) object;
        if ((this.idreglementBonDeSortie == null && other.idreglementBonDeSortie != null) || (this.idreglementBonDeSortie != null && !this.idreglementBonDeSortie.equals(other.idreglementBonDeSortie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.ReglementBonDeSortie[ idreglementBonDeSortie=" + idreglementBonDeSortie + " ]";
    }
    
}
