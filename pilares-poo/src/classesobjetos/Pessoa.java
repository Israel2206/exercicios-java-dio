package classesobjetos;

public class Pessoa {
    int idade;
    String nome;
    public static void main(String[] args) {
        Pessoa breno = new Pessoa();


        breno.nome = "Breno";
        breno.idade = 17;
        System.out.println("Nome: " +breno.nome);
        System.out.println("idade: " +breno.idade);
    }
}
