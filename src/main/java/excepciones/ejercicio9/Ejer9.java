package excepciones.ejercicio9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) {
        Integer input;
        while (true){
            try{
                System.out.println("Introducir un entero: ");
                input = new Scanner(System.in).nextInt();
                break;
            } catch (InputMismatchException e){
                System.out.println("Tipo erroneo | " + e.getMessage() );
            }
        }
    }
}
