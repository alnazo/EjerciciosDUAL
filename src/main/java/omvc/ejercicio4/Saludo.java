package omvc.ejercicio4;

public class Saludo {
    private String palabra;

    public Saludo(){}
    public Saludo(String palabra){
        this.palabra = palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }

    @Override
    public String toString() {
        return "Hola "+getPalabra();
    }
}
