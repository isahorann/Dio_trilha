public class SistemaMedida {
    public static void main(String[] args) {

        // com if else
        String sigla = "M";

        if (sigla == "P")
            System.out.println("pequeno");
        else if (sigla == "M")
            System.out.println("médio");
        else if (sigla == "G")
            System.out.println("grande");
        else
            System.out.println("indefinido");

        // com switch case
        
        sigla = "S";
        switch (sigla) {
            case "P": {
                System.out.println("pequeno");
                break;
            }
            case "M": {
                System.out.println("médio");
                break;
            }
            case "G": {
                System.out.println("grande");
                break;
            }
            default:
                System.out.println("indefinido");
                break;
        }
    }
}