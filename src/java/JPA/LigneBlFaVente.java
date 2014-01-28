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
@Table(name = "ligne_bl_fa_vente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LigneBlFaVente.findAll", query = "SELECT l FROM LigneBlFaVente l"),
    @NamedQuery(name = "LigneBlFaVente.findByIdligneBlFaVente", query = "SELECT l FROM LigneBlFaVente l WHERE l.idligneBlFaVente = :idligneBlFaVente"),
    @NamedQuery(name = "LigneBlFaVente.findByPrixuht", query = "SELECT l FROM LigneBlFaVente l WHERE l.prixuht = :prixuht"),
    @NamedQuery(name = "LigneBlFaVente.findByTtva", query = "SELECT l FROM LigneBlFaVente l WHERE l.ttva = :ttva"),
    @NamedQuery(name = "LigneBlFaVente.findByPrixuttc", query = "SELECT l FROM LigneBlFaVente l WHERE l.prixuttc = :prixuttc"),
    @NamedQuery(name = "LigneBlFaVente.findByQte", query = "SELECT l FROM LigneBlFaVente l WHERE l.qte = :qte"),
    @NamedQuery(name = "LigneBlFaVente.findByTotalht", query = "SELECT l FROM LigneBlFaVente l WHERE l.totalht = :totalht"),
    @NamedQuery(name = "LigneBlFaVente.findByTotalttc", query = "SELECT l FROM LigneBlFaVente l WHERE l.totalttc = :totalttc"),
    @NamedQuery(name = "LigneBlFaVente.findByRemise", query = "SELECT l FROM LigneBlFaVente l WHERE l.remise = :remise"),
    @NamedQuery(name = "LigneBlFaVente.findByNetht", query = "SELECT l FROM LigneBlFaVente l WHERE l.netht = :netht"),
    @NamedQuery(name = "LigneBlFaVente.findByNetttc", query = "SELECT l FROM LigneBlFaVente l WHERE l.netttc = :netttc"),
    @NamedQuery(name = "LigneBlFaVente.findByQtegratuit", query = "SELECT l FROM LigneBlFaVente l WHERE l.qtegratuit = :qtegratuit"),
    @NamedQuery(name = "LigneBlFaVente.findByBenefice", query = "SELECT l FROM LigneBlFaVente l WHERE l.benefice = :benefice"),
    @NamedQuery(name = "LigneBlFaVente.findByFodec", query = "SELECT l FROM LigneBlFaVente l WHERE l.fodec = :fodec"),
    @NamedQuery(name = "LigneBlFaVente.findByDroitc", query = "SELECT l FROM LigneBlFaVente l WHERE l.droitc = :droitc"),
    @NamedQuery(name = "LigneBlFaVente.findByDesegnation", query = "SELECT l FROM LigneBlFaVente l WHERE l.desegnation = :desegnation")})
public class LigneBlFaVente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idligne_bl_fa_vente")
    private Integer idligneBlFaVente;
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
    @JoinColumn(name = "idblfavente", referencedColumnName = "idbl_fa_vente")
    @ManyToOne
    private BlFaVente idblfavente;

    public LigneBlFaVente() {
    }

    public LigneBlFaVente(Integer idligneBlFaVente) {
        this.idligneBlFaVente = idligneBlFaVente;
    }

    public Integer getIdligneBlFaVente() {
        return idligneBlFaVente;
    }

    public void setIdligneBlFaVente(Integer idligneBlFaVente) {
        this.idligneBlFaVente = idligneBlFaVente;
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

    public BlFaVente getIdblfavente() {
        return idblfavente;
    }

    public void setIdblfavente(BlFaVente idblfavente) {
        this.idblfavente = idblfavente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idligneBlFaVente != null ? idligneBlFaVente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LigneBlFaVente)) {
            return false;
        }
        LigneBlFaVente other = (LigneBlFaVente) object;
        if ((this.idligneBlFaVente == null && other.idligneBlFaVente != null) || (this.idligneBlFaVente != null && !this.idligneBlFaVente.equals(other.idligneBlFaVente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.LigneBlFaVente[ idligneBlFaVente=" + idligneBlFaVente + " ]";
    }
    
}
