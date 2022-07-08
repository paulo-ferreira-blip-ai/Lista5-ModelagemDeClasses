package ClasseRetangulo;

public class MainRatangulo {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();
        r1.Base = 10;
        r1.Altura = 20;
        System.out.println("A área do rentangulo é: "+r1.areaDoRetangulo());
        System.out.println("O perímetro do retangulo é: "+r1.perimetroDoRetangulo());


    }
}
