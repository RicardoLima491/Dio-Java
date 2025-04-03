
import java.util.Date;

public class Operadores {
    public static void main(String[] args) throws Exception {

        String nome = "Ricardo";
        int idade = 22;
        char sexo = 'M';
        double peso = 68.5;
        boolean doador = false;
        Date dataNascimento = new Date();

        double soma = 10.5 +15.7;
        int subtracao = 113-25;
        int multiplicacao = 20*7;
        int divisao = 15/3;
        int modulo =  18%3;
        double resultado =(10*7)+(20/4)  ;
        String sobrenome = " Lima";
        String nomeCompleto ;
        nomeCompleto = nome + sobrenome;
        System.out.println(nomeCompleto);
        String juntarNumeros = 1+4+"1";
        System.out.println(juntarNumeros);

    }
    
}
