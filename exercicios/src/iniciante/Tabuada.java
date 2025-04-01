package iniciante;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int contador = 1;

        while (contador<=10) {
            System.out.println(numero+" X "+contador+" = "+(numero*contador));
            contador++;
        }
        scanner.close();
    }
}
