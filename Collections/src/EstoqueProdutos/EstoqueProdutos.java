package EstoqueProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	
	private Map<Long,Produto> estoqueProdutosMap;

	public EstoqueProdutos( ) {

		this.estoqueProdutosMap = new HashMap<>();
	}
	
	public void adicionarProdutos(long cod, String nome, int quantidade, double preco) {
		
		estoqueProdutosMap.put(cod,  new Produto(nome, preco, quantidade));
	}
	public void exibirProdutos () {
		
		System.out.println(estoqueProdutosMap);
	}
	public double calcularValorTotalEstoque() {
		
		double valorTotalEstoque =0d;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				valorTotalEstoque += p.getQuantidade()* p.getPreco();
			}
		}
		return valorTotalEstoque;	
	}
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				if(p.getPreco() > maiorPreco) {
					produtoMaisCaro = p;
				}
			}
		}
		return produtoMaisCaro;
}
	public Produto obterProdutoMaisbaixo() {
		Produto produtoMaisBaixo = null;
		double menorPreco = Double.MIN_VALUE;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				if(p.getPreco() < menorPreco) {
					produtoMaisBaixo = p;
				}
			}
		}
		return produtoMaisBaixo;
}


	public static void main (String[] args) {
	EstoqueProdutos estoque = new EstoqueProdutos();
	//estoque.exibirProdutos();
	estoque.adicionarProdutos(1L, "Mouse", 50, 29.99);
	estoque.adicionarProdutos(2L, "Teclado", 51, 49.99);
	estoque.adicionarProdutos(3L, "Monitor", 5, 639.99);
	estoque.exibirProdutos();
	System.out.println(estoque.calcularValorTotalEstoque());
	System.out.println(estoque.obterProdutoMaisCaro());
	System.out.println(estoque.obterProdutoMaisbaixo());
	
	
	
	
	
	
	
	
	
}
}