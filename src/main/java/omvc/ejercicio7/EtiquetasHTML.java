package omvc.ejercicio7;

public class EtiquetasHTML {
    private String etiqueta;
    private String contenido;

    public EtiquetasHTML(){}
    public EtiquetasHTML(String etiqueta, String contenido){
        this.etiqueta = etiqueta;
        this.contenido = contenido;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public String getContenido() {
        return contenido;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "<"+getEtiqueta()+">"+getContenido()+"</"+getEtiqueta()+">";
    }
}
