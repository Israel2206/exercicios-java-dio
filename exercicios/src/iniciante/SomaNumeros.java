package iniciante;
import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você deseja somar: ");
        int quantidade = scanner.nextInt();
        int contador = 1;
        int numero = 0;
        int soma = 0;

        while (contador<=quantidade) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            soma += numero;
            contador++;
        }
        System.out.println("Resultado: "+soma);
        scanner.close();
    }
}
