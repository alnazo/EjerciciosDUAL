package arraysycollections.ejercicio5;

public class Separador {

    public String[] separar(String[] e){
        String[] res;
        int count = 0;
        for (String str : e) {
            if (str.matches(".*\\d.*")) {
                count++;
            }
        }
        res = new String[count];
        for (int i = 0, j = 0; i<e.length; i++){
            if (e[i].matches(".*\\d.*")){
                res[j] = e[i];
                j++;
            }
        }
        return res;
    }
}
