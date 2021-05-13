package com.avanade.dio.api.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@IdClass(EstoqueId.class)
public class Estoque
{
	private Integer quantidade;

	@Id
	@ManyToOne
	@JoinColumn(name="CODIGO_PRODUTO", nullable=false)
	private Produto codigoProduto;
	
	@Id
	@JsonBackReference //Annotation para Evitar loop infinito
	@ManyToOne
	@JoinColumn(name="CODIGO_FILIAL", nullable=false)
	private Loja codigoFilial;
	
	public Estoque( )
	{
		
	}

	public Estoque( Produto codigoProduto, Loja codigoFilial, Integer quantidade )
	{
		super( );
		this.codigoProduto = codigoProduto;
		this.codigoFilial = codigoFilial;
		this.quantidade = quantidade;
	}

	@Override
	public String toString( )
	{
		return "Estoque [quantidade=" + quantidade + ", codigoProduto=" + codigoProduto + ", codigoFilial="
				+ codigoFilial + "]";
	}

	public Integer getQuantidade( )
	{
		return quantidade;
	}

	public void setQuantidade( Integer quantidade )
	{
		this.quantidade = quantidade;
	}

	public Produto getCodigoProduto( )
	{
		return codigoProduto;
	}

	public void setCodigoProduto( Produto codigoProduto )
	{
		this.codigoProduto = codigoProduto;
	}

	public Loja getCodigoFilial( )
	{
		return codigoFilial;
	}

	public void setCodigoFilial( Loja codigoFilial )
	{
		this.codigoFilial = codigoFilial;
	}
}
