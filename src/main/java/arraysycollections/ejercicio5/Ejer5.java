package arraysycollections.ejercicio5;

import java.util.Arrays;

public class Ejer5 {
    public static void main(String[] args) {
        Separador sep = new Separador();

        String[] line1 = {"T0da", "la", "v1da", "s3ra", "util"};

        System.out.println(Arrays.toString(sep.separar(line1)));

    }
}
