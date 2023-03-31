package excepciones.ejercicio3;

import excepciones.ejercicio2.ExcepcionPersonal;

public class Ejer3 {
    public static void main(String[] args){
        try{
            throw new ExcepcionPersonal("Lanzado");
        } catch (ExcepcionPersonal e){
            System.out.println(e.getMessage());
        }
    }
}
