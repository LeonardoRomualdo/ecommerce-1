package br.edu.up.convergentes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/produto")
public class ProdutoController extends GenericController{
	
	@RequestMapping(value= {"","/","/listar","/listar/"},
					method= {RequestMethod.GET, RequestMethod.POST})
	public String ListarJogos() {
		
		
		//chama o service
		return "produto/listar";
	}
}
