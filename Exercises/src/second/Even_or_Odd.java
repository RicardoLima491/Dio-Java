package second;

import java.util.Scanner;

public class Even_or_Odd {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		var firstNumber = scan.nextInt();
		System.out.println("Digite outro número: ");
		var secondNumber = scan.nextInt();
		System.out.println("Digite 1 para números impares");
		System.out.println("Digite 2 para números pares");
		var choice = scan.nextInt();
		
		
		if (firstNumber>secondNumber){
			System.out.println("Segundo numero deve ser maior que o primeiro");
		}
			if(choice ==1) {
				if (secondNumber % 2 ==0) {
					System.out.println(secondNumber);
					secondNumber = secondNumber -1;
				}

					do {						
						System.out.println(secondNumber);
						secondNumber = secondNumber - 2;
						}
					while (secondNumber >= firstNumber && secondNumber != 0);
				}
					
					
					
			else if (choice ==2){
				if (secondNumber % 2 !=0) {
						System.out.println(secondNumber);
						secondNumber = secondNumber -1;
				}
					
					do {
							System.out.println(secondNumber);
							secondNumber = secondNumber - 2;
						}
						while (secondNumber>= firstNumber && secondNumber >= 0);
			}
		}
	



	
	}
