/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JPA;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mrs2a
 */
@Entity
@Table(name = "ligne_devis")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LigneDevis.findAll", query = "SELECT l FROM LigneDevis l"),
    @NamedQuery(name = "LigneDevis.findByIdligneDevis", query = "SELECT l FROM LigneDevis l WHERE l.idligneDevis = :idligneDevis"),
    @NamedQuery(name = "LigneDevis.findByPrixuht", query = "SELECT l FROM LigneDevis l WHERE l.prixuht = :prixuht"),
    @NamedQuery(name = "LigneDevis.findByTtva", query = "SELECT l FROM LigneDevis l WHERE l.ttva = :ttva"),
    @NamedQuery(name = "LigneDevis.findByPrixuttc", query = "SELECT l FROM LigneDevis l WHERE l.prixuttc = :prixuttc"),
    @NamedQuery(name = "LigneDevis.findByQte", query = "SELECT l FROM LigneDevis l WHERE l.qte = :qte"),
    @NamedQuery(name = "LigneDevis.findByTotalht", query = "SELECT l FROM LigneDevis l WHERE l.totalht = :totalht"),
    @NamedQuery(name = "LigneDevis.findByTotalttc", query = "SELECT l FROM LigneDevis l WHERE l.totalttc = :totalttc"),
    @NamedQuery(name = "LigneDevis.findByRemise", query = "SELECT l FROM LigneDevis l WHERE l.remise = :remise"),
    @NamedQuery(name = "LigneDevis.findByNetht", query = "SELECT l FROM LigneDevis l WHERE l.netht = :netht"),
    @NamedQuery(name = "LigneDevis.findByNetttc", query = "SELECT l FROM LigneDevis l WHERE l.netttc = :netttc"),
    @NamedQuery(name = "LigneDevis.findByQtegratuit", query = "SELECT l FROM LigneDevis l WHERE l.qtegratuit = :qtegratuit"),
    @NamedQuery(name = "LigneDevis.findByBenefice", query = "SELECT l FROM LigneDevis l WHERE l.benefice = :benefice"),
    @NamedQuery(name = "LigneDevis.findByFodec", query = "SELECT l FROM LigneDevis l WHERE l.fodec = :fodec"),
    @NamedQuery(name = "LigneDevis.findByDroitc", query = "SELECT l FROM LigneDevis l WHERE l.droitc = :droitc"),
    @NamedQuery(name = "LigneDevis.findByDesegnation", query = "SELECT l FROM LigneDevis l WHERE l.desegnation = :desegnation")})
public class LigneDevis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idligne_devis")
    private Integer idligneDevis;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "prixuht")
    private BigDecimal prixuht;
    @Column(name = "ttva")
    private BigDecimal ttva;
    @Column(name = "prixuttc")
    private BigDecimal prixuttc;
    @Column(name = "qte")
    private Integer qte;
    @Column(name = "totalht")
    private BigDecimal totalht;
    @Column(name = "totalttc")
    private BigDecimal totalttc;
    @Column(name = "remise")
    private BigDecimal remise;
    @Column(name = "netht")
    private BigDecimal netht;
    @Column(name = "netttc")
    private BigDecimal netttc;
    @Column(name = "qtegratuit")
    private Integer qtegratuit;
    @Column(name = "benefice")
    private BigDecimal benefice;
    @Column(name = "fodec")
    private Integer fodec;
    @Column(name = "droitc")
    private Integer droitc;
    @Size(max = 255)
    @Column(name = "desegnation")
    private String desegnation;
    @JoinColumn(name = "idproduit", referencedColumnName = "idproduit")
    @ManyToOne
    private Produit idproduit;
    @JoinColumn(name = "iddevis", referencedColumnName = "iddevis")
    @ManyToOne
    private Devis iddevis;

    public LigneDevis() {
    }

    public LigneDevis(Integer idligneDevis) {
        this.idligneDevis = idligneDevis;
    }

    public Integer getIdligneDevis() {
        return idligneDevis;
    }

    public void setIdligneDevis(Integer idligneDevis) {
        this.idligneDevis = idligneDevis;
    }

    public BigDecimal getPrixuht() {
        return prixuht;
    }

    public void setPrixuht(BigDecimal prixuht) {
        this.prixuht = prixuht;
    }

    public BigDecimal getTtva() {
        return ttva;
    }

    public void setTtva(BigDecimal ttva) {
        this.ttva = ttva;
    }

    public BigDecimal getPrixuttc() {
        return prixuttc;
    }

    public void setPrixuttc(BigDecimal prixuttc) {
        this.prixuttc = prixuttc;
    }

    public Integer getQte() {
        return qte;
    }

    public void setQte(Integer qte) {
        this.qte = qte;
    }

    public BigDecimal getTotalht() {
        return totalht;
    }

    public void setTotalht(BigDecimal totalht) {
        this.totalht = totalht;
    }

    public BigDecimal getTotalttc() {
        return totalttc;
    }

    public void setTotalttc(BigDecimal totalttc) {
        this.totalttc = totalttc;
    }

    public BigDecimal getRemise() {
        return remise;
    }

    public void setRemise(BigDecimal remise) {
        this.remise = remise;
    }

    public BigDecimal getNetht() {
        return netht;
    }

    public void setNetht(BigDecimal netht) {
        this.netht = netht;
    }

    public BigDecimal getNetttc() {
        return netttc;
    }

    public void setNetttc(BigDecimal netttc) {
        this.netttc = netttc;
    }

    public Integer getQtegratuit() {
        return qtegratuit;
    }

    public void setQtegratuit(Integer qtegratuit) {
        this.qtegratuit = qtegratuit;
    }

    public BigDecimal getBenefice() {
        return benefice;
    }

    public void setBenefice(BigDecimal benefice) {
        this.benefice = benefice;
    }

    public Integer getFodec() {
        return fodec;
    }

    public void setFodec(Integer fodec) {
        this.fodec = fodec;
    }

    public Integer getDroitc() {
        return droitc;
    }

    public void setDroitc(Integer droitc) {
        this.droitc = droitc;
    }

    public String getDesegnation() {
        return desegnation;
    }

    public void setDesegnation(String desegnation) {
        this.desegnation = desegnation;
    }

    public Produit getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(Produit idproduit) {
        this.idproduit = idproduit;
    }

    public Devis getIddevis() {
        return iddevis;
    }

    public void setIddevis(Devis iddevis) {
        this.iddevis = iddevis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idligneDevis != null ? idligneDevis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LigneDevis)) {
            return false;
        }
        LigneDevis other = (LigneDevis) object;
        if ((this.idligneDevis == null && other.idligneDevis != null) || (this.idligneDevis != null && !this.idligneDevis.equals(other.idligneDevis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.LigneDevis[ idligneDevis=" + idligneDevis + " ]";
    }
    
}
