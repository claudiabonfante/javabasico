package orientacaoobjetosjavabanco;

public abstract class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("O total de contas é: " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        System.out.println("Estou criando uma conta: " + this.numero);
    }

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }
//
//    public boolean saca(double valor) {
//        if (this.saldo >= valor) {
//            this.saldo = this.saldo -= valor;
//            return true;
//        }   return false;
//
//    }
    public void saca(double valor) {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: "+ this.saldo + "Valor a sacar: " + valor);
        } this.saldo -= valor;
    }
    public void transfere(double valor, Conta destino) {
       this.saca(valor);
       destino.deposita(valor);
    }

    public double getSaldo() {
        return this.saldo;

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }


    public void setNumero(int novoNumero) {
        this.numero = novoNumero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
