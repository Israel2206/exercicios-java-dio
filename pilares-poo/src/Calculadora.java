import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite outro numero: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Escolha a operação (+, -, *, /): ");
        String oper = scanner.next(); // Certo!

        if (oper.equals("+")) {
            Somar(num1, num2);
        } else if (oper.equals("-")) {
            Subtrair(num1, num2);
        } else if (oper.equals("*")) {
            Multiplicar(num1, num2);
        } else if (oper.equals("/")) {
            Dividir(num1, num2);
        } else {
            System.out.println("COLOQUE UMA OPÇÃO VÁLIDA!");
        }

        scanner.close(); 
    }

    static void Somar(double num1, double num2) {
        System.out.println("Resultado: " + (num1 + num2));
    }

    static void Subtrair(double num1, double num2) {
        System.out.println("Resultado: " + (num1 - num2));
    }

    static void Multiplicar(double num1, double num2) {
        System.out.println("Resultado: " + (num1 * num2));
    }

    static void Dividir(double num1, double num2) {
        if (num2 != 0) { 
            System.out.println("Resultado: " + (num1 / num2));
        } else {
            System.out.println("Erro: Divisão por zero não permitida!");
        }
    }
}
