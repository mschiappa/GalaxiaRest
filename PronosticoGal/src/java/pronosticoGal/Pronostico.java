/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pronosticoGal;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "PRONOSTICO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pronostico.findAll", query = "SELECT p FROM Pronostico p"),
    @NamedQuery(name = "Pronostico.findByIdDia", query = "SELECT p FROM Pronostico p WHERE p.idDia = :idDia"),
    @NamedQuery(name = "Pronostico.findByEstado", query = "SELECT p FROM Pronostico p WHERE p.estado = :estado")})
public class Pronostico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_DIA")
    private Integer idDia;
    @Size(max = 200)
    @Column(name = "ESTADO")
    private String estado;

    public Pronostico() {
    }

    public Pronostico(Integer idDia) {
        this.idDia = idDia;
    }

    public Integer getIdDia() {
        return idDia;
    }

    public void setIdDia(Integer idDia) {
        this.idDia = idDia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDia != null ? idDia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pronostico)) {
            return false;
        }
        Pronostico other = (Pronostico) object;
        if ((this.idDia == null && other.idDia != null) || (this.idDia != null && !this.idDia.equals(other.idDia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pronosticoGal.Pronostico[ idDia=" + idDia + " ]";
    }
    
}
