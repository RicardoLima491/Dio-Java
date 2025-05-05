package somarNumeros;

public class Numero implements Comparable<Numero>{
	private int numero;

	public int getNumeros() {
		return numero;
	}

	public Numero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return  numero + "";
	}

	

	@Override
	public int compareTo(Numero o) {
		
		return Integer.compare(numero, numero);
		
	}

	
}
