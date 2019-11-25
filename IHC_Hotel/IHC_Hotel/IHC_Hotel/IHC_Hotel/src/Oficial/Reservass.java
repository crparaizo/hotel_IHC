/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oficial;

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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Selma e Candida
 */
@Entity
@Table(name = "reservass", catalog = "newhotel", schema = "")
@NamedQueries({
    @NamedQuery(name = "Reservass.findAll", query = "SELECT r FROM Reservass r"),
    @NamedQuery(name = "Reservass.findByCodigo", query = "SELECT r FROM Reservass r WHERE r.codigo = :codigo"),
    @NamedQuery(name = "Reservass.findByCodHospede", query = "SELECT r FROM Reservass r WHERE r.codHospede = :codHospede"),
    @NamedQuery(name = "Reservass.findByDataen", query = "SELECT r FROM Reservass r WHERE r.dataen = :dataen"),
    @NamedQuery(name = "Reservass.findByDatasa", query = "SELECT r FROM Reservass r WHERE r.datasa = :datasa"),
    @NamedQuery(name = "Reservass.findByTipoquarto", query = "SELECT r FROM Reservass r WHERE r.tipoquarto = :tipoquarto"),
    @NamedQuery(name = "Reservass.findByNpessoas", query = "SELECT r FROM Reservass r WHERE r.npessoas = :npessoas"),
    @NamedQuery(name = "Reservass.findByValor", query = "SELECT r FROM Reservass r WHERE r.valor = :valor"),
    @NamedQuery(name = "Reservass.findByPagamento", query = "SELECT r FROM Reservass r WHERE r.pagamento = :pagamento")})
public class Reservass implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "COD_HOSPEDE")
    private int codHospede;
    @Basic(optional = false)
    @Column(name = "DATAEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataen;
    @Basic(optional = false)
    @Column(name = "DATASA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datasa;
    @Basic(optional = false)
    @Column(name = "TIPOQUARTO")
    private String tipoquarto;
    @Basic(optional = false)
    @Column(name = "NPESSOAS")
    private int npessoas;
    @Basic(optional = false)
    @Column(name = "VALOR")
    private String valor;
    @Basic(optional = false)
    @Column(name = "PAGAMENTO")
    private String pagamento;

    public Reservass() {
    }

    public Reservass(Integer codigo) {
        this.codigo = codigo;
    }

    public Reservass(Integer codigo, int codHospede, Date dataen, Date datasa, String tipoquarto, int npessoas, String valor, String pagamento) {
        this.codigo = codigo;
        this.codHospede = codHospede;
        this.dataen = dataen;
        this.datasa = datasa;
        this.tipoquarto = tipoquarto;
        this.npessoas = npessoas;
        this.valor = valor;
        this.pagamento = pagamento;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        Integer oldCodigo = this.codigo;
        this.codigo = codigo;
        changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
    }

    public int getCodHospede() {
        return codHospede;
    }

    public void setCodHospede(int codHospede) {
        int oldCodHospede = this.codHospede;
        this.codHospede = codHospede;
        changeSupport.firePropertyChange("codHospede", oldCodHospede, codHospede);
    }

    public Date getDataen() {
        return dataen;
    }

    public void setDataen(Date dataen) {
        Date oldDataen = this.dataen;
        this.dataen = dataen;
        changeSupport.firePropertyChange("dataen", oldDataen, dataen);
    }

    public Date getDatasa() {
        return datasa;
    }

    public void setDatasa(Date datasa) {
        Date oldDatasa = this.datasa;
        this.datasa = datasa;
        changeSupport.firePropertyChange("datasa", oldDatasa, datasa);
    }

    public String getTipoquarto() {
        return tipoquarto;
    }

    public void setTipoquarto(String tipoquarto) {
        String oldTipoquarto = this.tipoquarto;
        this.tipoquarto = tipoquarto;
        changeSupport.firePropertyChange("tipoquarto", oldTipoquarto, tipoquarto);
    }

    public int getNpessoas() {
        return npessoas;
    }

    public void setNpessoas(int npessoas) {
        int oldNpessoas = this.npessoas;
        this.npessoas = npessoas;
        changeSupport.firePropertyChange("npessoas", oldNpessoas, npessoas);
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        String oldValor = this.valor;
        this.valor = valor;
        changeSupport.firePropertyChange("valor", oldValor, valor);
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        String oldPagamento = this.pagamento;
        this.pagamento = pagamento;
        changeSupport.firePropertyChange("pagamento", oldPagamento, pagamento);
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
        if (!(object instanceof Reservass)) {
            return false;
        }
        Reservass other = (Reservass) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Oficial.Reservass[ codigo=" + codigo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
