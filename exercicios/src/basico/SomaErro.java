package basico;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SomaErro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int soma = 0;
        int numero = 0;
        try {
            while (true) {
                System.out.print("Digite um número: ");
                numero = scanner.nextInt();
                soma+=numero;
            }
        } catch (InputMismatchException e) {
            System.out.println("Fim!");
        }finally{
            scanner.close();
        }

        System.out.println("soma = "+soma);
    }
}
