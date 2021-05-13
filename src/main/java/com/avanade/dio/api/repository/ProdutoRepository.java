package com.avanade.dio.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.avanade.dio.api.models.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, String>
{
	public Produto findByCodigo(Integer codigo);
}
