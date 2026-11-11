package ejercicio3;

public class Piedra implements Volador, Nadador {

    @Override
    public void volar() {
    }

    @Override
    public void nadar() {
        throw new UnsupportedOperationException("Una piedra no nada");
    }
}
