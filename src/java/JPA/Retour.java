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
@Table(name = "retour")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Retour.findAll", query = "SELECT r FROM Retour r"),
    @NamedQuery(name = "Retour.findByIdretour", query = "SELECT r FROM Retour r WHERE r.idretour = :idretour"),
    @NamedQuery(name = "Retour.findByNumpiece", query = "SELECT r FROM Retour r WHERE r.numpiece = :numpiece"),
    @NamedQuery(name = "Retour.findByNumpiecesource", query = "SELECT r FROM Retour r WHERE r.numpiecesource = :numpiecesource"),
    @NamedQuery(name = "Retour.findByDatepiece", query = "SELECT r FROM Retour r WHERE r.datepiece = :datepiece"),
    @NamedQuery(name = "Retour.findByMontantht", query = "SELECT r FROM Retour r WHERE r.montantht = :montantht"),
    @NamedQuery(name = "Retour.findByMontanttva", query = "SELECT r FROM Retour r WHERE r.montanttva = :montanttva"),
    @NamedQuery(name = "Retour.findByMontantttc", query = "SELECT r FROM Retour r WHERE r.montantttc = :montantttc"),
    @NamedQuery(name = "Retour.findByMontantregler", query = "SELECT r FROM Retour r WHERE r.montantregler = :montantregler"),
    @NamedQuery(name = "Retour.findByValider", query = "SELECT r FROM Retour r WHERE r.valider = :valider"),
    @NamedQuery(name = "Retour.findByRemiseglobal", query = "SELECT r FROM Retour r WHERE r.remiseglobal = :remiseglobal"),
    @NamedQuery(name = "Retour.findByBenefice", query = "SELECT r FROM Retour r WHERE r.benefice = :benefice"),
    @NamedQuery(name = "Retour.findByTypepiece", query = "SELECT r FROM Retour r WHERE r.typepiece = :typepiece"),
    @NamedQuery(name = "Retour.findByNetht", query = "SELECT r FROM Retour r WHERE r.netht = :netht"),
    @NamedQuery(name = "Retour.findByTotalremise", query = "SELECT r FROM Retour r WHERE r.totalremise = :totalremise"),
    @NamedQuery(name = "Retour.findByRemisecomptant", query = "SELECT r FROM Retour r WHERE r.remisecomptant = :remisecomptant"),
    @NamedQuery(name = "Retour.findByFodec", query = "SELECT r FROM Retour r WHERE r.fodec = :fodec"),
    @NamedQuery(name = "Retour.findByDroitc", query = "SELECT r FROM Retour r WHERE r.droitc = :droitc"),
    @NamedQuery(name = "Retour.findByTimbre", query = "SELECT r FROM Retour r WHERE r.timbre = :timbre"),
    @NamedQuery(name = "Retour.findByNetttc", query = "SELECT r FROM Retour r WHERE r.netttc = :netttc"),
    @NamedQuery(name = "Retour.findByValeurremiseg", query = "SELECT r FROM Retour r WHERE r.valeurremiseg = :valeurremiseg"),
    @NamedQuery(name = "Retour.findByValeurremiscompt", query = "SELECT r FROM Retour r WHERE r.valeurremiscompt = :valeurremiscompt"),
    @NamedQuery(name = "Retour.findByNetletre", query = "SELECT r FROM Retour r WHERE r.netletre = :netletre")})
public class Retour implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idretour")
    private Integer idretour;
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
    @JoinColumn(name = "idutilisateur", referencedColumnName = "idutilisateurs")
    @ManyToOne
    private Utilisateurs idutilisateur;
    @JoinColumn(name = "idcommercial", referencedColumnName = "idcommercial")
    @ManyToOne
    private Commercial idcommercial;
    @JoinColumn(name = "idclient", referencedColumnName = "idclient")
    @ManyToOne
    private Client idclient;
    @OneToMany(mappedBy = "idretour")
    private Collection<ReglementVente> reglementVenteCollection;
    @OneToMany(mappedBy = "idretour")
    private Collection<LigneRetour> ligneRetourCollection;

    public Retour() {
    }

    public Retour(Integer idretour) {
        this.idretour = idretour;
    }

    public Integer getIdretour() {
        return idretour;
    }

    public void setIdretour(Integer idretour) {
        this.idretour = idretour;
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
    public Collection<ReglementVente> getReglementVenteCollection() {
        return reglementVenteCollection;
    }

    public void setReglementVenteCollection(Collection<ReglementVente> reglementVenteCollection) {
        this.reglementVenteCollection = reglementVenteCollection;
    }

    @XmlTransient
    public Collection<LigneRetour> getLigneRetourCollection() {
        return ligneRetourCollection;
    }

    public void setLigneRetourCollection(Collection<LigneRetour> ligneRetourCollection) {
        this.ligneRetourCollection = ligneRetourCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idretour != null ? idretour.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Retour)) {
            return false;
        }
        Retour other = (Retour) object;
        if ((this.idretour == null && other.idretour != null) || (this.idretour != null && !this.idretour.equals(other.idretour))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Retour[ idretour=" + idretour + " ]";
    }
    
}
