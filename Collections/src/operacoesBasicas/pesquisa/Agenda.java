package operacoesBasicas.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class Agenda {
	
	private Set <Contato> contatoSet;
	
	
	public Agenda() {
		super();
		this.contatoSet = new HashSet<>();
	}

	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome,numero));
	}
	
	public void exibirContato() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisaPorNome(String nome) {
		Set<Contato> contatoPorNome = new HashSet<>();
		for (Contato c: contatoSet){
			if (c.getNome().startsWith(nome)){
				contatoPorNome.add(c);
			}
		}
		return contatoPorNome;
	}
	
	public Contato atualizarNumero(String nome , int novoNumero) {
		Contato contatoAtualizado = null;
		for (Contato c: contatoSet) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		
		return contatoAtualizado;
	}
	
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		//agenda.exibirContato();
		agenda.adicionarContato("Ricardo", 991468419);
		agenda.adicionarContato("Vanessa", 981468972);
		agenda.adicionarContato("Ricardo lima", 32222338);
		agenda.exibirContato();
		System.out.println(agenda.pesquisaPorNome("Ricardo"));
		agenda.atualizarNumero("Ricardo", 0);
		agenda.exibirContato();
	}

}
