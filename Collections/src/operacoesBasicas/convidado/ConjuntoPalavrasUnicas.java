package operacoesBasicas.convidado;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	
	private Set<Palavra> palavraSet;
	
	public ConjuntoPalavrasUnicas() {
		this.palavraSet = new HashSet();
	}
	
	public void adicionarPalavra(String palavra) {
		palavraSet.add(new Palavra(palavra));
	}
	
	public void removerPalavra(String palavra) {
		Palavra removerPalavra = null;
		for( Palavra p: palavraSet) {
			if (p.getPalavra()== palavra) {
			removerPalavra = p;
			break;
			}
		}
		palavraSet.remove(removerPalavra);
	}
	
	public boolean verificarPalavra(String palavra){
		return palavraSet.contains(palavra);
	}
	
	public void exibirPalavra() {
		System.out.println(palavraSet);
	}

	public static void main(String[] args) {
		ConjuntoPalavrasUnicas palavrasUnicas =  new ConjuntoPalavrasUnicas();
		palavrasUnicas.adicionarPalavra("Ricardo");
		palavrasUnicas.exibirPalavra();
		palavrasUnicas.removerPalavra("Ricardo");
		palavrasUnicas.adicionarPalavra("Ricardo");
		palavrasUnicas.adicionarPalavra("Pedro");
		palavrasUnicas.adicionarPalavra("Joao");
		palavrasUnicas.adicionarPalavra("Victor");
		palavrasUnicas.adicionarPalavra("Vanessa");
		palavrasUnicas.adicionarPalavra("Ricardo");
		palavrasUnicas.exibirPalavra();
		palavrasUnicas.removerPalavra("Ricardo");
		palavrasUnicas.verificarPalavra("Vanessa");
		

	}

}
