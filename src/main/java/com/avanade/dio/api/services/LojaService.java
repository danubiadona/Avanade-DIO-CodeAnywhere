package com.avanade.dio.api.services;

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
	
	public Loja findById(Integer id) {
		return lojaRepository.findByCodigo( id );
	}

    public void inserir(Loja loja){
    	lojaRepository.save( loja );
        System.out.println("INSERIDO: " + loja);
    }

    public void alterar(Loja loja){
    	lojaRepository.save( loja );
        System.out.println("ALTERADO: " + loja);
    }    

    public void excluir(Integer id){
    	Loja loja = lojaRepository.findByCodigo( id );
    	lojaRepository.delete( loja );
        System.out.println("EXCLUIDO: " + loja);
    }    
}
