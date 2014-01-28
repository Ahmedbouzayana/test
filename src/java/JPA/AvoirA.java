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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Mrs2a
 */
@Entity
@Table(name = "avoir_a")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AvoirA.findAll", query = "SELECT a FROM AvoirA a"),
    @NamedQuery(name = "AvoirA.findByIdavoirA", query = "SELECT a FROM AvoirA a WHERE a.idavoirA = :idavoirA"),
    @NamedQuery(name = "AvoirA.findByNumpiece", query = "SELECT a FROM AvoirA a WHERE a.numpiece = :numpiece"),
    @NamedQuery(name = "AvoirA.findByNumpiecesource", query = "SELECT a FROM AvoirA a WHERE a.numpiecesource = :numpiecesource"),
    @NamedQuery(name = "AvoirA.findByDatepiece", query = "SELECT a FROM AvoirA a WHERE a.datepiece = :datepiece"),
    @NamedQuery(name = "AvoirA.findByMontantht", query = "SELECT a FROM AvoirA a WHERE a.montantht = :montantht"),
    @NamedQuery(name = "AvoirA.findByMontanttva", query = "SELECT a FROM AvoirA a WHERE a.montanttva = :montanttva"),
    @NamedQuery(name = "AvoirA.findByMontantttc", query = "SELECT a FROM AvoirA a WHERE a.montantttc = :montantttc"),
    @NamedQuery(name = "AvoirA.findByMontantregler", query = "SELECT a FROM AvoirA a WHERE a.montantregler = :montantregler"),
    @NamedQuery(name = "AvoirA.findByValider", query = "SELECT a FROM AvoirA a WHERE a.valider = :valider"),
    @NamedQuery(name = "AvoirA.findByRemiseglobal", query = "SELECT a FROM AvoirA a WHERE a.remiseglobal = :remiseglobal"),
    @NamedQuery(name = "AvoirA.findByTypepiece", query = "SELECT a FROM AvoirA a WHERE a.typepiece = :typepiece"),
    @NamedQuery(name = "AvoirA.findByNetht", query = "SELECT a FROM AvoirA a WHERE a.netht = :netht"),
    @NamedQuery(name = "AvoirA.findByTotalremise", query = "SELECT a FROM AvoirA a WHERE a.totalremise = :totalremise"),
    @NamedQuery(name = "AvoirA.findByRemisecomptant", query = "SELECT a FROM AvoirA a WHERE a.remisecomptant = :remisecomptant"),
    @NamedQuery(name = "AvoirA.findByFodec", query = "SELECT a FROM AvoirA a WHERE a.fodec = :fodec"),
    @NamedQuery(name = "AvoirA.findByDroitc", query = "SELECT a FROM AvoirA a WHERE a.droitc = :droitc"),
    @NamedQuery(name = "AvoirA.findByTimbre", query = "SELECT a FROM AvoirA a WHERE a.timbre = :timbre"),
    @NamedQuery(name = "AvoirA.findByNetttc", query = "SELECT a FROM AvoirA a WHERE a.netttc = :netttc"),
    @NamedQuery(name = "AvoirA.findByValeurremiseg", query = "SELECT a FROM AvoirA a WHERE a.valeurremiseg = :valeurremiseg"),
    @NamedQuery(name = "AvoirA.findByValeurremiscompt", query = "SELECT a FROM AvoirA a WHERE a.valeurremiscompt = :valeurremiscompt")})
public class AvoirA implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idavoir_a")
    private Integer idavoirA;
    @Size(max = 45)
    @Column(name = "numpiece")
    private String numpiece;
    @Size(max = 45)
    @Column(name = "numpiecesource")
    private String numpiecesource;
    @Column(name = "datepiece")
    @Temporal(TemporalType.DATE)
    private Date datepiece;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "montantht")
    private BigDecimal montantht;
    @Column(name = "montanttva")
    private BigDecimal montanttva;
    @Column(name = "montantttc")
    private BigDecimal montantttc;
    @Column(name = "montantregler")
    private BigDecimal montantregler;
    @Column(name = "valider")
    private Integer valider;
    @Column(name = "remiseglobal")
    private BigDecimal remiseglobal;
    @Size(max = 45)
    @Column(name = "typepiece")
    private String typepiece;
    @Column(name = "netht")
    private BigDecimal netht;
    @Column(name = "totalremise")
    private BigDecimal totalremise;
    @Column(name = "remisecomptant")
    private BigDecimal remisecomptant;
    @Column(name = "fodec")
    private BigDecimal fodec;
    @Column(name = "droitc")
    private BigDecimal droitc;
    @Column(name = "timbre")
    private BigDecimal timbre;
    @Column(name = "netttc")
    private BigDecimal netttc;
    @Column(name = "valeurremiseg")
    private BigDecimal valeurremiseg;
    @Column(name = "valeurremiscompt")
    private BigDecimal valeurremiscompt;
    @JoinColumn(name = "idutilisateur", referencedColumnName = "idutilisateurs")
    @ManyToOne
    private Utilisateurs idutilisateur;
    @JoinColumn(name = "idfournisseur", referencedColumnName = "idfournisseur")
    @ManyToOne
    private Fournisseur idfournisseur;
    @OneToMany(mappedBy = "idavoira")
    private Collection<ReglementAchat> reglementAchatCollection;
    @OneToMany(mappedBy = "idavoirA")
    private Collection<LigneAvoirA> ligneAvoirACollection;

    public AvoirA() {
    }

    public AvoirA(Integer idavoirA) {
        this.idavoirA = idavoirA;
    }

    public Integer getIdavoirA() {
        return idavoirA;
    }

    public void setIdavoirA(Integer idavoirA) {
        this.idavoirA = idavoirA;
    }

    public String getNumpiece() {
        return numpiece;
    }

    public void setNumpiece(String numpiece) {
        this.numpiece = numpiece;
    }

    public String getNumpiecesource() {
        return numpiecesource;
    }

    public void setNumpiecesource(String numpiecesource) {
        this.numpiecesource = numpiecesource;
    }

    public Date getDatepiece() {
        return datepiece;
    }

    public void setDatepiece(Date datepiece) {
        this.datepiece = datepiece;
    }

    public BigDecimal getMontantht() {
        return montantht;
    }

    public void setMontantht(BigDecimal montantht) {
        this.montantht = montantht;
    }

    public BigDecimal getMontanttva() {
        return montanttva;
    }

    public void setMontanttva(BigDecimal montanttva) {
        this.montanttva = montanttva;
    }

    public BigDecimal getMontantttc() {
        return montantttc;
    }

    public void setMontantttc(BigDecimal montantttc) {
        this.montantttc = montantttc;
    }

    public BigDecimal getMontantregler() {
        return montantregler;
    }

    public void setMontantregler(BigDecimal montantregler) {
        this.montantregler = montantregler;
    }

    public Integer getValider() {
        return valider;
    }

    public void setValider(Integer valider) {
        this.valider = valider;
    }

    public BigDecimal getRemiseglobal() {
        return remiseglobal;
    }

    public void setRemiseglobal(BigDecimal remiseglobal) {
        this.remiseglobal = remiseglobal;
    }

    public String getTypepiece() {
        return typepiece;
    }

    public void setTypepiece(String typepiece) {
        this.typepiece = typepiece;
    }

    public BigDecimal getNetht() {
        return netht;
    }

    public void setNetht(BigDecimal netht) {
        this.netht = netht;
    }

    public BigDecimal getTotalremise() {
        return totalremise;
    }

    public void setTotalremise(BigDecimal totalremise) {
        this.totalremise = totalremise;
    }

    public BigDecimal getRemisecomptant() {
        return remisecomptant;
    }

    public void setRemisecomptant(BigDecimal remisecomptant) {
        this.remisecomptant = remisecomptant;
    }

    public BigDecimal getFodec() {
        return fodec;
    }

    public void setFodec(BigDecimal fodec) {
        this.fodec = fodec;
    }

    public BigDecimal getDroitc() {
        return droitc;
    }

    public void setDroitc(BigDecimal droitc) {
        this.droitc = droitc;
    }

    public BigDecimal getTimbre() {
        return timbre;
    }

    public void setTimbre(BigDecimal timbre) {
        this.timbre = timbre;
    }

    public BigDecimal getNetttc() {
        return netttc;
    }

    public void setNetttc(BigDecimal netttc) {
        this.netttc = netttc;
    }

    public BigDecimal getValeurremiseg() {
        return valeurremiseg;
    }

    public void setValeurremiseg(BigDecimal valeurremiseg) {
        this.valeurremiseg = valeurremiseg;
    }

    public BigDecimal getValeurremiscompt() {
        return valeurremiscompt;
    }

    public void setValeurremiscompt(BigDecimal valeurremiscompt) {
        this.valeurremiscompt = valeurremiscompt;
    }

    public Utilisateurs getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(Utilisateurs idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public Fournisseur getIdfournisseur() {
        return idfournisseur;
    }

    public void setIdfournisseur(Fournisseur idfournisseur) {
        this.idfournisseur = idfournisseur;
    }

    @XmlTransient
    public Collection<ReglementAchat> getReglementAchatCollection() {
        return reglementAchatCollection;
    }

    public void setReglementAchatCollection(Collection<ReglementAchat> reglementAchatCollection) {
        this.reglementAchatCollection = reglementAchatCollection;
    }

    @XmlTransient
    public Collection<LigneAvoirA> getLigneAvoirACollection() {
        return ligneAvoirACollection;
    }

    public void setLigneAvoirACollection(Collection<LigneAvoirA> ligneAvoirACollection) {
        this.ligneAvoirACollection = ligneAvoirACollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idavoirA != null ? idavoirA.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvoirA)) {
            return false;
        }
        AvoirA other = (AvoirA) object;
        if ((this.idavoirA == null && other.idavoirA != null) || (this.idavoirA != null && !this.idavoirA.equals(other.idavoirA))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.AvoirA[ idavoirA=" + idavoirA + " ]";
    }
    
}
