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
@Table(name = "cheque")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cheque.findAll", query = "SELECT c FROM Cheque c"),
    @NamedQuery(name = "Cheque.findByIdcheque", query = "SELECT c FROM Cheque c WHERE c.idcheque = :idcheque"),
    @NamedQuery(name = "Cheque.findByNomclt", query = "SELECT c FROM Cheque c WHERE c.nomclt = :nomclt"),
    @NamedQuery(name = "Cheque.findByMontant", query = "SELECT c FROM Cheque c WHERE c.montant = :montant"),
    @NamedQuery(name = "Cheque.findByBanque", query = "SELECT c FROM Cheque c WHERE c.banque = :banque"),
    @NamedQuery(name = "Cheque.findByNumcheque", query = "SELECT c FROM Cheque c WHERE c.numcheque = :numcheque"),
    @NamedQuery(name = "Cheque.findByDateech", query = "SELECT c FROM Cheque c WHERE c.dateech = :dateech"),
    @NamedQuery(name = "Cheque.findByMotif", query = "SELECT c FROM Cheque c WHERE c.motif = :motif"),
    @NamedQuery(name = "Cheque.findByIdclt", query = "SELECT c FROM Cheque c WHERE c.idclt = :idclt"),
    @NamedQuery(name = "Cheque.findByIdcom", query = "SELECT c FROM Cheque c WHERE c.idcom = :idcom"),
    @NamedQuery(name = "Cheque.findByDatech", query = "SELECT c FROM Cheque c WHERE c.datech = :datech"),
    @NamedQuery(name = "Cheque.findByIduser", query = "SELECT c FROM Cheque c WHERE c.iduser = :iduser")})
public class Cheque implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcheque")
    private Integer idcheque;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nomclt")
    private String nomclt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "montant")
    private BigDecimal montant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "banque")
    private String banque;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "numcheque")
    private String numcheque;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateech")
    @Temporal(TemporalType.DATE)
    private Date dateech;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "motif")
    private String motif;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idclt")
    private int idclt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcom")
    private int idcom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datech")
    @Temporal(TemporalType.DATE)
    private Date datech;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iduser")
    private int iduser;

    public Cheque() {
    }

    public Cheque(Integer idcheque) {
        this.idcheque = idcheque;
    }

    public Cheque(Integer idcheque, String nomclt, BigDecimal montant, String banque, String numcheque, Date dateech, String motif, int idclt, int idcom, Date datech, int iduser) {
        this.idcheque = idcheque;
        this.nomclt = nomclt;
        this.montant = montant;
        this.banque = banque;
        this.numcheque = numcheque;
        this.dateech = dateech;
        this.motif = motif;
        this.idclt = idclt;
        this.idcom = idcom;
        this.datech = datech;
        this.iduser = iduser;
    }

    public Integer getIdcheque() {
        return idcheque;
    }

    public void setIdcheque(Integer idcheque) {
        this.idcheque = idcheque;
    }

    public String getNomclt() {
        return nomclt;
    }

    public void setNomclt(String nomclt) {
        this.nomclt = nomclt;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public String getBanque() {
        return banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
    }

    public String getNumcheque() {
        return numcheque;
    }

    public void setNumcheque(String numcheque) {
        this.numcheque = numcheque;
    }

    public Date getDateech() {
        return dateech;
    }

    public void setDateech(Date dateech) {
        this.dateech = dateech;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public int getIdclt() {
        return idclt;
    }

    public void setIdclt(int idclt) {
        this.idclt = idclt;
    }

    public int getIdcom() {
        return idcom;
    }

    public void setIdcom(int idcom) {
        this.idcom = idcom;
    }

    public Date getDatech() {
        return datech;
    }

    public void setDatech(Date datech) {
        this.datech = datech;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcheque != null ? idcheque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cheque)) {
            return false;
        }
        Cheque other = (Cheque) object;
        if ((this.idcheque == null && other.idcheque != null) || (this.idcheque != null && !this.idcheque.equals(other.idcheque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Cheque[ idcheque=" + idcheque + " ]";
    }
    
}
