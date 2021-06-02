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

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public double getmCuadrados() {
        return mCuadrados;
    }

    public void setmCuadrados(double mCuadrados) {
        this.mCuadrados = mCuadrados;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getmCuadradosPrecio() {
        return mCuadradosPrecio;
    }

    public void setmCuadradosPrecio(double mCuadradosPrecio) {
        this.mCuadradosPrecio = mCuadradosPrecio;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public int getnCuartos() {
        return nCuartos;
    }

    public void setnCuartos(int nCuartos) {
        this.nCuartos = nCuartos;
    }

    public Constructora getConstructora() {
        return constructora;
    }

    public void setConstructora(Constructora constructora) {
        this.constructora = constructora;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

}
