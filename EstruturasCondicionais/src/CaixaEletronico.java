
public class CaixaEletronico {
    public static void main(String[] args) {
        double saldoCliente = 60.0;
        double valorSolicitado = 46.5;

        if (valorSolicitado < saldoCliente)
            saldoCliente = saldoCliente - valorSolicitado;

        System.out.println(saldoCliente);
    }
}
