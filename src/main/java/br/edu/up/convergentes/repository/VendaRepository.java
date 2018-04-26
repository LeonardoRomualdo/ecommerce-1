package br.edu.up.convergentes.repository;

import javax.validation.Valid;

import br.edu.up.convergentes.entity.Produto;
import br.edu.up.convergentes.entity.Venda;


public interface VendaRepository extends GenericRepository<Venda, Long> {

	Venda adicionarNoCarrinho(@Valid Produto produto);

}
