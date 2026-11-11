package ejercicio2;

public class Animal implements Volador, Nadador {
    private String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    @Override
    public void volar() {
        System.out.println(especie + " está volando.");
    }

    @Override
    public void nadar() {
        System.out.println(especie + " está nadando.");
    }
}
