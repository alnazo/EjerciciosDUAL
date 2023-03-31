package fundamentos.ejercicio18;

public class Ejer18 {

    public static void main(String[] args) {

        String banco = "2080";
        String sucursal = "1532";
        String control = "85";
        String cuenta = "3599333471";

        int A = banco(Integer.parseInt(banco));
        int B = sucursal(Integer.parseInt(sucursal));
        int C = (A+B)%11;
        int controlA = 11-C;
        if (controlA == 10){
            controlA = 1;
        } else if (controlA == 11){
            controlA = 0;
        }
        int D = cuenta(cuenta);
        int E = D%11;
        int controlB = 11-E;
        if (controlB == 10){
            controlB = 1;
        } else if (controlB == 11){
            controlB = 0;
        }

        boolean verificar = control(control, controlA, controlB);
        System.out.println(verificar);
    }

    public static int banco(int a){
        int res = 0;

        int cuarto = (a%10)*10;
        a = a/10;
        int tercero = (a%10)*5;
        a = a/10;
        int segundo = (a%10)*8;
        a = a/10;
        int primero = a*4;

        res = cuarto + tercero + segundo + primero;

        return res;
    }

    public static int sucursal(int a){
        int res = 0;

        int cuarto = (a%10)*6;
        a = a/10;
        int tercero = (a%10)*3;
        a = a/10;
        int segundo = (a%10)*7;
        a = a/10;
        int primero = a*9;

        res = cuarto + tercero + segundo + primero;

        return res;
    }

    public static int cuenta(String a){
        int res = 0;
        int primero = 0, segundo = 0, tercero = 0, cuarto = 0, quinto = 0, sexto = 0, septimo = 0, octavo = 0, noveno = 0, decimo = 0;
        for(int i = 0; i<a.length(); i++){
            int num = Integer.parseInt(a.substring(i,i+1));
            switch (i){
                case 0:
                    primero = num*1;
                    break;
                case 1:
                    segundo = num*2;
                    break;
                case 2:
                    tercero = num*4;
                    break;
                case 3:
                    cuarto = num*8;
                    break;
                case 4:
                    quinto = num*5;
                    break;
                case 5:
                    sexto = num*10;
                    break;
                case 6:
                    septimo = num*9;
                    break;
                case 7:
                    octavo = num*7;
                    break;
                case 8:
                    noveno = num*3;
                    break;
                case 9:
                    decimo = num*6;
                    break;
            }
        }

        res = decimo + noveno + octavo + septimo + sexto + quinto + cuarto + tercero + segundo + primero;

        return res;
    }

    public static boolean control(String e, int primero, int segundo){
        boolean res = false;

        if (primero == Integer.parseInt(e.substring(0,1)) && segundo == Integer.parseInt(e.substring(1,2))){
            res = true;
        }

        return res;
    }


}
