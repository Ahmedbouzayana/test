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
@Table(name = "ligne_bon_de_sortie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LigneBonDeSortie.findAll", query = "SELECT l FROM LigneBonDeSortie l"),
    @NamedQuery(name = "LigneBonDeSortie.findByIdligneBonDeSortie", query = "SELECT l FROM LigneBonDeSortie l WHERE l.idligneBonDeSortie = :idligneBonDeSortie"),
    @NamedQuery(name = "LigneBonDeSortie.findByPrixuht", query = "SELECT l FROM LigneBonDeSortie l WHERE l.prixuht = :prixuht"),
    @NamedQuery(name = "LigneBonDeSortie.findByTtva", query = "SELECT l FROM LigneBonDeSortie l WHERE l.ttva = :ttva"),
    @NamedQuery(name = "LigneBonDeSortie.findByPrixuttc", query = "SELECT l FROM LigneBonDeSortie l WHERE l.prixuttc = :prixuttc"),
    @NamedQuery(name = "LigneBonDeSortie.findByQte", query = "SELECT l FROM LigneBonDeSortie l WHERE l.qte = :qte"),
    @NamedQuery(name = "LigneBonDeSortie.findByTotalht", query = "SELECT l FROM LigneBonDeSortie l WHERE l.totalht = :totalht"),
    @NamedQuery(name = "LigneBonDeSortie.findByTotalttc", query = "SELECT l FROM LigneBonDeSortie l WHERE l.totalttc = :totalttc"),
    @NamedQuery(name = "LigneBonDeSortie.findByRemise", query = "SELECT l FROM LigneBonDeSortie l WHERE l.remise = :remise"),
    @NamedQuery(name = "LigneBonDeSortie.findByNetht", query = "SELECT l FROM LigneBonDeSortie l WHERE l.netht = :netht"),
    @NamedQuery(name = "LigneBonDeSortie.findByNetttc", query = "SELECT l FROM LigneBonDeSortie l WHERE l.netttc = :netttc"),
    @NamedQuery(name = "LigneBonDeSortie.findByQtegratuit", query = "SELECT l FROM LigneBonDeSortie l WHERE l.qtegratuit = :qtegratuit"),
    @NamedQuery(name = "LigneBonDeSortie.findByBenefice", query = "SELECT l FROM LigneBonDeSortie l WHERE l.benefice = :benefice"),
    @NamedQuery(name = "LigneBonDeSortie.findByFodec", query = "SELECT l FROM LigneBonDeSortie l WHERE l.fodec = :fodec"),
    @NamedQuery(name = "LigneBonDeSortie.findByDroitc", query = "SELECT l FROM LigneBonDeSortie l WHERE l.droitc = :droitc"),
    @NamedQuery(name = "LigneBonDeSortie.findByQter", query = "SELECT l FROM LigneBonDeSortie l WHERE l.qter = :qter"),
    @NamedQuery(name = "LigneBonDeSortie.findByQtev", query = "SELECT l FROM LigneBonDeSortie l WHERE l.qtev = :qtev"),
    @NamedQuery(name = "LigneBonDeSortie.findByDesegnation", query = "SELECT l FROM LigneBonDeSortie l WHERE l.desegnation = :desegnation")})
public class LigneBonDeSortie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idligne_bon_de_sortie")
    private Integer idligneBonDeSortie;
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
    @JoinColumn(name = "idbondesortie", referencedColumnName = "idbon_de_sortie")
    @ManyToOne
    private BonDeSortie idbondesortie;

    public LigneBonDeSortie() {
    }

    public LigneBonDeSortie(Integer idligneBonDeSortie) {
        this.idligneBonDeSortie = idligneBonDeSortie;
    }

    public Integer getIdligneBonDeSortie() {
        return idligneBonDeSortie;
    }

    public void setIdligneBonDeSortie(Integer idligneBonDeSortie) {
        this.idligneBonDeSortie = idligneBonDeSortie;
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

    public BonDeSortie getIdbondesortie() {
        return idbondesortie;
    }

    public void setIdbondesortie(BonDeSortie idbondesortie) {
        this.idbondesortie = idbondesortie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idligneBonDeSortie != null ? idligneBonDeSortie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LigneBonDeSortie)) {
            return false;
        }
        LigneBonDeSortie other = (LigneBonDeSortie) object;
        if ((this.idligneBonDeSortie == null && other.idligneBonDeSortie != null) || (this.idligneBonDeSortie != null && !this.idligneBonDeSortie.equals(other.idligneBonDeSortie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.LigneBonDeSortie[ idligneBonDeSortie=" + idligneBonDeSortie + " ]";
    }
    
}
