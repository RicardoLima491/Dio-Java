package catalagoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
	private List<Livro>livroList;

	public CatalagoLivros() {this.livroList = new ArrayList<>();}
	
	public void adicionarLivro (String titulo, String autor, int anoPublicacao) {
		livroList.add (new Livro(titulo, autor, anoPublicacao));
	}
	public List<Livro> pesquisaPorAutor (String autor){
		List<Livro> livrosPorAutor = new ArrayList<>();
		if (!livroList.isEmpty()) {
			for(Livro l :livroList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}
	public List<Livro> pesquisarPorIntervaloAnos (int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if (!livroList.isEmpty()) {
			for(Livro l :livroList) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
				livrosPorIntervaloAnos.add(l);
				}
			}
		}
		return livrosPorIntervaloAnos;
	}
	public Livro pesquisarPorTitulo(String titulo){
		Livro livroPorTitulo = null;
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
	
	
	
	 
		 
	 public static void main(String[] args) {
		 CatalagoLivros  catalagoLivros = new CatalagoLivros();
		 		 
		 catalagoLivros.adicionarLivro("O Mago", "Ricardo", 2021);
		 catalagoLivros.adicionarLivro("O Magro", "Ricardo", 2025);
		 catalagoLivros.adicionarLivro("a Magali", "Vanessa", 1821);
		 
		 System.out.println(catalagoLivros.pesquisaPorAutor("Ricardo"));
		 System.out.println(catalagoLivros.pesquisarPorIntervaloAnos(1821, 2021));
		 System.out.println(catalagoLivros.pesquisarPorTitulo("a magal"));

	 	}

}
