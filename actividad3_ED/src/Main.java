import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mainOption;
        do {
            System.out.println("\n MENÚ GENERAL");
            System.out.println("1. Pilas con arreglos.");
            System.out.println("2. Pilas con Stack.");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            mainOption = sc.nextInt();

            switch(mainOption){
                case 1:
                    menuArreglos();
                    break;

                case 2:
                    menuStack();
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo por favor.");

            }
        }while (mainOption != 3);

        sc.close();
    }

    public static void menuArreglos(){
        ArregloPila miPila = new ArregloPila(9);
        Random rand = new Random();


        for (int i = 0; i < 5; i++) {
            int valor = rand.nextInt(100); // entre 0 y 99
            miPila.apilar(valor);
        }

        miPila.mostrarPila();
        System.out.println("Tamaño actual de la pila: " + miPila.tamañoActual());

        // Borrar un dato
        miPila.desapilar();

        System.out.println("Nuevo tamaño de la pila: " + miPila.tamañoActual());
        System.out.println("Espacio disponible en la pila: " + miPila.espacioDisponible());

    }

    public static void menuStack(){
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pila1 = new Stack<>();
        Stack<Integer> pila2 = new Stack<>();

        int stackOption;
        do {
            System.out.println("\n MENÚ DE PILAS");
            System.out.println("1. Agregar dato a la pila 1");
            System.out.println("2. Mostrar pila 1");
            System.out.println("3. Copiar pila 1 en orden inverso a pila 2");
            System.out.println("4. Mostrar pila 2");
            System.out.println("5. Eliminar dato de pila 1");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            stackOption = scanner.nextInt();

            switch (stackOption) {
                case 1:
                    System.out.print("Ingresa un número entero: ");
                    int dato = scanner.nextInt();
                    pila1.push(dato);
                    System.out.println("Dato agregado a pila 1.");
                    break;

                case 2:
                    System.out.println("Pila 1: " + pila1);
                    break;

                case 3:
                    pila2.clear();
                    Stack<Integer> temp = new Stack<>();
                    temp.addAll(pila1);
                    while (!temp.isEmpty()) {
                        pila2.push(temp.pop());
                    }
                    System.out.println("Pila 1 copiada en orden inverso a pila 2.");
                    break;

                case 4:
                    System.out.println("Pila 2: " + pila2);
                    break;

                case 5:
                    if (!pila1.isEmpty()) {
                        System.out.println("Dato eliminado: " + pila1.pop());
                    } else {
                        System.out.println("La pila 1 está vacía.");
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo por favor.");
            }
        } while (stackOption != 6);

        scanner.close();

    }

}


