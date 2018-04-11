package br.edu.up.convergentes.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String nome;
	
	private String produtora;
	
	private String genero;
	
	private Date dataLancamento;
	
	private String descricao;
	
	private String plataforma;
	
	private BigDecimal preco;
	
	private BigDecimal avaliacao;
	
	public Produto() {
		super();
	}
	
	public Produto(Long id, @NotBlank String nome, String produtora, String genero, Date dataLancamento,
			String descricao, String plataforma, BigDecimal preco, BigDecimal avaliacao) {
		
		super();
		this.id = id;
		this.nome = nome;
		this.produtora = produtora;
		this.genero = genero;
		this.dataLancamento = dataLancamento;
		this.descricao = descricao;
		this.plataforma = plataforma;
		this.preco = preco;
		this.avaliacao = avaliacao;
	}
	
	public Produto(@NotBlank String nome, String produtora, String genero, Date dataLancamento,
			String descricao, String plataforma, BigDecimal preco, BigDecimal avaliacao) {
		
		super();		
		this.nome = nome;
		this.produtora = produtora;
		this.genero = genero;
		this.dataLancamento = dataLancamento;
		this.descricao = descricao;
		this.plataforma = plataforma;
		this.preco = preco;
		this.avaliacao = avaliacao;
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
	
	public String getProdutora() {
		return produtora;
	}
	
	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public Date getDataLancamento() {
		return dataLancamento;
	}
	
	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getPlataforma() {
		return plataforma;
	}
	
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	public BigDecimal getPreco() {
		return preco;
	}
	
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	public BigDecimal getAvaliacao() {
		return avaliacao;
	}
	
	public void setAvaliacao(BigDecimal avaliacao) {
		this.avaliacao = avaliacao;
	}
}