package package5;

import java.io.Serializable;

/**
 *
 * @author josep
 */
public class Constructora implements Serializable {

    private String identificacion;
    private String nombreConstructora;

    public Constructora(String id, String nombre) {
        this.identificacion = id;
        this.nombreConstructora = nombre;
    }

    public String obtenerNombreConstructora() {
        return nombreConstructora;
    }

    public void establecerNombreConstructora(String nombreConstructora) {
        this.nombreConstructora = nombreConstructora;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    public void establecerIdentificacion(String id) {
        identificacion = id;
    }

    public String toString() {
        return String.format("%s \n %s", identificacion, nombreConstructora);
    }

}
