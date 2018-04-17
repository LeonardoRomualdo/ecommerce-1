package br.edu.up.convergentes.service;

import java.security.Principal;
import java.util.Collection;

import br.edu.up.convergentes.exception.BusinessException;

public interface GenericService<T> {
	
	T find(Principal principal, Long codigo) throws BusinessException;
	
	Collection<T> findAll( Principal principal );

	void save(Principal principal, T clazz) throws BusinessException;

	void update(Principal principal, T clazz) throws BusinessException;
	
	void delete(Principal principal, T clazz) throws BusinessException;

}
