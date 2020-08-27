package com.zVelto.appguia.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Segmento implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer codigo;
	private String descricao;
	private Integer cadastro;
	private Date dataDeCadastro;
	private Integer atualizacao;
	private Date dataDeAtualizacao;
	
	public Segmento() {
	}

	public Segmento(Integer codigo, String descricao, Integer cadastro, Date dataDeCadastro, Integer atualizacao,
			Date dataDeAtualizacao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.cadastro = cadastro;
		this.dataDeCadastro = dataDeCadastro;
		this.atualizacao = atualizacao;
		this.dataDeAtualizacao = dataDeAtualizacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
