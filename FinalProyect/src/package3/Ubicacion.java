package package3;

import java.io.Serializable;

/**
 *
 * @author josep
 */
public class Ubicacion implements Serializable {

    private String identificacion;
    private String nombreBarrio;
    private String referencia;
    private int numeroCasa;

    public Ubicacion(int numCasa, String nombreB, String ref,
            String id) {
        identificacion = id;
        nombreBarrio = nombreB;
        referencia = ref;
        numeroCasa = numCasa;
    }

    public int obtenerNumeroCasa() {
        return numeroCasa;
    }

    public void establecerNumCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String obtenerReferencia() {
        return referencia;
    }

    public void establecerReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String obtenerNombreReferencia() {
        return nombreBarrio;
    }

    public String obtenerNombreBarrio() {
        return nombreBarrio;
    }

    public void establecerNombreBarrio(String nombreBarrio) {
        this.nombreBarrio = nombreBarrio;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    public void establecerIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String toString() {
        return numeroCasa + "\n" + nombreBarrio + "\n" + referencia + "\n" + identificacion;
    }
}
