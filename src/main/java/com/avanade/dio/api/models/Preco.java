package com.avanade.dio.api.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@IdClass(PrecoId.class)
public class Preco
{
	@Id
	private Integer codigo;
	private Long valor;
	private Date dataInicio;
	private Date dataFim;
	private Boolean indInativo;

	@Id
	@JsonBackReference //Annotation para Evitar loop infinito
	@ManyToOne
	@JoinColumn(name="CODIGO_FILIAL", nullable=false)
	private Produto codigoProduto;
	
	public Preco( )
	{
		
	}

	public Preco( Integer codigo, Long valor, Date dataInicio, Date dataFim, Boolean indInativo )
	{
		super( );
		this.codigo = codigo;
		this.valor = valor; 
		this.dataInicio = dataInicio; 
		this.dataFim = dataFim; 
		this.indInativo = indInativo;
	}

	@Override
	public String toString( )
	{
		return "Preco [codigo=" + codigo + ", valor=" + valor + ", indInativo=" + indInativo + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + "]";
	}

	public Integer getCodigo( )
	{
		return codigo;
	}

	public void setCodigo( Integer codigo )
	{
		this.codigo = codigo;
	}

	public Long getValor( )
	{
		return valor;
	}

	public void setValor( Long valor )
	{
		this.valor = valor;
	}

	public Boolean getIndInativo( )
	{
		return indInativo;
	}

	public void setIndInativo( Boolean indInativo )
	{
		this.indInativo = indInativo;
	}

	public Produto getCodigoProduto( )
	{
		return codigoProduto;
	}

	public void setCodigoProduto( Produto codigoProduto )
	{
		this.codigoProduto = codigoProduto;
	}
}
