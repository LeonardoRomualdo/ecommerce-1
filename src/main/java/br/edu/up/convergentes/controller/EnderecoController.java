package br.edu.up.convergentes.controller;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.up.convergentes.entity.Endereco;
import br.edu.up.convergentes.repository.EnderecoRepository;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
	
//	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@PostMapping()
	public Endereco postEndereco(@RequestBody @Valid Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
	
	@GetMapping(produces="application/json")
	public @ResponseBody Collection<Endereco> listaEndereco() {
		Collection<Endereco> listaEndereco = enderecoRepository.findAll();
		return listaEndereco;
	}
	
	@DeleteMapping()
	public Endereco deletaEndereco(@RequestBody Endereco endereco) {
		enderecoRepository.remove(endereco);
		return endereco;
	}
	

}
