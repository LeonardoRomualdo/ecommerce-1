package br.edu.up.convergentes.service.impl;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.validation.constraints.Email;

import br.edu.up.convergentes.entity.Endereco;
import br.edu.up.convergentes.entity.Pessoa;
import br.edu.up.convergentes.entity.Telefone;
import br.edu.up.convergentes.exception.BusinessException;
import br.edu.up.convergentes.service.PessoaService;

public class PessoaServiceImpl extends GenericServiceImpl<Pessoa> implements PessoaService {

	@Override
	public Pessoa find(Principal principal, Long codigo) throws BusinessException {

		return pessoaRepository.find(codigo);
	}

	@Override
	public Collection<Pessoa> findAll(Principal principal) {
		
		List<Pessoa> all = new ArrayList<>( pessoaRepository.findAll() );
		
		Collections.sort(all, new Comparator<Pessoa>() {
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		});
		
		return all;
	}

	@Override
	public void save(Principal principal, Pessoa pessoa) throws BusinessException {
		try {
			List<Telefone> telefones 	= pessoa.getTelefones();
			List<Endereco> enderecos	= pessoa.getEnderecos();
			String documento			= pessoa.getDocumento();
			String email 				= pessoa.getEmail();
			
			pessoa.setTelefones( null );
			pessoa.setEnderecos( null );
			pessoa.setDocumento( null );
			pessoa.setEmail( null );
			
			if (pessoa.getId() == null) {
				pessoaRepository.save(pessoa);		
			} else {
				pessoaRepository.update(pessoa);
			}
			
			for ( Telefone tel : telefones ) {
				
				if ( tel.getNumero() == null) {
					if (tel.getId() != null) {
						telefoneRepository.remove( telefoneRepository.find( tel.getId() ) );
					}
				} else {
					tel.setPessoa(pessoa);
					if (tel.getId() == null) {
						telefoneRepository.save(tel);		
					} else {
						telefoneRepository.update(tel);
					}
				}
			}
			} catch(Exception e) {
				throw new BusinessException("Erro ao salvar");
			}
		
	}

	@Override
	public void update(Principal principal, Pessoa pessoa) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Principal principal, Pessoa pessoa) throws BusinessException {
		try {
			pessoaRepository.remove(pessoa);	
		} catch (Exception e) {
			throw new BusinessException("Erro ao deletar objeto");
		}		
	}
}
