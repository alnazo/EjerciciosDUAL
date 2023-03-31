package fundamentos.ejercicio11;

public class Ejer11 {

    public static void main(String[] args) {
        System.out.println(transform("Supercleidomastoideo"));
    }

    public static String transform(String e){
        int cadena = e.length();
        char letra = e.charAt(cadena-1);
        return letra+e+letra;
    }
}
