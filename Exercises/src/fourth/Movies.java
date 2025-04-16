package fourth;
import java.util.Scanner;

public class Movies {
	static Ticket  ticket = new Ticket();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
		menu();
	}
	public static void menu() {
		
		System.out.println("digite 1 - Dublado ou 2 - Legendado");
		var sub = scan.nextInt();
		if (sub ==1) {
			 ticket.setSubtitle("Dublado"); 
		}else {
			ticket.setSubtitle("Legendado");
		}
		System.out.println("Quantos Ingressos?");
		var option = scan.nextInt();
		if (option <1) {
			System.out.println("Erro, tente novamente:");
			menu();
		}
		else if (option >=1 && option<3) {
			var type = "normal";

		}
		
		
		
	
		ticket.setNormal(30);
		ticket.setHalf(ticket.getNormal()/2);
		ticket.setFamily(ticket.getNormal()- (ticket.getNormal()*0.05));
		System.out.println(ticket.getFamily());
		System.out.println(ticket.getHalf());
		System.out.println(ticket.getNormal());
		System.out.print("Voce deseja "+ option+ "ingresso " +ticket.getSubtitle());
		System.out.println("");
		
	}
	

}
//System.out.print("Voce deseja "+ option+ "ingresso " +ticket.getSubtitle()+"no valor de ");