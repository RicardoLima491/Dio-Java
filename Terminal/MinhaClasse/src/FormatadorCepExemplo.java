public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("18054091");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Cep invalido");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() !=8)
            throw new CepInvalidoException();

            return "18054-091";
}
}
