package Escola;

public enum EstadoBrasileiro {
	SAO_PAULO("SP", "São Paulo", 11),
	RIO_JANEIRO("RJ", "Rio de Janeiro", 21),
	PIAUI ("PI", "Piauí", 65),
	MARANHAO("MA", "Maranhão", 40),
	ESPIRITO_SANTO("ES", "Espirito Santo", 52);
	
	private String nome;
	private String sigla;
	private int ibge;
	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;	
		this.ibge = ibge;
	}
	public int getIbge() {
		return ibge;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
}
