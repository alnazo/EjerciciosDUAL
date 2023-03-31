package herencias.ejercicio2;

public class Programador extends Empleado{
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    public Programador(){}
    public Programador(String nombre, String cedula, int edad, boolean casado, double salario, int lineasDeCodigoPorHora, String lenguajeDominante){
        super(nombre, cedula, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

}
