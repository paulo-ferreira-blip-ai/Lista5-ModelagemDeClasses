package ClassePessoa;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Renan", 15, 60, 170);
        int altura1 = pessoa.altura;
        double peso = pessoa.peso;
        int idade = pessoa.idade;
        System.out.println("O seu nome é " + pessoa.nome+ "\nque tem uma altura de "+altura1+" cm"+"\ncom idade de "+idade+" anos"+"\npesando aproximadamente "+peso+" kg.");

        pessoa.envelhecer();
        pessoa.emagrecer();
        //pessoa.engordar();
        pessoa.status();




    }
}
