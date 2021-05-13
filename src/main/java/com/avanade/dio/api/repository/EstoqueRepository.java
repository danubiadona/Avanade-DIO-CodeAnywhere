package com.avanade.dio.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.avanade.dio.api.models.Estoque;
import com.avanade.dio.api.models.Loja;
import com.avanade.dio.api.models.Produto;

public interface EstoqueRepository extends CrudRepository<Estoque, String>
{
	public Estoque findByCodigoFilialAndCodigoProduto(Loja codigoFilial, Produto codigoProduto);
}
