package fundamentos.ejercicio19;

import java.math.BigInteger;

public class Ejer19 {
    public static void main(String[] args) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String ibans = "ES0020854968164461807488";

        String pais = ibans.substring(0,4);
        String iban = ibans.substring(4)+pais;

        for (int i = 0; i < iban.length(); i++){
            if(!Character.isDigit(iban.charAt(i))){
                String cambio = iban.substring(i, i+1);
                int num = (letters.indexOf(cambio)+1)+9;
                iban = iban.substring(0,i) + num + iban.substring(i+1);
            }
        }
        BigInteger niban = new BigInteger(iban);
        BigInteger mod = new BigInteger("97");
        BigInteger rest = new BigInteger("98");
        BigInteger fin = niban.mod(mod);
        BigInteger res = rest.subtract(fin);
        String val = res.toString();
        if (val.length() == 1){
            val = "0"+val;
        }

        String nibans = ibans.substring(0,2) + val + ibans.substring(4);
        System.out.println(ibans);
        System.out.println("Generado:");
        System.out.println(nibans);

    }


}
