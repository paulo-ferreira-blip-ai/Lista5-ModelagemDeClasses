package ClasseBola;

public class MainBola {
    public static void main(String[] args) {
        Bola jabulani = new Bola();
        jabulani.marca = "Penalty";
        jabulani.circunferencia = "70 cm";
        jabulani.velocidade = "30 m/s";
        jabulani.material = "couro";
        jabulani.trocarCor("verde");
        System.out.println(jabulani.mostrarCor());
        jabulani.status();


    }
}
