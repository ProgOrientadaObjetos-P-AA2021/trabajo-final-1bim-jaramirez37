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

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    

}
