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
@Table(name = "br_achat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BrAchat.findAll", query = "SELECT b FROM BrAchat b"),
    @NamedQuery(name = "BrAchat.findByIdbrAchat", query = "SELECT b FROM BrAchat b WHERE b.idbrAchat = :idbrAchat"),
    @NamedQuery(name = "BrAchat.findByNumpiece", query = "SELECT b FROM BrAchat b WHERE b.numpiece = :numpiece"),
    @NamedQuery(name = "BrAchat.findByDatepiece", query = "SELECT b FROM BrAchat b WHERE b.datepiece = :datepiece"),
    @NamedQuery(name = "BrAchat.findByMontantht", query = "SELECT b FROM BrAchat b WHERE b.montantht = :montantht"),
    @NamedQuery(name = "BrAchat.findByMontanttva", query = "SELECT b FROM BrAchat b WHERE b.montanttva = :montanttva"),
    @NamedQuery(name = "BrAchat.findByMontantttc", query = "SELECT b FROM BrAchat b WHERE b.montantttc = :montantttc"),
    @NamedQuery(name = "BrAchat.findByMontantregler", query = "SELECT b FROM BrAchat b WHERE b.montantregler = :montantregler"),
    @NamedQuery(name = "BrAchat.findByValider", query = "SELECT b FROM BrAchat b WHERE b.valider = :valider"),
    @NamedQuery(name = "BrAchat.findByRemiseglobal", query = "SELECT b FROM BrAchat b WHERE b.remiseglobal = :remiseglobal"),
    @NamedQuery(name = "BrAchat.findByTypepiece", query = "SELECT b FROM BrAchat b WHERE b.typepiece = :typepiece"),
    @NamedQuery(name = "BrAchat.findByNetht", query = "SELECT b FROM BrAchat b WHERE b.netht = :netht"),
    @NamedQuery(name = "BrAchat.findByTotalremise", query = "SELECT b FROM BrAchat b WHERE b.totalremise = :totalremise"),
    @NamedQuery(name = "BrAchat.findByRemisecomptant", query = "SELECT b FROM BrAchat b WHERE b.remisecomptant = :remisecomptant"),
    @NamedQuery(name = "BrAchat.findByFodec", query = "SELECT b FROM BrAchat b WHERE b.fodec = :fodec"),
    @NamedQuery(name = "BrAchat.findByDroitc", query = "SELECT b FROM BrAchat b WHERE b.droitc = :droitc"),
    @NamedQuery(name = "BrAchat.findByTimbre", query = "SELECT b FROM BrAchat b WHERE b.timbre = :timbre"),
    @NamedQuery(name = "BrAchat.findByNetttc", query = "SELECT b FROM BrAchat b WHERE b.netttc = :netttc"),
    @NamedQuery(name = "BrAchat.findByValeurremiseg", query = "SELECT b FROM BrAchat b WHERE b.valeurremiseg = :valeurremiseg"),
    @NamedQuery(name = "BrAchat.findByValeurremiscompt", query = "SELECT b FROM BrAchat b WHERE b.valeurremiscompt = :valeurremiscompt"),
    @NamedQuery(name = "BrAchat.findByBase0", query = "SELECT b FROM BrAchat b WHERE b.base0 = :base0"),
    @NamedQuery(name = "BrAchat.findByTva0", query = "SELECT b FROM BrAchat b WHERE b.tva0 = :tva0"),
    @NamedQuery(name = "BrAchat.findByBase12", query = "SELECT b FROM BrAchat b WHERE b.base12 = :base12"),
    @NamedQuery(name = "BrAchat.findByTva12", query = "SELECT b FROM BrAchat b WHERE b.tva12 = :tva12"),
    @NamedQuery(name = "BrAchat.findByBase18", query = "SELECT b FROM BrAchat b WHERE b.base18 = :base18"),
    @NamedQuery(name = "BrAchat.findByTva18", query = "SELECT b FROM BrAchat b WHERE b.tva18 = :tva18"),
    @NamedQuery(name = "BrAchat.findByBase29", query = "SELECT b FROM BrAchat b WHERE b.base29 = :base29"),
    @NamedQuery(name = "BrAchat.findByTva29", query = "SELECT b FROM BrAchat b WHERE b.tva29 = :tva29"),
    @NamedQuery(name = "BrAchat.findByNetletre", query = "SELECT b FROM BrAchat b WHERE b.netletre = :netletre")})
public class BrAchat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idbr_achat")
    private Integer idbrAchat;
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
    @Size(max = 255)
    @Column(name = "netletre")
    private String netletre;
    @JoinColumn(name = "idutilisateur", referencedColumnName = "idutilisateurs")
    @ManyToOne
    private Utilisateurs idutilisateur;
    @JoinColumn(name = "idfrs", referencedColumnName = "idfournisseur")
    @ManyToOne
    private Fournisseur idfrs;
    @OneToMany(mappedBy = "idbr")
    private Collection<ReglementAchat> reglementAchatCollection;
    @OneToMany(mappedBy = "idbrachat")
    private Collection<LigneBrAchat> ligneBrAchatCollection;

    public BrAchat() {
    }

    public BrAchat(Integer idbrAchat) {
        this.idbrAchat = idbrAchat;
    }

    public Integer getIdbrAchat() {
        return idbrAchat;
    }

    public void setIdbrAchat(Integer idbrAchat) {
        this.idbrAchat = idbrAchat;
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

    public String getNetletre() {
        return netletre;
    }

    public void setNetletre(String netletre) {
        this.netletre = netletre;
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

    @XmlTransient
    public Collection<LigneBrAchat> getLigneBrAchatCollection() {
        return ligneBrAchatCollection;
    }

    public void setLigneBrAchatCollection(Collection<LigneBrAchat> ligneBrAchatCollection) {
        this.ligneBrAchatCollection = ligneBrAchatCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbrAchat != null ? idbrAchat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BrAchat)) {
            return false;
        }
        BrAchat other = (BrAchat) object;
        if ((this.idbrAchat == null && other.idbrAchat != null) || (this.idbrAchat != null && !this.idbrAchat.equals(other.idbrAchat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.BrAchat[ idbrAchat=" + idbrAchat + " ]";
    }
    
}
