package fundamentos.ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean fin = true;
        ArrayList<String> elems = new ArrayList<>();
        System.out.println("Si desea finalizar el programa no introduzca texto.");
        do {
            System.out.println("Introduzca elementos: ");
            String next =sc.nextLine();
            if (!next.isEmpty()){
                elems.add(next);
            } else {
                fin = false;
            }
        } while (fin);

        for(String el: elems){
            System.out.println(el + " " + verificador(el));
        }

    }

    public static String verificador(String e){
        String res;
        int num = e.length()%2;
        if (num == 0){
            res = "Par";
        } else {
            res = "Impar";
        }
        return res;
    }

}
