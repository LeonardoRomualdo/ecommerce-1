package br.edu.up.convergentes.service.impl;

import java.security.Principal;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.up.convergentes.entity.Cliente;
import br.edu.up.convergentes.repository.EnderecoRepository;
import br.edu.up.convergentes.repository.PessoaRepository;
import br.edu.up.convergentes.repository.ProdutoRepository;
import br.edu.up.convergentes.service.GenericService;

public abstract class GenericServiceImpl<T> implements GenericService<T> {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	@Autowired
	protected ClienteRepository clienteRepository;
	
	@Autowired
	protected EnderecoRepository enderecoRepository;
	
	@Autowired
	protected PessoaRepository pessoaRepository;
	
	@Autowired
	protected ProdutoRepository produtoRepository;
	
	@Autowired
	protected TelefoneRepository telefoneRepository;
	
	@Autowired
	protected VendaRepository vendaRepository;	
	
	protected Cliente getCliente(Principal principal) {
		return clienteRepository.findByEmail( principal.getName() );
	}

}
