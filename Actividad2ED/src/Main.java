import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arreglo1 = new int[7];
        int[] arreglo2 = new int[7];
        int[] arregloResultante = new int[7];

        int sumatoria = 0;
        int contador = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Por favor ingresa un número para el primer arreglo: ");
            arreglo1[i] = scanner.nextInt();
            contador++;

            System.out.print("Por favor ingresa un número para el segundo arreglo: ");
            arreglo2[i] = scanner.nextInt();
            contador++;

            sumatoria += arreglo1[i] + arreglo2[i];
            arregloResultante[i] = arreglo1[i] - arreglo2[i];
        }

        double promedio = (double) sumatoria / contador;
        System.out.println("\nEl promedio de los dos primeros arreglos es: " + promedio);

        // Mostrar arreglo resultante
        System.out.println("\nContenido del arreglo resultante:");
        for (int i = 0; i < arregloResultante.length; i++) {
            System.out.println("Posición " + i + ": " + arregloResultante[i]);
        }

        scanner.close();
    }
}