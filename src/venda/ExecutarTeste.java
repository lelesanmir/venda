package venda;

import java.math.BigDecimal;

public class ExecutarTeste {

/**
 * @param args
 */
/**
 * @param args
 */
/**
 * @param args
 */
/**
 * @param args
 */
/**
 * @param args
 */
public static void main(String[] args) {
	
	Produto produto1 = new Produto();
	
	produto1.setId(1L);
	produto1.setNome("Módulo Orientação a Objeto");
	produto1.setValor(BigDecimal.valueOf(100));
	
	Produto produto2 = new Produto();
	produto2.setNome("Módulo Spring Boot API REST");
	produto2.setId(2L);
	produto2.setValor(BigDecimal.valueOf(300));
	
	Produto produto3 = new Produto();
	produto3.setNome("Módulo de Angular 8");
	produto3.setId(3L);
	produto3.setValor(BigDecimal.valueOf(100));
	
	Produto produto4 = new Produto();
	produto4.setNome("Módulo de Hibernate");
	produto4.setId(3L);
	produto4.setValor(BigDecimal.valueOf(300));
	
	Venda venda = new Venda();
	
	venda.setDescricaoVenda("Venda Curso Formação Java");
	venda.setEnderecoVenda("Entregue por email");
	venda.setId(10L);
	venda.setNomeCliente("Leonardo dos Santos");
	//venda.setValorTotal(BigDecimal.valueOf(197.00));
	
	venda.getListaProdutos().add(produto1);
	venda.getListaProdutos().add(produto2);/*Não consigo fazer validações*/
	venda.addProduto(produto3);/*Posso fazer validações antes de adicionar na lista*/
	venda.addProduto(produto4);
	
	
	
	
	System.out.println("Valor da variável total: " + venda.getValorTotal());
 }
}
