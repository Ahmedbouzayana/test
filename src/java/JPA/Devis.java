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
@Table(name = "devis")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Devis.findAll", query = "SELECT d FROM Devis d"),
    @NamedQuery(name = "Devis.findByIddevis", query = "SELECT d FROM Devis d WHERE d.iddevis = :iddevis"),
    @NamedQuery(name = "Devis.findByNumpiece", query = "SELECT d FROM Devis d WHERE d.numpiece = :numpiece"),
    @NamedQuery(name = "Devis.findByNumpiecesource", query = "SELECT d FROM Devis d WHERE d.numpiecesource = :numpiecesource"),
    @NamedQuery(name = "Devis.findByDatepiece", query = "SELECT d FROM Devis d WHERE d.datepiece = :datepiece"),
    @NamedQuery(name = "Devis.findByMontantht", query = "SELECT d FROM Devis d WHERE d.montantht = :montantht"),
    @NamedQuery(name = "Devis.findByMontanttva", query = "SELECT d FROM Devis d WHERE d.montanttva = :montanttva"),
    @NamedQuery(name = "Devis.findByMontantttc", query = "SELECT d FROM Devis d WHERE d.montantttc = :montantttc"),
    @NamedQuery(name = "Devis.findByMontantregler", query = "SELECT d FROM Devis d WHERE d.montantregler = :montantregler"),
    @NamedQuery(name = "Devis.findByValider", query = "SELECT d FROM Devis d WHERE d.valider = :valider"),
    @NamedQuery(name = "Devis.findByRemiseglobal", query = "SELECT d FROM Devis d WHERE d.remiseglobal = :remiseglobal"),
    @NamedQuery(name = "Devis.findByBenefice", query = "SELECT d FROM Devis d WHERE d.benefice = :benefice"),
    @NamedQuery(name = "Devis.findByTypepiece", query = "SELECT d FROM Devis d WHERE d.typepiece = :typepiece"),
    @NamedQuery(name = "Devis.findByNetht", query = "SELECT d FROM Devis d WHERE d.netht = :netht"),
    @NamedQuery(name = "Devis.findByTotalremise", query = "SELECT d FROM Devis d WHERE d.totalremise = :totalremise"),
    @NamedQuery(name = "Devis.findByRemisecomptant", query = "SELECT d FROM Devis d WHERE d.remisecomptant = :remisecomptant"),
    @NamedQuery(name = "Devis.findByFodec", query = "SELECT d FROM Devis d WHERE d.fodec = :fodec"),
    @NamedQuery(name = "Devis.findByDroitc", query = "SELECT d FROM Devis d WHERE d.droitc = :droitc"),
    @NamedQuery(name = "Devis.findByTimbre", query = "SELECT d FROM Devis d WHERE d.timbre = :timbre"),
    @NamedQuery(name = "Devis.findByNetttc", query = "SELECT d FROM Devis d WHERE d.netttc = :netttc"),
    @NamedQuery(name = "Devis.findByValeurremiseg", query = "SELECT d FROM Devis d WHERE d.valeurremiseg = :valeurremiseg"),
    @NamedQuery(name = "Devis.findByValeurremiscompt", query = "SELECT d FROM Devis d WHERE d.valeurremiscompt = :valeurremiscompt"),
    @NamedQuery(name = "Devis.findByNetletre", query = "SELECT d FROM Devis d WHERE d.netletre = :netletre"),
    @NamedQuery(name = "Devis.findByBase0", query = "SELECT d FROM Devis d WHERE d.base0 = :base0"),
    @NamedQuery(name = "Devis.findByTva0", query = "SELECT d FROM Devis d WHERE d.tva0 = :tva0"),
    @NamedQuery(name = "Devis.findByBase12", query = "SELECT d FROM Devis d WHERE d.base12 = :base12"),
    @NamedQuery(name = "Devis.findByTva12", query = "SELECT d FROM Devis d WHERE d.tva12 = :tva12"),
    @NamedQuery(name = "Devis.findByBase18", query = "SELECT d FROM Devis d WHERE d.base18 = :base18"),
    @NamedQuery(name = "Devis.findByTva18", query = "SELECT d FROM Devis d WHERE d.tva18 = :tva18"),
    @NamedQuery(name = "Devis.findByBase29", query = "SELECT d FROM Devis d WHERE d.base29 = :base29"),
    @NamedQuery(name = "Devis.findByTva29", query = "SELECT d FROM Devis d WHERE d.tva29 = :tva29")})
public class Devis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddevis")
    private Integer iddevis;
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
    @JoinColumn(name = "idutilisateur", referencedColumnName = "idutilisateurs")
    @ManyToOne
    private Utilisateurs idutilisateur;
    @JoinColumn(name = "idcommercial", referencedColumnName = "idcommercial")
    @ManyToOne
    private Commercial idcommercial;
    @JoinColumn(name = "idclient", referencedColumnName = "idclient")
    @ManyToOne
    private Client idclient;
    @OneToMany(mappedBy = "iddevis")
    private Collection<LigneDevis> ligneDevisCollection;

    public Devis() {
    }

    public Devis(Integer iddevis) {
        this.iddevis = iddevis;
    }

    public Integer getIddevis() {
        return iddevis;
    }

    public void setIddevis(Integer iddevis) {
        this.iddevis = iddevis;
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

    @XmlTransient
    public Collection<LigneDevis> getLigneDevisCollection() {
        return ligneDevisCollection;
    }

    public void setLigneDevisCollection(Collection<LigneDevis> ligneDevisCollection) {
        this.ligneDevisCollection = ligneDevisCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddevis != null ? iddevis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Devis)) {
            return false;
        }
        Devis other = (Devis) object;
        if ((this.iddevis == null && other.iddevis != null) || (this.iddevis != null && !this.iddevis.equals(other.iddevis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Devis[ iddevis=" + iddevis + " ]";
    }
    
}
