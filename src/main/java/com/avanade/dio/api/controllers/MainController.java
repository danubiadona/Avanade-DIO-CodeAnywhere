package com.avanade.dio.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.avanade.dio.api.models.Estoque;
import com.avanade.dio.api.models.Loja;
import com.avanade.dio.api.models.Produto;
import com.avanade.dio.api.repository.EstoqueRepository;
import com.avanade.dio.api.repository.LojaRepository;
import com.avanade.dio.api.repository.ProdutoRepository;

/**
 * @author marcos.goncalves
 *
 */
@Controller
public class MainController
{
	@Autowired
	private EstoqueRepository estoqueRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private LojaRepository lojaRepository;
	
	@RequestMapping("/")
	public ModelAndView MainPage() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Loja> lojas = lojaRepository.findAll( );
		mv.addObject( "lojas", lojas );
		return mv;
	}

    @RequestMapping("/insere")
	public String criaEstoque() {
		Produto batata = produtoRepository.findByCodigo( 3 );
		Loja lojaRecife = lojaRepository.findByCodigo( 3000 );
		Estoque e = new Estoque( batata , lojaRecife, 70 );
		estoqueRepository.save( e );
		return "redirect:/";
	}
	
	@RequestMapping("/atualiza")
	public String atualiza() {
		Produto objeto2 = produtoRepository.findByCodigo( 2 );
		objeto2.setDescricao( "Cenoura" );
		produtoRepository.save( objeto2 );
		return "redirect:/";
	}
	
	@RequestMapping("/deleta")
	public String delete() {
		Produto p = produtoRepository.findByCodigo( 3 );
		Estoque e = estoqueRepository.findByCodigoProduto( p );
		estoqueRepository.delete( e );
		return "redirect:/";
	}
}
