public abstract class Personaje {
    private String nombre;
    private Rol rol;

    public Personaje(){}

    public Personaje(String nombre, Rol rol) {
        this.nombre = nombre;
        this.rol = rol;

    }


    enum Rol{
        GUERRERO,
        MAGO,
        ASESINO,
        SOPORTE

    }
    public String getNombre() {
        return nombre;
    }

    public Rol getRol() {
        return rol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public abstract void habilidadEspecial(Rol rol);
}
