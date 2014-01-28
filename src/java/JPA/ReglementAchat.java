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
@Table(name = "reglement_achat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReglementAchat.findAll", query = "SELECT r FROM ReglementAchat r"),
    @NamedQuery(name = "ReglementAchat.findByIdreglementAchat", query = "SELECT r FROM ReglementAchat r WHERE r.idreglementAchat = :idreglementAchat"),
    @NamedQuery(name = "ReglementAchat.findByMode", query = "SELECT r FROM ReglementAchat r WHERE r.mode = :mode"),
    @NamedQuery(name = "ReglementAchat.findByNumpiece", query = "SELECT r FROM ReglementAchat r WHERE r.numpiece = :numpiece"),
    @NamedQuery(name = "ReglementAchat.findByDate", query = "SELECT r FROM ReglementAchat r WHERE r.date = :date"),
    @NamedQuery(name = "ReglementAchat.findByDateechance", query = "SELECT r FROM ReglementAchat r WHERE r.dateechance = :dateechance"),
    @NamedQuery(name = "ReglementAchat.findByMontant", query = "SELECT r FROM ReglementAchat r WHERE r.montant = :montant"),
    @NamedQuery(name = "ReglementAchat.findByTypepiece", query = "SELECT r FROM ReglementAchat r WHERE r.typepiece = :typepiece"),
    @NamedQuery(name = "ReglementAchat.findByValider", query = "SELECT r FROM ReglementAchat r WHERE r.valider = :valider"),
    @NamedQuery(name = "ReglementAchat.findByBanque", query = "SELECT r FROM ReglementAchat r WHERE r.banque = :banque")})
public class ReglementAchat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreglement_achat")
    private Integer idreglementAchat;
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
    @JoinColumn(name = "idfaachat", referencedColumnName = "idfa_achat")
    @ManyToOne
    private FaAchat idfaachat;
    @JoinColumn(name = "idbr", referencedColumnName = "idbr_achat")
    @ManyToOne
    private BrAchat idbr;
    @JoinColumn(name = "idfrs", referencedColumnName = "idfournisseur")
    @ManyToOne
    private Fournisseur idfrs;
    @JoinColumn(name = "idretoura", referencedColumnName = "idretour_a")
    @ManyToOne
    private RetourA idretoura;
    @JoinColumn(name = "idavoira", referencedColumnName = "idavoir_a")
    @ManyToOne
    private AvoirA idavoira;

    public ReglementAchat() {
    }

    public ReglementAchat(Integer idreglementAchat) {
        this.idreglementAchat = idreglementAchat;
    }

    public Integer getIdreglementAchat() {
        return idreglementAchat;
    }

    public void setIdreglementAchat(Integer idreglementAchat) {
        this.idreglementAchat = idreglementAchat;
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

    public FaAchat getIdfaachat() {
        return idfaachat;
    }

    public void setIdfaachat(FaAchat idfaachat) {
        this.idfaachat = idfaachat;
    }

    public BrAchat getIdbr() {
        return idbr;
    }

    public void setIdbr(BrAchat idbr) {
        this.idbr = idbr;
    }

    public Fournisseur getIdfrs() {
        return idfrs;
    }

    public void setIdfrs(Fournisseur idfrs) {
        this.idfrs = idfrs;
    }

    public RetourA getIdretoura() {
        return idretoura;
    }

    public void setIdretoura(RetourA idretoura) {
        this.idretoura = idretoura;
    }

    public AvoirA getIdavoira() {
        return idavoira;
    }

    public void setIdavoira(AvoirA idavoira) {
        this.idavoira = idavoira;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreglementAchat != null ? idreglementAchat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReglementAchat)) {
            return false;
        }
        ReglementAchat other = (ReglementAchat) object;
        if ((this.idreglementAchat == null && other.idreglementAchat != null) || (this.idreglementAchat != null && !this.idreglementAchat.equals(other.idreglementAchat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.ReglementAchat[ idreglementAchat=" + idreglementAchat + " ]";
    }
    
}
