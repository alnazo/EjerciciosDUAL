package arraysycollections.ejercicio2;

public class Ejer2 {
    public static void main(String[] args) {
        ContentList list = new ContentList();

        int[] list1 = {6,8,6,4,7,6};
        int[] list2 = {8,5,3};
        int[] list3 = {2,5,8,6};

        System.out.println(list.detector(list1));
        System.out.println(list.detector(list2));
        System.out.println(list.detector(list3));

    }
}
