package br.edu.up.convergentes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="endereco")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id;

	@Column
	private Long numero;
	
	@Column
	private boolean ativo = true;
	
	@Column
	@NotNull(message="{error.entity.field.mandatory}")
	@Size(min = 1, max = 300)
	private String endereco;
	
	@Column
	private Long cep;

	@Column
	@Size(min = 0, max = 300)
	private String bairro;

	@Column
	@Size(min = 0, max = 300)
	private String complemento;

}
