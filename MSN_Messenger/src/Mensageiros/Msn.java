package Mensageiros;

public class Msn extends Mensageiros{
	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("Enviando Mensagem pelo MSN");	
	}public void receberMensagem() {
		System.out.println("Recebendo Mensagem pelo MSN");	
	}
	 void salvarHistorico() {
		System.out.println("testando Salvar historico");
	}
}
