package fundamentos.ejercicio4;

public class Ejer4 {
    public static void main(String[] args) {
        String cadena = "T0d0 lo pos1bl3";
        sacanumeros(cadena);
    }

    public static void sacanumeros(String e){
        for(int i = 0; i<e.length();i++){
            if(Character.isDigit(e.charAt(i))){
                System.out.println(e.charAt(i));
            }
        }
    }

}
