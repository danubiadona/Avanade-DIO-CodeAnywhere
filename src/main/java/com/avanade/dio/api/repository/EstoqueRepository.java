package com.avanade.dio.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.avanade.dio.api.models.Estoque;
import com.avanade.dio.api.models.Produto;

public interface EstoqueRepository extends CrudRepository<Estoque, String>
{
	public Estoque findByCodigoFilial(Integer codigoFilial);
	public Estoque findByCodigoProduto(Produto codigoProduto);
}
