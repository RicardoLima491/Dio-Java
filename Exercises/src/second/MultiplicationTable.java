package second;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero de 1 a 10: ");
		var multiplier= scan.nextInt();
		
		if ( multiplier <= 0) {
			System.out.println("Número inválido");
			
		}else {
		
		var contador = 1;
		while(contador <=10 ) {
			System.out.println(contador + " X " +multiplier + " = " +(contador* multiplier));
			
			contador++;
		}
		}
	}

}
