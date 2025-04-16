package Mensageiros;

public class Facebook extends Mensageiros{
	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("Enviando Mensagem pelo Facebook");	
	}public void receberMensagem() {
		System.out.println("Recebendo Mensagem pelo Facebook");	
	}
	 void salvarHistorico() {
			System.out.println("testando Salvar historico");
		}
	

}
