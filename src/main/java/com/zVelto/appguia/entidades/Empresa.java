package com.zVelto.appguia.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_empresas")
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "EMP_CODIGO")
	private Integer codigo;
	@Column(name = "EMP_NOME")
	private String nome;
	@Column(name = "EMP_CNPJ")
	private String cnpj;
	@Column(name = "EMP_EMAIL")
	private String email;
	@Column(name = "EMP_TELEFONE")
	private String telefone1;
	@Column(name = "EMP_TELEFONE1")
	private String telefone2;
	@Column(name = "EMP_TELEFONE2")
	private String telefone3;
	@Column(name = "EMP_RUA")
	private String rua;
	@Column(name = "EMP_NUMERO")
	private String numero;
	@Column(name = "EMP_COMPLEMENTO")
	private String complemento;
	@Column(name = "EMP_BAIRRO")
	private String bairro;
	@Column(name = "EMP_CIDADE")
	private String cidade;
	@Column(name = "EMP_UF")
	private String uf;
	@Column(name = "EMP_CEP")
	private String cep;
	@Column(name = "EMP_USR_CADASTRO")
	private Integer cadastro;
	@Column(name = "EMP_DT_CADASTRO")
	private Date dataDeCadastro;
	@Column(name = "EMP_USR_ATT")
	private Integer atualizacao;
	@Column(name = "EMP_DT_ATT")
	private Date dataDeAtualizacao;
	
	public Empresa() {
	}

	public Empresa(Integer codigo, String nome, String cnpj, String email, String telefone1, String telefone2,
			String telefone3, String rua, String numero, String complemento, String bairro, String cidade, String uf,
			String cep, Integer cadastro, Date dataDeCadastro, Integer atualizacao, Date dataDeAtualizacao) {
		this.codigo = codigo;
		this.nome = nome;
		this.cnpj = cnpj;
		this.email = email;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.telefone3 = telefone3;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		this.cadastro = cadastro;
		this.dataDeCadastro = dataDeCadastro;
		this.atualizacao = atualizacao;
		this.dataDeAtualizacao = dataDeAtualizacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getTelefone3() {
		return telefone3;
	}

	public void setTelefone3(String telefone3) {
		this.telefone3 = telefone3;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getCadastro() {
		return cadastro;
	}

	public void setCadastro(Integer cadastro) {
		this.cadastro = cadastro;
	}

	public Date getDataDeCadastro() {
		return dataDeCadastro;
	}

	public void setDataDeCadastro(Date dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}

	public Integer getAtualizacao() {
		return atualizacao;
	}

	public void setAtualizacao(Integer atualizacao) {
		this.atualizacao = atualizacao;
	}

	public Date getDataDeAtualizacao() {
		return dataDeAtualizacao;
	}

	public void setDataDeAtualizacao(Date dataDeAtualizacao) {
		this.dataDeAtualizacao = dataDeAtualizacao;
	}

	public Integer getCodigo() {
		return codigo;
	}
	
}
