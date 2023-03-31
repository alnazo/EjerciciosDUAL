package omvc.ejercicio5;

public class Repetido {
    private String palabra;
    private int repeticion;

    public Repetido(){}
    public Repetido(String palabra, int repeticion){
        this.palabra = palabra;
        this.repeticion = repeticion;
    }

    public String getPalabra() {
        return palabra;
    }

    public int getRepeticion() {
        return repeticion;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public void setRepeticion(int repeticion) {
        this.repeticion = repeticion;
    }

    public void mostrar(){
        for(int i = 0; i<repeticion; i++){
            System.out.println(getPalabra());
        }
    }

}
