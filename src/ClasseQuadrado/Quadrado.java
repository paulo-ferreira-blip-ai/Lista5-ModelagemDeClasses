package ClasseQuadrado;

public class Quadrado {
    public double tamanhoDoLado;

    public Quadrado() {
        this.tamanhoDoLado = 0;
    }

    public void area() {
        System.out.println("A área do quadrado é igual: " + (tamanhoDoLado * tamanhoDoLado) + " cm²");
    }
}
