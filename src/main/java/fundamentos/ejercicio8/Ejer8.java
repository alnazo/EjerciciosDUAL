package fundamentos.ejercicio8;

public class Ejer8 {

    public static void main(String[] args) {
        System.out.println(numerito(4));
    }

    public static int numerito(int n){
        int res = 0;
        if (n >= 21){
            res = n-21;
        } else {
            res = (n-21)*2;
        }
        return res;
    }
}
