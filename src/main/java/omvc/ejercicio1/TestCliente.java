package omvc.ejercicio1;

public class TestCliente {
    public static void main(String[] args) {
        Cliente cl1 = new Cliente("Antonio", 26, 1.81, "Baloncesto", "Sevilla");

        System.out.println(cl1);
        System.out.println(cl1.cambiarHobby("Baloncesto"));
        System.out.println(cl1.cambiarHobby("Balonmano"));
        System.out.println(cl1);
    }
}
