package excepciones.ejercicio7;

public class Ejer7 {
    public static void main(String[] args) {
        String obj = null;
        int a = 2;
        int b = 0;

        try {
            //obj.length();
            //int c = a/b;
            //int d = Integer.parseInt("solo");
        } catch (NullPointerException nu){
            System.out.println(nu.getMessage());
        } catch (ArithmeticException ar) {
            System.out.println(ar.getMessage());
        } catch (NumberFormatException in) {
            System.out.println(in.getMessage());
        }
    }
}
