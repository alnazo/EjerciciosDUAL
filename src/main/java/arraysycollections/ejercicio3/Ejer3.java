package arraysycollections.ejercicio3;

import java.util.Arrays;

public class Ejer3 {
    public static void main(String[] args) {
        MidList mid = new MidList();

        int[] list1 = {6,8,6,4,7,6};
        int[] list2 = {8,6,3};
        int[] list3 = {2,5,8,6};

        try {
            System.out.println(Arrays.toString(mid.medio(list1)));
            System.out.println(Arrays.toString(mid.medio(list2)));
            System.out.println(Arrays.toString(mid.medio(list3)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
