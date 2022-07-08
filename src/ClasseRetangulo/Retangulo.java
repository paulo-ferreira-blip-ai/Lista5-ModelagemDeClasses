package ClasseRetangulo;

public class Retangulo {
    public double Base;
    public double Altura;

    public Retangulo() {
        this.Base = 0;
        this.Altura = 0;
    }

    public double areaDoRetangulo(){
        return Base * Altura;


    }
    public double perimetroDoRetangulo(){
        return 2 *(Base+Altura);


    }
    //public void
}
