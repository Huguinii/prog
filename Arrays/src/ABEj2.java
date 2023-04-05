import java.util.Arrays;
import java.util.Scanner;

public class ABEj2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [][] numeros = new int[4][5];

        for(int i=0; i<numeros.length; i++) {

            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j]=sc.nextInt();

            }
        }
        for (int i=0;i< numeros.length;i++){
            for (int j=0;j<numeros[i].length;j++){
                System.out.print(numeros[i][j] + "\t");


            }System.out.print(
                    numeros[i][0]+numeros[i][1]+numeros[i][2]+numeros[i][3]+numeros[i][4]
            );

            System.out.println();
        }
        for (int j=0;j<numeros[0].length;j++){
            int sumaColumna=0;
            for (int i=0; i<numeros.length;i++){
                sumaColumna += numeros[i][j];
            }
            System.out.println(j+sumaColumna);
        }

    }

}
