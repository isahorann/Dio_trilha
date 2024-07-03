public class ExemploBreakContinue {
    public static void main(String[] args) {

        System.out.println("Exemplo de contagem com break: ");
        
        for (int numero = 0; numero <= 5; numero++) {
            if (numero == 3)
                break;
            System.out.println(numero);
        }

        System.out.println("Exemplo de contagem com continue: ");

        for (int numero = 0; numero <= 5; numero++) {
            if (numero == 3)
                continue;
            System.out.println(numero);
        }
    }
}
