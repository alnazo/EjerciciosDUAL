package fundamentos.ejercicio7;

public class Ejer7 {
    public static void main(String[] args) {
        cuentaVocales("EleFantE");
    }

    public static void cuentaVocales(String e){
        int count = 0;
        e = e.toLowerCase();
        for (int i = 0; i < e.length(); i++){
            if (e.charAt(i) == 'a' || e.charAt(i) == 'e' || e.charAt(i) == 'i' || e.charAt(i) == 'o' || e.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println("Tiene "+count+" vocales");
    }
}
