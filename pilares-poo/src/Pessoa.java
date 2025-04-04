public class Pessoa {
    String nome;
    int idade;
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.idade = 17;
        pessoa.nome = "Israel";

        pessoa.Comprimentar();

    }
    public void Comprimentar(){
        System.out.println("olá, eu sou "+nome+", tudo bem?");
    }
}
