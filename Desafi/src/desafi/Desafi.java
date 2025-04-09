package desafi;

import java.util.Scanner;

public class Desafi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Saldo Inicial: ");
        double saldoInicial = scanner.nextDouble();
        int contador =1;
        double saldo;
       
	       do {
	        saldo = scanner.nextDouble();
	        saldoInicial = (saldoInicial + saldo);
	        contador++;
    }		while (contador <=3);
	       System.out.printf("%.2f\n", saldoInicial);
        scanner.close();
    }
}
