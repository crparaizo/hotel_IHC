/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author 2485282
 */
@Entity
@Table(name = "reservas", catalog = "hotel", schema = "")
@NamedQueries({
    @NamedQuery(name = "Reservas.findAll", query = "SELECT r FROM Reservas r")
    , @NamedQuery(name = "Reservas.findById", query = "SELECT r FROM Reservas r WHERE r.id = :id")
    , @NamedQuery(name = "Reservas.findByTitulo", query = "SELECT r FROM Reservas r WHERE r.titulo = :titulo")
    , @NamedQuery(name = "Reservas.findByDescricao", query = "SELECT r FROM Reservas r WHERE r.descricao = :descricao")
    , @NamedQuery(name = "Reservas.findByNquarto", query = "SELECT r FROM Reservas r WHERE r.nquarto = :nquarto")
    , @NamedQuery(name = "Reservas.findByNcamas", query = "SELECT r FROM Reservas r WHERE r.ncamas = :ncamas")
    , @NamedQuery(name = "Reservas.findByValor", query = "SELECT r FROM Reservas r WHERE r.valor = :valor")
    , @NamedQuery(name = "Reservas.findByIdSituacao", query = "SELECT r FROM Reservas r WHERE r.idSituacao = :idSituacao")})
public class Reservas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "TITULO")
    private String titulo;
    @Basic(optional = false)
    @Column(name = "DESCRICAO")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "NQUARTO")
    private int nquarto;
    @Basic(optional = false)
    @Column(name = "NCAMAS")
    private int ncamas;
    @Basic(optional = false)
    @Column(name = "VALOR")
    private float valor;
    @Column(name = "ID_SITUACAO")
    private Integer idSituacao;

    public Reservas() {
    }

    public Reservas(Integer id) {
        this.id = id;
    }

    public Reservas(Integer id, String titulo, String descricao, int nquarto, int ncamas, float valor) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.nquarto = nquarto;
        this.ncamas = ncamas;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        String oldTitulo = this.titulo;
        this.titulo = titulo;
        changeSupport.firePropertyChange("titulo", oldTitulo, titulo);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public int getNquarto() {
        return nquarto;
    }

    public void setNquarto(int nquarto) {
        int oldNquarto = this.nquarto;
        this.nquarto = nquarto;
        changeSupport.firePropertyChange("nquarto", oldNquarto, nquarto);
    }

    public int getNcamas() {
        return ncamas;
    }

    public void setNcamas(int ncamas) {
        int oldNcamas = this.ncamas;
        this.ncamas = ncamas;
        changeSupport.firePropertyChange("ncamas", oldNcamas, ncamas);
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        float oldValor = this.valor;
        this.valor = valor;
        changeSupport.firePropertyChange("valor", oldValor, valor);
    }

    public Integer getIdSituacao() {
        return idSituacao;
    }

    public void setIdSituacao(Integer idSituacao) {
        Integer oldIdSituacao = this.idSituacao;
        this.idSituacao = idSituacao;
        changeSupport.firePropertyChange("idSituacao", oldIdSituacao, idSituacao);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservas)) {
            return false;
        }
        Reservas other = (Reservas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Listas.Reservas[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
