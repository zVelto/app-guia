package com.zVelto.appguia.entidades;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Status implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer codigo;
	private String descricao;
	
	public Status() {
	}

	public Status(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

}
