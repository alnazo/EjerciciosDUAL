package fundamentos.ejercicio15;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejer15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Si desea finalizar el programa no introduzca valor.");
        ArrayList<String> values = new ArrayList<>();
        boolean fin = true;
        int suma = 0;
        int num = 0;
        do{
            System.out.println("Introduzca valor:");
            String val = sc.nextLine();
            if (!val.isEmpty()){
                values.add(val);
            } else {
                fin = false;
            }
        } while (fin);

        for (int i = 0; i < values.size(); i++){
            if (values.get(i).matches("([0-9]+(-[0-9]+)?)")){
                num = Integer.parseInt(values.get(i));
                suma += num;
            } else {
                System.out.println("El parámetro No " + (i+1) + " no es numérico");
            }
        }
        System.out.println("La suma es: "+suma);
    }

}
