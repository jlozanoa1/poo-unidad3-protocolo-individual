package ejercicio2;

public class PruebaPato {
    public static void main(String[] args) {
        Pato pato = new Pato();
        pato.volar();
        pato.nadar();

        // Polimorfismo mediante interfaces
        Volador v = pato;
        Nadador n = pato;
        v.volar();
        n.nadar();
    }
}
