public class Main {

    public static void main(String[] args) {

        Cliente Diogo = new Cliente();
        Diogo.setNome("Diogo");

        Conta cc = new ContaCorrente(Diogo);
        Conta cp = new ContaPoupanca(Diogo);

        cc.depositar(100);
        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
