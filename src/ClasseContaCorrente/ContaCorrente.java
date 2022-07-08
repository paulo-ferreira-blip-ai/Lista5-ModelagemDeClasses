package ClasseContaCorrente;

public class ContaCorrente {
    public int numeroDaConta;
    public String nomeDoCorrentista;
    public double saldo;
    public double deposito;
    public double saque;

    public ContaCorrente() {
        this.numeroDaConta = 1020;
        this.nomeDoCorrentista = "Renan Ferreira Sousa";
        this.saldo = 500;
        this.deposito = 0;
        this.saque = 0;
    }

    public double depositoEmConta() {
        return saldo += deposito;

    }

    public double saqueEmConta() {
        return saldo -= saque;

    }


}
