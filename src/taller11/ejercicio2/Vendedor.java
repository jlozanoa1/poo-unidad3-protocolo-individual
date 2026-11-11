package ejercicio2;

public class Vendedor extends Empleado {
    private double salarioBase;
    private double ventas;
    private double porcentajeComision;

    public Vendedor(String nombre, double salarioBase, double ventas, double porcentajeComision) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.ventas = ventas;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + ventas * porcentajeComision / 100;
    }
}
