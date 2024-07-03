public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;
        
        // ternário

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Em recuperação" : "Reprovado";

        System.out.println(resultado);

        // condicional convencional

        if (nota >= 7) {
            System.out.println("Aprovado!");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Em recuperação!");
        } else
            System.out.println("Reprovado!");

    }
}
