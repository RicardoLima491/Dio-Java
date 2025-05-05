package ordenacaoNumeros;

public class Numero implements Comparable<Numero>{
	private int numero;

	public int getNumero() {
		return numero;
	}

	public Numero(int numero) {
		super();
		this.numero = numero;
	}

	@Override
	public String toString() {
		return  numero + "";
	}

	@Override
	public int compareTo(Numero n) {
		
		return Integer.compare(numero, n.getNumero());
	}
	

}
