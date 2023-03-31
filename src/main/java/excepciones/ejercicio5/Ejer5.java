package excepciones.ejercicio5;

public class Ejer5 {

    public static void main(String[] args) throws PersonalException {
        try {
            f();
        } catch (PersonalException e){
            e.printStackTrace();
        }
    }

    public static void f() throws PersonalException{
        try{
            g();
        } catch (PersonalException e){
            System.out.println(e.getMessage());
            throw new PersonalException("Generado en f()");
        }
    }

    public static void g() throws PersonalException{
        throw new PersonalException("Generado en g()");
    }

}
