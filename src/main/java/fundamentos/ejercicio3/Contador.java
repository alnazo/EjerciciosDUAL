package fundamentos.ejercicio3;

public class Contador {
    private static int count = 0;

    public Contador(){
        this.count++;
    }

    public static int getCount() {
        return count;
    }
}
