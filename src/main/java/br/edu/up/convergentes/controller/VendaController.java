package br.edu.up.convergentes.controller;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.edu.up.convergentes.entity.Produto;
import br.edu.up.convergentes.entity.Venda;
import br.edu.up.convergentes.repository.VendaRepository;

@Controller
@RequestMapping("/venda")
public class VendaController extends GenericController{
	
	private VendaRepository vendaRepository;

	@GetMapping(produces="application/json")
	public @ResponseBody Collection<Venda> ListarPedidos() {
		Collection<Venda> listaPedidos = vendaRepository.findAll();
		return listaPedidos;
	}
	
	@RequestMapping(value= {"","/","/listarPedido","/listarPedido/"},
					method= {RequestMethod.GET, RequestMethod.POST})
	public String listarPedido(@RequestBody Venda produto) {
		vendaRepository.find(produto.getId());
		return listarPedido(produto);
	}
	
	@PostMapping()
	public Venda adicionarNoCarrinho(@RequestBody @Valid Produto produto) {
		return vendaRepository.adicionarNoCarrinho(produto);
	}
}
