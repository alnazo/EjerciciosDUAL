package herencias.ejercicio1;

import java.util.Date;

enum Modo {
    AIRE, AGUA, NITROGENO;
}

public class Congelado extends Producto {
    private int temp_recomendada;
    private Modo congelacion;

    public Congelado(){}
    public Congelado(Date caducidad, int lote, int temp_recomendada, Modo congelacion){
        super(caducidad, lote);
        this.temp_recomendada = temp_recomendada;
        this.congelacion = congelacion;
    }


}
