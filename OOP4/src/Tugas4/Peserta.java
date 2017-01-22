/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ambrizal
 */
@Entity
@Table(name = "peserta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Peserta.findAll", query = "SELECT p FROM Peserta p")
    , @NamedQuery(name = "Peserta.findByDataId", query = "SELECT p FROM Peserta p WHERE p.dataId = :dataId")
    , @NamedQuery(name = "Peserta.findByDataNama", query = "SELECT p FROM Peserta p WHERE p.dataNama = :dataNama")
    , @NamedQuery(name = "Peserta.findByDataAsal", query = "SELECT p FROM Peserta p WHERE p.dataAsal = :dataAsal")
    , @NamedQuery(name = "Peserta.findByDataLahir", query = "SELECT p FROM Peserta p WHERE p.dataLahir = :dataLahir")})
public class Peserta implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "data_id")
    private Integer dataId;
    @Basic(optional = false)
    @Column(name = "data_nama")
    private String dataNama;
    @Basic(optional = false)
    @Column(name = "data_asal")
    private String dataAsal;
    @Basic(optional = false)
    @Column(name = "data_lahir")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataLahir;
    @Basic(optional = false)
    @Lob
    @Column(name = "data_alamat")
    private String dataAlamat;

    public Peserta() {
    }

    public Peserta(Integer dataId) {
        this.dataId = dataId;
    }

    public Peserta(Integer dataId, String dataNama, String dataAsal, Date dataLahir, String dataAlamat) {
        this.dataId = dataId;
        this.dataNama = dataNama;
        this.dataAsal = dataAsal;
        this.dataLahir = dataLahir;
        this.dataAlamat = dataAlamat;
    }

    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        Integer oldDataId = this.dataId;
        this.dataId = dataId;
        changeSupport.firePropertyChange("dataId", oldDataId, dataId);
    }

    public String getDataNama() {
        return dataNama;
    }

    public void setDataNama(String dataNama) {
        String oldDataNama = this.dataNama;
        this.dataNama = dataNama;
        changeSupport.firePropertyChange("dataNama", oldDataNama, dataNama);
    }

    public String getDataAsal() {
        return dataAsal;
    }

    public void setDataAsal(String dataAsal) {
        String oldDataAsal = this.dataAsal;
        this.dataAsal = dataAsal;
        changeSupport.firePropertyChange("dataAsal", oldDataAsal, dataAsal);
    }

    public Date getDataLahir() {
        return dataLahir;
    }

    public void setDataLahir(Date dataLahir) {
        Date oldDataLahir = this.dataLahir;
        this.dataLahir = dataLahir;
        changeSupport.firePropertyChange("dataLahir", oldDataLahir, dataLahir);
    }

    public String getDataAlamat() {
        return dataAlamat;
    }

    public void setDataAlamat(String dataAlamat) {
        String oldDataAlamat = this.dataAlamat;
        this.dataAlamat = dataAlamat;
        changeSupport.firePropertyChange("dataAlamat", oldDataAlamat, dataAlamat);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataId != null ? dataId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peserta)) {
            return false;
        }
        Peserta other = (Peserta) object;
        if ((this.dataId == null && other.dataId != null) || (this.dataId != null && !this.dataId.equals(other.dataId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tugas4.Peserta[ dataId=" + dataId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
