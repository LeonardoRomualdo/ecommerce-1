package br.edu.up.convergentes.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="venda")
public class Venda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	private Long id_produto;
	
	private Long id_cliente;
	
	private BigDecimal desconto;
	
	private BigDecimal valorTotal;

	public Venda() {
	}

	public Venda(Long id, Long id_produto, Long id_cliente, BigDecimal desconto, BigDecimal valorTotal) {
		super();
		Id = id;
		this.id_produto = id_produto;
		this.id_cliente = id_cliente;
		this.desconto = desconto;
		this.valorTotal = valorTotal;
	}

	public Venda(Long id_produto, Long id_cliente, BigDecimal desconto, BigDecimal valorTotal) {
		super();
		this.id_produto = id_produto;
		this.id_cliente = id_cliente;
		this.desconto = desconto;
		this.valorTotal = valorTotal;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Long getId_produto() {
		return id_produto;
	}

	public void setId_produto(Long id_produto) {
		this.id_produto = id_produto;
	}

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public BigDecimal getDesconto() {
		return desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
}
