package fundamentos.ejercicio2;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        boolean text;
        do {
            System.out.println("Introduzca el nombre:");
            nombre = sc.nextLine();
            text = nombre.chars().allMatch(Character::isAlphabetic);
            if (!text) {
                System.out.println("Error al introducir el nombre");
            }
        } while (!text);

        System.out.println("Hola "+ nombre);
    }
}
