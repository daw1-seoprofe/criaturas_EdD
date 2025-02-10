public abstract class Personaje {
    private String codigo;
    private String nombre;
    private int puntosVida;
    private int puntosExperiencia;
    private boolean muerto;

    // Constructor
    public Personaje(String codigo, String nombre, int puntosVida, int puntosExperiencia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.puntosExperiencia = puntosExperiencia;
        this.muerto = this.puntosVida < 0;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
        this.muerto = this.puntosVida < 0;
    }

    public int getPuntosExperiencia() {
        return puntosExperiencia;
    }

    public void setPuntosExperiencia(int puntosExperiencia) {
        this.puntosExperiencia = puntosExperiencia;
    }

    public boolean isMuerto() {
        return muerto;
    }

    // Método para herir al personaje
    public void herir(int herida) {
        this.puntosVida -= herida;
        this.muerto = this.puntosVida < 0;
    }

    // Método abstracto para la pócima sanadora
    public abstract void pocimaSanadora();

    // Método toString
    @Override
    public String toString() {
        return "Personaje{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", puntosVida=" + puntosVida +
                ", puntosExperiencia=" + puntosExperiencia +
                ", muerto=" + muerto +
                '}';
    }
}