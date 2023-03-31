package omvc.ejercicio2;

public class TestEmpleado {
    public static void main(String[] args) {
        Empleado em1 = new Empleado("Manuel", Empleado.Puesto.DEPENDIENTE, 1200.5);

        System.out.println(em1.calcularSueldo(200));
    }
}
