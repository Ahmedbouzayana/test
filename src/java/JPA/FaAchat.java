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
@Table(name = "fa_achat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FaAchat.findAll", query = "SELECT f FROM FaAchat f"),
    @NamedQuery(name = "FaAchat.findByIdfaAchat", query = "SELECT f FROM FaAchat f WHERE f.idfaAchat = :idfaAchat"),
    @NamedQuery(name = "FaAchat.findByNumpiece", query = "SELECT f FROM FaAchat f WHERE f.numpiece = :numpiece"),
    @NamedQuery(name = "FaAchat.findByDatepiece", query = "SELECT f FROM FaAchat f WHERE f.datepiece = :datepiece"),
    @NamedQuery(name = "FaAchat.findByMontantht", query = "SELECT f FROM FaAchat f WHERE f.montantht = :montantht"),
    @NamedQuery(name = "FaAchat.findByMontanttva", query = "SELECT f FROM FaAchat f WHERE f.montanttva = :montanttva"),
    @NamedQuery(name = "FaAchat.findByMontantttc", query = "SELECT f FROM FaAchat f WHERE f.montantttc = :montantttc"),
    @NamedQuery(name = "FaAchat.findByMontantregler", query = "SELECT f FROM FaAchat f WHERE f.montantregler = :montantregler"),
    @NamedQuery(name = "FaAchat.findByValider", query = "SELECT f FROM FaAchat f WHERE f.valider = :valider"),
    @NamedQuery(name = "FaAchat.findByRemiseglobal", query = "SELECT f FROM FaAchat f WHERE f.remiseglobal = :remiseglobal"),
    @NamedQuery(name = "FaAchat.findByTypepiece", query = "SELECT f FROM FaAchat f WHERE f.typepiece = :typepiece"),
    @NamedQuery(name = "FaAchat.findByNetht", query = "SELECT f FROM FaAchat f WHERE f.netht = :netht"),
    @NamedQuery(name = "FaAchat.findByTotalremise", query = "SELECT f FROM FaAchat f WHERE f.totalremise = :totalremise"),
    @NamedQuery(name = "FaAchat.findByRemisecomptant", query = "SELECT f FROM FaAchat f WHERE f.remisecomptant = :remisecomptant"),
    @NamedQuery(name = "FaAchat.findByFodec", query = "SELECT f FROM FaAchat f WHERE f.fodec = :fodec"),
    @NamedQuery(name = "FaAchat.findByDroitc", query = "SELECT f FROM FaAchat f WHERE f.droitc = :droitc"),
    @NamedQuery(name = "FaAchat.findByTimbre", query = "SELECT f FROM FaAchat f WHERE f.timbre = :timbre"),
    @NamedQuery(name = "FaAchat.findByNetttc", query = "SELECT f FROM FaAchat f WHERE f.netttc = :netttc"),
    @NamedQuery(name = "FaAchat.findByValeurremiseg", query = "SELECT f FROM FaAchat f WHERE f.valeurremiseg = :valeurremiseg"),
    @NamedQuery(name = "FaAchat.findByValeurremiscompt", query = "SELECT f FROM FaAchat f WHERE f.valeurremiscompt = :valeurremiscompt"),
    @NamedQuery(name = "FaAchat.findByNetletre", query = "SELECT f FROM FaAchat f WHERE f.netletre = :netletre"),
    @NamedQuery(name = "FaAchat.findByBase0", query = "SELECT f FROM FaAchat f WHERE f.base0 = :base0"),
    @NamedQuery(name = "FaAchat.findByTva0", query = "SELECT f FROM FaAchat f WHERE f.tva0 = :tva0"),
    @NamedQuery(name = "FaAchat.findByBase12", query = "SELECT f FROM FaAchat f WHERE f.base12 = :base12"),
    @NamedQuery(name = "FaAchat.findByTva12", query = "SELECT f FROM FaAchat f WHERE f.tva12 = :tva12"),
    @NamedQuery(name = "FaAchat.findByBase18", query = "SELECT f FROM FaAchat f WHERE f.base18 = :base18"),
    @NamedQuery(name = "FaAchat.findByTva18", query = "SELECT f FROM FaAchat f WHERE f.tva18 = :tva18"),
    @NamedQuery(name = "FaAchat.findByBase29", query = "SELECT f FROM FaAchat f WHERE f.base29 = :base29"),
    @NamedQuery(name = "FaAchat.findByTva29", query = "SELECT f FROM FaAchat f WHERE f.tva29 = :tva29")})
public class FaAchat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfa_achat")
    private Integer idfaAchat;
    @Size(max = 45)
    @Column(name = "numpiece")
    private String numpiece;
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
    @Size(max = 255)
    @Column(name = "netletre")
    private String netletre;
    @Column(name = "base0")
    private BigDecimal base0;
    @Column(name = "tva0")
    private BigDecimal tva0;
    @Column(name = "base12")
    private BigDecimal base12;
    @Column(name = "tva12")
    private BigDecimal tva12;
    @Column(name = "base18")
    private BigDecimal base18;
    @Column(name = "tva18")
    private BigDecimal tva18;
    @Column(name = "base29")
    private BigDecimal base29;
    @Column(name = "tva29")
    private BigDecimal tva29;
    @OneToMany(mappedBy = "idfaachat")
    private Collection<LigneFaAchat> ligneFaAchatCollection;
    @JoinColumn(name = "idutilisateur", referencedColumnName = "idutilisateurs")
    @ManyToOne
    private Utilisateurs idutilisateur;
    @JoinColumn(name = "idfrs", referencedColumnName = "idfournisseur")
    @ManyToOne
    private Fournisseur idfrs;
    @OneToMany(mappedBy = "idfaachat")
    private Collection<ReglementAchat> reglementAchatCollection;

    public FaAchat() {
    }

    public FaAchat(Integer idfaAchat) {
        this.idfaAchat = idfaAchat;
    }

    public Integer getIdfaAchat() {
        return idfaAchat;
    }

    public void setIdfaAchat(Integer idfaAchat) {
        this.idfaAchat = idfaAchat;
    }

    public String getNumpiece() {
        return numpiece;
    }

    public void setNumpiece(String numpiece) {
        this.numpiece = numpiece;
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

    public String getNetletre() {
        return netletre;
    }

    public void setNetletre(String netletre) {
        this.netletre = netletre;
    }

    public BigDecimal getBase0() {
        return base0;
    }

    public void setBase0(BigDecimal base0) {
        this.base0 = base0;
    }

    public BigDecimal getTva0() {
        return tva0;
    }

    public void setTva0(BigDecimal tva0) {
        this.tva0 = tva0;
    }

    public BigDecimal getBase12() {
        return base12;
    }

    public void setBase12(BigDecimal base12) {
        this.base12 = base12;
    }

    public BigDecimal getTva12() {
        return tva12;
    }

    public void setTva12(BigDecimal tva12) {
        this.tva12 = tva12;
    }

    public BigDecimal getBase18() {
        return base18;
    }

    public void setBase18(BigDecimal base18) {
        this.base18 = base18;
    }

    public BigDecimal getTva18() {
        return tva18;
    }

    public void setTva18(BigDecimal tva18) {
        this.tva18 = tva18;
    }

    public BigDecimal getBase29() {
        return base29;
    }

    public void setBase29(BigDecimal base29) {
        this.base29 = base29;
    }

    public BigDecimal getTva29() {
        return tva29;
    }

    public void setTva29(BigDecimal tva29) {
        this.tva29 = tva29;
    }

    @XmlTransient
    public Collection<LigneFaAchat> getLigneFaAchatCollection() {
        return ligneFaAchatCollection;
    }

    public void setLigneFaAchatCollection(Collection<LigneFaAchat> ligneFaAchatCollection) {
        this.ligneFaAchatCollection = ligneFaAchatCollection;
    }

    public Utilisateurs getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(Utilisateurs idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public Fournisseur getIdfrs() {
        return idfrs;
    }

    public void setIdfrs(Fournisseur idfrs) {
        this.idfrs = idfrs;
    }

    @XmlTransient
    public Collection<ReglementAchat> getReglementAchatCollection() {
        return reglementAchatCollection;
    }

    public void setReglementAchatCollection(Collection<ReglementAchat> reglementAchatCollection) {
        this.reglementAchatCollection = reglementAchatCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfaAchat != null ? idfaAchat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FaAchat)) {
            return false;
        }
        FaAchat other = (FaAchat) object;
        if ((this.idfaAchat == null && other.idfaAchat != null) || (this.idfaAchat != null && !this.idfaAchat.equals(other.idfaAchat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.FaAchat[ idfaAchat=" + idfaAchat + " ]";
    }
    
}
