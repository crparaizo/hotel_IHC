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
@Table(name = "recepcionistas", catalog = "newhotel", schema = "")
@NamedQueries({
    @NamedQuery(name = "Recepcionistas.findAll", query = "SELECT r FROM Recepcionistas r"),
    @NamedQuery(name = "Recepcionistas.findByCodigo", query = "SELECT r FROM Recepcionistas r WHERE r.codigo = :codigo"),
    @NamedQuery(name = "Recepcionistas.findByNome", query = "SELECT r FROM Recepcionistas r WHERE r.nome = :nome"),
    @NamedQuery(name = "Recepcionistas.findByCpf", query = "SELECT r FROM Recepcionistas r WHERE r.cpf = :cpf"),
    @NamedQuery(name = "Recepcionistas.findByRg", query = "SELECT r FROM Recepcionistas r WHERE r.rg = :rg"),
    @NamedQuery(name = "Recepcionistas.findBySexo", query = "SELECT r FROM Recepcionistas r WHERE r.sexo = :sexo"),
    @NamedQuery(name = "Recepcionistas.findByDatanasc", query = "SELECT r FROM Recepcionistas r WHERE r.datanasc = :datanasc"),
    @NamedQuery(name = "Recepcionistas.findByEmail", query = "SELECT r FROM Recepcionistas r WHERE r.email = :email"),
    @NamedQuery(name = "Recepcionistas.findByTel", query = "SELECT r FROM Recepcionistas r WHERE r.tel = :tel"),
    @NamedQuery(name = "Recepcionistas.findByCel", query = "SELECT r FROM Recepcionistas r WHERE r.cel = :cel"),
    @NamedQuery(name = "Recepcionistas.findByEndereco", query = "SELECT r FROM Recepcionistas r WHERE r.endereco = :endereco"),
    @NamedQuery(name = "Recepcionistas.findByNum", query = "SELECT r FROM Recepcionistas r WHERE r.num = :num"),
    @NamedQuery(name = "Recepcionistas.findByCep", query = "SELECT r FROM Recepcionistas r WHERE r.cep = :cep"),
    @NamedQuery(name = "Recepcionistas.findByCidade", query = "SELECT r FROM Recepcionistas r WHERE r.cidade = :cidade"),
    @NamedQuery(name = "Recepcionistas.findByUf", query = "SELECT r FROM Recepcionistas r WHERE r.uf = :uf"),
    @NamedQuery(name = "Recepcionistas.findBySenha", query = "SELECT r FROM Recepcionistas r WHERE r.senha = :senha")})
public class Recepcionistas implements Serializable {
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
    @Basic(optional = false)
    @Column(name = "SENHA")
    private String senha;

    public Recepcionistas() {
    }

    public Recepcionistas(Integer codigo) {
        this.codigo = codigo;
    }

    public Recepcionistas(Integer codigo, String nome, String cpf, String rg, Character sexo, Date datanasc, String email, String endereco, int num, String cep, String cidade, String uf, String senha) {
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
        this.senha = senha;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        String oldSenha = this.senha;
        this.senha = senha;
        changeSupport.firePropertyChange("senha", oldSenha, senha);
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
        if (!(object instanceof Recepcionistas)) {
            return false;
        }
        Recepcionistas other = (Recepcionistas) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Oficial.Recepcionistas[ codigo=" + codigo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
