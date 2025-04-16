package second;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o peso: ");
		var weight = scan.nextDouble();
		System.out.println("Digite a altura: ");
		var height = scan.nextDouble();
		
		var imc = (weight/(height*2));

		//System.out.println("Imc: "+ imc);
		if (imc<=18.5) {
			System.out.println("Abaixo do peso.");
		}
		else if(imc >=18.6 && imc<=24.9) {
			System.out.println("Peso ideal.");
		}
		else if(imc >= 25.0&& imc<=29.9) {
			System.out.println("Levemente acima do peso.");
		}
		else if(imc >= 30.0&& imc<=34.9) {
			System.out.println("Obesidade Grau I.");
		}
		else if(imc >= 35.0&& imc<=39.9) {
			System.out.println("Obesidade Grau II (Severa).");
		}
		else {
			System.out.println("Obesidade Grau III (Mórbida).");
		}
	}
}
