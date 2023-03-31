package omvc.ejercicio1;

import java.math.BigInteger;

public class Cliente {
    private String nombre;
    private int edad;
    private double altura;
    private String hobby;
    private String ciudad;

    public Cliente(){}
    public Cliente(String nombre, int edad, double altura, String hobby, String ciudad){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.hobby = hobby;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public String getHobby() {
        return hobby;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre()
                + "\nEdad: " + getEdad()
                + "\nAltura: " + getAltura()
                + "\nHobby: " + getHobby()
                + "\nCiudad: " + getCiudad();
    }

    public boolean cambiarHobby(String hobby){
        boolean res = false;
        if (hobby != getHobby()) {
            setHobby(hobby);
            res = true;
        }
        return res;
    }



}

