/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JPA;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Mrs2a
 */
@Entity
@Table(name = "tiket")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiket.findAll", query = "SELECT t FROM Tiket t"),
    @NamedQuery(name = "Tiket.findByIdtiket", query = "SELECT t FROM Tiket t WHERE t.idtiket = :idtiket"),
    @NamedQuery(name = "Tiket.findByDatecreation", query = "SELECT t FROM Tiket t WHERE t.datecreation = :datecreation"),
    @NamedQuery(name = "Tiket.findByMantonttotal", query = "SELECT t FROM Tiket t WHERE t.mantonttotal = :mantonttotal"),
    @NamedQuery(name = "Tiket.findByMantontregle", query = "SELECT t FROM Tiket t WHERE t.mantontregle = :mantontregle"),
    @NamedQuery(name = "Tiket.findByFacture", query = "SELECT t FROM Tiket t WHERE t.facture = :facture")})
public class Tiket implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtiket")
    private Integer idtiket;
    @Column(name = "datecreation")
    @Temporal(TemporalType.DATE)
    private Date datecreation;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "mantonttotal")
    private BigDecimal mantonttotal;
    @Column(name = "mantontregle")
    private BigDecimal mantontregle;
    @Column(name = "facture")
    private Integer facture;
    @OneToMany(mappedBy = "idtiket")
    private Collection<Reglementtiket> reglementtiketCollection;
    @JoinColumn(name = "idutilisateur", referencedColumnName = "idutilisateurs")
    @ManyToOne
    private Utilisateurs idutilisateur;
    @JoinColumn(name = "idcaisse", referencedColumnName = "idcaisse")
    @ManyToOne
    private Caisse idcaisse;
    @OneToMany(mappedBy = "idtiket")
    private Collection<LigneTiket> ligneTiketCollection;

    public Tiket() {
    }

    public Tiket(Integer idtiket) {
        this.idtiket = idtiket;
    }

    public Integer getIdtiket() {
        return idtiket;
    }

    public void setIdtiket(Integer idtiket) {
        this.idtiket = idtiket;
    }

    public Date getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }

    public BigDecimal getMantonttotal() {
        return mantonttotal;
    }

    public void setMantonttotal(BigDecimal mantonttotal) {
        this.mantonttotal = mantonttotal;
    }

    public BigDecimal getMantontregle() {
        return mantontregle;
    }

    public void setMantontregle(BigDecimal mantontregle) {
        this.mantontregle = mantontregle;
    }

    public Integer getFacture() {
        return facture;
    }

    public void setFacture(Integer facture) {
        this.facture = facture;
    }

    @XmlTransient
    public Collection<Reglementtiket> getReglementtiketCollection() {
        return reglementtiketCollection;
    }

    public void setReglementtiketCollection(Collection<Reglementtiket> reglementtiketCollection) {
        this.reglementtiketCollection = reglementtiketCollection;
    }

    public Utilisateurs getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(Utilisateurs idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public Caisse getIdcaisse() {
        return idcaisse;
    }

    public void setIdcaisse(Caisse idcaisse) {
        this.idcaisse = idcaisse;
    }

    @XmlTransient
    public Collection<LigneTiket> getLigneTiketCollection() {
        return ligneTiketCollection;
    }

    public void setLigneTiketCollection(Collection<LigneTiket> ligneTiketCollection) {
        this.ligneTiketCollection = ligneTiketCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtiket != null ? idtiket.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiket)) {
            return false;
        }
        Tiket other = (Tiket) object;
        if ((this.idtiket == null && other.idtiket != null) || (this.idtiket != null && !this.idtiket.equals(other.idtiket))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Tiket[ idtiket=" + idtiket + " ]";
    }
    
}
