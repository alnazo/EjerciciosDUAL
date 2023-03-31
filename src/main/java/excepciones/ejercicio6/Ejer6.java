package excepciones.ejercicio6;

import excepciones.ejercicio5.PersonalException;

public class Ejer6 {
    public static void main(String[] args) {
        try {
        f();
        } catch (PersonalException e){
            e.printStackTrace();
        }
    }

    public static void f() throws PersonalException{
        try{
            g();
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            throw new PersonalException("Generado en f()");
        }
    }

    public static void g() throws PersonalException{
        throw new PersonalException("Generado en g()");
    }
}
