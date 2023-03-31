package herencias.ejercicio2;

public class Empleado {

    private String nombre;
    private String cedula;
    private int edad;
    private boolean casado;
    private double salario;

    public Empleado(){}
    public Empleado(String nombre, String cedula, int edad, boolean casado, double salario){
        this.nombre = nombre;
        this.cedula = cedula;
        if(edad >= 18 && edad <= 45){
            this.edad = edad;
        }
        this.casado = casado;
        this.salario = salario;
    }

    public String clasificacion(){
        if(this.edad <= 21){
            return "Principiante";
        } else if (this.edad > 21 && this.edad < 36) {
            return "Intermedio";
        } else {
            return "Senior";
        }
    }

    private String casado(){
        return this.casado == true ? "Si" : "No";
    }

    public void aumento(int porcentaje){
        double aumento = 1+(porcentaje/100);

        this.salario = this.salario * aumento;

    }

    @Override
    public String toString() {
        return this.nombre + "\n" + this.cedula + "\n" + this.edad + "\n" + casado() + "\n" + this.salario;
    }
}
