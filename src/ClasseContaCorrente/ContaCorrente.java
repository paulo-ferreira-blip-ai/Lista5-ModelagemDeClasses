package ClasseContaCorrente;

public class ContaCorrente {
    public int numeroDaConta;
    public String nomeDoCorrentista;
    public double saldo;

    public ContaCorrente() {
        this.numeroDaConta = 1020;
        this.nomeDoCorrentista = "Renan Ferreira Sousa";
        this.saldo = 0;
    }
    public void status(){
        System.out.println("Número da conta "+this.numeroDaConta+ "\npertencente ao correntista "+this.nomeDoCorrentista+"\ncom saldo no valor de R$ "+this.saldo);

    }


}
