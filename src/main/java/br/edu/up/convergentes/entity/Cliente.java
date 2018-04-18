package br.edu.up.convergentes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "cliente", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Cliente {
	
	@Id
	@Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull(message="{error.entity.field.mandatory}")
	@Size(min = 1, max = 255)
	private String nome;

	@NotNull
	@Email
	@Column(unique = true)
	private String email;

//	@NotNull(message="{error.entity.field.mandatory}")
	private String senha;
		
	@JsonBackReference
	@OneToOne(fetch=FetchType.EAGER, mappedBy="cliente")
	private Pessoa pessoa;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(Long id, @NotNull(message = "{error.entity.field.mandatory}") @Size(min = 1, max = 255) String nome,
			@NotNull @Email String email, String senha, Pessoa pessoa) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.pessoa = pessoa;
	}

	public Cliente(@NotNull(message = "{error.entity.field.mandatory}") @Size(min = 1, max = 255) String nome,
			@NotNull @Email String email, String senha, Pessoa pessoa) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.pessoa = pessoa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
