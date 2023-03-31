package arraysycollections.ejercicio1;

public class ListInt {

    public boolean ejer1(int[] a){
        boolean res = false;

        int first = a[0];
        int last = a[a.length-1];
        if (first == 6 || last == 6){
            res = true;
        }

        return res;
    }

}
