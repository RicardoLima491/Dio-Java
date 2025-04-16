package Mensageiros;
import java.util.Scanner;

public class PcRicardo {

	public static void main(String[] args) {
		//polimorfismo
		
		// indica que nao foi escolhido o mensageiro padrao
		Mensageiros msg = null;
		//scanner
		Scanner scanner = new Scanner(System.in);
		String appEscolhido = scanner.next();
		
		// escolha de qual msg
		if (appEscolhido.equals("msn"))
				msg = new Msn();
		else if (appEscolhido.equals("fbk"))
			msg = new Facebook();
		else if (appEscolhido.equals("tlg"))
			msg = new Telegram();
		//novidade é o EQUALS!!!
		
		msg.enviarMensagem();
		msg.receberMensagem();
		
		//Abaixo no comentario o codigo antigo sobre abstração!
		
		
		/*
		System.out.println("MSN");
		System.out.println("");
		Msn msn = new Msn();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		System.out.println("");
		System.out.println("Facebook");
		System.out.println("");
		
		Facebook fbk = new Facebook();
		fbk.enviarMensagem();
		fbk.receberMensagem();
		
		System.out.println("");
		System.out.println("Telegram");
		System.out.println("");
		
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
*/

	}
	

}
