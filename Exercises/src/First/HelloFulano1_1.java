package First;

import java.util.Scanner;

public class HelloFulano1_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome :");
		var name = scanner.next();
		System.out.println("Digite o ano de nascimento");
		var year = scanner.nextInt();
		
		if ((2025 - year)<0 ) {
			System.out.println("digite corretamente o ano de nascimento");
		}
	
		else
			System.out.println("Olá "+ name + " você tem "+ (2025 - year ));

	}

}
