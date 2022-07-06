package ClasseCarro;

public class Carro {
    public int qtdPortas;
    public String modelo;
    public String marca;
    public double potencia;

    public Carro() {
        this.qtdPortas = qtdPortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = 2.0;
    }

    public void status() {
        System.out.println("O modelo do carro é " + this.modelo + "\nDa marcar " + this.marca + "\nDe " + this.qtdPortas + " portas");

    }
}
