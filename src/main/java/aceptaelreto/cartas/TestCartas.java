package aceptaelreto.cartas;

import java.util.Scanner;

public class TestCartas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        System.out.println("Si desea finalizar la introduccion de cartas, escriba un 0.");
        System.out.println("Los valores de las cartas van desde el 2 al 10 y J, Q, K, A");
        System.out.println("Los palos son: P, D, T, C");
        EscaleraDeColor cartas = new EscaleraDeColor();
        do{
            System.out.println("Introduzca las 4 cartas en formato (Valor Palo Valor Palo Valor Palo Valor Palo)");
            input = sc.nextLine();
            input = input.toUpperCase();
            if(input.equals("0")){
                System.out.println("Procesando cartas...");
            } else if (!input.equals("0") && cartas.verificar(input)){
                cartas.add(input);
            } else {
                System.out.println("La linea introducida esta mal. Vuelva a intentarlo.");
            }
        } while (!input.equals("0"));

        cartas.solucion();

    }
}
