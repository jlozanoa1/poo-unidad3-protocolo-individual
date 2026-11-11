package ejercicio1;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Carlos");
        p.hablar();
        p.trabajar();

        // Polimorfismo: la misma persona vista como cada interfaz
        Hablador h = p;
        Trabajador t = p;
        h.hablar();
        t.trabajar();
    }
}
