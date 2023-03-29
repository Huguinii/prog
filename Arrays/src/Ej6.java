import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[15];
        for (int i=0; i<16; i++){
            numeros[i]=sc.nextInt();
            if (numeros[i]!=numeros[15]){
            numeros[i]=numeros[i+1];
            }else{
                numeros[15]=numeros[0];
            }
        }
        for (int i=0; i<16; i++){

        }

    }
}
