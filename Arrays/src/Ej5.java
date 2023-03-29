import java.util.Scanner;

public class Ej5 {
    public Ej5() {

    }

    public static void main(String[] args) {



        menor();
    }
    public static void menor(){
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i=0; i<10; i++){
            numeros[i] = sc.nextInt();
            if (numeros[i]<minimo){
                minimo = numeros[i];
            }
            if (numeros[i]>maximo){
                maximo = numeros[i];
            }
        }
        System.out.println("Minimo " +minimo+" Maximo "+maximo);
    }
}