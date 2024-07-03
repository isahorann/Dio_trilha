
public class Operadores {
    public static void main(String[] args) throws Exception {
      
        // int idade = 22;
        // double peso = 68.5;
        // char sexo = 'M';
        // boolean doadorOrgao = true;
        // double soma = 10.5 + 15.7;
        // int subtracao = 113 - 25;
        // int multiplicacao = 20 * 7;
        // int divisao = 15 / 3;
        // int modulo = 18 % 3;
        // double resultado = (10 * 7) + (20/4);
        String nomeCompleto = "LINGUAGEM" + " JAVA";
        System.out.println(nomeCompleto);

        int numero = 5;
        numero++;
        System.out.println(numero);

        boolean variavel = false;
        variavel = !variavel;
        System.out.println(variavel);

        // System.out.println(!variavel);

        // Operador ternário:

        int a, b;
        String resultado;

        a = 5;
        b = 6;
        resultado = a == b ? "verdadeiro" : "falso";

        // if (a==b){
        // resultado = "verdadeiro";
        // }
        // else {
        // resultado = "falso";
        // }

        System.out.println(resultado);

        // Operadores Relacionais

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("igualdade =  " + simNao);

        simNao = numero1 != numero2;

        System.out.println("diferença = " + simNao);

        simNao = numero1 >= numero2;

        System.out.println("maior ou igual = " + simNao);

        simNao = numero1 <= numero2;

        System.out.println("menor ou igual = " + simNao);

        // Operadores Condicionais

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }
        else if (condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
        System.out.println("fim");

    }
}
