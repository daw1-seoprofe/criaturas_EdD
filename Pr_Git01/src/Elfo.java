public class Elfo extends Personaje {
    private double longitudOrejas;
    private int flechasPorSegundo;

    // Constructor
    public Elfo(String codigo, String nombre, int puntosVida, int puntosExperiencia, double longitudOrejas, int flechasPorSegundo) {
        super(codigo, nombre, puntosVida, puntosExperiencia);
        this.longitudOrejas = longitudOrejas;
        this.flechasPorSegundo = flechasPorSegundo;
    }

    // Getters y Setters
    public double getLongitudOrejas() {
        return longitudOrejas;
    }

    public void setLongitudOrejas(double longitudOrejas) {
        this.longitudOrejas = longitudOrejas;
    }

    public int getFlechasPorSegundo() {
        return flechasPorSegundo;
    }

    public void setFlechasPorSegundo(int flechasPorSegundo) {
        this.flechasPorSegundo = flechasPorSegundo;
    }

    // Implementación del método pocimaSanadora
    @Override
    public void pocimaSanadora() {
        int nuevosPuntosVida = getPuntosVida() + 20;
        if (nuevosPuntosVida > 100) {
            nuevosPuntosVida = 100;
        }
        setPuntosVida(nuevosPuntosVida);
    }

    // Método toString
    @Override
    public String toString() {
        return "Elfo{" +
                "codigo='" + getCodigo() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", puntosVida=" + getPuntosVida() +
                ", puntosExperiencia=" + getPuntosExperiencia() +
                ", muerto=" + isMuerto() +
                ", longitudOrejas=" + longitudOrejas +
                ", flechasPorSegundo=" + flechasPorSegundo +
                '}';
    }
}