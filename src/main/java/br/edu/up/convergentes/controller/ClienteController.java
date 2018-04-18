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

import br.edu.up.convergentes.entity.Cliente;
import br.edu.up.convergentes.entity.Pessoa;
import br.edu.up.convergentes.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@PostMapping()
	public Cliente postCliente(@RequestBody @Valid Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@GetMapping(produces="application/json")
	public @ResponseBody Cliente listaCliente() {
		Collection<Cliente> listaCliente = clienteRepository.findAll();
		return clienteRepository;
	}
	
	@DeleteMapping()
	public Cliente deletaCliente(@RequestBody Cliente cliente) {
		clienteRepository.remove(cliente);
		return cliente;
	}
}
