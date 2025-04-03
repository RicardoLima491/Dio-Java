public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "a";
/*
        if (sigla == "p")
        System.out.println("PEQUENO");
        else if (sigla =="m")
        System.out.println("Medio");
        else if (sigla == "g")
        System.out.println("Grande");
        else 
        System.out.println("Erro");
*/ 
//if nao tem ponto e virgula

        switch (sigla) {
            case "p":{
                System.out.println("Pequeno");
                break;
            }
            case "m":{
                System.out.println("medio");
                break;
            }
            
            case "g":{
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("Erro");;
        }

    }
}