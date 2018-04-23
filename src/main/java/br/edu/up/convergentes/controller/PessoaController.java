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

import br.edu.up.convergentes.entity.Pessoa;
import br.edu.up.convergentes.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
//	@Autowired
	private PessoaRepository pessoaRepository;
	
	@PostMapping()
	public Pessoa postPessoa(@RequestBody @Valid Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	@GetMapping(produces="application/json")
	public @ResponseBody Collection<Pessoa> listaPessoa() {
		Collection<Pessoa> listaPessoas = pessoaRepository.findAll();
		return listaPessoas;
	}
	
	@DeleteMapping()
	public Pessoa deletaPessoa(@RequestBody Pessoa pessoa) {
		pessoaRepository.remove(pessoa);
		return pessoa;
	}

}
