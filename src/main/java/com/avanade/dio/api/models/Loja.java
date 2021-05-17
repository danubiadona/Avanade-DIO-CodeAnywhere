package com.avanade.dio.api.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="LOJAS")
public class Loja
{
	@Id
	private Integer codigo;
	private String nome;
	private Boolean indInativo;

	@JsonManagedReference //Annotation para Evitar loop infinito
	@OneToMany(mappedBy="codigoFilial")
	private List<Estoque> estoque;
	
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

	@Override
	public String toString( )
	{
		return "Loja [codigo=" + codigo + ", nome=" + nome + ", indInativo=" + indInativo + "]";
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

	public List< Estoque > getEstoque( )
	{
		return estoque;
	}

	public void setEstoque( List< Estoque > estoque )
	{
		this.estoque = estoque;
	}
}
