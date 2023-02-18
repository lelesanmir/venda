package venda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {

	private Long id;
	
	private String descricaoVenda;
	
	private String nomeCliente;
	
	private String enderecoVenda;
	
	private BigDecimal valorTotal;
	
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	
	public void addProduto (Produto produto) {
		/*Poderia fazer varias validações*/
		this.listaProdutos.add(produto);
	}
	
	private double totalVenda() {
		double total = 0.0;
		for (Produto produto : listaProdutos) {
			total += produto.getValor().doubleValue();
		}
		return total;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaoVenda() {
		return descricaoVenda;
	}

	public void setDescricaoVenda(String descricaoVenda) {
		this.descricaoVenda = descricaoVenda;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}



	public String getEnderecoVenda() {
		return enderecoVenda;
	}

	public void setEnderecoVenda(String enderecoVenda) {
		this.enderecoVenda = enderecoVenda;
	}

	public BigDecimal getValorTotal() {
		this.valorTotal = BigDecimal.valueOf(totalVenda());
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "Venda [id=" + id + ", descricaoVenda=" + descricaoVenda + ", nomeCliente=" + nomeCliente
				+ ", enderecoVenda=" + enderecoVenda + ", valorTotal=" + valorTotal + ", listaProdutos=" + listaProdutos
				+ "]";
	}
	
	
	
}
