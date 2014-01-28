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
@Table(name = "ligne_br_achat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LigneBrAchat.findAll", query = "SELECT l FROM LigneBrAchat l"),
    @NamedQuery(name = "LigneBrAchat.findByIdligneBrAchat", query = "SELECT l FROM LigneBrAchat l WHERE l.idligneBrAchat = :idligneBrAchat"),
    @NamedQuery(name = "LigneBrAchat.findByPrixuht", query = "SELECT l FROM LigneBrAchat l WHERE l.prixuht = :prixuht"),
    @NamedQuery(name = "LigneBrAchat.findByTtva", query = "SELECT l FROM LigneBrAchat l WHERE l.ttva = :ttva"),
    @NamedQuery(name = "LigneBrAchat.findByPrixuttc", query = "SELECT l FROM LigneBrAchat l WHERE l.prixuttc = :prixuttc"),
    @NamedQuery(name = "LigneBrAchat.findByQte", query = "SELECT l FROM LigneBrAchat l WHERE l.qte = :qte"),
    @NamedQuery(name = "LigneBrAchat.findByTotalht", query = "SELECT l FROM LigneBrAchat l WHERE l.totalht = :totalht"),
    @NamedQuery(name = "LigneBrAchat.findByTotalttc", query = "SELECT l FROM LigneBrAchat l WHERE l.totalttc = :totalttc"),
    @NamedQuery(name = "LigneBrAchat.findByRemise", query = "SELECT l FROM LigneBrAchat l WHERE l.remise = :remise"),
    @NamedQuery(name = "LigneBrAchat.findByNetht", query = "SELECT l FROM LigneBrAchat l WHERE l.netht = :netht"),
    @NamedQuery(name = "LigneBrAchat.findByNetttc", query = "SELECT l FROM LigneBrAchat l WHERE l.netttc = :netttc"),
    @NamedQuery(name = "LigneBrAchat.findByQtegratuit", query = "SELECT l FROM LigneBrAchat l WHERE l.qtegratuit = :qtegratuit"),
    @NamedQuery(name = "LigneBrAchat.findByAncienremise", query = "SELECT l FROM LigneBrAchat l WHERE l.ancienremise = :ancienremise"),
    @NamedQuery(name = "LigneBrAchat.findByFodec", query = "SELECT l FROM LigneBrAchat l WHERE l.fodec = :fodec"),
    @NamedQuery(name = "LigneBrAchat.findByDroitc", query = "SELECT l FROM LigneBrAchat l WHERE l.droitc = :droitc"),
    @NamedQuery(name = "LigneBrAchat.findByNvprixventeht", query = "SELECT l FROM LigneBrAchat l WHERE l.nvprixventeht = :nvprixventeht"),
    @NamedQuery(name = "LigneBrAchat.findByDesegnation", query = "SELECT l FROM LigneBrAchat l WHERE l.desegnation = :desegnation")})
public class LigneBrAchat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idligne_br_achat")
    private Integer idligneBrAchat;
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
    @Size(max = 255)
    @Column(name = "desegnation")
    private String desegnation;
    @JoinColumn(name = "idproduit", referencedColumnName = "idproduit")
    @ManyToOne
    private Produit idproduit;
    @JoinColumn(name = "idbrachat", referencedColumnName = "idbr_achat")
    @ManyToOne
    private BrAchat idbrachat;

    public LigneBrAchat() {
    }

    public LigneBrAchat(Integer idligneBrAchat) {
        this.idligneBrAchat = idligneBrAchat;
    }

    public Integer getIdligneBrAchat() {
        return idligneBrAchat;
    }

    public void setIdligneBrAchat(Integer idligneBrAchat) {
        this.idligneBrAchat = idligneBrAchat;
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

    public BrAchat getIdbrachat() {
        return idbrachat;
    }

    public void setIdbrachat(BrAchat idbrachat) {
        this.idbrachat = idbrachat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idligneBrAchat != null ? idligneBrAchat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LigneBrAchat)) {
            return false;
        }
        LigneBrAchat other = (LigneBrAchat) object;
        if ((this.idligneBrAchat == null && other.idligneBrAchat != null) || (this.idligneBrAchat != null && !this.idligneBrAchat.equals(other.idligneBrAchat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.LigneBrAchat[ idligneBrAchat=" + idligneBrAchat + " ]";
    }
    
}
