
class ArregloPila {
    private final int[] pila;
    private int ultimo;

    public ArregloPila(int size) {
        pila = new int[size];
        ultimo = -1;
    }

    public boolean estaLlena() {
        return ultimo == pila.length - 1;
    }

    public boolean estaVacia() {
        return ultimo == -1;
    }

    public void apilar(int dato) {
        if (!estaLlena()) {
            pila[++ultimo] = dato;
        } else {
            System.out.println("La pila está llena. No se puede agregar elementos.");
        }
    }

    public void desapilar() {
        if (!estaVacia()) {
            System.out.println("elemento eliminado: " + pila[ultimo--]);
        } else {
            System.out.println("La pila está vacía. No hay elementos para mostrar.");
        }
    }

    public int tamañoActual() {
        return ultimo + 1;
    }

    public int espacioDisponible() {
        return pila.length - tamañoActual();
    }

    public void mostrarPila() {
        System.out.print("Esta pila contiene: ");
        for (int i = 0; i <= ultimo; i++) {
            System.out.print(pila[i] + " ");
        }
        System.out.println();
    }
}
