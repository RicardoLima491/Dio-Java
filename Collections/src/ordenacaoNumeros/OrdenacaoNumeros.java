package ordenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	
	private List <Numero> numeroList;
	
	public OrdenacaoNumeros() {
		this.numeroList = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		numeroList.add(new Numero(numero));
	}
	/*
	public List<Numero> ordenarAscendente(){
		List<Numero> ordenarAscendente = new ArrayList<>(numeroList);
		Collections.sort(ordenarAscendente);
		return ordenarAscendente;
	}
	
	public List<Numero> ordenarDescendente(){
		List<Numero> ordenarDescendente = new ArrayList<>(numeroList);
		Collections.sort(ordenarDescendente);
		ordenarDescendente.sort(Collections.reverseOrder());
		return ordenarDescendente;
	}
	
	*/
	public void ordenacaoAscendente() {
		numeroList.sort((a,b) -> a.compareTo (b));
		System.out.println( numeroList);
	}
	public void ordenarDescendente() {
		numeroList.sort((a,b) -> b.compareTo (a));
		System.out.println( numeroList);
	}
	public static void main(String[] args) {
		OrdenacaoNumeros numeros = new OrdenacaoNumeros();
		numeros.adicionarNumero(1);
		numeros.adicionarNumero(3);
		numeros.adicionarNumero(0);
		numeros.adicionarNumero(2);
		numeros.adicionarNumero(9);
		numeros.adicionarNumero(6);
		System.out.println(numeros.numeroList);
		numeros.ordenacaoAscendente();
		numeros.ordenarDescendente();
		//System.out.println(numeros.ordenarAscendente());
		//System.out.println(numeros.ordenarDescendente());
		
	}

	
}
