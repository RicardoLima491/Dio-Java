package lista_alunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import java.util.Comparator;

public class GerenciadorAlunos {

	private Set <Alunos> alunosSet;

	public GerenciadorAlunos() {
		this.alunosSet =new HashSet<>();
	}
	public void adicionarAluno(String nome, long matricula, double media) {
		alunosSet.add(new Alunos(nome, matricula, media));
	}
	public void exibirAlunos() {
		System.out.println(alunosSet);
	}
	public void removerAluno(long matricula) {
		Alunos removerAlunos = null;
		for (Alunos a: alunosSet) {
			if (a.getMatricula() == matricula) {
				removerAlunos = a;
				break;
			}
		}
		alunosSet.remove(removerAlunos);
	}
	public void exibirAlunosPorNota() {
		Set<Alunos> alunosPorNota = new TreeSet<>(new ComparatorNota());
		alunosPorNota.addAll(alunosSet);
		System.out.println(alunosPorNota);
		
	}
	
	public void exibirAlunosPorNome() {
		Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);
		System.out.println(alunosPorNome);
	}


	public static void main(String[] args) {
		GerenciadorAlunos gerente = new GerenciadorAlunos();
		gerente.adicionarAluno("Ricardo", 1232346609L, 9.1);
		gerente.adicionarAluno("Henrique", 1232346610L, 9);
		gerente.adicionarAluno("Henri", 1232346611L, 8.5);
		gerente.adicionarAluno("Miguel", 1232346612L, 9.1);
		gerente.exibirAlunos();
		gerente.removerAluno(1232346611);
		gerente.exibirAlunos();
		//gerente.exibirAlunosPorNome();
		gerente.exibirAlunosPorNota();
		
	}

}

