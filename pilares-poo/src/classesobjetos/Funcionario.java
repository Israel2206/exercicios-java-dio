package classesobjetos;
public class Funcionario {
    String nome;
    double salario;
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        
        funcionario.nome = "Israel";
        funcionario.salario = 1512.00;
        System.out.println("Salario Anual: "+funcionario.CalcularSalario());
    }
    public double CalcularSalario(){
        return salario*12;
    }
    
}
