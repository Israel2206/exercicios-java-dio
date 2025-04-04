package automovel;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();

        jeep.setChassi("6256633");
        jeep.ligar();

        Moto s1000rr = new Moto();
        s1000rr.setChassi("03082007");
        s1000rr.ligar();
    }
    
}
