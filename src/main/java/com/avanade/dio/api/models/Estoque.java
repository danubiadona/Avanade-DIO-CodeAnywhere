package com.avanade.dio.api.models;

public class Estoque
{
	private Integer quantidade;

	private Produto produto;
	private Loja filial;
	
	public Estoque( )
	{
		
	}

	public Estoque( Produto produto, Loja filial, Integer quantidade )
	{
		super( );
		this.produto = produto;
		this.filial = filial;
		this.quantidade = quantidade;
	}

	public Integer getQuantidade( )
	{
		return quantidade;
	}

	public void setQuantidade( Integer quantidade )
	{
		this.quantidade = quantidade;
	}

	public Produto getProduto( )
	{
		return produto;
	}

	public void setProduto( Produto produto )
	{
		this.produto = produto;
	}

	public Loja getFilial( )
	{
		return filial;
	}

	public void setFilial( Loja filial )
	{
		this.filial = filial;
	}
}
