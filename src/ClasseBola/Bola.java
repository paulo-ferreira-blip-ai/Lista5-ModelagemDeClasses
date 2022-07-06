package ClasseBola;

public class Bola {
    public String circunferencia;
    public String cor;
    public String marca;
    public String velocidade;
    public String material;

    void status(){
        System.out.println("A marca da bola é " + this.marca + "\nfeita com material de "+this.material+ "\nda cor "+this.cor+"." +"\nTem uma circunferência de "+this.circunferencia+ "\nque chega a uma velocidade máxima de "+this.velocidade+".");

    }



    public Bola() {

    }

    public void trocarCor (String novaCor){
        cor = novaCor;

    } public String mostrarCor(){
        return cor;
    }
}
