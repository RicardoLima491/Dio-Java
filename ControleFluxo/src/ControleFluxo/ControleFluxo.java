package ControleFluxo;

import java.util.Locale;
import java.util.Scanner;

public class ControleFluxo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US) ;
		System.out.println("POR FAVOR INSIRA O PRIMEIRO PARAMETRO: ");
		int parametro1 = scanner.nextInt();
		System.out.println("POR FAVOR INSIRA O SEGUNDO PARAMETRO: ");
		int parametro2 = scanner.nextInt();
		
		System.out.println(parametro1+" "+ parametro2);
		
		
		
		
		
		
		
	}

}
