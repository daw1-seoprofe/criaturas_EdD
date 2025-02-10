public class Partida {
    public static void main(String[] args) {
        // No se puede instanciar la clase Personaje porque es abstracta
        // Personaje personaje = new Personaje("P001", "Personaje1", 100, 0); // Esto dará error

        // Crear un Elfo
        Elfo elfo = new Elfo("E001", "Legolas", 80, 50, 15.5, 3);
        System.out.println(elfo);
        elfo.herir(30);
        System.out.println("Después de herir: " + elfo);
        elfo.pocimaSanadora();
        System.out.println("Después de la pócima: " + elfo);

        // Crear un Mago
        Mago mago = new Mago("M001", "Gandalf", 60, 100, "Gris", 30.0);
        System.out.println(mago);
        mago.herir(50);
        System.out.println("Después de herir: " + mago);
        mago.pocimaSanadora();
        System.out.println("Después de la pócima: " + mago);
    }
}