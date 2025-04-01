package iniciante;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        if (numero %2==0) {
            System.out.println("O número "+numero+" é Par");
        }else{
            System.out.print("O número "+numero+" é Impar");
        }
        scanner.close();
    }
}