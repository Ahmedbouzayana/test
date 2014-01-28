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
@Table(name = "ligne_bon_de_livraison")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LigneBonDeLivraison.findAll", query = "SELECT l FROM LigneBonDeLivraison l"),
    @NamedQuery(name = "LigneBonDeLivraison.findByIdligneBonDeLivraison", query = "SELECT l FROM LigneBonDeLivraison l WHERE l.idligneBonDeLivraison = :idligneBonDeLivraison"),
    @NamedQuery(name = "LigneBonDeLivraison.findByPrixuht", query = "SELECT l FROM LigneBonDeLivraison l WHERE l.prixuht = :prixuht"),
    @NamedQuery(name = "LigneBonDeLivraison.findByTtva", query = "SELECT l FROM LigneBonDeLivraison l WHERE l.ttva = :ttva"),
    @NamedQuery(name = "LigneBonDeLivraison.findByPrixuttc", query = "SELECT l FROM LigneBonDeLivraison l WHERE l.prixuttc = :prixuttc"),
    @NamedQuery(name = "LigneBonDeLivraison.findByQte", query = "SELECT l FROM LigneBonDeLivraison l WHERE l.qte = :qte"),
    @NamedQuery(name = "LigneBonDeLivraison.findByTotalht", query = "SELECT l FROM LigneBonDeLivraison l WHERE l.totalht = :totalht"),
    @NamedQuery(name = "LigneBonDeLivraison.findByTotalttc", query = "SELECT l FROM LigneBonDeLivraison l WHERE l.totalttc = :totalttc"),
    @NamedQuery(name = "LigneBonDeLivraison.findByRemise", query = "SELECT l FROM LigneBonDeLivraison l WHERE l.remise = :remise"),
    @NamedQuery(name = "LigneBonDeLivraison.findByNetht", query = "SELECT l FROM LigneBonDeLivraison l WHERE l.netht = :netht"),
    @NamedQuery(name = "LigneBonDeLivraison.findByNetttc", query = "SELECT l FROM LigneBonDeLivraison l WHERE l.netttc = :netttc"),
    @NamedQuery(name = "LigneBonDeLivraison.findByQtegratuit", query = "SELECT l FROM LigneBonDeLivraison l WHERE l.qtegratuit = :qtegratuit"),
    @NamedQuery(name = "LigneBonDeLivraison.findByBenefice", query = "SELECT l FROM LigneBonDeLivraison l WHERE l.benefice = :benefice"),
    @NamedQuery(name = "LigneBonDeLivraison.findByFodec", query = "SELECT l FROM LigneBonDeLivraison l WHERE l.fodec = :fodec"),
    @NamedQuery(name = "LigneBonDeLivraison.findByDroitc", query = "SELECT l FROM LigneBonDeLivraison l WHERE l.droitc = :droitc"),
    @NamedQuery(name = "LigneBonDeLivraison.findByQter", query = "SELECT l FROM LigneBonDeLivraison l WHERE l.qter = :qter"),
    @NamedQuery(name = "LigneBonDeLivraison.findByQtev", query = "SELECT l FROM LigneBonDeLivraison l WHERE l.qtev = :qtev"),
    @NamedQuery(name = "LigneBonDeLivraison.findByDesegnation", query = "SELECT l FROM LigneBonDeLivraison l WHERE l.desegnation = :desegnation")})
public class LigneBonDeLivraison implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idligne_bon_de_livraison")
    private Integer idligneBonDeLivraison;
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
    @Column(name = "qter")
    private Integer qter;
    @Column(name = "qtev")
    private Integer qtev;
    @Size(max = 255)
    @Column(name = "desegnation")
    private String desegnation;
    @JoinColumn(name = "idproduit", referencedColumnName = "idproduit")
    @ManyToOne
    private Produit idproduit;
    @JoinColumn(name = "idbondelivraison", referencedColumnName = "idbon_de_livraison")
    @ManyToOne
    private BonDeLivraison idbondelivraison;

    public LigneBonDeLivraison() {
    }

    public LigneBonDeLivraison(Integer idligneBonDeLivraison) {
        this.idligneBonDeLivraison = idligneBonDeLivraison;
    }

    public Integer getIdligneBonDeLivraison() {
        return idligneBonDeLivraison;
    }

    public void setIdligneBonDeLivraison(Integer idligneBonDeLivraison) {
        this.idligneBonDeLivraison = idligneBonDeLivraison;
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

    public Integer getQter() {
        return qter;
    }

    public void setQter(Integer qter) {
        this.qter = qter;
    }

    public Integer getQtev() {
        return qtev;
    }

    public void setQtev(Integer qtev) {
        this.qtev = qtev;
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

    public BonDeLivraison getIdbondelivraison() {
        return idbondelivraison;
    }

    public void setIdbondelivraison(BonDeLivraison idbondelivraison) {
        this.idbondelivraison = idbondelivraison;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idligneBonDeLivraison != null ? idligneBonDeLivraison.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LigneBonDeLivraison)) {
            return false;
        }
        LigneBonDeLivraison other = (LigneBonDeLivraison) object;
        if ((this.idligneBonDeLivraison == null && other.idligneBonDeLivraison != null) || (this.idligneBonDeLivraison != null && !this.idligneBonDeLivraison.equals(other.idligneBonDeLivraison))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.LigneBonDeLivraison[ idligneBonDeLivraison=" + idligneBonDeLivraison + " ]";
    }
    
}
