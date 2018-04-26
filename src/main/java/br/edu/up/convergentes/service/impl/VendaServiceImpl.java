package br.edu.up.convergentes.service.impl;

import java.security.Principal;
import java.util.Collection;

import br.edu.up.convergentes.entity.Venda;
import br.edu.up.convergentes.exception.BusinessException;
import br.edu.up.convergentes.service.VendaService;

public class VendaServiceImpl extends GenericServiceImpl<Venda> implements VendaService {

	@Override
	public Venda find(Principal principal, Long codigo) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Venda> findAll(Principal principal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Principal principal, Venda clazz) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Principal principal, Venda clazz) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Principal principal, Venda clazz) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

}
