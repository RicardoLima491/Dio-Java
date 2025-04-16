package Escola;

public class SistemaCadastro {
	public static void main (String[] args) {
		Pessoa marcos = new Pessoa("31143093801", "Marcos" );
		
		marcos.setEndereco("Rua Zilda Monteiro");
		System.out.println(marcos.getNome()+ " - "+ marcos.getCpf());
	}

}
