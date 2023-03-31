package fundamentos.ejercicio16;

public class Ejer16 {
    public static void main(String[] args) {
        rombo(6);
    }

    public static void rombo(int num){
        int i=0,j=0,k=0;
        if(num%2==0)
        {
            num++;
        }
        for(i=1;i<=num;i=i+2){
            for(k=num+1;k>=i;k=k-2){
                System.out.print(" ");
            }
            for(j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(i=num;i>=1;i=i-2){
            for(k=i;k<=num+2;k=k+2){
                System.out.print(" ");
            }
            for(j=i-2;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
