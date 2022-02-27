public abstract class Conta implements iConta {

    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia =  AGENCIA_PADRAO;
        this.conta =  SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }
    public int getConta() {
        return conta;
    }
    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println("Titular da conta: " + this.cliente.getNome());
        System.out.println();
        System.out.printf("Agência: %d", this.agencia);
        System.out.println();
        System.out.printf("Conta Corrente: %d", this.conta);
        System.out.println();
        System.out.printf("Saldo: %.2f", this.saldo);
        System.out.println();
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);


    }

    public void imprimirExtrato() {

    }


}
