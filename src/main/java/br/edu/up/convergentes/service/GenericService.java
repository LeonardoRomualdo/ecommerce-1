package br.edu.up.convergentes.service;

public interface GenericService<T> {
	
	T find(Long codigo);
	
//	Collection<T> findAll(  );

	void save(T clazz);

	void update(T clazz);
	
	void delete(T clazz);

}
