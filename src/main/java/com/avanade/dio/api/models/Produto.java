package com.avanade.dio.api.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUTOS")
public class Produto
{
	@Id
	private Integer codigo;
	private String descricao;
	private LocalDate dataValidade;
	private String ean;
	private Boolean indInativo;
	
	public Produto( )
	{
		
	}

	public Produto( Integer codigo, String descricao, LocalDate dataValidade, String ean, Boolean indInativo )
	{
		super( );
		this.codigo = codigo;
		this.descricao = descricao;
		this.dataValidade = dataValidade;
		this.ean = ean;
		this.indInativo = indInativo;
	}

	public Produto( String descricao, LocalDate dataValidade, String ean, Boolean indInativo )
	{
		super( );
		this.descricao = descricao;
		this.dataValidade = dataValidade;
		this.ean = ean;
		this.indInativo = indInativo;
	}

	@Override
	public String toString( )
	{
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", dataValidade=" + dataValidade + ", ean="
				+ ean + ", indInativo=" + indInativo + "]";
	}

	public Integer getCodigo( )
	{
		return codigo;
	}

	public void setCodigo( Integer codigo )
	{
		this.codigo = codigo;
	}

	public String getDescricao( )
	{
		return descricao;
	}

	public void setDescricao( String descricao )
	{
		this.descricao = descricao;
	}

	public LocalDate getDataValidade( )
	{
		return dataValidade;
	}

	public void setDataValidade( LocalDate dataValidade )
	{
		this.dataValidade = dataValidade;
	}

	public String getEan( )
	{
		return ean;
	}

	public void setEan( String ean )
	{
		this.ean = ean;
	}

	public Boolean getIndInativo( )
	{
		return indInativo;
	}

	public void setIndInativo( Boolean indInativo )
	{
		this.indInativo = indInativo;
	}
}
