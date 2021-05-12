package com.avanade.dio.api.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avanade.dio.api.models.Estoque;
import com.avanade.dio.api.models.Loja;
import com.avanade.dio.api.models.Produto;

@Service
public class EstoqueService {

    @Autowired
    private LojaService lojaService;
    @Autowired
    private ProdutoService produtoService;

    public List<Estoque> findAll(){
        List<Estoque> listaEstoque = new ArrayList<Estoque>();
        //Primeiro item do estoque
        Loja loja = lojaService.geraItem(1);
        Produto produto = produtoService.geraItem(1, "123456789");
        Estoque e1 = new Estoque(produto, loja, 10);
        //Segundo item do estoque
        loja = lojaService.geraItem(1);
        produto = produtoService.geraItem(2, "987654321");
        Estoque e2 = new Estoque(produto, loja, 20);        

        listaEstoque.add(e1);
        listaEstoque.add(e2);
        return listaEstoque;
    }

    public void inserir(Estoque estoque){
        System.out.println("INSERIDO: " + estoque);
    }

    public void alterar(Estoque estoque){
        System.out.println("ALTERADO: " + estoque);
    }    

    public void excluir(Long id){
        System.out.println("EXCLUIDO: " + id);
    } 
}
