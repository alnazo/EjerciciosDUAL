package omvc.ejercicio6;

import java.util.ArrayList;

public class Concatenar {
    private ArrayList<String> palabras;

    public Concatenar(){}
    public Concatenar(ArrayList<String> palabras){
        this.palabras = palabras;
    }

    public void mostrar(){
        String concatenado = "";
        for(int i = 0; i < palabras.size(); i++){
            if (i != palabras.size()-1) {
                concatenado += palabras.get(i) + ", ";
            } else {
                concatenado += palabras.get(i);
            }
        }
        System.out.println(concatenado);
    }

}
