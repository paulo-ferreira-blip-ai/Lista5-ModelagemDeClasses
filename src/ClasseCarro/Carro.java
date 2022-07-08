package ClasseCarro;

public class Carro {
    public int qtdPortas;
    public String modelo;
    public String marca;
    public double potencia;
    public boolean ligarCarro;

    public Carro() {
        this.qtdPortas = qtdPortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
        this.ligarCarro = ligarCarro();
    }

    public boolean ligarCarro(){
        if (this.ligarCarro == true){
            System.out.println("O carro esta ligado.");
        } else {
            System.out.println("O carro não está ligado.");
        }return ligarCarro;

    }

    public void status() {
        System.out.println("O modelo do carro é " + this.modelo + "\nDa marcar " + this.marca + "\nDe " + this.qtdPortas + " portas");

    }
}
