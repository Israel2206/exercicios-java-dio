package basico;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mult = 1;
        System.out.print("Digite um número para fatorar: ");
        int fatorial = scanner.nextInt();
        
        int contador = 1;
        
        while (contador<=fatorial) {
            mult = (mult*fatorial);
            fatorial--;     
        }
        System.out.println("resultdo: "+mult);

        scanner.close();
    }
}
