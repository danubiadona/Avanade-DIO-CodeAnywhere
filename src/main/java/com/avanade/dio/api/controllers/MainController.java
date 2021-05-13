package com.avanade.dio.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.avanade.dio.api.models.Estoque;
import com.avanade.dio.api.models.Loja;
import com.avanade.dio.api.models.Produto;
import com.avanade.dio.api.services.EstoqueService;
import com.avanade.dio.api.services.LojaService;
import com.avanade.dio.api.services.ProdutoService;

/**
 * @author marcos.goncalves
 *
 */
@Controller
public class MainController
{
	@Autowired
    private EstoqueService estoqueService;
	
	@Autowired
    private LojaService lojaService;
	
	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping("/")
	public ModelAndView MainPage() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Loja> lojas = lojaService.findAll( );
		mv.addObject( "lojas", lojas );
		return mv;
	}

    @RequestMapping("estoque/insere/{codigoFilial}/{codigoProduto}/{quantidade}")
	public String criaEstoque(@PathVariable Integer codigoFilial, @PathVariable Integer codigoProduto, @PathVariable Integer quantidade) {
    	Loja loja = lojaService.findById( codigoFilial );
    	Produto produto = produtoService.findById( codigoProduto );
    	Estoque estoque = new Estoque( produto, loja, quantidade );
    	estoqueService.inserir(estoque);
		return "redirect:/";
	}
	
	@RequestMapping("estoque/atualiza/{codigoFilial}/{codigoProduto}/{quantidade}")
	public String atualizaEstoque(@PathVariable Integer codigoFilial, @PathVariable Integer codigoProduto, @PathVariable Integer quantidade) {
		Estoque estoque = estoqueService.findById( codigoFilial, codigoProduto );
		estoqueService.alterar( estoque );
		return "redirect:/";
	}
	
	@RequestMapping("estoque/deleta/{codigoFilial}/{codigoProduto}")
	public String deletaEstoque(@PathVariable Integer codigoFilial, @PathVariable Integer codigoProduto) {
		estoqueService.excluir(codigoFilial, codigoProduto);
		return "redirect:/";
	}
	
	@RequestMapping("produto/atualiza/descricao/{codigoProduto}/{descricao}")
	public String atualizaNomeProduto(@PathVariable Integer codigoProduto, @PathVariable String descricao) {
		Produto produto = produtoService.findById( codigoProduto );
		produto.setDescricao( descricao );
		produtoService.alterar( produto );
		return "redirect:/";
	}
}
