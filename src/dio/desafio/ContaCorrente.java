package dio.desafio;

public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println(" ==== Extrato Conta corrente");
        super.imprimirInfosComuns();
    }
}
