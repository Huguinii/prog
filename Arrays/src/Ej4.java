
import java.util.Random;
public class Ej4 {

   public Ej4(){
       rellenarArrays();
   }
    public static void main(String[] args) {
        Ej4 e = new Ej4();


    }


    public void rellenarArrays(){
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < 20; i++) {
            numero[i] = numeroAleatorio();
            cuadrado[i] = (int) Math.pow(numero[i], 2);
            cubo[i] = (int) Math.pow(numero[i], 3);
            System.out.println("numero normal "+numero[i]+" numero cuadrado "+cuadrado[i]+" numero cubo "+cubo[i]);




        }
    }private int numeroAleatorio(){

        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(101);
        return numeroAleatorio;
    }

}

