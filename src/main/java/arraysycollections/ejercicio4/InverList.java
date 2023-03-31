package arraysycollections.ejercicio4;

public class InverList {
    public int[] inversion(int[] a){
        int[] res = new int[a.length];
        int cont = 0;
        for(int i = a.length-1; i >= 0; i--){
            res[cont] = a[i];
            cont++;
        }

        return res;
    }
}
