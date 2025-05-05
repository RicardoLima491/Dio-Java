package somarNumeros;

import java.util.ArrayList;

import java.util.List;

public class SomarNumeros {
	private static List<Numero> numeroList;
	
	public SomarNumeros() {
		this.numeroList = new ArrayList<>();
		}
	
	public void adicionarNumero(int numero) {
		numeroList.add( new Numero(numero));
		
	}
	
	public int calcularSoma(){
		int soma =0 ;
		if(!numeroList.isEmpty()) {
			for (Numero n : numeroList) {
				 soma = soma + (n.getNumeros());
			}
		}
		return soma;
	}
	
	public void exibirNumeros() {
		if(!numeroList.isEmpty()) {
			System.out.println(numeroList);
		}
		
	}
	public void maiorNumero() {
		int maior = 0; 
		if(!numeroList.isEmpty()) {
			for (Numero n : numeroList) {
				if (n.getNumeros()> maior) {
					maior = n.getNumeros();
				}
			}
			System.out.println("O maior número na lista é: "+maior);
		}
		
	}
	public void menorNumero() { 
		int menor = 1000000000;
		if(!numeroList.isEmpty()) {
			for (Numero n : numeroList) {
				if (n.getNumeros()< menor) {
					menor = n.getNumeros();
				}
			}
			System.out.println("O menor número na lista é: "+menor);
		}
		
	}
	public void  tamanhoLista() {
		System.out.println("A lista tem "+numeroList.size()+" números");
	}
	
	
	public static void main(String[] args) {
		SomarNumeros somarNumeros = new SomarNumeros();
		somarNumeros.adicionarNumero(1);
		somarNumeros.adicionarNumero(12);
		somarNumeros.adicionarNumero(13);
		somarNumeros.adicionarNumero(4);
		somarNumeros.adicionarNumero(17);
		somarNumeros.adicionarNumero(170);
		System.out.println("Soma de todos os números na lista: "+ somarNumeros.calcularSoma());
		somarNumeros.exibirNumeros();
		somarNumeros.maiorNumero();
		somarNumeros.menorNumero();
		somarNumeros.tamanhoLista();
		
	}

}
