package exercicios;
import java.util.Scanner;

public class NumeroDigitado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();
        int contador = 1;

        while (numero>=contador) {
            System.out.println(contador);
            contador++;
        }

        scanner.close();
    }
    
}