package ejercicio1;

public class PruebaFiguras {
    public static void main(String[] args) {
        Figura r = new Rectangulo(5, 3);
        Figura t = new Triangulo(5, 3);

        System.out.printf("%s -> Área: %.2f%n", r.nombre, r.calcularArea());
        System.out.printf("%s -> Área: %.2f%n", t.nombre, t.calcularArea());
    }
}
