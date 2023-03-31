package excepciones.ejercicio8;

import java.util.ArrayList;

public class Ejer8 {
    public static void main(String[] args) {
        Integer[] list = new Integer[5];

        try {
            list[-3] = 2;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }


    }
}
