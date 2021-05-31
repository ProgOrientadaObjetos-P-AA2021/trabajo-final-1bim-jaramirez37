package package4;

import java.io.Serializable;

/**
 *
 * @author josep
 */
public class Ciudad implements Serializable {

    private String identificacion;
    private String nombreCiudad;
    private String nombreProv;

    public Ciudad(String nombreC, String nombrePro, String id) {
        identificacion = id;
        nombreProv = nombrePro;
        nombreCiudad = nombreC;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    public void establecerIdentificacion(String id) {
        identificacion = id;
    }

    public String obtenerNombreProvincia() {
        return nombreProv;
    }

    public void establecerNombreProv(String n) {
        nombreProv = n;
    }

    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }

    public void establecerNombreCiudad(String n) {
        nombreCiudad = n;
    }

    public String toString() {
        return String.format("%s \n %s \n %s", nombreCiudad, nombreProv, identificacion);
    }

}
