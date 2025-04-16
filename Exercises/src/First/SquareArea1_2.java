package First;

import java.util.Scanner;

public class SquareArea1_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tamanho do lado do quadrado a ser calculado: ");
		var side = scan.nextInt();
		var square = (side* side);
		System.out.println("Este quadrado tem a area de "+ square );
		
	}
	

}
