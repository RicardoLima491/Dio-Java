import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 25.0;
        
        


        System.out.println("Por favor, digite o valor a ser sacado!");
        double valorSolicitado = scanner.nextDouble();

    
            
        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("O Seu saldo agora é de: R$ "+saldo);
        }
        else{
            System.out.println("O Seu saldo é de: R$ "+saldo);
            System.out.println("Saldo Insuficiente");
           
        }
    
    }
}