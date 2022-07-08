package ClasseContaCorrente;

public class MainContaCorrente {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        c1.numeroDaConta = 1390;
        c1.nomeDoCorrentista = "Renan Sousa";
        c1.saldo = 1000;
        c1.deposito = 600;
        c1.saque = 300;

        c1.depositoEmConta();
        c1.saqueEmConta();

        System.out.println("Número da conta " + c1.numeroDaConta + "\npertencente ao correntista " + c1.nomeDoCorrentista +
                "\nVocê fez um deposito de R$ " + c1.deposito + "\nVocê fez um saque de R$ " + c1.saque +
                "\ncom saldo no valor de R$ " + c1.saldo);


    }
}
