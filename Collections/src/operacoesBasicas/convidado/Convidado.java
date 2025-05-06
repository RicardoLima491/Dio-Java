package operacoesBasicas.convidado;

import java.util.Objects;

public class Convidado {
	
	//atributos
	private String nome;
	
	private int codConvite;

	@Override
	public String toString() {
		return "Convidado " + nome + ", codConvite=" + codConvite + "]";
	}

	public String getNome() {
		return nome;
	}

	public int getCodConvite() {
		return codConvite;
	}

	public Convidado(String nome, int codConvite) {
		super();
		this.nome = nome;
		this.codConvite = codConvite;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codConvite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return codConvite == other.codConvite;
	}

	
	
	
}
