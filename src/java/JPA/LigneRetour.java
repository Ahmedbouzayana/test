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
@Table(name = "ligne_retour")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LigneRetour.findAll", query = "SELECT l FROM LigneRetour l"),
    @NamedQuery(name = "LigneRetour.findByIdligneRetour", query = "SELECT l FROM LigneRetour l WHERE l.idligneRetour = :idligneRetour"),
    @NamedQuery(name = "LigneRetour.findByPrixuht", query = "SELECT l FROM LigneRetour l WHERE l.prixuht = :prixuht"),
    @NamedQuery(name = "LigneRetour.findByTtva", query = "SELECT l FROM LigneRetour l WHERE l.ttva = :ttva"),
    @NamedQuery(name = "LigneRetour.findByPrixuttc", query = "SELECT l FROM LigneRetour l WHERE l.prixuttc = :prixuttc"),
    @NamedQuery(name = "LigneRetour.findByQte", query = "SELECT l FROM LigneRetour l WHERE l.qte = :qte"),
    @NamedQuery(name = "LigneRetour.findByTotalht", query = "SELECT l FROM LigneRetour l WHERE l.totalht = :totalht"),
    @NamedQuery(name = "LigneRetour.findByTotalttc", query = "SELECT l FROM LigneRetour l WHERE l.totalttc = :totalttc"),
    @NamedQuery(name = "LigneRetour.findByRemise", query = "SELECT l FROM LigneRetour l WHERE l.remise = :remise"),
    @NamedQuery(name = "LigneRetour.findByNetht", query = "SELECT l FROM LigneRetour l WHERE l.netht = :netht"),
    @NamedQuery(name = "LigneRetour.findByNetttc", query = "SELECT l FROM LigneRetour l WHERE l.netttc = :netttc"),
    @NamedQuery(name = "LigneRetour.findByQtegratuit", query = "SELECT l FROM LigneRetour l WHERE l.qtegratuit = :qtegratuit"),
    @NamedQuery(name = "LigneRetour.findByBenefice", query = "SELECT l FROM LigneRetour l WHERE l.benefice = :benefice"),
    @NamedQuery(name = "LigneRetour.findByFodec", query = "SELECT l FROM LigneRetour l WHERE l.fodec = :fodec"),
    @NamedQuery(name = "LigneRetour.findByDroitc", query = "SELECT l FROM LigneRetour l WHERE l.droitc = :droitc")})
public class LigneRetour implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idligne_retour")
    private Integer idligneRetour;
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
    @JoinColumn(name = "idretour", referencedColumnName = "idretour")
    @ManyToOne
    private Retour idretour;
    @JoinColumn(name = "idproduit", referencedColumnName = "idproduit")
    @ManyToOne
    private Produit idproduit;

    public LigneRetour() {
    }

    public LigneRetour(Integer idligneRetour) {
        this.idligneRetour = idligneRetour;
    }

    public Integer getIdligneRetour() {
        return idligneRetour;
    }

    public void setIdligneRetour(Integer idligneRetour) {
        this.idligneRetour = idligneRetour;
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

    public Retour getIdretour() {
        return idretour;
    }

    public void setIdretour(Retour idretour) {
        this.idretour = idretour;
    }

    public Produit getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(Produit idproduit) {
        this.idproduit = idproduit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idligneRetour != null ? idligneRetour.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LigneRetour)) {
            return false;
        }
        LigneRetour other = (LigneRetour) object;
        if ((this.idligneRetour == null && other.idligneRetour != null) || (this.idligneRetour != null && !this.idligneRetour.equals(other.idligneRetour))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.LigneRetour[ idligneRetour=" + idligneRetour + " ]";
    }
    
}
