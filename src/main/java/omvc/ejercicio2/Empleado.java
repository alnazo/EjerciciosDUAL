package omvc.ejercicio2;



public class Empleado {
    public enum Puesto {
        ENCARGADO, GERENTE, DIRECTOR, DEPENDIENTE;
    }
    private String nombre;
    private Puesto puesto;
    private double sueldo;

    public Empleado(){}
    public Empleado(String nombre, Puesto puesto, double sueldo){
        this.nombre = nombre;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre()
                + "\nPuesto: " + getPuesto()
                + "\nSueldo: " +getSueldo();
    }

    public double calcularSueldo(int extras){
        double res = 0.0;

        final double retenciones = 15;
        double reten = (getSueldo()*retenciones)/100;

        res = (getSueldo() + extras)-reten;

        return res;
    }

}
