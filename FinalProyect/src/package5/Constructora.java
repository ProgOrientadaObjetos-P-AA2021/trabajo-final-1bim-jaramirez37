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

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreConstructora() {
        return nombreConstructora;
    }

    public void setNombreConstructora(String nombreConstructora) {
        this.nombreConstructora = nombreConstructora;
    }

    

}
