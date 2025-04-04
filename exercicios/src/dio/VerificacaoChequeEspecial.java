package dio;
import java.util.Scanner;

public class VerificacaoChequeEspecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        // Saldo total disponível, considerando o cheque especial
        double saldoDisponivel = saldo + limiteChequeEspecial;

        if (saque <= saldo) {
            System.out.println("Transacao realizada com sucesso.");
        } else if (saque <= saldoDisponivel) {
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        } else {
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }

        scanner.close();
    }
}
