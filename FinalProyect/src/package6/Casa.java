package package6;

import java.io.Serializable;
import package5.Constructora;
import package4.Ciudad;
import package2.Propietario;
import package3.Ubicacion;

/**
 *
 * @author josep
 */
public class Casa implements Serializable {

    private String identificacion;
    private double mCuadrados;
    private Ubicacion ubicacion;
    private double mCuadradosPrecio;
    private Propietario propietario;
    private double costoTotal;
    private int nCuartos;
    private Constructora constructora;
    private Ciudad ciudad;

    public Casa(String id, double mc, Ubicacion ub, double mcp, Propietario pc,
            int nc, Constructora cnt, Ciudad cd) {
        identificacion = id;
        mCuadrados = mc;
        ubicacion = ub;
        mCuadradosPrecio = mcp;
        propietario = pc;
        nCuartos = nc;
        constructora = cnt;
        ciudad = cd;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    public void establecerIdentificacion(String id) {
        identificacion = id;
    }

    public double obtenerMCuadrados() {
        return mCuadrados;
    }

    public void establecerMCuadrados(double mc) {
        mCuadrados = mc;
    }

    public Ubicacion obtenerUbicacion() {
        return ubicacion;
    }

    public void establecerUbicacion(Ubicacion ub) {
        ubicacion = ub;
    }

    public double obtenerMCuadradosPrecio() {
        return mCuadradosPrecio;
    }

    public void establecerMCuadradosPrecio(double mcp) {
        mCuadradosPrecio = mcp;
    }

    public Propietario obtenerPropietario() {
        return propietario;
    }

    public void establecerPropietario(Propietario prop) {
        propietario = prop;
    }

    public double calcularCostoTotal() {
        return costoTotal;
    }

    public void establecerCostoTotal(double ct) {
        costoTotal = ct;
    }

    public int obtenerNCuartos() {
        return nCuartos;
    }

    public void setnCuartos(int nCuartos) {
        this.nCuartos = nCuartos;
    }

    public Constructora obtenerConstructora() {
        return constructora;
    }

    public void establecerConstructora(Constructora cnt) {
        constructora = cnt;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public void establecerCiudad(Ciudad cd) {
        ciudad = cd;
    }

    public String toString() {
        return String.format("%s \n %s \n %s \n %s \n %s \n %s \n %s \n %s \n %s", identificacion, mCuadrados,
                costoTotal, nCuartos, mCuadradosPrecio,
                propietario.obtenerIdentificacion(), ubicacion.obtenerIdentificacion(),
                ciudad.obtenerNombreCiudad(), constructora.obtenerIdentificacion());
    }
}
