
public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2334565");
            System.out.println(cepFormatado);
        } catch (CepInvalidException e) {
            System.err.println("O cep não corresponde com as regras de negócio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidException {
        if (cep.length() != 8)
            throw new CepInvalidException();
        return "23.345-065";
    }
}