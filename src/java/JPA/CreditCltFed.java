/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JPA;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mrs2a
 */
@Entity
@Table(name = "credit_clt_fed")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CreditCltFed.findAll", query = "SELECT c FROM CreditCltFed c"),
    @NamedQuery(name = "CreditCltFed.findByIdcltfed", query = "SELECT c FROM CreditCltFed c WHERE c.idcltfed = :idcltfed"),
    @NamedQuery(name = "CreditCltFed.findByMontant", query = "SELECT c FROM CreditCltFed c WHERE c.montant = :montant"),
    @NamedQuery(name = "CreditCltFed.findByDatecredit", query = "SELECT c FROM CreditCltFed c WHERE c.datecredit = :datecredit"),
    @NamedQuery(name = "CreditCltFed.findByIdutilisateurs", query = "SELECT c FROM CreditCltFed c WHERE c.idutilisateurs = :idutilisateurs"),
    @NamedQuery(name = "CreditCltFed.findByIdcommercial", query = "SELECT c FROM CreditCltFed c WHERE c.idcommercial = :idcommercial"),
    @NamedQuery(name = "CreditCltFed.findByIdcredifed", query = "SELECT c FROM CreditCltFed c WHERE c.idcredifed = :idcredifed"),
    @NamedQuery(name = "CreditCltFed.findByIdclt", query = "SELECT c FROM CreditCltFed c WHERE c.idclt = :idclt"),
    @NamedQuery(name = "CreditCltFed.findByMotif", query = "SELECT c FROM CreditCltFed c WHERE c.motif = :motif")})
public class CreditCltFed implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcltfed")
    private int idcltfed;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "montant")
    private BigDecimal montant;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datecredit")
    @Temporal(TemporalType.DATE)
    private Date datecredit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idutilisateurs")
    private int idutilisateurs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcommercial")
    private int idcommercial;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcredifed")
    private Integer idcredifed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idclt")
    private int idclt;
    @Size(max = 255)
    @Column(name = "motif")
    private String motif;

    public CreditCltFed() {
    }

    public CreditCltFed(Integer idcredifed) {
        this.idcredifed = idcredifed;
    }

    public CreditCltFed(Integer idcredifed, int idcltfed, BigDecimal montant, Date datecredit, int idutilisateurs, int idcommercial, int idclt) {
        this.idcredifed = idcredifed;
        this.idcltfed = idcltfed;
        this.montant = montant;
        this.datecredit = datecredit;
        this.idutilisateurs = idutilisateurs;
        this.idcommercial = idcommercial;
        this.idclt = idclt;
    }

    public int getIdcltfed() {
        return idcltfed;
    }

    public void setIdcltfed(int idcltfed) {
        this.idcltfed = idcltfed;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public Date getDatecredit() {
        return datecredit;
    }

    public void setDatecredit(Date datecredit) {
        this.datecredit = datecredit;
    }

    public int getIdutilisateurs() {
        return idutilisateurs;
    }

    public void setIdutilisateurs(int idutilisateurs) {
        this.idutilisateurs = idutilisateurs;
    }

    public int getIdcommercial() {
        return idcommercial;
    }

    public void setIdcommercial(int idcommercial) {
        this.idcommercial = idcommercial;
    }

    public Integer getIdcredifed() {
        return idcredifed;
    }

    public void setIdcredifed(Integer idcredifed) {
        this.idcredifed = idcredifed;
    }

    public int getIdclt() {
        return idclt;
    }

    public void setIdclt(int idclt) {
        this.idclt = idclt;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcredifed != null ? idcredifed.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CreditCltFed)) {
            return false;
        }
        CreditCltFed other = (CreditCltFed) object;
        if ((this.idcredifed == null && other.idcredifed != null) || (this.idcredifed != null && !this.idcredifed.equals(other.idcredifed))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.CreditCltFed[ idcredifed=" + idcredifed + " ]";
    }
    
}
