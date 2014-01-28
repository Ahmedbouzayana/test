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
@Table(name = "ligne_tiket")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LigneTiket.findAll", query = "SELECT l FROM LigneTiket l"),
    @NamedQuery(name = "LigneTiket.findByIdligneTiket", query = "SELECT l FROM LigneTiket l WHERE l.idligneTiket = :idligneTiket"),
    @NamedQuery(name = "LigneTiket.findByQte", query = "SELECT l FROM LigneTiket l WHERE l.qte = :qte"),
    @NamedQuery(name = "LigneTiket.findByTotal", query = "SELECT l FROM LigneTiket l WHERE l.total = :total"),
    @NamedQuery(name = "LigneTiket.findByRemise", query = "SELECT l FROM LigneTiket l WHERE l.remise = :remise"),
    @NamedQuery(name = "LigneTiket.findByNet", query = "SELECT l FROM LigneTiket l WHERE l.net = :net"),
    @NamedQuery(name = "LigneTiket.findByPrixunet", query = "SELECT l FROM LigneTiket l WHERE l.prixunet = :prixunet"),
    @NamedQuery(name = "LigneTiket.findByPrixu", query = "SELECT l FROM LigneTiket l WHERE l.prixu = :prixu")})
public class LigneTiket implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idligne_tiket")
    private Integer idligneTiket;
    @Column(name = "qte")
    private Integer qte;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total")
    private BigDecimal total;
    @Column(name = "remise")
    private BigDecimal remise;
    @Column(name = "net")
    private BigDecimal net;
    @Column(name = "prixunet")
    private BigDecimal prixunet;
    @Column(name = "prixu")
    private BigDecimal prixu;
    @JoinColumn(name = "idtiket", referencedColumnName = "idtiket")
    @ManyToOne
    private Tiket idtiket;
    @JoinColumn(name = "idproduit", referencedColumnName = "idproduit")
    @ManyToOne
    private Produit idproduit;

    public LigneTiket() {
    }

    public LigneTiket(Integer idligneTiket) {
        this.idligneTiket = idligneTiket;
    }

    public Integer getIdligneTiket() {
        return idligneTiket;
    }

    public void setIdligneTiket(Integer idligneTiket) {
        this.idligneTiket = idligneTiket;
    }

    public Integer getQte() {
        return qte;
    }

    public void setQte(Integer qte) {
        this.qte = qte;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getRemise() {
        return remise;
    }

    public void setRemise(BigDecimal remise) {
        this.remise = remise;
    }

    public BigDecimal getNet() {
        return net;
    }

    public void setNet(BigDecimal net) {
        this.net = net;
    }

    public BigDecimal getPrixunet() {
        return prixunet;
    }

    public void setPrixunet(BigDecimal prixunet) {
        this.prixunet = prixunet;
    }

    public BigDecimal getPrixu() {
        return prixu;
    }

    public void setPrixu(BigDecimal prixu) {
        this.prixu = prixu;
    }

    public Tiket getIdtiket() {
        return idtiket;
    }

    public void setIdtiket(Tiket idtiket) {
        this.idtiket = idtiket;
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
        hash += (idligneTiket != null ? idligneTiket.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LigneTiket)) {
            return false;
        }
        LigneTiket other = (LigneTiket) object;
        if ((this.idligneTiket == null && other.idligneTiket != null) || (this.idligneTiket != null && !this.idligneTiket.equals(other.idligneTiket))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.LigneTiket[ idligneTiket=" + idligneTiket + " ]";
    }
    
}
