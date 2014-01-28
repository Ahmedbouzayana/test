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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mrs2a
 */
@Entity
@Table(name = "ligne_fa_achat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LigneFaAchat.findAll", query = "SELECT l FROM LigneFaAchat l"),
    @NamedQuery(name = "LigneFaAchat.findByIdligneFaAchat", query = "SELECT l FROM LigneFaAchat l WHERE l.idligneFaAchat = :idligneFaAchat"),
    @NamedQuery(name = "LigneFaAchat.findByPrixuht", query = "SELECT l FROM LigneFaAchat l WHERE l.prixuht = :prixuht"),
    @NamedQuery(name = "LigneFaAchat.findByTtva", query = "SELECT l FROM LigneFaAchat l WHERE l.ttva = :ttva"),
    @NamedQuery(name = "LigneFaAchat.findByPrixuttc", query = "SELECT l FROM LigneFaAchat l WHERE l.prixuttc = :prixuttc"),
    @NamedQuery(name = "LigneFaAchat.findByQte", query = "SELECT l FROM LigneFaAchat l WHERE l.qte = :qte"),
    @NamedQuery(name = "LigneFaAchat.findByTotalht", query = "SELECT l FROM LigneFaAchat l WHERE l.totalht = :totalht"),
    @NamedQuery(name = "LigneFaAchat.findByTotalttc", query = "SELECT l FROM LigneFaAchat l WHERE l.totalttc = :totalttc"),
    @NamedQuery(name = "LigneFaAchat.findByRemise", query = "SELECT l FROM LigneFaAchat l WHERE l.remise = :remise"),
    @NamedQuery(name = "LigneFaAchat.findByNetht", query = "SELECT l FROM LigneFaAchat l WHERE l.netht = :netht"),
    @NamedQuery(name = "LigneFaAchat.findByNetttc", query = "SELECT l FROM LigneFaAchat l WHERE l.netttc = :netttc"),
    @NamedQuery(name = "LigneFaAchat.findByQtegratuit", query = "SELECT l FROM LigneFaAchat l WHERE l.qtegratuit = :qtegratuit"),
    @NamedQuery(name = "LigneFaAchat.findByAncienremise", query = "SELECT l FROM LigneFaAchat l WHERE l.ancienremise = :ancienremise"),
    @NamedQuery(name = "LigneFaAchat.findByFodec", query = "SELECT l FROM LigneFaAchat l WHERE l.fodec = :fodec"),
    @NamedQuery(name = "LigneFaAchat.findByDroitc", query = "SELECT l FROM LigneFaAchat l WHERE l.droitc = :droitc"),
    @NamedQuery(name = "LigneFaAchat.findByNvprixventeht", query = "SELECT l FROM LigneFaAchat l WHERE l.nvprixventeht = :nvprixventeht"),
    @NamedQuery(name = "LigneFaAchat.findByDesegnation", query = "SELECT l FROM LigneFaAchat l WHERE l.desegnation = :desegnation")})
public class LigneFaAchat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idligne_fa_achat")
    private Integer idligneFaAchat;
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
    @Column(name = "ancienremise")
    private BigDecimal ancienremise;
    @Column(name = "fodec")
    private Integer fodec;
    @Column(name = "droitc")
    private Integer droitc;
    @Column(name = "nvprixventeht")
    private BigDecimal nvprixventeht;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "desegnation")
    private String desegnation;
    @JoinColumn(name = "idproduit", referencedColumnName = "idproduit")
    @ManyToOne
    private Produit idproduit;
    @JoinColumn(name = "idfaachat", referencedColumnName = "idfa_achat")
    @ManyToOne
    private FaAchat idfaachat;

    public LigneFaAchat() {
    }

    public LigneFaAchat(Integer idligneFaAchat) {
        this.idligneFaAchat = idligneFaAchat;
    }

    public LigneFaAchat(Integer idligneFaAchat, String desegnation) {
        this.idligneFaAchat = idligneFaAchat;
        this.desegnation = desegnation;
    }

    public Integer getIdligneFaAchat() {
        return idligneFaAchat;
    }

    public void setIdligneFaAchat(Integer idligneFaAchat) {
        this.idligneFaAchat = idligneFaAchat;
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

    public FaAchat getIdfaachat() {
        return idfaachat;
    }

    public void setIdfaachat(FaAchat idfaachat) {
        this.idfaachat = idfaachat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idligneFaAchat != null ? idligneFaAchat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LigneFaAchat)) {
            return false;
        }
        LigneFaAchat other = (LigneFaAchat) object;
        if ((this.idligneFaAchat == null && other.idligneFaAchat != null) || (this.idligneFaAchat != null && !this.idligneFaAchat.equals(other.idligneFaAchat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.LigneFaAchat[ idligneFaAchat=" + idligneFaAchat + " ]";
    }
    
}
