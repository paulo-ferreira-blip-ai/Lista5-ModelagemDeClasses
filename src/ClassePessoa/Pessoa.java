package ClassePessoa;

public class Pessoa {
    public String nome;
    public int idade;
    public double peso;
    public int altura;

    //mostrando atributos na tela:
    public void status() {
        System.out.println("No proximo ano você fará " + this.idade+" anos");
        System.out.println("e se emagrecer 3 quilo ficará com " + this.peso + " kg");
        System.out.println("Até os 21 anos você cresce meio centimento por ano, ou seja, no proximo ano terá " + this.altura + " cm de altura.");
        System.out.println();
    }

    //Constructor
    public Pessoa(String nome, int idade, double peso, int altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    //Método para envelhecer e para crescer meio centímetro por ano até os 21 anos.
    public void envelhecer() {
        this.idade = this.idade + 1;
        if (this.idade < 21) {
            crescer(5);
        }

    }

    //Método para emagrecer:
    public void emagrecer() {
        this.peso -= 3;
    }

    //Método para crescer usado dentro do método envelhecer:
    public void crescer(double altura2) {
        this.altura += altura2;

    }

    //Método para engordar:
    public void engordar() {
        this.peso += 1;
    }

}

