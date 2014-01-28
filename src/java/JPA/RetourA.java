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
@Table(name = "retour_a")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RetourA.findAll", query = "SELECT r FROM RetourA r"),
    @NamedQuery(name = "RetourA.findByIdretourA", query = "SELECT r FROM RetourA r WHERE r.idretourA = :idretourA"),
    @NamedQuery(name = "RetourA.findByNumpiece", query = "SELECT r FROM RetourA r WHERE r.numpiece = :numpiece"),
    @NamedQuery(name = "RetourA.findByNumpiecesource", query = "SELECT r FROM RetourA r WHERE r.numpiecesource = :numpiecesource"),
    @NamedQuery(name = "RetourA.findByDatepiece", query = "SELECT r FROM RetourA r WHERE r.datepiece = :datepiece"),
    @NamedQuery(name = "RetourA.findByMontantht", query = "SELECT r FROM RetourA r WHERE r.montantht = :montantht"),
    @NamedQuery(name = "RetourA.findByMontanttva", query = "SELECT r FROM RetourA r WHERE r.montanttva = :montanttva"),
    @NamedQuery(name = "RetourA.findByMontantttc", query = "SELECT r FROM RetourA r WHERE r.montantttc = :montantttc"),
    @NamedQuery(name = "RetourA.findByMontantregler", query = "SELECT r FROM RetourA r WHERE r.montantregler = :montantregler"),
    @NamedQuery(name = "RetourA.findByValider", query = "SELECT r FROM RetourA r WHERE r.valider = :valider"),
    @NamedQuery(name = "RetourA.findByRemiseglobal", query = "SELECT r FROM RetourA r WHERE r.remiseglobal = :remiseglobal"),
    @NamedQuery(name = "RetourA.findByTypepiece", query = "SELECT r FROM RetourA r WHERE r.typepiece = :typepiece"),
    @NamedQuery(name = "RetourA.findByNetht", query = "SELECT r FROM RetourA r WHERE r.netht = :netht"),
    @NamedQuery(name = "RetourA.findByTotalremise", query = "SELECT r FROM RetourA r WHERE r.totalremise = :totalremise"),
    @NamedQuery(name = "RetourA.findByRemisecomptant", query = "SELECT r FROM RetourA r WHERE r.remisecomptant = :remisecomptant"),
    @NamedQuery(name = "RetourA.findByFodec", query = "SELECT r FROM RetourA r WHERE r.fodec = :fodec"),
    @NamedQuery(name = "RetourA.findByDroitc", query = "SELECT r FROM RetourA r WHERE r.droitc = :droitc"),
    @NamedQuery(name = "RetourA.findByTimbre", query = "SELECT r FROM RetourA r WHERE r.timbre = :timbre"),
    @NamedQuery(name = "RetourA.findByNetttc", query = "SELECT r FROM RetourA r WHERE r.netttc = :netttc"),
    @NamedQuery(name = "RetourA.findByValeurremiseg", query = "SELECT r FROM RetourA r WHERE r.valeurremiseg = :valeurremiseg"),
    @NamedQuery(name = "RetourA.findByValeurremiscompt", query = "SELECT r FROM RetourA r WHERE r.valeurremiscompt = :valeurremiscompt")})
public class RetourA implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idretour_a")
    private Integer idretourA;
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
    @OneToMany(mappedBy = "idretoura")
    private Collection<ReglementAchat> reglementAchatCollection;
    @JoinColumn(name = "idutilisateur", referencedColumnName = "idutilisateurs")
    @ManyToOne
    private Utilisateurs idutilisateur;
    @JoinColumn(name = "idfournisseur", referencedColumnName = "idfournisseur")
    @ManyToOne
    private Fournisseur idfournisseur;
    @OneToMany(mappedBy = "idretourA")
    private Collection<LigneRetourA> ligneRetourACollection;

    public RetourA() {
    }

    public RetourA(Integer idretourA) {
        this.idretourA = idretourA;
    }

    public Integer getIdretourA() {
        return idretourA;
    }

    public void setIdretourA(Integer idretourA) {
        this.idretourA = idretourA;
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

    @XmlTransient
    public Collection<ReglementAchat> getReglementAchatCollection() {
        return reglementAchatCollection;
    }

    public void setReglementAchatCollection(Collection<ReglementAchat> reglementAchatCollection) {
        this.reglementAchatCollection = reglementAchatCollection;
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
    public Collection<LigneRetourA> getLigneRetourACollection() {
        return ligneRetourACollection;
    }

    public void setLigneRetourACollection(Collection<LigneRetourA> ligneRetourACollection) {
        this.ligneRetourACollection = ligneRetourACollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idretourA != null ? idretourA.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetourA)) {
            return false;
        }
        RetourA other = (RetourA) object;
        if ((this.idretourA == null && other.idretourA != null) || (this.idretourA != null && !this.idretourA.equals(other.idretourA))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.RetourA[ idretourA=" + idretourA + " ]";
    }
    
}
