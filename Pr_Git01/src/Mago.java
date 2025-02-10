public class Mago extends Personaje {
    private String colorToga;
    private double largoVarita;

    // Constructor
    public Mago(String codigo, String nombre, int puntosVida, int puntosExperiencia, String colorToga, double largoVarita) {
        super(codigo, nombre, puntosVida, puntosExperiencia);
        this.colorToga = colorToga;
        this.largoVarita = largoVarita;
    }

    // Getters y Setters
    public String getColorToga() {
        return colorToga;
    }

    public void setColorToga(String colorToga) {
        this.colorToga = colorToga;
    }

    public double getLargoVarita() {
        return largoVarita;
    }

    public void setLargoVarita(double largoVarita) {
        this.largoVarita = largoVarita;
    }

    // Implementación del método pocimaSanadora
    @Override
    public void pocimaSanadora() {
        int nuevosPuntosVida = getPuntosVida() * 4;
        if (nuevosPuntosVida > 150) {
            nuevosPuntosVida = 150;
        }
        setPuntosVida(nuevosPuntosVida);
    }

    // Método toString
    @Override
    public String toString() {
        return "Mago{" +
                "codigo='" + getCodigo() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", puntosVida=" + getPuntosVida() +
                ", puntosExperiencia=" + getPuntosExperiencia() +
                ", muerto=" + isMuerto() +
                ", colorToga='" + colorToga + '\'' +
                ", largoVarita=" + largoVarita +
                '}';
    }
}