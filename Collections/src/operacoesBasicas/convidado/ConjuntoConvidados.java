package operacoesBasicas.convidado;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		super();
		this.convidadoSet = new HashSet();
	}
	public void adicionarConvidado(String nome, int codConvite) {
		convidadoSet.add(new Convidado(nome, codConvite));
	}
	public void removerConvidadoPorCodigoConvite(int codConvite) {
		Convidado removerConvidado = null;
		for (Convidado c: convidadoSet) {
			if (c.getCodConvite() ==codConvite) {
				removerConvidado =c;
				break;
			}
		}
		convidadoSet.remove(removerConvidado);
		
	}
	public int totalConvidados() {
		return convidadoSet.size();
	}
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}

	public static void main(String[] args) {
		ConjuntoConvidados festa = new ConjuntoConvidados();
		festa.adicionarConvidado("Ricardo", 1);
		festa.adicionarConvidado("Vanessa", 2);
		festa.adicionarConvidado("Miguel", 3);
		festa.adicionarConvidado("Henrique", 4);
		festa.exibirConvidados();
		//festa.removerConvidadoPorCodigoConvite(1);
		festa.exibirConvidados();
	}

}
