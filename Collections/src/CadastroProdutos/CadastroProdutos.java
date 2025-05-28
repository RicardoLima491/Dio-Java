package CadastroProdutos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	private Set <Produto> produtoSet;
	
	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}
	public void adicionarProduto(long cod, String nome, double preco,  int quantidade ) {
		produtoSet.add(new Produto(cod, nome, preco, quantidade) );
	}
	public Set <Produto> exibirProdutosPorNome(){
		Set<Produto>produtoPorNome  = new TreeSet<>(produtoSet);
		return produtoPorNome ;
		
	}
	public Set<Produto> exibirProdutosPorPreco(){
		Set<Produto> produtosPorPreco = new TreeSet<> (new   ComparatorPorPreco());
		produtoSet.addAll(produtoSet);
		return produtosPorPreco;
}
	public static void main(String[]args ) {
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		cadastroProdutos.adicionarProduto(123456789L, "Mouse", 15.50, 110);
		cadastroProdutos.adicionarProduto(123456790L, "Teclado", 35.50, 190);
		cadastroProdutos.adicionarProduto(123456791L, "Monitor", 650.99, 40);
		cadastroProdutos.adicionarProduto(123456789L, "alicate", 15.50, 10);
		cadastroProdutos.adicionarProduto(123456789L, "Mouse", 15.50, 110);
		System.out.println(cadastroProdutos.produtoSet);
		System.out.println(cadastroProdutos.exibirProdutosPorNome());
		
		
	}

}
