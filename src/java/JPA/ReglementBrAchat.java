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
@Table(name = "reglement_br_achat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReglementBrAchat.findAll", query = "SELECT r FROM ReglementBrAchat r"),
    @NamedQuery(name = "ReglementBrAchat.findByIdreglementBrAchat", query = "SELECT r FROM ReglementBrAchat r WHERE r.idreglementBrAchat = :idreglementBrAchat"),
    @NamedQuery(name = "ReglementBrAchat.findByMode", query = "SELECT r FROM ReglementBrAchat r WHERE r.mode = :mode"),
    @NamedQuery(name = "ReglementBrAchat.findByNumpiece", query = "SELECT r FROM ReglementBrAchat r WHERE r.numpiece = :numpiece"),
    @NamedQuery(name = "ReglementBrAchat.findByDate", query = "SELECT r FROM ReglementBrAchat r WHERE r.date = :date"),
    @NamedQuery(name = "ReglementBrAchat.findByDateechance", query = "SELECT r FROM ReglementBrAchat r WHERE r.dateechance = :dateechance"),
    @NamedQuery(name = "ReglementBrAchat.findByMontant", query = "SELECT r FROM ReglementBrAchat r WHERE r.montant = :montant"),
    @NamedQuery(name = "ReglementBrAchat.findByIdfrs", query = "SELECT r FROM ReglementBrAchat r WHERE r.idfrs = :idfrs"),
    @NamedQuery(name = "ReglementBrAchat.findByIdutilisateur", query = "SELECT r FROM ReglementBrAchat r WHERE r.idutilisateur = :idutilisateur"),
    @NamedQuery(name = "ReglementBrAchat.findByIdbrachat", query = "SELECT r FROM ReglementBrAchat r WHERE r.idbrachat = :idbrachat")})
public class ReglementBrAchat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreglement_br_achat")
    private Integer idreglementBrAchat;
    @Size(max = 45)
    @Column(name = "mode")
    private String mode;
    @Size(max = 45)
    @Column(name = "numpiece")
    private String numpiece;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "dateechance")
    @Temporal(TemporalType.DATE)
    private Date dateechance;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "montant")
    private BigDecimal montant;
    @Column(name = "idfrs")
    private Integer idfrs;
    @Column(name = "idutilisateur")
    private Integer idutilisateur;
    @Column(name = "idbrachat")
    private Integer idbrachat;

    public ReglementBrAchat() {
    }

    public ReglementBrAchat(Integer idreglementBrAchat) {
        this.idreglementBrAchat = idreglementBrAchat;
    }

    public Integer getIdreglementBrAchat() {
        return idreglementBrAchat;
    }

    public void setIdreglementBrAchat(Integer idreglementBrAchat) {
        this.idreglementBrAchat = idreglementBrAchat;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getNumpiece() {
        return numpiece;
    }

    public void setNumpiece(String numpiece) {
        this.numpiece = numpiece;
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

    public Integer getIdfrs() {
        return idfrs;
    }

    public void setIdfrs(Integer idfrs) {
        this.idfrs = idfrs;
    }

    public Integer getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(Integer idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public Integer getIdbrachat() {
        return idbrachat;
    }

    public void setIdbrachat(Integer idbrachat) {
        this.idbrachat = idbrachat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreglementBrAchat != null ? idreglementBrAchat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReglementBrAchat)) {
            return false;
        }
        ReglementBrAchat other = (ReglementBrAchat) object;
        if ((this.idreglementBrAchat == null && other.idreglementBrAchat != null) || (this.idreglementBrAchat != null && !this.idreglementBrAchat.equals(other.idreglementBrAchat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.ReglementBrAchat[ idreglementBrAchat=" + idreglementBrAchat + " ]";
    }
    
}
