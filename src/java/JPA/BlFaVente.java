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
@Table(name = "bl_fa_vente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BlFaVente.findAll", query = "SELECT b FROM BlFaVente b"),
    @NamedQuery(name = "BlFaVente.findByIdblFaVente", query = "SELECT b FROM BlFaVente b WHERE b.idblFaVente = :idblFaVente"),
    @NamedQuery(name = "BlFaVente.findByNumpiece", query = "SELECT b FROM BlFaVente b WHERE b.numpiece = :numpiece"),
    @NamedQuery(name = "BlFaVente.findByDatepiece", query = "SELECT b FROM BlFaVente b WHERE b.datepiece = :datepiece"),
    @NamedQuery(name = "BlFaVente.findByMontantht", query = "SELECT b FROM BlFaVente b WHERE b.montantht = :montantht"),
    @NamedQuery(name = "BlFaVente.findByMontanttva", query = "SELECT b FROM BlFaVente b WHERE b.montanttva = :montanttva"),
    @NamedQuery(name = "BlFaVente.findByMontantttc", query = "SELECT b FROM BlFaVente b WHERE b.montantttc = :montantttc"),
    @NamedQuery(name = "BlFaVente.findByMontantregler", query = "SELECT b FROM BlFaVente b WHERE b.montantregler = :montantregler"),
    @NamedQuery(name = "BlFaVente.findByValider", query = "SELECT b FROM BlFaVente b WHERE b.valider = :valider"),
    @NamedQuery(name = "BlFaVente.findByRemiseglobal", query = "SELECT b FROM BlFaVente b WHERE b.remiseglobal = :remiseglobal"),
    @NamedQuery(name = "BlFaVente.findByBenefice", query = "SELECT b FROM BlFaVente b WHERE b.benefice = :benefice"),
    @NamedQuery(name = "BlFaVente.findByTypepiece", query = "SELECT b FROM BlFaVente b WHERE b.typepiece = :typepiece"),
    @NamedQuery(name = "BlFaVente.findByNetht", query = "SELECT b FROM BlFaVente b WHERE b.netht = :netht"),
    @NamedQuery(name = "BlFaVente.findByTotalremise", query = "SELECT b FROM BlFaVente b WHERE b.totalremise = :totalremise"),
    @NamedQuery(name = "BlFaVente.findByRemisecomptant", query = "SELECT b FROM BlFaVente b WHERE b.remisecomptant = :remisecomptant"),
    @NamedQuery(name = "BlFaVente.findByFodec", query = "SELECT b FROM BlFaVente b WHERE b.fodec = :fodec"),
    @NamedQuery(name = "BlFaVente.findByDroitc", query = "SELECT b FROM BlFaVente b WHERE b.droitc = :droitc"),
    @NamedQuery(name = "BlFaVente.findByTimbre", query = "SELECT b FROM BlFaVente b WHERE b.timbre = :timbre"),
    @NamedQuery(name = "BlFaVente.findByNetttc", query = "SELECT b FROM BlFaVente b WHERE b.netttc = :netttc"),
    @NamedQuery(name = "BlFaVente.findByValeurremiseg", query = "SELECT b FROM BlFaVente b WHERE b.valeurremiseg = :valeurremiseg"),
    @NamedQuery(name = "BlFaVente.findByValeurremiscompt", query = "SELECT b FROM BlFaVente b WHERE b.valeurremiscompt = :valeurremiscompt"),
    @NamedQuery(name = "BlFaVente.findByNetletre", query = "SELECT b FROM BlFaVente b WHERE b.netletre = :netletre"),
    @NamedQuery(name = "BlFaVente.findByBase0", query = "SELECT b FROM BlFaVente b WHERE b.base0 = :base0"),
    @NamedQuery(name = "BlFaVente.findByTva0", query = "SELECT b FROM BlFaVente b WHERE b.tva0 = :tva0"),
    @NamedQuery(name = "BlFaVente.findByBase12", query = "SELECT b FROM BlFaVente b WHERE b.base12 = :base12"),
    @NamedQuery(name = "BlFaVente.findByTva12", query = "SELECT b FROM BlFaVente b WHERE b.tva12 = :tva12"),
    @NamedQuery(name = "BlFaVente.findByBase18", query = "SELECT b FROM BlFaVente b WHERE b.base18 = :base18"),
    @NamedQuery(name = "BlFaVente.findByTva18", query = "SELECT b FROM BlFaVente b WHERE b.tva18 = :tva18"),
    @NamedQuery(name = "BlFaVente.findByBase29", query = "SELECT b FROM BlFaVente b WHERE b.base29 = :base29"),
    @NamedQuery(name = "BlFaVente.findByTva29", query = "SELECT b FROM BlFaVente b WHERE b.tva29 = :tva29")})
public class BlFaVente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idbl_fa_vente")
    private Integer idblFaVente;
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
    @Column(name = "benefice")
    private BigDecimal benefice;
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
    @OneToMany(mappedBy = "idblfavente")
    private Collection<LigneBlFaVente> ligneBlFaVenteCollection;
    @OneToMany(mappedBy = "idblfavente")
    private Collection<ReglementVente> reglementVenteCollection;
    @JoinColumn(name = "idutilisateur", referencedColumnName = "idutilisateurs")
    @ManyToOne
    private Utilisateurs idutilisateur;
    @JoinColumn(name = "idcommercial", referencedColumnName = "idcommercial")
    @ManyToOne
    private Commercial idcommercial;
    @JoinColumn(name = "idclient", referencedColumnName = "idclient")
    @ManyToOne
    private Client idclient;

    public BlFaVente() {
    }

    public BlFaVente(Integer idblFaVente) {
        this.idblFaVente = idblFaVente;
    }

    public Integer getIdblFaVente() {
        return idblFaVente;
    }

    public void setIdblFaVente(Integer idblFaVente) {
        this.idblFaVente = idblFaVente;
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

    public BigDecimal getBenefice() {
        return benefice;
    }

    public void setBenefice(BigDecimal benefice) {
        this.benefice = benefice;
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
    public Collection<LigneBlFaVente> getLigneBlFaVenteCollection() {
        return ligneBlFaVenteCollection;
    }

    public void setLigneBlFaVenteCollection(Collection<LigneBlFaVente> ligneBlFaVenteCollection) {
        this.ligneBlFaVenteCollection = ligneBlFaVenteCollection;
    }

    @XmlTransient
    public Collection<ReglementVente> getReglementVenteCollection() {
        return reglementVenteCollection;
    }

    public void setReglementVenteCollection(Collection<ReglementVente> reglementVenteCollection) {
        this.reglementVenteCollection = reglementVenteCollection;
    }

    public Utilisateurs getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(Utilisateurs idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public Commercial getIdcommercial() {
        return idcommercial;
    }

    public void setIdcommercial(Commercial idcommercial) {
        this.idcommercial = idcommercial;
    }

    public Client getIdclient() {
        return idclient;
    }

    public void setIdclient(Client idclient) {
        this.idclient = idclient;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idblFaVente != null ? idblFaVente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BlFaVente)) {
            return false;
        }
        BlFaVente other = (BlFaVente) object;
        if ((this.idblFaVente == null && other.idblFaVente != null) || (this.idblFaVente != null && !this.idblFaVente.equals(other.idblFaVente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.BlFaVente[ idblFaVente=" + idblFaVente + " ]";
    }
    
}
