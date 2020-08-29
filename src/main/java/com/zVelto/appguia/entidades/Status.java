package com.zVelto.appguia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_status")
public class Status implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "STS_CODIGO")
	private Integer codigo;
	@Column(name = "STS_DESCRICAO")
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
