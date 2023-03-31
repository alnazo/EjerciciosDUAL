package excepciones.ejercicio10;

public class Ejer10 {

    public static void main(String[] args) {
        C element = new C();
        A element2 = (A) element;
        try {
            element2.excep();
        } catch (Excep3 e) {
            System.out.println(e.getMessage());
        } catch (Excep2 e) {
            System.out.println(e.getMessage());
        } catch (Excep1 e) {
            System.out.println(e.getMessage());
        }
    }

}
