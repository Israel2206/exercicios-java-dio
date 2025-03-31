import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.print("Digite seu Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite seu Sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.print("Digite sua Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite sua Altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Nome: " + nome + " " + sobrenome);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Altura: " + altura + " m");
        } 
        catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de digitar os dados corretamente.");
        } 
        finally {
            scanner.close();
        }
    }
}
