//import java.util.Scanner;
//import java.util.Locale;
//
//public class AboutMe {
//    public static void main(String[] args) {
//        // formas de executar pelo terminal, pelo prompt de comando e pelos argumentos;
//
//        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
//        String nome;
//        // = args[0];
//        String sobrenome;
//        // = args[1];
//        int idade;
//        // = Integer.valueOf(args[2]);
//        double altura;
//        // = Double.valueOf(args[3]);
//
//        System.out.println("Digite seu nome: ");
//        nome = sc.nextLine();
//        System.out.println("Digite seu sobrenome: ");
//        sobrenome = sc.nextLine();
//        System.out.println("Digite sua idade: ");
//        idade = sc.nextInt();
//        System.out.println("Digite sua altura: ");
//        altura = sc.nextDouble();
//        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
//
//        System.out.println("Tenho " + idade + " anos.");
//        System.out.println("Minha altura é " + altura + " cm");
//        sc.close();
//    }
//}