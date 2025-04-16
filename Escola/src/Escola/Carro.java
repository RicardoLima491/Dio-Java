package Escola;

public class Carro extends Veiculos{
	
		public void ligar() {
		confereCambio();
		confereCombustivel();
		falaPlaca();
		System.out.println("Carro ligado");
	}
	private void confereCombustivel() {
		System.out.println("Conferindo Combustivel ");
	}
	private void confereCambio() {
		System.out.println("Conferindo Cambio");
	}
	private void falaPlaca() {
		System.out.println(getPlaca());
		
	}
		
		

}
