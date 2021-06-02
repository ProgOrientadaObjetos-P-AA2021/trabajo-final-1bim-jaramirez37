package package2;

import java.io.Serializable;

/**
 *
 * @author josep
 */

public class Propietario implements Serializable {

    private String identificacion;
    private String nombresPropietario;
    private String apellidosPropietario;

    public Propietario(String id, String nombres, String apellidos) {
        nombresPropietario = nombres;
        apellidosPropietario = apellidos;
        identificacion = id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombresPropietario() {
        return nombresPropietario;
    }

    public void setNombresPropietario(String nombresPropietario) {
        this.nombresPropietario = nombresPropietario;
    }

    public String getApellidosPropietario() {
        return apellidosPropietario;
    }

    public void setApellidosPropietario(String apellidosPropietario) {
        this.apellidosPropietario = apellidosPropietario;
    }

}
