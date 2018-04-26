package br.edu.up.convergentes.repository.impl;

import javax.validation.Valid;

import br.edu.up.convergentes.entity.Produto;
import br.edu.up.convergentes.entity.Venda;
import br.edu.up.convergentes.repository.VendaRepository;

public class VendaRepositoryImpl extends GenericRepositoryImpl<Venda, Long> implements VendaRepository {

	@Override
	public Venda adicionarNoCarrinho(@Valid Produto produto) {
		// TODO Auto-generated method stub
		return null;
	}


}
