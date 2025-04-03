import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class AboutMe {
    
    public static void main (String[] args) {
        try{

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
       

        System.out.println("Digite seu nome");
        String nome= scanner.next();
        System.out.println("Digite seu sobrenome");
        String sobrenome= scanner.next();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite sua Altura: ");
        double altura = scanner.nextDouble();
      
      
      
      
      
      
      
       /* 
        String nome = args[0];
        String  sobrenome = args[1];
        int idade =  Integer.valueOf(args[2]);
            double altura = Double.valueOf(args[3]);
        */ 


        /*
     para receber parametros no terminal precisamos chamar o JAVA
    * Seguido do arquivo: AboutMe 
    * e os paramentros separados por espaços : Ricardo Lima 42 1.81
    */

        System.out.println("Me chamo "+ nome+" "+ sobrenome);
        System.out.println("Tenho "+ idade+ " anos");
        System.out.println("Minha altura é " + altura + " cm");
        scanner.close();
        }
        catch(InputMismatchException e ){
            System.out.println("Campos idade e altura devem ser numeros");
        }
        // da pra passar os parametros pelo arquivo.json
        //diretamento nos args que desejar

    }
}
