public class Aluno {
    String nome;
    double nota1;
    double nota2;

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        
        aluno.nome = "Breno";
        aluno.nota1 = 10;
        aluno.nota2 = 8.5;

        media(aluno.nota1,aluno.nota2);

    }
    public static void media(double nota1, double nota2){
        double resultado = (nota1+nota2)/2;
        System.out.println(resultado);
    }
}
