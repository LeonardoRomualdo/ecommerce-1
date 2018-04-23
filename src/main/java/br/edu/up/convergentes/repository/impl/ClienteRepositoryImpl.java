package br.edu.up.convergentes.repository.impl;

import org.springframework.stereotype.Repository;

import br.edu.up.convergentes.entity.Cliente;
import br.edu.up.convergentes.repository.ClienteRepository;

@Repository
public class ClienteRepositoryImpl extends GenericRepositoryImpl<Cliente, Long> implements ClienteRepository {

}
