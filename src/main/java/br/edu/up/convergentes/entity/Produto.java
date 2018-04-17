package br.edu.up.convergentes.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

@Entity
@Table(name = "produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="nome")
	@Size(min = 1, max = 255)
	private String nome;
	
	@Column(name="produtora")
	@Size(min = 1, max = 255)
	private String produtora;
	
	@Column(name="genero")
	@Size(min = 1, max = 255)
	private String genero;
	
	@Column(name="data_de_lancamento")
	@Temporal(TemporalType.DATE)
	private Date dataLancamento;
	
	@Column(name="descricao")
	@Size(min = 0, max = 255)
	private String descricao;
	
	@Column(name="plataforma")
	@Size(min = 1, max = 255)
	private String plataforma;
	
	@Column(name="preco")
	@Digits(integer=3, fraction=2) /* R$999,99 */
	private BigDecimal preco;
	
	@Column(name="avaliacao")
	@Digits(integer=2, fraction=1) /* Nota 0.0 ~ 10.0 */
	private BigDecimal avaliacao;
	
	public Produto() {
		super();
	}
	
	public Produto(@Size(min = 1, max = 255) String nome, @Size(min = 1, max = 255) String produtora,
			@Size(min = 1, max = 255) String genero, Date dataLancamento, @Size(min = 0, max = 255) String descricao,
			@Size(min = 1, max = 255) String plataforma, @Digits(integer = 3, fraction = 2) BigDecimal preco,
			@Digits(integer = 2, fraction = 1) BigDecimal avaliacao) {
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

	public Produto(Long id, @Size(min = 1, max = 255) String nome, @Size(min = 1, max = 255) String produtora,
			@Size(min = 1, max = 255) String genero, Date dataLancamento, @Size(min = 0, max = 255) String descricao,
			@Size(min = 1, max = 255) String plataforma, @Digits(integer = 3, fraction = 2) BigDecimal preco,
			@Digits(integer = 2, fraction = 1) BigDecimal avaliacao) {
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