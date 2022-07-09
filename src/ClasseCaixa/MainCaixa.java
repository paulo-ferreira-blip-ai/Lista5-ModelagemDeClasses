package ClasseCaixa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCaixa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Caixa ca1 = new Caixa();
        ca1.saldo = 1000;

        //Variaveis utilizadas:
        String respostaEscrita = "";
        int respostaNumerica = 0;
        double soma = 0;
        List<Double> credito = new ArrayList<>();
        int qtdLancamentos;

        //Mostrando saldo da conta:
        System.out.println("Saldo em conta: R$ " + ca1.saldo);

        //Laço de repetição para o sistema:
        do {
            System.out.println("Quantos lançamentos deseja fazer? ");
            qtdLancamentos = input.nextInt();
            System.out.println("Digite 1 para crédito e 2 para débito.");
            respostaNumerica = input.nextInt();

            //Condicional caso o usuario queira adicionar valores ao seu saldo:
            if (respostaNumerica == 1) {
                for (double i = 0; i < qtdLancamentos; i++) {
                    System.out.println("Digite o " + (i + 1) + "º valor: ");
                    credito.add(input.nextDouble());
                    soma += (double) credito.get((int) i);
                    ca1.crédito = soma;

                }
                System.out.println("Saldo R$ " + ca1.credito());
            }

            //Condicional caso o usuario queira reitrar valores do seu saldo:
            if (respostaNumerica == 2) {
                for (double i = 0; i < qtdLancamentos; i++) {
                    System.out.println("Digite o " + (i + 1) + "º valor: ");
                    credito.add(input.nextDouble());
                    soma += (double) credito.get((int) i);
                    ca1.débito = soma;

                }
                System.out.println("Saldo R$ " + ca1.debito());
            }

            //Questionario final. O usuario pode decidir se quer fazer alguma outra movimentação ou sair do sistema:
            System.out.println("Deseja fazer alguma outra movimentação? sim/não: ");
            respostaEscrita = input.next();

            //Condicional que reiniciará o laço caso o usuario queira fazer outra movimentação:
        } while (respostaEscrita.equalsIgnoreCase("sim"));

        //Mensagem caso escolha sair do sistema:
        System.out.println("Obrigado por usar nosso sistema! Até mais.");


    }
}
