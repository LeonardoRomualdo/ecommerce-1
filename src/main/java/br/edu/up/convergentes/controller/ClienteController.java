package br.edu.up.convergentes.controller;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.up.convergentes.entity.Cliente;
import br.edu.up.convergentes.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@RequestMapping(value="save", method= {RequestMethod.POST, RequestMethod.GET}, 
//			consumes= {MediaType.APPLICATION_JSON_VALUE},
			produces= {MediaType.APPLICATION_JSON_VALUE})
	public Cliente salvar(@Valid Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@GetMapping(value="/listar/json",
	produces= {MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody Collection<Cliente> listaClienteJSON() {
		Collection<Cliente> listaCliente = clienteRepository.findAll();
		return listaCliente;
	}
	
	@RequestMapping(value="/listar/xml",
			method= {RequestMethod.GET}, produces= {MediaType.APPLICATION_XML_VALUE})
	public @ResponseBody Collection<Cliente> listaClienteXML() {
		Collection<Cliente> listaCliente = clienteRepository.findAll();
		return listaCliente;
	}
	
	@DeleteMapping()
	public Cliente deletaCliente(@RequestBody Cliente cliente) {
		clienteRepository.remove(cliente);
		return cliente;
	}
}
