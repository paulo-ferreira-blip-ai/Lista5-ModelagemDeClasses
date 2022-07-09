package ClasseJardinagem;

public class Jardinagem {
    //Atributos:
    public String nomeJardim;
    public double qtdMetros;
    public int qtdPlantas;
    public double qtdMetrosGrama;
    public double quilosAdubo;
    public double valorAdubo;
    public double valorMetroGrama;
    public double valorCorteGrama;

    //Constructor:
    public Jardinagem() {

    }


    //métodos:
    public void usarAdubo() {
        for (int i = 0; i < qtdMetrosGrama; i += 2) {
            this.quilosAdubo += 0.1;
        }

    }

    public double precoAdubo() {
        return quilosAdubo * valorAdubo;
    }

    public double precoCorteGrama() {
        return valorCorteGrama = qtdMetrosGrama * valorMetroGrama;
    }

}
