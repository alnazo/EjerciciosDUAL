package fundamentos.ejercicio6;

public class Ejer6 {
    public static void main(String[] args) {
        String tipo = triangulo(23.5,22.5,23);
        System.out.println("El triángulo es: " + tipo);
    }
    public static String triangulo(double lad1, double lad2, double lad3){
        String res;
        if (lad1 == lad2 && lad1 == lad3){
            res = "equilátero";
        } else if (lad1 == lad2 || lad1 == lad3 || lad2 == lad3){
            res = "isósceles";
        } else {
            res = "escaleno";
        }
        return res;
    }
}
