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
@Table(name = "reglement_vente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReglementVente.findAll", query = "SELECT r FROM ReglementVente r"),
    @NamedQuery(name = "ReglementVente.findByIdreglementVente", query = "SELECT r FROM ReglementVente r WHERE r.idreglementVente = :idreglementVente"),
    @NamedQuery(name = "ReglementVente.findByMode", query = "SELECT r FROM ReglementVente r WHERE r.mode = :mode"),
    @NamedQuery(name = "ReglementVente.findByNumpiece", query = "SELECT r FROM ReglementVente r WHERE r.numpiece = :numpiece"),
    @NamedQuery(name = "ReglementVente.findByDate", query = "SELECT r FROM ReglementVente r WHERE r.date = :date"),
    @NamedQuery(name = "ReglementVente.findByDateechance", query = "SELECT r FROM ReglementVente r WHERE r.dateechance = :dateechance"),
    @NamedQuery(name = "ReglementVente.findByMontant", query = "SELECT r FROM ReglementVente r WHERE r.montant = :montant"),
    @NamedQuery(name = "ReglementVente.findByTypepiece", query = "SELECT r FROM ReglementVente r WHERE r.typepiece = :typepiece"),
    @NamedQuery(name = "ReglementVente.findByValider", query = "SELECT r FROM ReglementVente r WHERE r.valider = :valider"),
    @NamedQuery(name = "ReglementVente.findByBanque", query = "SELECT r FROM ReglementVente r WHERE r.banque = :banque")})
public class ReglementVente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreglement_vente")
    private Integer idreglementVente;
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
    @Size(max = 45)
    @Column(name = "typepiece")
    private String typepiece;
    @Column(name = "valider")
    private Integer valider;
    @Size(max = 45)
    @Column(name = "banque")
    private String banque;
    @JoinColumn(name = "idutilisateur", referencedColumnName = "idutilisateurs")
    @ManyToOne
    private Utilisateurs idutilisateur;
    @JoinColumn(name = "idretour", referencedColumnName = "idretour")
    @ManyToOne
    private Retour idretour;
    @JoinColumn(name = "idclient", referencedColumnName = "idclient")
    @ManyToOne
    private Client idclient;
    @JoinColumn(name = "idbs", referencedColumnName = "idbon_de_sortie")
    @ManyToOne
    private BonDeSortie idbs;
    @JoinColumn(name = "idblfavente", referencedColumnName = "idbl_fa_vente")
    @ManyToOne
    private BlFaVente idblfavente;
    @JoinColumn(name = "idavoir", referencedColumnName = "idavoir")
    @ManyToOne
    private Avoir idavoir;

    public ReglementVente() {
    }

    public ReglementVente(Integer idreglementVente) {
        this.idreglementVente = idreglementVente;
    }

    public Integer getIdreglementVente() {
        return idreglementVente;
    }

    public void setIdreglementVente(Integer idreglementVente) {
        this.idreglementVente = idreglementVente;
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

    public String getTypepiece() {
        return typepiece;
    }

    public void setTypepiece(String typepiece) {
        this.typepiece = typepiece;
    }

    public Integer getValider() {
        return valider;
    }

    public void setValider(Integer valider) {
        this.valider = valider;
    }

    public String getBanque() {
        return banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
    }

    public Utilisateurs getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(Utilisateurs idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public Retour getIdretour() {
        return idretour;
    }

    public void setIdretour(Retour idretour) {
        this.idretour = idretour;
    }

    public Client getIdclient() {
        return idclient;
    }

    public void setIdclient(Client idclient) {
        this.idclient = idclient;
    }

    public BonDeSortie getIdbs() {
        return idbs;
    }

    public void setIdbs(BonDeSortie idbs) {
        this.idbs = idbs;
    }

    public BlFaVente getIdblfavente() {
        return idblfavente;
    }

    public void setIdblfavente(BlFaVente idblfavente) {
        this.idblfavente = idblfavente;
    }

    public Avoir getIdavoir() {
        return idavoir;
    }

    public void setIdavoir(Avoir idavoir) {
        this.idavoir = idavoir;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreglementVente != null ? idreglementVente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReglementVente)) {
            return false;
        }
        ReglementVente other = (ReglementVente) object;
        if ((this.idreglementVente == null && other.idreglementVente != null) || (this.idreglementVente != null && !this.idreglementVente.equals(other.idreglementVente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.ReglementVente[ idreglementVente=" + idreglementVente + " ]";
    }
    
}
