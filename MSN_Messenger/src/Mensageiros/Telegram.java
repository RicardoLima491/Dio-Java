package Mensageiros;

public class Telegram extends Mensageiros{
	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("Enviando Mensagem pelo Telegram");	
	}public void receberMensagem() {
		System.out.println("Recebendo Mensagem pelo Telegram");	
		System.out.println("aqui é diferente");
	}
	 void salvarHistorico() {
			System.out.println("testando Salvar historico");
		}
}
