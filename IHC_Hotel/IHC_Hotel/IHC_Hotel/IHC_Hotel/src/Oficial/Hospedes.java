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
@Table(name = "hospedes", catalog = "newhotel", schema = "")
@NamedQueries({
    @NamedQuery(name = "Hospedes.findAll", query = "SELECT h FROM Hospedes h"),
    @NamedQuery(name = "Hospedes.findByCodigo", query = "SELECT h FROM Hospedes h WHERE h.codigo = :codigo"),
    @NamedQuery(name = "Hospedes.findByNome", query = "SELECT h FROM Hospedes h WHERE h.nome = :nome"),
    @NamedQuery(name = "Hospedes.findByCpf", query = "SELECT h FROM Hospedes h WHERE h.cpf = :cpf"),
    @NamedQuery(name = "Hospedes.findByRg", query = "SELECT h FROM Hospedes h WHERE h.rg = :rg"),
    @NamedQuery(name = "Hospedes.findBySexo", query = "SELECT h FROM Hospedes h WHERE h.sexo = :sexo"),
    @NamedQuery(name = "Hospedes.findByDatanasc", query = "SELECT h FROM Hospedes h WHERE h.datanasc = :datanasc"),
    @NamedQuery(name = "Hospedes.findByEmail", query = "SELECT h FROM Hospedes h WHERE h.email = :email"),
    @NamedQuery(name = "Hospedes.findByTel", query = "SELECT h FROM Hospedes h WHERE h.tel = :tel"),
    @NamedQuery(name = "Hospedes.findByCel", query = "SELECT h FROM Hospedes h WHERE h.cel = :cel"),
    @NamedQuery(name = "Hospedes.findByEndereco", query = "SELECT h FROM Hospedes h WHERE h.endereco = :endereco"),
    @NamedQuery(name = "Hospedes.findByNum", query = "SELECT h FROM Hospedes h WHERE h.num = :num"),
    @NamedQuery(name = "Hospedes.findByCep", query = "SELECT h FROM Hospedes h WHERE h.cep = :cep"),
    @NamedQuery(name = "Hospedes.findByCidade", query = "SELECT h FROM Hospedes h WHERE h.cidade = :cidade"),
    @NamedQuery(name = "Hospedes.findByUf", query = "SELECT h FROM Hospedes h WHERE h.uf = :uf")})
public class Hospedes implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    @Basic(optional = false)
    @Column(name = "CPF")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "RG")
    private String rg;
    @Basic(optional = false)
    @Column(name = "SEXO")
    private Character sexo;
    @Basic(optional = false)
    @Column(name = "DATANASC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datanasc;
    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "TEL")
    private String tel;
    @Column(name = "CEL")
    private String cel;
    @Basic(optional = false)
    @Column(name = "ENDERECO")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "NUM")
    private int num;
    @Basic(optional = false)
    @Column(name = "CEP")
    private String cep;
    @Basic(optional = false)
    @Column(name = "CIDADE")
    private String cidade;
    @Basic(optional = false)
    @Column(name = "UF")
    private String uf;

    public Hospedes() {
    }

    public Hospedes(Integer codigo) {
        this.codigo = codigo;
    }

    public Hospedes(Integer codigo, String nome, String cpf, String rg, Character sexo, Date datanasc, String email, String endereco, int num, String cep, String cidade, String uf) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.datanasc = datanasc;
        this.email = email;
        this.endereco = endereco;
        this.num = num;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        Integer oldCodigo = this.codigo;
        this.codigo = codigo;
        changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        String oldRg = this.rg;
        this.rg = rg;
        changeSupport.firePropertyChange("rg", oldRg, rg);
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        Character oldSexo = this.sexo;
        this.sexo = sexo;
        changeSupport.firePropertyChange("sexo", oldSexo, sexo);
    }

    public Date getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(Date datanasc) {
        Date oldDatanasc = this.datanasc;
        this.datanasc = datanasc;
        changeSupport.firePropertyChange("datanasc", oldDatanasc, datanasc);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        String oldTel = this.tel;
        this.tel = tel;
        changeSupport.firePropertyChange("tel", oldTel, tel);
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        String oldCel = this.cel;
        this.cel = cel;
        changeSupport.firePropertyChange("cel", oldCel, cel);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        int oldNum = this.num;
        this.num = num;
        changeSupport.firePropertyChange("num", oldNum, num);
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        String oldCep = this.cep;
        this.cep = cep;
        changeSupport.firePropertyChange("cep", oldCep, cep);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        String oldCidade = this.cidade;
        this.cidade = cidade;
        changeSupport.firePropertyChange("cidade", oldCidade, cidade);
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        String oldUf = this.uf;
        this.uf = uf;
        changeSupport.firePropertyChange("uf", oldUf, uf);
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
        if (!(object instanceof Hospedes)) {
            return false;
        }
        Hospedes other = (Hospedes) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Oficial.Hospedes[ codigo=" + codigo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
