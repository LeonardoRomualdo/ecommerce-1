package br.edu.up.convergentes.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "pessoa")
@DiscriminatorColumn(name="tipoPessoa")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	@Size(min=1, max=255)
	private String tipoPessoa;
	
	@JsonManagedReference
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="codigo_cliente")
	private Cliente cliente;
	
	@Column(name="documento")
	@Size(min=1, max=255)
	private String documento;
	
	@Column(name="email")
	@Size(min=1, max=255)
	private String email;
	
	@JsonManagedReference
	@OneToMany(fetch=FetchType.LAZY, mappedBy="pessoa", cascade=CascadeType.ALL)
	private List<Telefone> telefones = new ArrayList<>();
	
	@JsonManagedReference
	@OneToMany(fetch=FetchType.LAZY, mappedBy="pessoa", cascade=CascadeType.ALL)
//	@OrderBy("ativo DESC")
	private List<Endereco> enderecos = new ArrayList<>();

	public Pessoa() {
		super();
	}

	public Pessoa(@Size(min = 1, max = 255) String tipoPessoa, Cliente cliente,
			@Size(min = 1, max = 255) String documento, @Size(min = 1, max = 255) String email,
			List<Telefone> telefones, List<Endereco> enderecos) {
		super();
		this.tipoPessoa = tipoPessoa;
		this.cliente = cliente;
		this.documento = documento;
		this.email = email;
		this.telefones = telefones;
		this.enderecos = enderecos;
	}

	public Pessoa(Long id, @Size(min = 1, max = 255) String tipoPessoa, Cliente cliente,
			@Size(min = 1, max = 255) String documento, @Size(min = 1, max = 255) String email,
			List<Telefone> telefones, List<Endereco> enderecos) {
		super();
		this.id = id;
		this.tipoPessoa = tipoPessoa;
		this.cliente = cliente;
		this.documento = documento;
		this.email = email;
		this.telefones = telefones;
		this.enderecos = enderecos;
	}	
}
