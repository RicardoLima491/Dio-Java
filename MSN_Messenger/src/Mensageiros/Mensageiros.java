package Mensageiros;

public abstract class Mensageiros {

	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	abstract void salvarHistorico();
	
	protected void validarConexaoInternet() {
		System.out.println("Validando a Conexão com a internet");
	}
	
}
	
		

	


