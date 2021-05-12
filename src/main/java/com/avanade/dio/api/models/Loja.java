package com.avanade.dio.api.models;


public class Loja
{
	private Integer codigo;
	private String nome;
	private Boolean indInativo;
	
	public Loja( )
	{
		
	}

	public Loja( Integer codigo, String nome, Boolean indInativo )
	{
		super( );
		this.codigo = codigo;
		this.nome = nome;
		this.indInativo = indInativo;
	}

	public Loja( String nome, Boolean indInativo )
	{
		super( );
		this.nome = nome;
		this.indInativo = indInativo;
	}

	public Integer getCodigo( )
	{
		return codigo;
	}

	public void setCodigo( Integer codigo )
	{
		this.codigo = codigo;
	}

	public String getNome( )
	{
		return nome;
	}

	public void setNome( String nome )
	{
		this.nome = nome;
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
