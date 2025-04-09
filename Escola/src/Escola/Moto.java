package Escola;

public class Moto extends Veiculos {
	public void ligar(){
		falaPlaca();
		confereCombustivel();
		confereCambio();
		System.out.println("Moto ligada");
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

	