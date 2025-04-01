package iniciante;
import java.util.Scanner;

public class NumeroMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite um número: ");
        int numero2 = scanner.nextInt();

        if (numero1>numero2) {
            System.out.println("O maior número é: "+numero1);
        }else if (numero2>numero1) {
            System.out.println("O maior número é: "+numero2);
        }else{
            System.out.println("Ambos números tem o mesmo valor!");
        }
        scanner.close();
    }
}
