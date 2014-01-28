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
@Table(name = "caisse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Caisse.findAll", query = "SELECT c FROM Caisse c"),
    @NamedQuery(name = "Caisse.findByIdcaisse", query = "SELECT c FROM Caisse c WHERE c.idcaisse = :idcaisse"),
    @NamedQuery(name = "Caisse.findByDate", query = "SELECT c FROM Caisse c WHERE c.date = :date"),
    @NamedQuery(name = "Caisse.findByFondDeCaisse", query = "SELECT c FROM Caisse c WHERE c.fondDeCaisse = :fondDeCaisse"),
    @NamedQuery(name = "Caisse.findByColtureDeCaisse", query = "SELECT c FROM Caisse c WHERE c.coltureDeCaisse = :coltureDeCaisse"),
    @NamedQuery(name = "Caisse.findByColturer", query = "SELECT c FROM Caisse c WHERE c.colturer = :colturer"),
    @NamedQuery(name = "Caisse.findByMtespace", query = "SELECT c FROM Caisse c WHERE c.mtespace = :mtespace"),
    @NamedQuery(name = "Caisse.findByMtcheque", query = "SELECT c FROM Caisse c WHERE c.mtcheque = :mtcheque"),
    @NamedQuery(name = "Caisse.findByMtsortiec", query = "SELECT c FROM Caisse c WHERE c.mtsortiec = :mtsortiec"),
    @NamedQuery(name = "Caisse.findByMttpe", query = "SELECT c FROM Caisse c WHERE c.mttpe = :mttpe"),
    @NamedQuery(name = "Caisse.findByMtcheqc", query = "SELECT c FROM Caisse c WHERE c.mtcheqc = :mtcheqc"),
    @NamedQuery(name = "Caisse.findByMtentrec", query = "SELECT c FROM Caisse c WHERE c.mtentrec = :mtentrec")})
public class Caisse implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcaisse")
    private Integer idcaisse;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "fond_de_caisse")
    private BigDecimal fondDeCaisse;
    @Column(name = "colture_de_caisse")
    private BigDecimal coltureDeCaisse;
    @Column(name = "colturer")
    private Integer colturer;
    @Column(name = "mtespace")
    private BigDecimal mtespace;
    @Column(name = "mtcheque")
    private BigDecimal mtcheque;
    @Column(name = "mtsortiec")
    private BigDecimal mtsortiec;
    @Column(name = "mttpe")
    private BigDecimal mttpe;
    @Column(name = "mtcheqc")
    private BigDecimal mtcheqc;
    @Column(name = "mtentrec")
    private BigDecimal mtentrec;
    @OneToMany(mappedBy = "idcaisse")
    private Collection<Reglementtiket> reglementtiketCollection;
    @OneToMany(mappedBy = "idcaisse")
    private Collection<Mouvement> mouvementCollection;
    @OneToMany(mappedBy = "idcaisse")
    private Collection<Tiket> tiketCollection;
    @JoinColumn(name = "idutilisateur", referencedColumnName = "idutilisateurs")
    @ManyToOne
    private Utilisateurs idutilisateur;

    public Caisse() {
    }

    public Caisse(Integer idcaisse) {
        this.idcaisse = idcaisse;
    }

    public Integer getIdcaisse() {
        return idcaisse;
    }

    public void setIdcaisse(Integer idcaisse) {
        this.idcaisse = idcaisse;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getFondDeCaisse() {
        return fondDeCaisse;
    }

    public void setFondDeCaisse(BigDecimal fondDeCaisse) {
        this.fondDeCaisse = fondDeCaisse;
    }

    public BigDecimal getColtureDeCaisse() {
        return coltureDeCaisse;
    }

    public void setColtureDeCaisse(BigDecimal coltureDeCaisse) {
        this.coltureDeCaisse = coltureDeCaisse;
    }

    public Integer getColturer() {
        return colturer;
    }

    public void setColturer(Integer colturer) {
        this.colturer = colturer;
    }

    public BigDecimal getMtespace() {
        return mtespace;
    }

    public void setMtespace(BigDecimal mtespace) {
        this.mtespace = mtespace;
    }

    public BigDecimal getMtcheque() {
        return mtcheque;
    }

    public void setMtcheque(BigDecimal mtcheque) {
        this.mtcheque = mtcheque;
    }

    public BigDecimal getMtsortiec() {
        return mtsortiec;
    }

    public void setMtsortiec(BigDecimal mtsortiec) {
        this.mtsortiec = mtsortiec;
    }

    public BigDecimal getMttpe() {
        return mttpe;
    }

    public void setMttpe(BigDecimal mttpe) {
        this.mttpe = mttpe;
    }

    public BigDecimal getMtcheqc() {
        return mtcheqc;
    }

    public void setMtcheqc(BigDecimal mtcheqc) {
        this.mtcheqc = mtcheqc;
    }

    public BigDecimal getMtentrec() {
        return mtentrec;
    }

    public void setMtentrec(BigDecimal mtentrec) {
        this.mtentrec = mtentrec;
    }

    @XmlTransient
    public Collection<Reglementtiket> getReglementtiketCollection() {
        return reglementtiketCollection;
    }

    public void setReglementtiketCollection(Collection<Reglementtiket> reglementtiketCollection) {
        this.reglementtiketCollection = reglementtiketCollection;
    }

    @XmlTransient
    public Collection<Mouvement> getMouvementCollection() {
        return mouvementCollection;
    }

    public void setMouvementCollection(Collection<Mouvement> mouvementCollection) {
        this.mouvementCollection = mouvementCollection;
    }

    @XmlTransient
    public Collection<Tiket> getTiketCollection() {
        return tiketCollection;
    }

    public void setTiketCollection(Collection<Tiket> tiketCollection) {
        this.tiketCollection = tiketCollection;
    }

    public Utilisateurs getIdutilisateur() {
        return idutilisateur;
    }

    public void setIdutilisateur(Utilisateurs idutilisateur) {
        this.idutilisateur = idutilisateur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcaisse != null ? idcaisse.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caisse)) {
            return false;
        }
        Caisse other = (Caisse) object;
        if ((this.idcaisse == null && other.idcaisse != null) || (this.idcaisse != null && !this.idcaisse.equals(other.idcaisse))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Caisse[ idcaisse=" + idcaisse + " ]";
    }
    
}
