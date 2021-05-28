package com.avanade.dio.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.avanade.dio.api.models.Preco;
import com.avanade.dio.api.services.PrecoService;

@RestController
@RequestMapping("/api/v1/itens")
public class PrecoController {
    
	@Autowired
    private PrecoService precoService;
	
    @GetMapping
    public Iterable<Preco> listar(){
        return precoService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void inserir(@RequestBody Preco preco){
        precoService.inserir(preco);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void alterar(@RequestBody Preco preco){
        precoService.alterar(preco);
    }

}
