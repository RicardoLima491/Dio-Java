package collections.operacoesBasicas;

import java.util.List;
import java.util.ArrayList;


public class CarrinhoDeCompras {
	private List<Item> itemList;
	
	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}
public void adicionarItem(String nome, double preco, int quantidade) {
	Item item = new Item (nome, preco, quantidade);
	this.itemList.add(item);
	
}
public void removerItem(String nome) {
	List<Item> itemRemover = new ArrayList<>();
	if(!itemList.isEmpty()) {
		for (Item i : itemList) {
			if (i.getNome().equalsIgnoreCase(nome)) {
				itemRemover.add(i);
			}
		}
	itemList.removeAll(itemRemover);
	} else {
		listaVazia();
		
	}
		
}	
public void listaVazia() {
	System.out.println("A lista está vazia!");
}

public void exibirItens() {
	if(!itemList.isEmpty()) {
		System.out.println(itemList);
	}else {
		listaVazia();
	}
}
public double calcularValorTotal() {
	double valorTotal=0;
	if(!itemList.isEmpty()) {
		for(Item i : itemList ) {
			double valorItem = i.getPreco()*i.getQuantidade();
			valorTotal += valorItem;
		}
		return valorTotal;
	}else {	
		listaVazia();
		
	}
	
	
	return 0;


}
	public static void main(String[] args) {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras(); 
		carrinhoDeCompras.adicionarItem("Pao",1.09d,12);
		carrinhoDeCompras.adicionarItem("leite",4.49d,24);
		carrinhoDeCompras.exibirItens();
		System.out.println("Valor total da compra é de "+carrinhoDeCompras.calcularValorTotal());
		carrinhoDeCompras.removerItem("leite");
		carrinhoDeCompras.exibirItens();
		System.out.println("Valor total da compra é de "+carrinhoDeCompras.calcularValorTotal());
		
		
		
			
		
		
		
	}
}

