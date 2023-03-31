package excepciones.ejercicio2;

public class Ejer2 {
    public static void main(String[] args) {
        try{
            throw new ExcepcionPersonal("Error generado");
        } catch (ExcepcionPersonal e){
            System.out.println(e.getMessage());
        }
    }
}
