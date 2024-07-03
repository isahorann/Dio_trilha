import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        // exemplo de um problema: Joãozinho recebe 50 de mesada e resolve comprar doces
        // até o dinheiro acabar. O exemplo utiliza while.

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");

        // exemplo em que Joãozinho liga para um amigo, utilizando do-while.
        System.out.println("Discando...");
        do {
            System.out.println("Telefone tocando");
            // executando várias vezes até atender
        } while (tocando());
        System.out.println("Alô!!!");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        // negando o ato de continuar tocando
        return !atendeu;
    }

}
