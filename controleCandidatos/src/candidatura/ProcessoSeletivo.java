package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		
		String [] candidatos ={"Felipe", "Marcia","Ricardo", "Vanessa", "Paulo"}; 
		for (String candidato:candidatos) {
			entrandoEmContato(candidato);

		}
	}
	
		static void entrandoEmContato(String candidato) {
			int tentativasRealizadas =1;
			boolean continuarTentando = true;
			boolean atendeu = false;
			do {
				atendeu =  atender();
				continuarTentando = !atendeu;
				if (continuarTentando)
					tentativasRealizadas++;
				else
					System.out.println("Contato Realizado com Sucesso!");
			}while (continuarTentando && tentativasRealizadas<5);
			if (atendeu)
				System.out.println("Conseseguimo contato com "+ candidato + " na " + tentativasRealizadas + " tentativa");
			else 
				System.out.println("Não conseguimos contato com "+ candidato + ", numero maximo de tentativas "+ tentativasRealizadas);
			
			}
		static boolean atender() {
			return new Random().nextInt(5)==1;
		}
	
	
	static void imprimirSelecionados() {
		String [] candidatos ={"Felipe", "Marcia","Ricardo", "Vanessa", "Paulo"}; 
		System.out.println("Imprimindo a lista de candidatos informando o indice");
		for (int indice =0 ; indice <candidatos.length; indice++) {
			System.out.println("o Candidato de numero "+ (indice+1)+ " é " + candidatos[indice]);
		}
		System.out.println("exemplo de abreviação do for each ");
		for (String candidato: candidatos) {
			System.out.println("O candidato selecionado foi "+candidato);
		
		}
	}
	static void selecaoCandidatos(){
		String [] candidatos = {"Felipe", "Marcia"," Ricardo", "Vanessa", "Paulo", "Victor", "Daniel","Miguel", "Henrique", "Thiago", "Danilo", "Rafael", "José", "Benedita", "Tereza",};
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase= 2000.0;
		while (candidatosSelecionados <5 && candidatosAtual<candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			
			
			System.out.println("O Candidato "+ candidato + " solicitou este valor de salario " + salarioPretendido);
			
			if (salarioBase>=salarioPretendido) {
				System.out.println("O Candidato "+ candidato+ " foi selecionado para vaga" );
				candidatosSelecionados ++;
				
			}
			candidatosAtual++;
		}
		
	}
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase> salarioPretendido) {
			System.out.println("Ligar para o candidato");
		}else if (salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta");
		}else
			System.out.println("Aguardando o resultado dos demais candidatos");
	}
}
