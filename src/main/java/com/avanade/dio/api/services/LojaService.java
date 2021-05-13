package com.avanade.dio.api.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avanade.dio.api.models.Loja;
import com.avanade.dio.api.repository.LojaRepository;

@Service
public class LojaService {
    
	@Autowired
	private LojaRepository lojaRepository;
	
	public Iterable<Loja> findAll(){
        return lojaRepository.findAll( );
    }

    public void inserir(Loja loja){
        System.out.println("INSERIDO: " + loja);
    }

    public void alterar(Loja loja){
        System.out.println("ALTERADO: " + loja);
    }    

    public void excluir(Long id){
        System.out.println("EXCLUIDO: " + id);
    }    

    private Iterable<Loja> geraLista(){
        List<Loja> listaLoja = new ArrayList<Loja>();
        Loja l1 = geraItem(1);
        Loja l2 = geraItem(2);
        listaLoja.add(l1);
        listaLoja.add(l2);
        return listaLoja;    
    }

    public Loja geraItem(int id){
        return new Loja(id, "nome" + id , false);
    }
}
