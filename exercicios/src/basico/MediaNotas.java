package basico;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite sua primeira nota: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite sua segunda nota: ");
            double nota2 = scanner.nextDouble();
            
            System.out.print("Digite sua terceira nota: ");
            double nota3 = scanner.nextDouble();
            double media = (nota1+nota2+nota3)/3;
    
            if (media >= 7) {
                System.out.println("Sua média é: "+media+" aprovado!");
            }else if (media >=5 && media <7) {
                System.out.println("Sua media é: "+media+" recuperação!");
            }else{
                System.out.println("Sua media é: "+media+" reprovado!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Digite um número coretamente!");
        }
        finally{
            scanner.close();
        }
    }
}
