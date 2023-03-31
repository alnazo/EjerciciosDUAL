package omvc.ejercicio3;

import omvc.ejercicio1.Cliente;
import omvc.ejercicio2.Empleado;

public class Orden {
    private int identificador;
    private Empleado empleado;
    private Cliente cliente;
    private String provincia;
    private boolean telematico;
    private int countincidencias;
    public Orden(){}
    public Orden(int identificador, Empleado empleado, Cliente cliente, String provincia, boolean telematico){
        this.identificador = identificador;
        this.empleado = empleado;
        this.cliente = cliente;
        this.provincia = provincia;
        this.telematico = telematico;
        this.countincidencias = 0;
    }

    public int getIdentificador(){
        return identificador;
    }

    public Empleado getEmpleado(){
        return empleado;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public String getProvincia(){
        return provincia;
    }

    public Boolean getTelematico(){
        return telematico;
    }

    public int getCountincidencias(){
        return countincidencias;
    }

    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }

    public void setEmpleado(Empleado empleado){
        this.empleado = empleado;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void setProvincia(String provincia){
        this.provincia = provincia;
    }

    public void setTelematico(boolean telematico){
        this.telematico = telematico;
    }

    public void setCountincidencias(int countincidencias){
        this.countincidencias = countincidencias;
    }

    public void aumentarIncidencia(){
        setCountincidencias(this.countincidencias+1);
    }


}
