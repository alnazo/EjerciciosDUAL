package arraysycollections.ejercicio4;

import java.util.Arrays;

public class Ejer4 {
    public static void main(String[] args) {
        InverList inv = new InverList();

        int[] list1 = {6,8,6,4,7,6};
        int[] list2 = {8,5,6,3};
        int[] list3 = {2,5,8,6};
        int[] res1 = inv.inversion(list1);
        int[] res2 = inv.inversion(list2);
        int[] res3 = inv.inversion(list3);

        System.out.println(Arrays.toString(res1) + "\n" + Arrays.toString(res2) + "\n" + Arrays.toString(res3));

    }
}
