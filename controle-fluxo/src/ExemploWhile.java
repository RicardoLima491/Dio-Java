import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        int x= 0;
        while (mesada > 0) {
            x ++;
            Double valorDoce = valorAleatorio();
            if (valorDoce> mesada)
                valorDoce = mesada;
            
            System.out.println("Doce do valor : "+ valorDoce +"Adicionado no carrinho");
            System.out.println("joao ja comprou "+ x + " doces");
            mesada = mesada -valorDoce;
        }
        System.out.println("Mesada = " +mesada);
        System.out.println("Joao gastou toda a sua mesada");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);

            
        }
    }

