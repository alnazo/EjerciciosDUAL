package aceptaelreto.cartas;

import java.util.*;

public class EscaleraDeColor {
    private ArrayList<String> cartas = new ArrayList<>();
    private ArrayList<Integer> nums = new ArrayList<>();
    private ArrayList<String> pal = new ArrayList<>();
    private ArrayList<String> solucion = new ArrayList<>();
    private static String numeros = "1234567890JQKA";
    private static String palos = "PDTC";

    public EscaleraDeColor(){}

    public void add(String linea){
        this.cartas.add(linea);
    }

    private String getNumero(int pos){
        String get = numeros.substring(pos, pos+1);
        if(get.equals("0")) {
            return "10";
        } else if(get.equals("1")){
            return "A";
        } else {
            return get;
        }
    }

    public boolean verificar(String linea){
        boolean res = false;
        int cont = 0;
        linea = linea.replaceAll("10", "0");
        String limpia = linea.replaceAll(" ", "");
        if (limpia.length() == 8) {
            for (int i = 0; i < limpia.length(); i++) {
                String num = limpia.substring(i, i+1);
                if (i == 0 || i == 2 || i == 4 || i == 6) { //Numeros
                    if (numeros.contains(num)){
                        cont++;
                    }
                } else { //Palos
                    if (palos.contains(num)){
                        cont++;
                    }
                }
            }
            if(limpia.substring(0,2).equals(limpia.substring(2,4))
                    || limpia.substring(0,2).equals(limpia.substring(4,6))
                    || limpia.substring(0,2).equals(limpia.substring(6,8))
                    || limpia.substring(2,4).equals(limpia.substring(4,6))
                    || limpia.substring(2,4).equals(limpia.substring(6,8))
                    || limpia.substring(4,6).equals(limpia.substring(6,8))
            ){
                return false;
            }
        }
        if (cont == 8){
            res = true;
        }

        return res;
    }

    private void agrupar(String linea){
        linea = linea.replaceAll("10", "0");
        String limpia = linea.replaceAll(" ", "");
        for (int j = 0; j < limpia.length(); j++) {
            String num = limpia.substring(j, j+1);
            if (j == 0 || j == 2 || j == 4 || j == 6) { //Numeros
                if (numeros.contains(num)){
                    if (num.equals("J") || num.equals("Q") || num.equals("K") || num.equals("A")){
                        int numn = numeros.indexOf(num)+1;
                        nums.add(numn);
                    } else if (num.equals("0")) {
                        nums.add(10);
                    } else {
                        nums.add(Integer.parseInt(num));
                    }
                }
            } else { //Palos
                if (palos.contains(num)){
                    pal.add(num);
                }
            }
        }
    }

    public void solucion(){
        if (!cartas.isEmpty()) {
            for (String linea : cartas) {
                agrupar(linea);
                boolean[] palos = new boolean[4];
                String primerPalo = pal.get(0);
                nums.sort(Comparator.naturalOrder());
                for (int i = 0; i < pal.size(); i++) {
                    if (pal.get(i).equals(primerPalo)) {
                        palos[i] = true;
                    } else {
                        palos[i] = false;
                    }
                }

                if (palos[0] == palos[1] && palos[0] == palos[2] && palos[0] == palos[3]) {
                    solucion.add(consecutivos(nums, pal.get(0)));
                } else {
                    solucion.add("NADA");
                }

                pal.clear();
                nums.clear();
            }

            for (String sol : solucion) {
                System.out.println(sol);
            }
        } else {
            System.out.println("No se han introducido cartas");
        }

    }

    private String consecutivos(ArrayList<Integer> numeros, String palo){
        String res = "";
        boolean conse = false;
        boolean noconse = false;

        ArrayList<ArrayList<Integer>> nuevosNumeros = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(numeros.get(0));
        for (int i = 0; i<numeros.size()-1; i++) {
            if (numeros.get(i+1) == numeros.get(i)+1) {
                temp.add(numeros.get(i+1));
            } else {
                nuevosNumeros.add(temp);
                temp = new ArrayList<>();
                temp.add(numeros.get(i+1));
            }
        }
        nuevosNumeros.add(temp);

        if(nuevosNumeros.size() == 1){
            conse = true;
        } else {
            noconse = true;
        }

        if (conse){
            if (numeros.get(3) == 13){
                res = (getNumero(numeros.get(3))) + " " + palo;
            } else if(numeros.get(3) == 14) {
                res = (getNumero(numeros.get(0)-2)) + " " + palo;
            } else if (numeros.get(0) >= 2 && numeros.get(3) <= 12){
                res = (getNumero(numeros.get(3))) + " " + palo;
            }
        } else if (noconse){
            if (nuevosNumeros.size() == 2 && nuevosNumeros.get(0).size() == 1){
                res = (getNumero(nuevosNumeros.get(0).get(0))) + " " + palo;
            } else if (nuevosNumeros.size() == 2 && nuevosNumeros.get(0).size() == 2) {
                res = (getNumero(nuevosNumeros.get(0).get(1))) + " " + palo;
            } else if (nuevosNumeros.size() == 2 && nuevosNumeros.get(0).size() == 3){
                res = (getNumero(nuevosNumeros.get(0).get(2))) + " " + palo;
            } else {
                res = "NADA";
            }
        } else {
            res = "NADA";
        }
        return res;
    }


}
