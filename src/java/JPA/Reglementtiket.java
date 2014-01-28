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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mrs2a
 */
@Entity
@Table(name = "reglementtiket")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reglementtiket.findAll", query = "SELECT r FROM Reglementtiket r"),
    @NamedQuery(name = "Reglementtiket.findByIdreglementtiket", query = "SELECT r FROM Reglementtiket r WHERE r.idreglementtiket = :idreglementtiket"),
    @NamedQuery(name = "Reglementtiket.findByMode", query = "SELECT r FROM Reglementtiket r WHERE r.mode = :mode"),
    @NamedQuery(name = "Reglementtiket.findByNumpiece", query = "SELECT r FROM Reglementtiket r WHERE r.numpiece = :numpiece"),
    @NamedQuery(name = "Reglementtiket.findByBanque", query = "SELECT r FROM Reglementtiket r WHERE r.banque = :banque"),
    @NamedQuery(name = "Reglementtiket.findByDatereg", query = "SELECT r FROM Reglementtiket r WHERE r.datereg = :datereg"),
    @NamedQuery(name = "Reglementtiket.findByDateech", query = "SELECT r FROM Reglementtiket r WHERE r.dateech = :dateech"),
    @NamedQuery(name = "Reglementtiket.findByMontant", query = "SELECT r FROM Reglementtiket r WHERE r.montant = :montant"),
    @NamedQuery(name = "Reglementtiket.findByGsm", query = "SELECT r FROM Reglementtiket r WHERE r.gsm = :gsm"),
    @NamedQuery(name = "Reglementtiket.findByObservation", query = "SELECT r FROM Reglementtiket r WHERE r.observation = :observation"),
    @NamedQuery(name = "Reglementtiket.findByValider", query = "SELECT r FROM Reglementtiket r WHERE r.valider = :valider"),
    @NamedQuery(name = "Reglementtiket.findByIdcharge", query = "SELECT r FROM Reglementtiket r WHERE r.idcharge = :idcharge")})
public class Reglementtiket implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreglementtiket")
    private Integer idreglementtiket;
    @Size(max = 45)
    @Column(name = "mode")
    private String mode;
    @Size(max = 45)
    @Column(name = "numpiece")
    private String numpiece;
    @Size(max = 45)
    @Column(name = "banque")
    private String banque;
    @Column(name = "datereg")
    @Temporal(TemporalType.DATE)
    private Date datereg;
    @Column(name = "dateech")
    @Temporal(TemporalType.DATE)
    private Date dateech;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "montant")
    private BigDecimal montant;
    @Size(max = 45)
    @Column(name = "gsm")
    private String gsm;
    @Size(max = 255)
    @Column(name = "observation")
    private String observation;
    @Column(name = "valider")
    private Integer valider;
    @Column(name = "idcharge")
    private Integer idcharge;
    @JoinColumn(name = "idutilisateur", referencedColumnName = "idutilisateurs")
    @ManyToOne
    private Utilisateurs idutilisateur;
    @JoinColumn(name = "idtiket", referencedColumnName = "idtiket")
    @ManyToOne
    private Tiket idtiket;
    @JoinColumn(name = "idcaisse", referencedColumnName = "idcaisse")
    @ManyToOne
    private Caisse idcaisse;

    public Reglementtiket() {
    }

    public Reglementtiket(Integer idreglementtiket) {
        this.idreglementtiket = idreglementtiket;
    }

    public Integer getIdreglementtiket() {
        return idreglementtiket;
    }

    public void setIdreglementtiket(Integer idreglementtiket) {
        this.idreglementtiket = idreglementtiket;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getNumpiece() {
        return numpiece;
    }

    public void setNumpiece(String numpiece) {
        this.numpiece = numpiece;
    }

    public String getBanque() {
        return banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
    }

    public Date getDatereg() {
        return datereg;
    }

    public void setDatereg(Date datereg) {
        this.datereg = datereg;
    }

    public Date getDateech() {
        return dateech;
    }

    public void setDateech(Date dateech) {
        this.dateech = dateech;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Integer getValider() {
        return valider;
    }

    public void setValider(Integer valider) {
        this.valider = valider;
    }

    public Integer getIdcharge() {
        return idcharge;
    }

    public void setIdcharge(Integer idcharge) {
        this.idcharge = idcharge;
    }

    public Utilisateurs getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(Utilisateurs idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    public Tiket getIdtiket() {
        return idtiket;
    }

    public void setIdtiket(Tiket idtiket) {
        this.idtiket = idtiket;
    }

    public Caisse getIdcaisse() {
        return idcaisse;
    }

    public void setIdcaisse(Caisse idcaisse) {
        this.idcaisse = idcaisse;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreglementtiket != null ? idreglementtiket.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reglementtiket)) {
            return false;
        }
        Reglementtiket other = (Reglementtiket) object;
        if ((this.idreglementtiket == null && other.idreglementtiket != null) || (this.idreglementtiket != null && !this.idreglementtiket.equals(other.idreglementtiket))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Reglementtiket[ idreglementtiket=" + idreglementtiket + " ]";
    }
    
}
