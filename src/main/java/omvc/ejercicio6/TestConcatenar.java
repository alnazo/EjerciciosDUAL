package omvc.ejercicio6;

import java.util.ArrayList;

public class TestConcatenar {
    public static void main(String[] args) {

        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Luis");
        palabras.add("Pedernal");
        palabras.add("Juegos");
        palabras.add("Fianza");
        palabras.add("Agradable");

        Concatenar concat = new Concatenar(palabras);
        concat.mostrar();
    }
}
