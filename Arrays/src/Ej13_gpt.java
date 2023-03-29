import java.util.Arrays;
import java.util.Scanner;

public class Ej13_gpt {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        // Rellenar el array con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 501); // Genera un número aleatorio entre 0 y 500 (ambos incluidos)
        }
        System.out.println("Array generado:");
        System.out.println(Arrays.toString(numeros));

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Quieres destacar el máximo o el mínimo? (Máximo/Minimum)");
        String opcion = scanner.nextLine().toLowerCase();

        int numeroDestacado;
        if (opcion.equals("máximo")) {
            numeroDestacado = encontrarMaximo(numeros);
        } else if (opcion.equals("mínimo")) {
            numeroDestacado = encontrarMinimo(numeros);
        } else {
            System.out.println("Opción no válida.");
            return;
        }

        // Mostrar el array con el número destacado
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroDestacado) {
                System.out.print("**" + numeroDestacado + "** ");
            } else {
                System.out.print(numeros[i] + " ");
            }
        }
    }

    // Función para encontrar el máximo número en un array
    public static int encontrarMaximo(int[] numeros) {
        int maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        return maximo;
    }

    // Función para encontrar el mínimo número en un array
    public static int encontrarMinimo(int[] numeros) {
        int minimo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        return minimo;
    }
}
