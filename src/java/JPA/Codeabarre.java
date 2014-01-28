/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JPA;

import java.io.Serializable;
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
@Table(name = "codeabarre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Codeabarre.findAll", query = "SELECT c FROM Codeabarre c"),
    @NamedQuery(name = "Codeabarre.findByIdcodeabarre", query = "SELECT c FROM Codeabarre c WHERE c.idcodeabarre = :idcodeabarre"),
    @NamedQuery(name = "Codeabarre.findByCode", query = "SELECT c FROM Codeabarre c WHERE c.code = :code")})
public class Codeabarre implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcodeabarre")
    private Integer idcodeabarre;
    @Size(max = 45)
    @Column(name = "code")
    private String code;
    @JoinColumn(name = "idproduit", referencedColumnName = "idproduit")
    @ManyToOne
    private Produit idproduit;

    public Codeabarre() {
    }

    public Codeabarre(Integer idcodeabarre) {
        this.idcodeabarre = idcodeabarre;
    }

    public Integer getIdcodeabarre() {
        return idcodeabarre;
    }

    public void setIdcodeabarre(Integer idcodeabarre) {
        this.idcodeabarre = idcodeabarre;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
        hash += (idcodeabarre != null ? idcodeabarre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Codeabarre)) {
            return false;
        }
        Codeabarre other = (Codeabarre) object;
        if ((this.idcodeabarre == null && other.idcodeabarre != null) || (this.idcodeabarre != null && !this.idcodeabarre.equals(other.idcodeabarre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Codeabarre[ idcodeabarre=" + idcodeabarre + " ]";
    }
    
}
