public class ResultadoEscolar {
    public static void main(String[] args) { 
        int nota = 7;
       // if nao tem ponto e virgula
       // if tem { } para abrir e fechar bloco se tiver mais que duas linhas
       /*
       if( nota >= 7 ){

            System.out.println("Aprovado");}
        
           
        else if(nota >= 5 && nota <7)
            System.out.println("Recuperação");
            

        else
            System.out.println("Reprovado");
         */
        String resultado = nota>= 7? "Aprovado" : nota >=5 && nota <7 ?"Recuperaçao" : "Reprovado";
        System.out.println(resultado);
    }
}
