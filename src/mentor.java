import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class mentor {
    public static void main(String[] args) {

        System.out.println("Iniciando o jogo!");
        Scanner input = new Scanner(System.in);

        String continuar = "";

        List<Integer> placarAcertos = new ArrayList<>();
        List<Integer> placarAcertosParciais = new ArrayList();
        List<Integer> placarErros = new ArrayList();

        do {
            System.out.println("Escolha o nivel de dificuldade:  \n1 - Fácil\n2 - Médio\n3 - Dificil");
            int dificuldade = input.nextInt();

            int limitador = 0;
            boolean opcaoInvalida = false;

            switch (dificuldade) {
                case 1:
                    limitador = 5;
                    break;
                case 2:
                    limitador = 7;
                    break;
                case 3:
                    limitador = 10;
                    break;
                default: opcaoInvalida = true;
            }

            if (opcaoInvalida) {
                System.out.println("Opção invalida! Tente informar um valor entre 1 e 3");
                continue;
            }

            int numeroSorteado = new Random().nextInt(limitador);

            System.out.println("<<"+numeroSorteado+">>");

            System.out.printf("Informe um numero entre %d e %d: ", 0, limitador);
            int aposta = input.nextInt();

            if(aposta == numeroSorteado) {
                System.out.println("Acertou! Ganhou 10 pontos!");
                placarAcertos.add(numeroSorteado);
            }
            else if(aposta == numeroSorteado-1 || aposta == numeroSorteado+1) {
                System.out.printf("Passou perto! O numero correto é: %d\nGanhou 5 pontos!", numeroSorteado);
                placarAcertosParciais.add(numeroSorteado);
            }
            else {
                System.out.printf("Errou! O numero correto é: %d\nNão marcou pontos!", numeroSorteado);
                placarErros.add(numeroSorteado);
            }

            System.out.println("\nDeseja jogar novamente? Sim|Não");
            continuar = input.next();



        } while (continuar.equalsIgnoreCase("sim"));

        int acertos = placarAcertos.size();
        int parciais = placarAcertosParciais.size();
        int erros = placarErros.size();
        int pontuacaoFinal = (acertos * 10) + (parciais * 5);
        int rodadas = acertos + parciais + erros;

        System.out.printf("Acertos exatos: %d\nAcertos parciais: %d\nErros %d\nSua pontuação foi: %d\nTotal de rodadas: %d", acertos, parciais, erros, pontuacaoFinal, rodadas);
        System.out.println("\nOs seus acertos foram: " + placarAcertos);
        System.out.println("Os seus acertos aproximados foram: " + placarAcertosParciais);
    }
}
