package classesobjetos;
import java.util.Scanner;

public class ContaBancaria {
    String titular;
    double saldo;
    int numero;
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        
        contaBancaria.titular = "Israel";
        contaBancaria.saldo = 1200.0;
        contaBancaria.numero = 521;

        System.out.println("Saldo Atualizado: "+ contaBancaria.DepositarDinheiro());
        
    }
    public double DepositarDinheiro(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do depósito: ");
        double deposito = scanner.nextDouble();
        return saldo = saldo+deposito;
    }
}
