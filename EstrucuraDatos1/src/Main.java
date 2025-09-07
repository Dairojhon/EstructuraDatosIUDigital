import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        Jugador jugador= (Jugador) CrearPersonaje();
        System.out.println("¿Deseas usar la habilidad especial? responde S para activar la habilidad especial");
        String respuestaHabilidad=sc1.nextLine();
        if (respuestaHabilidad.toUpperCase().equals(String.valueOf('S'))){
            jugador.habilidadEspecial(jugador.getRol());
            System.out.println("\n estos son los nuevos atributos del jugador: ");
            mostrarAtributos(jugador);
        }
        System.out.println("¿Deseas atacar? responde S para atacar");
        String respustaAtaque=sc1.nextLine();
        if (respustaAtaque.toUpperCase().equals(String.valueOf('S'))){
            jugador.Ataque(jugador.getRol());
        }
    }

    public static Personaje CrearPersonaje(){
        Scanner sc= new Scanner(System.in);
        int fuerza ;
        int velocidad ;
        int vida ;
        int magia ;
        int defensa ;

        System.out.println(" CREAR JUGADOR ");
        System.out.print("Nombre del jugador: ");
        String nombre = sc.nextLine();

        System.out.println("Selecciona un rol:");
        System.out.println("1. GUERRERO");
        System.out.println("2. MAGO");
        System.out.println("3. ASESINO");
        System.out.println("4. SOPORTE");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        Jugador.Rol rolSeleccionado;

        switch (opcion) {
            case 1 -> {
                rolSeleccionado = Personaje.Rol.GUERRERO;
                fuerza = 500;
                velocidad = 50;
                vida = 5000;
                magia = 10;
                defensa = 500;
            }
            case 2 -> {
                rolSeleccionado = Personaje.Rol.MAGO;
                fuerza = 20;
                velocidad = 150;
                vida = 3500;
                magia = 500;
                defensa = 350;
            }
            case 3 -> {
                rolSeleccionado = Personaje.Rol.ASESINO;
                fuerza = 300;
                velocidad = 200;
                vida = 3500;
                magia = 20;
                defensa = 350;
            }
            case 4 -> {
                rolSeleccionado = Personaje.Rol.SOPORTE;
                fuerza = 200;
                velocidad = 150;
                vida = 4500;
                magia = 350;
                defensa = 200;
            }
            default -> {
                System.out.println("Opción inválida. Se asignará rol GUERRERO por defecto.");
                rolSeleccionado = Personaje.Rol.GUERRERO;
                fuerza = 500;
                velocidad = 50;
                vida = 5000;
                magia = 10;
                defensa = 500;
            }
        }
        Jugador jugador = new Jugador(nombre, rolSeleccionado, fuerza, velocidad, vida, magia, defensa);

        mostrarAtributos(jugador);

        return jugador;
    }

    public static void mostrarAtributos(Jugador jugador){
        System.out.println("\n Se ha creado tu jugador :");
        System.out.println("Nombre: " + jugador.getNombre());
        System.out.println("Rol: " + jugador.getRol());
        System.out.println("Fuerza: " + jugador.getFuerza());
        System.out.println("Velocidad: " + jugador.getVelocidad());
        System.out.println("Vida: " + jugador.getVida());
        System.out.println("Magia: " + jugador.getMagia());
        System.out.println("Defensa: " + jugador.getDefensa());
    }
}