package ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ordenacao.Pessoa.ComparatorPorAltura;

public class OrdenacaoPessoa {
	
	private List<Pessoa> pessoaList;
	
	public OrdenacaoPessoa() {

		this.pessoaList = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa>pessoasPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	public  List<Pessoa>  ordenarPorAltura(){
		List<Pessoa>pessoasPorAltura = new ArrayList<>(pessoaList);
		//Collections.sort(pessoasPorAltura, new ComparatorPorAltura() );
		return pessoasPorAltura;
	}
	
	
	public static void main(String[] args) {
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
		ordenacaoPessoa.adicionarPessoa("Ricardo", 42, 1.8);
		ordenacaoPessoa.adicionarPessoa("Vanessa", 41, 1.75);
		ordenacaoPessoa.adicionarPessoa("Victor", 18, 1.85);
		ordenacaoPessoa.adicionarPessoa("Daniel", 17, 1.8);
		ordenacaoPessoa.adicionarPessoa("Miguel", 9, 1.60);
		ordenacaoPessoa.adicionarPessoa("Henrique", 7, 1.45);
		System.out.println("Antes "+ ordenacaoPessoa.pessoaList);
		ordenacaoPessoa.pessoaList.sort((a,b) -> a.compareTo(b));
		System.out.println("com list.sort "+ ordenacaoPessoa.pessoaList);
		//System.out.println(ordenacaoPessoa.ordenarPorAltura());
		//System.out.println(ordenacaoPessoa.ordenarPorIdade());
	}

}
