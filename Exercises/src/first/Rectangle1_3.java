package first;

import java.util.Scanner;

public class Rectangle1_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tamanho da base do retangulo a ser calculado: ");
		var base = scan.nextInt();
		System.out.println("Digite o tamanho do altura do retangulo a ser calculado: ");
		var height = scan.nextInt();
		
		var rectangle = (base* height);
		System.out.println("Este retangulo tem a area de "+ rectangle );

	}

}