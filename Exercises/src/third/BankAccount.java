package third;

import java.util.Scanner;

public class BankAccount {
	static Account account = new Account();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		newAccount();
	}
	public static void menu() {
	
	System.out.println("Selecione a opção a seguir: ");
	System.out.println("1 - Consultar saldo");
	System.out.println("2 - Consultar Cheque especial");
	System.out.println("3 - Depositar dinheiro");
	System.out.println("4 - Sacar dinheiro");
	System.out.println("5 - Pagar boleto");
	System.out.println("6 - Verificar uso do Cheque especial");
	var option = scan.nextInt();
	
	switch(option) {
		case 1 :{
			showBalance();
		}
		case 2:{
			checkSpecialCheck();
			showBalance();
			
			}
		case 3:{
			depositMoney();
			showBalance();
		}
		case 4:{
			withdrawMoney();
			showBalance();
			
		}
		case 5:{
			payBill();
			showBalance();
			
		}
		case 6:{
			checkOverdraft();
			System.out.println("");
			showBalance();
			
		}
		}
	}
	public static void newAccount() {
		System.out.println("Bem vindo ao RiBank: Faça seu primeiro deposito: ");
		
		account.setBalance(scan.nextDouble());
		if (account.getBalance()<= 500.0) {
			account.setOverdaft(50.0);
			showBalance();
		}
		else {
			account.setOverdaft(account.getBalance()/2);
			showBalance();
		}	
	}
	public static void checkSpecialCheck() {
		System.out.println("Seu cheque epecial é de: R$" +account.getOverdaft());
	}
	public static void depositMoney() {
		System.out.println("Qual valor a ser depositado: ");
		 var deposit = scan.nextDouble();
		 account.setBalance(account.getBalance() + deposit);
		 showBalance();
	}
	public static void withdrawMoney() {

		checkOverdraft();
		
		if ( account.getBalanceOverdraft() <= 0) {
			System.out.println("Não é possivel completar essa solicitação, por favor verifique o seu saldo! ");
		}
		else
		{
			System.out.println("Qual valor voce deseja sacar? ");
			var takeMoney = scan.nextDouble();
			if (takeMoney > account.getBalanceOverdraft()) {
				System.out.println("Não é possivel completar essa solicitação, por favor verifique o seu saldo!");
			}
			else
				account.setBalance(account.getBalance()- takeMoney);
		}
	}
	public static void payBill() {
		checkOverdraft();
		if ( account.getBalanceOverdraft()<= 0) {
			System.out.println("Não é possivel completar essa solicitação, por favor verifique o seu saldo! ");
		}
		else
		{
			System.out.println("Qual o valor do boleto? ");
			var payBill = scan.nextDouble();
			if (payBill > account.getBalanceOverdraft()) {
				System.out.println("Não é possivel completar essa solicitação, por favor verifique o seu saldo!");
			}
			else
			{
				account.setBalance(account.getBalance()- payBill);
			}
		}
	}	
	public static void checkOverdraft() {
		account.setBalanceOverdraft(account.getBalance() + account.getOverdaft() );
	}
	public static void showBalance() {
		System.out.println("Seu saldo é de R$"+ account.getBalance() + 
				" e seu Cheque Especial é de R$"+ account.getOverdaft()
				+" num total de: R$" + (account.getBalance()
				+account.getOverdaft()));
		System.out.println();
		menu();
	}
}


