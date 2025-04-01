package basico;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            int numero1 = scanner.nextInt();
            System.out.print("Digite um número: ");
            int numero2 = scanner.nextInt();

            int resultado = numero1/numero2;

            System.out.println("Resultado: "+resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Não é permitido dividir por 0!");
        } catch (InputMismatchException e){
            System.out.println("Coloque um número válido!");
        } finally {
            scanner.close();
        }
    }
    
}