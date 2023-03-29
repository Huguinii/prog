import java.util.Random;
import java.util.Scanner;

public class Ej13 {
    int[] array100 = new int[100];
    Scanner sc =new Scanner(System.in);

    public Ej13(){
        Array100();
    }
    public static void main(String[] args) {
        Ej13 e= new Ej13();

    }
    public void Array100(){
        rellenaArray();
        System.out.println("");
        System.out.println("¿Qué quiere destacar? (1- minimo, 2- maximo):");
        eleccion();
        for (int i=0; i<100; i++){
            System.out.println(array100[i]);
        }
    }

    public void rellenaArray(){
        for (int i=0; i<100; i++){
            array100[i]=numeroAleatorio();
            System.out.print(array100[i]+" ");
        }

    }
    public void maximo(){
        int maximo = Integer.MAX_VALUE;
        for (int i=0; i<100; i++){
            if (array100[i]>maximo){
                array100[i]=+maximo;
                System.out.println("**"+array100[maximo]+"**");
            }
        }
    }
    public void minimo(){
        int minimo = Integer.MIN_VALUE;
        for (int i=0; i<100; i++){
            if (array100[i]<minimo){
                array100[i]=minimo;
            }
        }
    }
    public void eleccion(){
        int eleccion= sc.nextInt();
        if (eleccion==1|| eleccion==2){
            switch (eleccion) {
                case 1:
                    minimo();
                    break;
                case 2:
                    maximo();
                    break;
            }
        }else{
            System.out.println("No es un numero valido");
            eleccion();
        }
    }
    private int numeroAleatorio(){

        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(501);
        return numeroAleatorio;
    }
}
