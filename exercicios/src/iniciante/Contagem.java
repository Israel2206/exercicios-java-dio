package iniciante;
import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        for(int contador = 1; contador<=numero;contador++) {
            System.out.println(contador);
        }
        scanner.close();
    }
}
