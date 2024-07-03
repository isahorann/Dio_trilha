
public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 23.0;
        double valorSolicitado = 25.0;

        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);
    }
}
