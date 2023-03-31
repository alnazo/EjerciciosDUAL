package excepciones.ejercicio4;

public class Ejer4 {
    public static void main(String[] args) {
        String obj = null;

        try {
            obj.length();
        } catch (NullPointerException e) {
            System.out.println("No puede ser null");
        }
    }

}