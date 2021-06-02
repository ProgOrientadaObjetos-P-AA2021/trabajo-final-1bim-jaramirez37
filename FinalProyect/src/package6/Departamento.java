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
public class Departamento implements Serializable {

    private String nombreEdificio;
    private String ubicacionEnEdificio;
    private int numeroCuartos;
    private double valorCuotaMensual;
    private double costoTotal;
    private Ubicacion ubicacion;
    private double precioMCuadrado;
    private Constructora constructora;
    private Ciudad ciudad;
    private double precio;
    private Propietario propietario;
    private String identificacion;
    private double mCuadrados;

    public Departamento(String nomEdi, String ubiEdificio, int nCuartos,
            double valorCm, Ubicacion ubi, double precioMC,
            Constructora cnt, Ciudad cd, double prec,
            Propietario prop, String id, double mCuad) {
        
        nombreEdificio = nomEdi;
        ubicacionEnEdificio = ubiEdificio;
        numeroCuartos = nCuartos;
        valorCuotaMensual = valorCm;
        ubicacion = ubi;
        precioMCuadrado = precioMC;
        constructora = cnt;
        ciudad = cd;
        precio = prec;
        propietario = prop;
        identificacion = id;
        mCuadrados = mCuad;
    }

    public String getNombreEdificio() {
        return nombreEdificio;
    }

    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }

    public String getUbicacionEnEdificio() {
        return ubicacionEnEdificio;
    }

    public void setUbicacionEnEdificio(String ubicacionEnEdificio) {
        this.ubicacionEnEdificio = ubicacionEnEdificio;
    }

    public int getNumeroCuartos() {
        return numeroCuartos;
    }

    public void setNumeroCuartos(int numeroCuartos) {
        this.numeroCuartos = numeroCuartos;
    }

    public double getValorCuotaMensual() {
        return valorCuotaMensual;
    }

    public void setValorCuotaMensual(double valorCuotaMensual) {
        this.valorCuotaMensual = valorCuotaMensual;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getPrecioMCuadrado() {
        return precioMCuadrado;
    }

    public void setPrecioMCuadrado(double precioMCuadrado) {
        this.precioMCuadrado = precioMCuadrado;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
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

    
}
