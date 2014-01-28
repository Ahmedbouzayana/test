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
@Table(name = "reglement_credit_clt_fed")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReglementCreditCltFed.findAll", query = "SELECT r FROM ReglementCreditCltFed r"),
    @NamedQuery(name = "ReglementCreditCltFed.findByIdreglement", query = "SELECT r FROM ReglementCreditCltFed r WHERE r.idreglement = :idreglement"),
    @NamedQuery(name = "ReglementCreditCltFed.findByDatereg", query = "SELECT r FROM ReglementCreditCltFed r WHERE r.datereg = :datereg"),
    @NamedQuery(name = "ReglementCreditCltFed.findByMontantreg", query = "SELECT r FROM ReglementCreditCltFed r WHERE r.montantreg = :montantreg"),
    @NamedQuery(name = "ReglementCreditCltFed.findByIdutilisateurs", query = "SELECT r FROM ReglementCreditCltFed r WHERE r.idutilisateurs = :idutilisateurs"),
    @NamedQuery(name = "ReglementCreditCltFed.findByIdcommercial", query = "SELECT r FROM ReglementCreditCltFed r WHERE r.idcommercial = :idcommercial"),
    @NamedQuery(name = "ReglementCreditCltFed.findByIdclientfed", query = "SELECT r FROM ReglementCreditCltFed r WHERE r.idclientfed = :idclientfed"),
    @NamedQuery(name = "ReglementCreditCltFed.findByIdclt", query = "SELECT r FROM ReglementCreditCltFed r WHERE r.idclt = :idclt"),
    @NamedQuery(name = "ReglementCreditCltFed.findByMotif", query = "SELECT r FROM ReglementCreditCltFed r WHERE r.motif = :motif")})
public class ReglementCreditCltFed implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreglement")
    private Integer idreglement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datereg")
    @Temporal(TemporalType.DATE)
    private Date datereg;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "montantreg")
    private BigDecimal montantreg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idutilisateurs")
    private int idutilisateurs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcommercial")
    private int idcommercial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idclientfed")
    private int idclientfed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idclt")
    private int idclt;
    @Size(max = 255)
    @Column(name = "motif")
    private String motif;

    public ReglementCreditCltFed() {
    }

    public ReglementCreditCltFed(Integer idreglement) {
        this.idreglement = idreglement;
    }

    public ReglementCreditCltFed(Integer idreglement, Date datereg, BigDecimal montantreg, int idutilisateurs, int idcommercial, int idclientfed, int idclt) {
        this.idreglement = idreglement;
        this.datereg = datereg;
        this.montantreg = montantreg;
        this.idutilisateurs = idutilisateurs;
        this.idcommercial = idcommercial;
        this.idclientfed = idclientfed;
        this.idclt = idclt;
    }

    public Integer getIdreglement() {
        return idreglement;
    }

    public void setIdreglement(Integer idreglement) {
        this.idreglement = idreglement;
    }

    public Date getDatereg() {
        return datereg;
    }

    public void setDatereg(Date datereg) {
        this.datereg = datereg;
    }

    public BigDecimal getMontantreg() {
        return montantreg;
    }

    public void setMontantreg(BigDecimal montantreg) {
        this.montantreg = montantreg;
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

    public int getIdclientfed() {
        return idclientfed;
    }

    public void setIdclientfed(int idclientfed) {
        this.idclientfed = idclientfed;
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
        hash += (idreglement != null ? idreglement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReglementCreditCltFed)) {
            return false;
        }
        ReglementCreditCltFed other = (ReglementCreditCltFed) object;
        if ((this.idreglement == null && other.idreglement != null) || (this.idreglement != null && !this.idreglement.equals(other.idreglement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.ReglementCreditCltFed[ idreglement=" + idreglement + " ]";
    }
    
}
