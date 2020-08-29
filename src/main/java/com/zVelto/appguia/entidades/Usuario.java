package com.zVelto.appguia.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer codigo;
	private String nome;
	private String cpf;
	private String login;
	private String senha;
	private String telefone1;
	private String telefone2;
	private String telefone3;
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	private Integer cadastro;
	private Date dataDeCadastro;
	private Integer atualizacao;
	private Date dataDeAtualizacao;
	
	
	public Usuario() {
	}


	public Usuario(Integer codigo, String nome, String cpf, String login, String senha, String telefone1,
			String telefone2, String telefone3, String rua, String numero, String complemento, String bairro,
			String cidade, String uf, String cep, Integer cadastro, Date dataDeCadastro, Integer atualizacao,
			Date dataDeAtualizacao) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.login = login;
		this.senha = senha;
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


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
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
