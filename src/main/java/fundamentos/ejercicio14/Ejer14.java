package fundamentos.ejercicio14;

public class Ejer14 {

    public static void main(String[] args) {

        System.out.println(palindromo("Anita lava la tina"));

    }

    public static boolean palindromo(String e) {
        boolean res = false;
        e = e.toLowerCase();
        e = e.replaceAll(" ", "");
        String reverse = "";
        for (int i = 0; i < e.length();i++){
            reverse = e.charAt(i)+ reverse;
        }
        if (e.equals(reverse)){
            res = true;
        }
        return res;
    }
}
