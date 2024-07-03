import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        
try {
Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.println(
                "Olá, me chamo " + nome + " " + sobrenome + ", tenho " + idade + " anos e minha altura é " + altura);
                    

        sc.close();
    } catch (InputMismatchException e) {
   System.err.println("Os campos idade e altura precisam ser numéricos ");
}
}
}
