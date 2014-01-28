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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mrs2a
 */
@Entity
@Table(name = "ligne_avoir_a")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LigneAvoirA.findAll", query = "SELECT l FROM LigneAvoirA l"),
    @NamedQuery(name = "LigneAvoirA.findByIdligneAvoirA", query = "SELECT l FROM LigneAvoirA l WHERE l.idligneAvoirA = :idligneAvoirA"),
    @NamedQuery(name = "LigneAvoirA.findByPrixuht", query = "SELECT l FROM LigneAvoirA l WHERE l.prixuht = :prixuht"),
    @NamedQuery(name = "LigneAvoirA.findByTtva", query = "SELECT l FROM LigneAvoirA l WHERE l.ttva = :ttva"),
    @NamedQuery(name = "LigneAvoirA.findByPrixuttc", query = "SELECT l FROM LigneAvoirA l WHERE l.prixuttc = :prixuttc"),
    @NamedQuery(name = "LigneAvoirA.findByQte", query = "SELECT l FROM LigneAvoirA l WHERE l.qte = :qte"),
    @NamedQuery(name = "LigneAvoirA.findByTotalht", query = "SELECT l FROM LigneAvoirA l WHERE l.totalht = :totalht"),
    @NamedQuery(name = "LigneAvoirA.findByTotalttc", query = "SELECT l FROM LigneAvoirA l WHERE l.totalttc = :totalttc"),
    @NamedQuery(name = "LigneAvoirA.findByRemise", query = "SELECT l FROM LigneAvoirA l WHERE l.remise = :remise"),
    @NamedQuery(name = "LigneAvoirA.findByNetht", query = "SELECT l FROM LigneAvoirA l WHERE l.netht = :netht"),
    @NamedQuery(name = "LigneAvoirA.findByNetttc", query = "SELECT l FROM LigneAvoirA l WHERE l.netttc = :netttc"),
    @NamedQuery(name = "LigneAvoirA.findByBenefice", query = "SELECT l FROM LigneAvoirA l WHERE l.benefice = :benefice"),
    @NamedQuery(name = "LigneAvoirA.findByQtegratuit", query = "SELECT l FROM LigneAvoirA l WHERE l.qtegratuit = :qtegratuit"),
    @NamedQuery(name = "LigneAvoirA.findByAncienremise", query = "SELECT l FROM LigneAvoirA l WHERE l.ancienremise = :ancienremise"),
    @NamedQuery(name = "LigneAvoirA.findByFodec", query = "SELECT l FROM LigneAvoirA l WHERE l.fodec = :fodec"),
    @NamedQuery(name = "LigneAvoirA.findByDroitc", query = "SELECT l FROM LigneAvoirA l WHERE l.droitc = :droitc"),
    @NamedQuery(name = "LigneAvoirA.findByNvprixventeht", query = "SELECT l FROM LigneAvoirA l WHERE l.nvprixventeht = :nvprixventeht")})
public class LigneAvoirA implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idligne_avoir_a")
    private Integer idligneAvoirA;
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
    @Column(name = "benefice")
    private BigDecimal benefice;
    @Column(name = "qtegratuit")
    private Integer qtegratuit;
    @Column(name = "ancienremise")
    private BigDecimal ancienremise;
    @Column(name = "fodec")
    private Integer fodec;
    @Column(name = "droitc")
    private Integer droitc;
    @Column(name = "nvprixventeht")
    private BigDecimal nvprixventeht;
    @JoinColumn(name = "idproduit", referencedColumnName = "idproduit")
    @ManyToOne
    private Produit idproduit;
    @JoinColumn(name = "idavoir_a", referencedColumnName = "idavoir_a")
    @ManyToOne
    private AvoirA idavoirA;

    public LigneAvoirA() {
    }

    public LigneAvoirA(Integer idligneAvoirA) {
        this.idligneAvoirA = idligneAvoirA;
    }

    public Integer getIdligneAvoirA() {
        return idligneAvoirA;
    }

    public void setIdligneAvoirA(Integer idligneAvoirA) {
        this.idligneAvoirA = idligneAvoirA;
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

    public BigDecimal getBenefice() {
        return benefice;
    }

    public void setBenefice(BigDecimal benefice) {
        this.benefice = benefice;
    }

    public Integer getQtegratuit() {
        return qtegratuit;
    }

    public void setQtegratuit(Integer qtegratuit) {
        this.qtegratuit = qtegratuit;
    }

    public BigDecimal getAncienremise() {
        return ancienremise;
    }

    public void setAncienremise(BigDecimal ancienremise) {
        this.ancienremise = ancienremise;
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

    public BigDecimal getNvprixventeht() {
        return nvprixventeht;
    }

    public void setNvprixventeht(BigDecimal nvprixventeht) {
        this.nvprixventeht = nvprixventeht;
    }

    public Produit getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(Produit idproduit) {
        this.idproduit = idproduit;
    }

    public AvoirA getIdavoirA() {
        return idavoirA;
    }

    public void setIdavoirA(AvoirA idavoirA) {
        this.idavoirA = idavoirA;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idligneAvoirA != null ? idligneAvoirA.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LigneAvoirA)) {
            return false;
        }
        LigneAvoirA other = (LigneAvoirA) object;
        if ((this.idligneAvoirA == null && other.idligneAvoirA != null) || (this.idligneAvoirA != null && !this.idligneAvoirA.equals(other.idligneAvoirA))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.LigneAvoirA[ idligneAvoirA=" + idligneAvoirA + " ]";
    }
    
}
