package arraysycollections.ejercicio3;

import java.util.Arrays;

public class MidList {
    public int[] medio(int[] a) throws Exception{
        int[] res = new int[2];

        if(a.length % 2 == 0){
            res[0] = a[(a.length/2)-1];
            res[1] = a[(a.length/2)];
        } else {
            throw new Exception("El array de entrada: " + Arrays.toString(a) + " no contiene los suficientes elementos");
        }

        return res;
    }

}
