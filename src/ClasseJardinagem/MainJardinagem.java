package ClasseJardinagem;

public class MainJardinagem {
    public static void main(String[] args) {
        Jardinagem jad1 = new Jardinagem();
        jad1.nomeJardim = "Éden";
        jad1.qtdMetros = 150;
        jad1.qtdPlantas = 45;
        jad1.qtdMetrosGrama = 100;
        jad1.quilosAdubo = 0;
        jad1.valorAdubo = 10.49;
        jad1.valorMetroGrama = 5.50;
        jad1.valorCorteGrama = 8.50;

        //chamando métodos:

        jad1.usarAdubo();
        System.out.printf("No seu jardim chamado " + jad1.nomeJardim +
                " você tem um terreno que mede " + jad1.qtdMetros + " metros." + "" +
                "\nE com " + jad1.qtdPlantas + " tipos de plantas, seu jardim fica muito bem ornamentado." + "" +
                "\nEntão se você tem " + jad1.qtdMetrosGrama + " metros de grama, a cada 2 metros você gastaria");
        System.out.printf(" R$ %.2f", jad1.precoAdubo());
        System.out.println(" em adubo.\n" + "E poderia revender por R$ " + jad1.valorCorteGrama +
                " o metro da sua grama já adubada." +
                "Tendo um lucro de R$ " + jad1.precoCorteGrama() +
                " caso venda os " + jad1.qtdMetrosGrama + " metros que você possui.");

    }
}
