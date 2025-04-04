public class Cachorro {
    String nome;
    String raca;
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        cachorro.nome = "neguin";
        cachorro.raca = "lavrador";

        cachorro.Latir();
    }
    public void Latir(){
        System.out.println("Au Au");
    }
}
