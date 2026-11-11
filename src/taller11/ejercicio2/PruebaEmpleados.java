package ejercicio2;

public class PruebaEmpleados {
    public static void main(String[] args) {
        Empleado[] empleados = {
                new Gerente("Ana", 4000, 1500),
                new Vendedor("Luis", 1500, 20000, 5)
        };

        for (Empleado e : empleados) {
            e.mostrarDetalles();
            System.out.println("---");
        }
    }
}
