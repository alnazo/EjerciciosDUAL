package fundamentos.ejercicio13;

public class Ejer13 {

    public static void main(String[] args) {
        System.out.println(adolescente(15,20,23));
    }

    public static boolean adolescente(int ed1, int ed2, int ed3){
        boolean res = false;

        if ((ed1 >= 13 && ed1 <= 19) || (ed2 >= 13 && ed2 <= 19) || (ed3 >= 13 && ed3 <= 19)){
            res = true;
        }

        return res;
    }

}
