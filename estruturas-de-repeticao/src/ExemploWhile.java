import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) throws Exception {
        double mesada = 50.0;

        while (mesada>0) {
            Double valorDoce = valorAletorio();
            if(valorDoce>mesada)
                valorDoce = mesada;
            
            System.out.println("Doce valor: "+ valorDoce+ "Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: "+ mesada);
        System.out.println("Joãozinho gastou todas suas econimias em doces!");

    }
    private static double valorAletorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
