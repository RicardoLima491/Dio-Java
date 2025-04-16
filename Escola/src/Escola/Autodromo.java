package Escola;

public class Autodromo {
	public static void main(String[] args) {
		Carro fiesta = new Carro();
		fiesta.setPlaca("FIS-3i15");
		fiesta.ligar();
		fiesta.getPlaca();
		
		Moto cg125 = new Moto();
		cg125.setPlaca("DHV-7855");
		cg125.ligar();
		cg125.getPlaca();
		
		/*Veiculos punto = cg125;
		punto.ligar();
		*/
	
		
		
	}

}
