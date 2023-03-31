package excepciones.ejercicio1;

public class Ejer1 {

    public static void main(String[] args) throws Exception {
        try {
            throw new Exception("Error generado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Final");
        }
    }
}
