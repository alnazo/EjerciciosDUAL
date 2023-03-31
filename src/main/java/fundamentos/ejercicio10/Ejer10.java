package fundamentos.ejercicio10;

public class Ejer10 {

    public static void main(String[] args) {
        System.out.println(calc(150));
    }

    public static boolean calc(int n){
        boolean res = false;
        int ci = n - 100;
        int dos = n - 200;

        if ((ci <= 10 && ci >= 0) || (dos <= 10 && dos >= 0)) {
            res = true;
        }

        return res;
    }
}
