package fundamentos.ejercicio9;


import java.time.LocalDate;

public class Ejer9 {

    public static void main(String[] args) {
        boolean vacaciones = false;
        boolean diaDeSemana = true;
        LocalDate day = LocalDate.now();
        if (day.getDayOfWeek().getValue() > 5){
            diaDeSemana = false;
        }

        System.out.println(dormir(diaDeSemana, vacaciones));
    }

    public static boolean dormir(boolean diaDeSemana, boolean vacaciones){
        boolean dormir = false;
        if (!diaDeSemana && vacaciones){
           dormir = true;
        }
        return dormir;
    }
}
