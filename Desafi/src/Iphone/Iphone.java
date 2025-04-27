package Iphone;

import java.util.Scanner;

public class Iphone implements Browser, Cellphone, musicPlayer{
	static Scanner scanner = new Scanner(System.in);
		public static void main(String[] args) {
		
		
		
		System.out.println("Escolha a opção:");
		System.out.println("1 - Telefone ");
		System.out.println("2 - Player de músicas");
		System.out.println("3 - Navegador de Internet");
		var choice = scanner.nextInt();
		
		if(choice==1) {
		
			System.out.println("Escolha a opção:");
			System.out.println("1 - Discagem ");
			System.out.println("2 - Atender ");
			System.out.println("3 - Caixa Postal ");
			var choiceTel = scanner.nextInt();
			if (choiceTel ==1) {
				System.out.println("Digite o numero para discagem ");
				var number = scanner.next();
				Cellphone.call(number);
				main(args);
			}
			else if (choiceTel ==2){
				Cellphone.answer();
				main(args);
			}
			else if (choiceTel ==3){
				Cellphone.voiceMail();
				main(args);
			} 
		}
		else if(choice == 2) {
			System.out.println("Escolha a opção:");
			System.out.println("1 - Tocar música ");
			System.out.println("2 - Pausar música ");
			System.out.println("3 - Selecionar música ");
			var choicePlayer = scanner.nextInt();
			if (choicePlayer ==1) {
				musicPlayer.play();
				main(args);
			}
			else if(choicePlayer ==2) {
				musicPlayer.pause();
				main(args);
			}
			else if(choicePlayer ==3) {
				System.out.println("Digite o nome da música: ");
				var selectMusic = scanner.next();
				musicPlayer.selectMusic(selectMusic);
				main(args);
			}
		}
		else if(choice ==3) {
			System.out.println("Escolha a opção:");
			System.out.println("1 - Exibir página ");
			System.out.println("2 - Abrir nova aba ");
			System.out.println("3 - Atualizar página ");
			var choicebrowser = scanner.nextInt();
			if (choicebrowser == 1) {
				System.out.println("Digite a o endereço web:");
				var url = scanner.next();
				Browser.showPage(url);
				main(args);
			}
			else if(choicebrowser ==2) {
				Browser.addNewTab();
				main(args);
			}
			else if(choicebrowser ==3) {
				Browser.refresh();
				main(args);
			}
		}
	
	}
		
}
