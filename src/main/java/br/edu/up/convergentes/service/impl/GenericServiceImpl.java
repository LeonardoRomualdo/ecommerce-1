package br.edu.up.convergentes.service.impl;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.up.convergentes.repository.ProdutoRepository;

public abstract class GenericServiceImpl<T> {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	@Autowired
	protected ProdutoRepository produtoRepository;

}
