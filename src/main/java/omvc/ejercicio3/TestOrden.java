package omvc.ejercicio3;

import omvc.ejercicio1.Cliente;
import omvc.ejercicio2.Empleado;

public class TestOrden {
    public static void main(String[] args) {
        Cliente cl1 = new Cliente("Alonso", 21, 1.75, "Futbol", "Valencia");
        Empleado em1 = new Empleado("Javier", Empleado.Puesto.GERENTE, 2700.2);

        Orden or1 = new Orden(1, em1, cl1, "Aragon", true);

        System.out.println(or1.getCountincidencias());
        or1.aumentarIncidencia();
        or1.aumentarIncidencia();
        System.out.println(or1.getCountincidencias());
        or1.aumentarIncidencia();
        System.out.println(or1.getCountincidencias());

    }
}
