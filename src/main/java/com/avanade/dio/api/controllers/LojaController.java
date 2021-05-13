package com.avanade.dio.api.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.avanade.dio.api.models.Loja;
import com.avanade.dio.api.services.LojaService;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping("/api/v1/lojas")
public class LojaController {

    @Autowired
    private LojaService lojaService;
    
    @GetMapping
    public Iterable<Loja> listar(){
        return lojaService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void inserir(@RequestBody Loja loja){
        lojaService.inserir(loja);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void alterar(@RequestBody Loja loja){
        lojaService.alterar(loja);
    }

    @DeleteMapping
    @RequestMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void excluir(@PathVariable Integer id){
        lojaService.excluir(id);
    }    
}
