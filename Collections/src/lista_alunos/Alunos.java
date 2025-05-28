package lista_alunos;

import java.util.Comparator;

public class Alunos implements Comparable<Alunos> {
	private String nome;
	
	private long matricula;
	
	private double media;


	public Alunos(String nome, long matricula, double media) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.media = media;
	}

		public String getNome() {
		return nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public double getMedia() {
		return media;
	}

		@Override
	public String toString() {
		return  nome + ", mat. = " + matricula + ", media = " + media;
	}

		@Override
		public int compareTo(Alunos o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
			
			
			
		}

		class ComparatorNota implements Comparator<Alunos>{

			@Override
			public int compare(Alunos a1, Alunos a2) {
				
				return Double.compare(a1.getMedia(), a2.getMedia());
			}
	
	}
	

	


