public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"Ricardo", "Felipe", "julia", "Marcos"};

        /*for (int x=0; x <alunos.length; x++){
            System.out.println("O nome do aluno no indice x = " + (x+1)  +" é "+ alunos [x]); // array sempre começa pelo indice 0 por isso coloquei posição do array +1 
        */
        
        for (String aluno : alunos){
            System.out.println ("Nome do aluno é " + aluno);
        }
















        
    }
}
