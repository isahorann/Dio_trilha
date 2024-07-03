/**
 * ExemploFor
 */
public class ExemploFor {
public static void main(String[] args) {

    //exemplo simples com carneirinhos

    for (int carneirinhos = 0; carneirinhos <= 20; carneirinhos++) {
        System.out.println("contando carneirinhos " + carneirinhos);
    }
    System.out.println("Joãozinho dormiu.");

    //exemplo com Array

    String alunos []= {"ANA","JULIA", "PAULO","RENATO"};
    for (int x = 0; x < alunos.length; x++) {
        System.out.println("O aluno no índice x= "+ x + " é "+ alunos[x]);
    }

    //forma abreviada

    for(String aluno : alunos){
        System.out.println("nome do aluno é: "+ aluno);
    }
}
    
}