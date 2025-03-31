public class ExemploForArry {
    public static void main(String[] args) {
        String alunos [] = {"MARIANE", "BRENO", "BASTOS","CAVALCANTE"};

        /*for(int x=0; x<alunos.length; x++) {

            System.out.println("O aluno "+ x +" é: "+alunos[x]);
        }
        */

        for(String aluno: alunos ){

            System.out.println("O nome do aluno é: "+aluno);
        }

    }
}