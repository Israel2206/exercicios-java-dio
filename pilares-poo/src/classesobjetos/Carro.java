package classesobjetos;
public class Carro {
    String marca;
    String modelo;

    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.marca = "jeep";
        carro.modelo = "renegation";

        System.out.println("Marca: " + carro.marca);
        System.out.println("Modelo: " + carro.modelo);

    }
}
