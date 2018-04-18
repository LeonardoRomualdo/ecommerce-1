package br.edu.up.convergentes.service.impl;

import java.security.Principal;
import java.util.Collection;

import br.edu.up.convergentes.entity.Cliente;
import br.edu.up.convergentes.exception.BusinessException;
import br.edu.up.convergentes.service.ClienteService;

public class ClienteServiceImpl extends GenericServiceImpl<Cliente> implements ClienteService {

	@Override
	public Cliente find(Principal principal, Long codigo) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Cliente> findAll(Principal principal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Principal principal, Cliente clazz) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Principal principal, Cliente clazz) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Principal principal, Cliente clazz) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

}
