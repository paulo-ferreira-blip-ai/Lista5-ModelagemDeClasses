package ClasseRetangulo;

public class Retangulo {
    public double Base;
    public double Altura;

    public Retangulo() {
        this.Base = 0;
        this.Altura = 0;
    }

    public void areaDoRetangulo(){
        System.out.println("A aréa do retangulo é: " + (Base * Altura));

    }
}
