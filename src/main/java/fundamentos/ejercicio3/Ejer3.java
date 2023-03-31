package fundamentos.ejercicio3;

public class Ejer3 {
    public static void main(String[] args) {
        Contador c = new Contador();
        System.out.println(c.getCount());
        Contador c2 = new Contador();
        System.out.println(c.getCount() + " " + c2.getCount());
    }
}
