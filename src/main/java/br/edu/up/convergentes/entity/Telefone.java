package br.edu.up.convergentes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="telefone")
public class Telefone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id;
	
	@Column
	private String tipoTelefone;
	
	@Column
	private Long ddd;
	
	@Column
	private Long numero;
	
	@Column
	private Long ramal;
	
	@JsonBackReference
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="codigo_pessoa")
	private Pessoa pessoa;

	public Telefone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Telefone(Long id, String tipoTelefone, Long ddd, Long numero, Long ramal, Pessoa pessoa) {
		super();
		this.id = id;
		this.tipoTelefone = tipoTelefone;
		this.ddd = ddd;
		this.numero = numero;
		this.ramal = ramal;
		this.pessoa = pessoa;
	}

	public Telefone(String tipoTelefone, Long ddd, Long numero, Long ramal, Pessoa pessoa) {
		super();
		this.tipoTelefone = tipoTelefone;
		this.ddd = ddd;
		this.numero = numero;
		this.ramal = ramal;
		this.pessoa = pessoa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public Long getDdd() {
		return ddd;
	}

	public void setDdd(Long ddd) {
		this.ddd = ddd;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Long getRamal() {
		return ramal;
	}

	public void setRamal(Long ramal) {
		this.ramal = ramal;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
