package dio;
import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {

            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                limiteDiario= limiteDiario - valorSaque;
                System.out.println("Saque realizado. Limite restante: "+limiteDiario);
                System.out.println("Transacoes encerradas.");
                break;
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}