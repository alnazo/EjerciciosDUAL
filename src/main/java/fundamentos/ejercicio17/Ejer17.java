package fundamentos.ejercicio17;

public class Ejer17 {
    public static void main(String[] args) {
        String dni = "30237738Y";
        System.out.println(dni(dni));
    }

    public static boolean dni(String dni){
        String dniChars="TRWAGMYFPDXBNJZSQVHLCKE";
        boolean res = false;
        dni = dni.toUpperCase();
        if (dni.length() == 9){
            char letra = dni.charAt(dni.length()-1);
            int num = Integer.parseInt(dni.replaceAll("[A-Z]", "").substring(0, 8));
            int valnum = num%23;
            if (dniChars.charAt(valnum) == letra) {
                res = true;
            }
        } else {
            System.out.println("El DNI no tiene una longitud adecuada");
        }
        return res;
    }
}
