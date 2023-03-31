package fundamentos.ejercicio12;

public class Ejer12 {

    public static void main(String[] args) {
        System.out.println(inicia("Programa no va"));
    }
    public static boolean inicia(String e){
        boolean res = false;

        if (e.matches("programa(.*)")){
            res = true;
        }

        return res;
    }

}
