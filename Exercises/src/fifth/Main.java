package fifth;

import java.util.Scanner;

public class Main {
	 
	private static  Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args ) {
		
		int option;
		GeometricForm geometricForm = null;
		while(true) {
			System.out.println("Escolha a forma geometrica para o calculo da área");
			System.out.println("1 - Quadrado");
			System.out.println("2 - Retangulo");
			System.out.println("3 - Circulo");
			System.out.println("4 - Sair");
			option = scan.nextInt();
			
			if (option == 1) {
				geometricForm = createSquare();
			}else if(option == 2) {
				 geometricForm = createRectangle();
			}else if(option==3) {
				 geometricForm = createCircle();
			}else if(option ==4) {
				break;
			}else {
				System.out.println("Opção invalida");
				continue;
			}
			System.out.println("O resultado do calculo da area foi: "+ geometricForm.getArea());
		}

	}
	private static GeometricForm createSquare() {
		System.out.println("informe o tamanho dos lados: ");
		var side = scan.nextDouble();		
		return new Square(side);
	}
	private static GeometricForm createRectangle() {
		System.out.println("informe a base: ");
		var base = scan.nextDouble();
		System.out.println("informe a altura: ");
		var height = scan.nextDouble();
		return new Rectangle(height, base);
	}
	private static GeometricForm createCircle() {
		System.out.println("informe o raio: ");
		var radius = scan.nextDouble();
		return new Circle(radius);
	}
}
