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
@Table(name = "ligne_avoir")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LigneAvoir.findAll", query = "SELECT l FROM LigneAvoir l"),
    @NamedQuery(name = "LigneAvoir.findByIdligneAvoir", query = "SELECT l FROM LigneAvoir l WHERE l.idligneAvoir = :idligneAvoir"),
    @NamedQuery(name = "LigneAvoir.findByPrixuht", query = "SELECT l FROM LigneAvoir l WHERE l.prixuht = :prixuht"),
    @NamedQuery(name = "LigneAvoir.findByTtva", query = "SELECT l FROM LigneAvoir l WHERE l.ttva = :ttva"),
    @NamedQuery(name = "LigneAvoir.findByPrixuttc", query = "SELECT l FROM LigneAvoir l WHERE l.prixuttc = :prixuttc"),
    @NamedQuery(name = "LigneAvoir.findByQte", query = "SELECT l FROM LigneAvoir l WHERE l.qte = :qte"),
    @NamedQuery(name = "LigneAvoir.findByTotalht", query = "SELECT l FROM LigneAvoir l WHERE l.totalht = :totalht"),
    @NamedQuery(name = "LigneAvoir.findByTotalttc", query = "SELECT l FROM LigneAvoir l WHERE l.totalttc = :totalttc"),
    @NamedQuery(name = "LigneAvoir.findByRemise", query = "SELECT l FROM LigneAvoir l WHERE l.remise = :remise"),
    @NamedQuery(name = "LigneAvoir.findByNetht", query = "SELECT l FROM LigneAvoir l WHERE l.netht = :netht"),
    @NamedQuery(name = "LigneAvoir.findByNetttc", query = "SELECT l FROM LigneAvoir l WHERE l.netttc = :netttc"),
    @NamedQuery(name = "LigneAvoir.findByQtegratuit", query = "SELECT l FROM LigneAvoir l WHERE l.qtegratuit = :qtegratuit"),
    @NamedQuery(name = "LigneAvoir.findByBenefice", query = "SELECT l FROM LigneAvoir l WHERE l.benefice = :benefice"),
    @NamedQuery(name = "LigneAvoir.findByFodec", query = "SELECT l FROM LigneAvoir l WHERE l.fodec = :fodec"),
    @NamedQuery(name = "LigneAvoir.findByDroitc", query = "SELECT l FROM LigneAvoir l WHERE l.droitc = :droitc")})
public class LigneAvoir implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idligne_avoir")
    private Integer idligneAvoir;
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
    @JoinColumn(name = "idproduit", referencedColumnName = "idproduit")
    @ManyToOne
    private Produit idproduit;
    @JoinColumn(name = "idavoir", referencedColumnName = "idavoir")
    @ManyToOne
    private Avoir idavoir;

    public LigneAvoir() {
    }

    public LigneAvoir(Integer idligneAvoir) {
        this.idligneAvoir = idligneAvoir;
    }

    public Integer getIdligneAvoir() {
        return idligneAvoir;
    }

    public void setIdligneAvoir(Integer idligneAvoir) {
        this.idligneAvoir = idligneAvoir;
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

    public Produit getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(Produit idproduit) {
        this.idproduit = idproduit;
    }

    public Avoir getIdavoir() {
        return idavoir;
    }

    public void setIdavoir(Avoir idavoir) {
        this.idavoir = idavoir;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idligneAvoir != null ? idligneAvoir.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LigneAvoir)) {
            return false;
        }
        LigneAvoir other = (LigneAvoir) object;
        if ((this.idligneAvoir == null && other.idligneAvoir != null) || (this.idligneAvoir != null && !this.idligneAvoir.equals(other.idligneAvoir))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.LigneAvoir[ idligneAvoir=" + idligneAvoir + " ]";
    }
    
}
