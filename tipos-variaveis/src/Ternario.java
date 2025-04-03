public class Ternario {
    public static void main(String[] args) throws Exception {
        int a = 5, b = 6;
        
        String resultado = a==b ? "verdadeiro" : "falso";
        /*if (a==b)
            resultado =  "verdadeiro";
        else
            resultado= "falso"    ;
            
        System.out.println(resultado);
        int resultados = a!=b ? 1 : 2;
        System.out.println(resultados);

        //para comparar numeros ==
        // para String utilizar variavel.equals
        String nomeUm = "Ricardo";
        String nomeDois = new String("Ricardo");
        System.out.println (nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));
            
        */
        
        // operadores Logicos

        boolean condicao = true;
        boolean condicao2 = true;

        if (condicao && condicao2){

            System.out.println("as duas sao verdadeiras");

        }
        if (condicao || condicao2){

            System.out.println("uma das duas sao verdadeiras");
        }
        System.out.println("fim");

    
    
    
    
    
    
    
    
    
    
    
    }
    
}
