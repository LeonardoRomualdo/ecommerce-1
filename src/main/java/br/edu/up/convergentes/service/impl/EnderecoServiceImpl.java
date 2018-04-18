package br.edu.up.convergentes.service.impl;

import java.security.Principal;
import java.util.Collection;

import br.edu.up.convergentes.entity.Endereco;
import br.edu.up.convergentes.exception.BusinessException;
import br.edu.up.convergentes.service.EnderecoService;

public class EnderecoServiceImpl extends GenericServiceImpl<Endereco> implements EnderecoService{

	@Override
	public Endereco find(Principal principal, Long codigo) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Endereco> findAll(Principal principal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Principal principal, Endereco clazz) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Principal principal, Endereco clazz) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Principal principal, Endereco clazz) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

}
