package arraysycollections.ejercicio2;

public class ContentList {

    public boolean detector(int[] a){
        boolean res = true;

        for(int i = 0; i<a.length; i++){
            if(a[i] == 2 || a[i] == 3){
                res = false;
            }
        }

        return res;
    }

}
