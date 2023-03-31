package arraysycollections.ejercicio6;

import java.util.ArrayList;

public class Ejer6 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<String> line1 = new ArrayList<>();
        list1.add(6); list1.add(8); list1.add(6); list1.add(4); list1.add(7); list1.add(6);
        list2.add(8); list2.add(5); list2.add(2);
        list3.add(2); list3.add(5); list3.add(8); list3.add(6);
        line1.add("T0da"); line1.add("la"); line1.add("v1da"); line1.add("s3ra"); line1.add("util");

        System.out.println(ejer1(list1));
        System.out.println(ejer1(list2));
        System.out.println("----------");
        System.out.println(ejer2(list1));
        System.out.println(ejer2(list3));
        System.out.println("----------");
        try {
            System.out.println(ejer3(list3));
            System.out.println(ejer3(list2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("----------");
        System.out.println(ejer4(list3));
        System.out.println(ejer4(list2));
        System.out.println("----------");
        System.out.println(ejer5(line1));
        System.out.println("----------");


    }

    public static boolean ejer1(ArrayList<Integer> li){
        boolean res = false;
        if(li.get(li.size()-1) == 6 || li.get(0) == 6){
            res = true;
        }
        return res;
    }

    public static boolean ejer2(ArrayList<Integer> li){
        boolean res = true;
        if(li.contains(2) || li.contains(3)){
            res = false;
        }
        return res;
    }

    public static ArrayList<Integer> ejer3(ArrayList<Integer> li) throws Exception{
        ArrayList<Integer> neli = new ArrayList<>();
        if (li.size()%2==0){
            neli.add(li.get((li.size()/2)-1));
            neli.add(li.get((li.size()/2)));
        } else {
            throw new Exception("La lista de entrada: " + li.toString() + " no contiene los suficientes elementos");
        }
        return neli;
    }

    public static ArrayList<Integer> ejer4(ArrayList<Integer> li){
        ArrayList<Integer> neli = new ArrayList<>();
        for (int i = li.size()-1; i>=0; i--){
            neli.add(li.get(i));
        }
        return neli;
    }

    public static ArrayList<String> ejer5(ArrayList<String> li){
        ArrayList<String> neli = new ArrayList<>();
        for (String str : li) {
            if (str.matches(".*\\d.*")) {
                neli.add(str);
            }
        }
        return neli;
    }

}
