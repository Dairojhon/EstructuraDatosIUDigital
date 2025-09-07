public class Jugador extends Personaje {

    private int fuerza;
    private int velocidad;
    private int vida;
    private int magia;
    private int defensa;


    public Jugador(String nombre, Rol rol, int fuerza, int velocidad, int vida, int magia, int defensa) {
        super(nombre, rol);
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.vida = vida;
        this.magia = magia;
        this.defensa = defensa;
    }

       public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }


    @Override
    public void habilidadEspecial(Rol rol){
        switch (rol) {
            case GUERRERO -> {
                this.setFuerza(this.getFuerza() + 200);
                System.out.println("El Jugador ha usado la habilidad especial de Guerrero.");
            }
            case MAGO -> {
                this.setMagia(this.getMagia() + 200);
                System.out.println("El Jugador ha usado la habilidad especial de Mago.");
            }
            case ASESINO -> {
                this.setVelocidad(this.getVelocidad() + 2);
                System.out.println("El Jugador ha usado la habilidad especial de Asesino.");
            }
            case SOPORTE -> {
                this.setVida(this.getVida() + 2000);
                System.out.println("El Jugador ha usado la habilidad especial de Soporte.");
            }
        }


    }
    public void Ataque(Rol rol) {
        switch (rol) {
            case GUERRERO -> {
                this.ataqueGuerrero();
            }
            case MAGO -> {
                ataqueMagico();
            }
            case ASESINO -> {
                ataqueAsesino();
            }
            case SOPORTE -> {
                curacion();
            }
        }
    }

        public void ataqueGuerrero () {
            System.out.println("El jugador " + this.getNombre() + " ha atacado y realizo daño fisico por " + this.getFuerza());
        }
        public void ataqueMagico () {
            System.out.println("El jugador " + this.getNombre() + " ha atacado y realizo daño magico por " + this.getMagia());
        }
        public void ataqueAsesino () {
            int ataqueRapido;
            ataqueRapido = this.getFuerza() * (this.getVelocidad() / 2);
            System.out.println("El jugador " + this.getNombre() + " ha atacado y realizo daño por " + ataqueRapido);
        }

        public void curacion () {
            System.out.println("El jugador " + this.getNombre() + " ha curado un compañero, ha recuperado vida por 1000");
        }
    }




