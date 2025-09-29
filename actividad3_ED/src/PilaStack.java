import java.util.Stack;

public class PilaStack {
    public static void main(String[] args) {
        Stack<Integer> pila1 = new Stack<>();
        Stack<Integer> pila2 = new Stack<>();

        // Agregar 7 datos a la primera pila
        for (int i = 1; i <= 7; i++) {
            pila1.push(i * 10); // Ejemplo: 10, 20, ..., 70
        }

        System.out.println("Pila 1: " + pila1);

        // Transferir datos en orden inverso a la segunda pila
        Stack<Integer> temp = new Stack<>();
        temp.addAll(pila1); // Copiar pila1

        while (!temp.isEmpty()) {
            pila2.push(temp.pop());
        }

        System.out.println("Pila 2 (inversa): " + pila2);
    }
}
