package ControleFluxo;
import java.util.Scanner;
public class ControleFluxo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("POR FAVOR INSIRA O PRIMEIRO PARAMETRO: ");
		int parametroUm = scanner.nextInt();
		System.out.println("POR FAVOR INSIRA O SEGUNDO PARAMETRO: ");
		int parametroDois = scanner.nextInt();
				try {
			contar(parametroUm,parametroDois);		

		} catch (ParametrosInvalidosException e) {
			System.out.println("Segundo parametro deve ser maior que o Primeiro");
		}
	}
	static int contar(int parametroUm , int parametroDois) throws ParametrosInvalidosException{
		if (parametroDois <= parametroUm ) {
			throw new ParametrosInvalidosException();
		}else {
			int contagem = parametroDois- parametroUm;
			int contar;
			for(  contar= 1; contar<= contagem; contar++)
				System.out.println("Imprimindo o número "+ contar);		
		}
		return parametroDois;
	}
}
