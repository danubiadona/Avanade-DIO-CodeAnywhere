package com.avanade.dio.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.avanade.dio.api.models.Estoque;
import com.avanade.dio.api.services.EstoqueService;

@RestController
@RequestMapping("/api/v1/price")
public class EstoqueController {
    
	@Autowired
    private EstoqueService estoqueService;
	
    @GetMapping
    public Iterable<Estoque> listar(){
        return estoqueService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void inserir(@RequestBody Estoque estoque){
        estoqueService.inserir(estoque);
    }
    
    @PostMapping
    @RequestMapping("{codigoFilial}/{codigoProduto}/{quantidade}")
    @ResponseStatus(HttpStatus.CREATED)
    public void inserir(@PathVariable Integer codigoFilial, @PathVariable Integer codigoProduto, @PathVariable Integer quantidade){
        Estoque estoque = estoqueService.findById( codigoFilial, codigoProduto );
    	estoqueService.inserir(estoque);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void alterar(@RequestBody Estoque estoque){
        estoqueService.alterar(estoque);
    }

    @DeleteMapping
    @RequestMapping("{codigoFilial}/{codigoProduto}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void excluir(@PathVariable Integer codigoFilial, @PathVariable Integer codigoProduto){
        estoqueService.excluir(codigoFilial, codigoProduto);
    }
}
