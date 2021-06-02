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

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreBarrio() {
        return nombreBarrio;
    }

    public void setNombreBarrio(String nombreBarrio) {
        this.nombreBarrio = nombreBarrio;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    
  
}
