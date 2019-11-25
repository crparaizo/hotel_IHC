/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oficial;

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
 * @author Selma e Candida
 */
@Entity
@Table(name = "quartos", catalog = "newhotel", schema = "")
@NamedQueries({
    @NamedQuery(name = "Quartos.findAll", query = "SELECT q FROM Quartos q"),
    @NamedQuery(name = "Quartos.findByCodigo", query = "SELECT q FROM Quartos q WHERE q.codigo = :codigo"),
    @NamedQuery(name = "Quartos.findByDescricao", query = "SELECT q FROM Quartos q WHERE q.descricao = :descricao"),
    @NamedQuery(name = "Quartos.findByValor", query = "SELECT q FROM Quartos q WHERE q.valor = :valor"),
    @NamedQuery(name = "Quartos.findByQuantpessoas", query = "SELECT q FROM Quartos q WHERE q.quantpessoas = :quantpessoas"),
    @NamedQuery(name = "Quartos.findByQuantquartos", query = "SELECT q FROM Quartos q WHERE q.quantquartos = :quantquartos")})
public class Quartos implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "DESCRICAO")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "VALOR")
    private int valor;
    @Basic(optional = false)
    @Column(name = "QUANTPESSOAS")
    private int quantpessoas;
    @Basic(optional = false)
    @Column(name = "QUANTQUARTOS")
    private int quantquartos;

    public Quartos() {
    }

    public Quartos(Integer codigo) {
        this.codigo = codigo;
    }

    public Quartos(Integer codigo, String descricao, int valor, int quantpessoas, int quantquartos) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.quantpessoas = quantpessoas;
        this.quantquartos = quantquartos;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        Integer oldCodigo = this.codigo;
        this.codigo = codigo;
        changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        int oldValor = this.valor;
        this.valor = valor;
        changeSupport.firePropertyChange("valor", oldValor, valor);
    }

    public int getQuantpessoas() {
        return quantpessoas;
    }

    public void setQuantpessoas(int quantpessoas) {
        int oldQuantpessoas = this.quantpessoas;
        this.quantpessoas = quantpessoas;
        changeSupport.firePropertyChange("quantpessoas", oldQuantpessoas, quantpessoas);
    }

    public int getQuantquartos() {
        return quantquartos;
    }

    public void setQuantquartos(int quantquartos) {
        int oldQuantquartos = this.quantquartos;
        this.quantquartos = quantquartos;
        changeSupport.firePropertyChange("quantquartos", oldQuantquartos, quantquartos);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quartos)) {
            return false;
        }
        Quartos other = (Quartos) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Oficial.Quartos[ codigo=" + codigo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
