package classesobjetos;
public class Livro {
    String titulo;
    String autor;

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.titulo = "diario de um banana";
        livro.autor = "banana";

        Livro livro2 = new Livro();
        livro2.titulo = "convite para um homicidio";
        livro2.autor = "Aghata Criste";

        Livro livro3 = new Livro();
        livro3.titulo = "algoritmo";
        livro3.autor = "indefinido";

        System.out.println(livro.autor +" | "+livro2.autor+" | "+livro3.autor );
    }
}