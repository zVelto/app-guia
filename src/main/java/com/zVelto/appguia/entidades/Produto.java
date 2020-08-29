package com.zVelto.appguia.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer codigo;
	private String descricao;
	private Double preco;
	private Date dataDeCadastro;
	private Date dataDeAtualizacao;
	
	
	public Produto() {
	}

	public Produto(Integer codigo, String descricao, Double preco, Date dataDeCadastro, Date dataDeAtualizacao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.dataDeCadastro = dataDeCadastro;
		this.dataDeAtualizacao = dataDeAtualizacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Date getDataDeCadastro() {
		return dataDeCadastro;
	}

	public void setDataDeCadastro(Date dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
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
