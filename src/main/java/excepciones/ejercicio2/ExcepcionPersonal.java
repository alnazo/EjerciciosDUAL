package excepciones.ejercicio2;

public class ExcepcionPersonal extends Throwable{

    private final static String MESSAGE = "Excepcion personal";

    public ExcepcionPersonal(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return MESSAGE + " : " + super.getMessage();
    }
}
