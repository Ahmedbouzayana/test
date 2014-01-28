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
@Table(name = "avoir")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Avoir.findAll", query = "SELECT a FROM Avoir a"),
    @NamedQuery(name = "Avoir.findByIdavoir", query = "SELECT a FROM Avoir a WHERE a.idavoir = :idavoir"),
    @NamedQuery(name = "Avoir.findByNumpiece", query = "SELECT a FROM Avoir a WHERE a.numpiece = :numpiece"),
    @NamedQuery(name = "Avoir.findByNumpiecesource", query = "SELECT a FROM Avoir a WHERE a.numpiecesource = :numpiecesource"),
    @NamedQuery(name = "Avoir.findByDatepiece", query = "SELECT a FROM Avoir a WHERE a.datepiece = :datepiece"),
    @NamedQuery(name = "Avoir.findByMontantht", query = "SELECT a FROM Avoir a WHERE a.montantht = :montantht"),
    @NamedQuery(name = "Avoir.findByMontanttva", query = "SELECT a FROM Avoir a WHERE a.montanttva = :montanttva"),
    @NamedQuery(name = "Avoir.findByMontantttc", query = "SELECT a FROM Avoir a WHERE a.montantttc = :montantttc"),
    @NamedQuery(name = "Avoir.findByMontantregler", query = "SELECT a FROM Avoir a WHERE a.montantregler = :montantregler"),
    @NamedQuery(name = "Avoir.findByValider", query = "SELECT a FROM Avoir a WHERE a.valider = :valider"),
    @NamedQuery(name = "Avoir.findByRemiseglobal", query = "SELECT a FROM Avoir a WHERE a.remiseglobal = :remiseglobal"),
    @NamedQuery(name = "Avoir.findByBenefice", query = "SELECT a FROM Avoir a WHERE a.benefice = :benefice"),
    @NamedQuery(name = "Avoir.findByTypepiece", query = "SELECT a FROM Avoir a WHERE a.typepiece = :typepiece"),
    @NamedQuery(name = "Avoir.findByNetht", query = "SELECT a FROM Avoir a WHERE a.netht = :netht"),
    @NamedQuery(name = "Avoir.findByTotalremise", query = "SELECT a FROM Avoir a WHERE a.totalremise = :totalremise"),
    @NamedQuery(name = "Avoir.findByRemisecomptant", query = "SELECT a FROM Avoir a WHERE a.remisecomptant = :remisecomptant"),
    @NamedQuery(name = "Avoir.findByFodec", query = "SELECT a FROM Avoir a WHERE a.fodec = :fodec"),
    @NamedQuery(name = "Avoir.findByDroitc", query = "SELECT a FROM Avoir a WHERE a.droitc = :droitc"),
    @NamedQuery(name = "Avoir.findByTimbre", query = "SELECT a FROM Avoir a WHERE a.timbre = :timbre"),
    @NamedQuery(name = "Avoir.findByNetttc", query = "SELECT a FROM Avoir a WHERE a.netttc = :netttc"),
    @NamedQuery(name = "Avoir.findByValeurremiseg", query = "SELECT a FROM Avoir a WHERE a.valeurremiseg = :valeurremiseg"),
    @NamedQuery(name = "Avoir.findByValeurremiscompt", query = "SELECT a FROM Avoir a WHERE a.valeurremiscompt = :valeurremiscompt"),
    @NamedQuery(name = "Avoir.findByNetletre", query = "SELECT a FROM Avoir a WHERE a.netletre = :netletre")})
public class Avoir implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idavoir")
    private Integer idavoir;
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
    @OneToMany(mappedBy = "idavoir")
    private Collection<LigneAvoir> ligneAvoirCollection;
    @OneToMany(mappedBy = "idavoir")
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

    public Avoir() {
    }

    public Avoir(Integer idavoir) {
        this.idavoir = idavoir;
    }

    public Integer getIdavoir() {
        return idavoir;
    }

    public void setIdavoir(Integer idavoir) {
        this.idavoir = idavoir;
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

    @XmlTransient
    public Collection<LigneAvoir> getLigneAvoirCollection() {
        return ligneAvoirCollection;
    }

    public void setLigneAvoirCollection(Collection<LigneAvoir> ligneAvoirCollection) {
        this.ligneAvoirCollection = ligneAvoirCollection;
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
        hash += (idavoir != null ? idavoir.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Avoir)) {
            return false;
        }
        Avoir other = (Avoir) object;
        if ((this.idavoir == null && other.idavoir != null) || (this.idavoir != null && !this.idavoir.equals(other.idavoir))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Avoir[ idavoir=" + idavoir + " ]";
    }
    
}
