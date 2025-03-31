package exercicios;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero para a Tabuada: ");
        int numero = scanner.nextInt();

        for( int contador = 1; contador <=10; contador++){
            System.out.println(numero +" X "+contador+" = "+(numero*contador));
        }
        scanner.close();
    }
}
