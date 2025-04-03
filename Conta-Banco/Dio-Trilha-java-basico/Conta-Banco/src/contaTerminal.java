import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
  
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
       
        System.out.println("Por favor, digite o número da Agência!");  //entrada de dados do usuario
        String agencia = scanner.next();
        System.out.println("Agora digite o número da sua conta");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite seu nome");
        String nomeCliente = scanner.next();
       
        System.out.println("Por favor digite seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + numeroConta +" e seu saldo de "+ saldo+" já está disponível para saque");
    }
}