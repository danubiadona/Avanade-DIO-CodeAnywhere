package com.avanade.dio.api.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.avanade.dio.api.models.Produto;

import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    public List<Produto> findAll(){
        return geraLista();
    }

    public void inserir(Produto produto){
        System.out.println("INSERIDO: " + produto);
    }

    public void alterar(Produto produto){
        System.out.println("ALTERADO: " + produto);
    }    

    public void excluir(Long id){
        System.out.println("EXCLUIDO: " + id);
    }

    private List<Produto> geraLista(){
        List<Produto> listaProduto = new ArrayList<Produto>();
        Produto p1 = geraItem(1, "123456789");
        Produto p2 = geraItem(2, "987654321");
        listaProduto.add(p1);
        listaProduto.add(p2);
        return listaProduto;
    }

    public Produto geraItem(int id, String ean){
        return new Produto(id, "descricao" + id, new Date(), ean, false);
    }    

}
