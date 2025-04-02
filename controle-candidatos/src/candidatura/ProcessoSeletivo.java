/*CODIGO COPIADO DO CURSO DIO PARA EU PODER TER UMA BASE DE COMO FUNCIONA AS ESTRUTURAS DO JAVA */

package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"BRENO","ISRAEL","FABIO","PAULO","FABRICIO"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            }else{
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
            }
            
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO DO CANDIDATO "+candidato+ " NA " + tentativasRealizadas);
        }else{
            System.out.println("NÃO CONSEGUIMOS CONTATO DO CANDIDATO "+candidato+ " NA " + tentativasRealizadas);
        }
    }
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"BRENO","ISRAEL","FABIO","PAULO","FABRICIO"};
        System.out.println("Imprimindo a lista de candidatos infromando o indice do elemento");

        for(int indice = 0; indice < candidatos.length;indice++){
            System.out.println("O candidado de numero "+(indice+1)+" é "+ candidatos[indice]);
        }
    }
    static void selecaoCandidatos(){

        String [] candidatos = {"BRENO","ISRAEL","FABIO","PAULO","FABRICIO","SOLANGE","LUCAS","PABLO","MATHEUS","MARIANE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;

        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+candidato+ " solicitou esse valor de Salario "+ salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato "+candidato+" foi selecionado para a vaga");
                candidatosSelecionados++;   
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO PARA CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
