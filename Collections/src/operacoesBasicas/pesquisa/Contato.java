package operacoesBasicas.pesquisa;

import java.util.Objects;

public class Contato {
	private String nome;
	private int numero;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	public Contato(String nome, int numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}
	@Override
	public String toString() {
		return nome +  " tel "+ numero + "";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(nome, other.nome);
	}
	

}
