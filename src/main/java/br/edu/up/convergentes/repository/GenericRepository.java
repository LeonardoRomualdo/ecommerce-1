package br.edu.up.convergentes.repository;

import java.io.Serializable;
import java.util.Collection;

import org.hibernate.exception.ConstraintViolationException;

public interface GenericRepository<T, ID extends Serializable> {
	
	public T find(ID id);

	public void save(T entity);

	public T update(T entity);

	public void remove(T entity) throws ConstraintViolationException;

	public Collection<T> findAll();

	public Collection<T> findInRange(int firstResult, int maxResults);

	public Long count();
	
	public void executeUpdateNativeQuery(StringBuffer nativeQuery);
}
