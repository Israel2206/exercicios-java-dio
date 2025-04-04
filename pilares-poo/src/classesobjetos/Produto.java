package classesobjetos;
public class Produto {
    String nome;
    double preco;
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "cafe";
        produto.preco = 8.00;

        Produto produto2 = new Produto();
        produto2.nome = "acucar";
        produto2.preco = 5.5;

        Produto produto3 = new Produto();
        produto3.nome = "arroz";
        produto3.preco = 6.00;

        double total = produto.preco + produto2.preco + produto3.preco;
        System.out.println("Preço total: " + total);

    }
}
