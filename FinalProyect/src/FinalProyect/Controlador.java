package FinalProyect;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import package5.Constructora;
import package4.Ciudad;
import package2.Propietario;
import package6.Casa;
import package6.Departamento;
import package3.Ubicacion;

/**
 *
 * @author josep
 */
public class Controlador {

    Scanner leer = new Scanner(System.in);

    DesYSerializador archivos = new DesYSerializador();

    public void ejecutar(String opcionPrincipal, String opcionSecundaria) throws IOException {
        switch (opcionPrincipal) {
            case "1":
                switch (opcionSecundaria) {
                    case "1":
                        subirRegistroPropietario();
                        break;
                    case "2":
                        subirRegistroUbicacion();
                        break;
                    case "3":
                        subirRegistroCiudad();
                        break;
                    case "4":
                        subirRegistroConstructora();
                        break;
                    case "5":
                        subirRegistroCasa();
                        break;
                    case "6":
                        subirRegistroDepartamento();
                        break;
                }
                break;
            case "2":

                switch (opcionSecundaria) {
                    case "1":

                        mostrarRegistrosPropietarios();
                        break;
                    case "2":
                        mostrarRegistrosUbicaciones();
                        break;
                    case "3":
                        mostrarRegistrosCiudades();
                        break;
                    case "4":
                        mostrarRegistrosConstructoras();
                        break;
                    case "5":
                        mostrarRegistrosCasas();
                        break;
                    case "6":
                        mostrarRegistrosDepartamentos();
                        break;

                }
                break;
        }
    }

    public void mostrarRegistrosPropietarios() throws IOException {
        int cantidadPropietarios = Integer.parseInt(obtenerUltimoId("propietarios"));
        for (int i = 1; i <= cantidadPropietarios; i++) {
            Propietario propietario = archivos.deserializarPropietario(Integer.toString(i));
            System.out.println("ID: " + propietario.getIdentificacion());
            System.out.println("Nombres: " + propietario.getNombresPropietario());
            System.out.println("Apellidos: " + propietario.getApellidosPropietario());
            System.out.println("");
        }
    }

    public void mostrarRegistrosUbicaciones() throws IOException {
        int cantidadUbicaciones = Integer.parseInt(obtenerUltimoId("ubicaciones"));
        for (int i = 1; i <= cantidadUbicaciones; i++) {
            Ubicacion ubicacion = archivos.deserializarUbicacion(Integer.toString(i));
            System.out.println("ID: " + ubicacion.getIdentificacion());
            System.out.println("Barrio: " + ubicacion.getNombreBarrio());
            System.out.println("Referencia: " + ubicacion.getReferencia());
            System.out.println("Número de casa: " + ubicacion.getNumeroCasa());
            System.out.println("");
        }
    }

    public void mostrarRegistrosCiudades() throws IOException {
        int cantidadCiudades = Integer.parseInt(obtenerUltimoId("ciudades"));
        for (int i = 1; i <= cantidadCiudades; i++) {
            Ciudad ciudad = archivos.deserializarCiudad(Integer.toString(i));
            System.out.println("ID: " + ciudad.getIdentificacion());
            System.out.println("Nombre ciudad: " + ciudad.getNombreCiudad());
            System.out.println("Nombre Provincia: " + ciudad.getNombreProv());
            System.out.println("");
        }
    }

    public void mostrarRegistrosConstructoras() throws IOException {
        int cantidadConstructoras = Integer.parseInt(obtenerUltimoId("constructoras"));
        for (int i = 1; i <= cantidadConstructoras; i++) {
            Constructora constructora = archivos.deserializarConstructora(Integer.toString(i));
            System.out.println("ID: " + constructora.getIdentificacion());
            System.out.println("Nombre de la empresa: "
                    + constructora.getNombreConstructora());
            System.out.println("");
        }
    }

    public void mostrarRegistrosCasas() throws IOException {
        int cantidadCasas = Integer.parseInt(obtenerUltimoId("casas"));

        for (int i = 1; i <= cantidadCasas; i++) {
            Casa casa = archivos.deserializarCasa(Integer.toString(i));
            System.out.println("ID: " + casa.getIdentificacion());
            System.out.println("ID de la constructora-> " + casa.getConstructora());
            System.out.println("ID del propietario: " + casa.getIdentificacion());
            System.out.println("Metros cuadrados: " + casa.getmCuadrados());
            System.out.println("Precio m²: " + casa.getmCuadradosPrecio());
            System.out.println("Nombre ciudad: " + casa.getCiudad().getNombreCiudad());
            System.out.println("Número de Casa: " + casa.getUbicacion().getNumeroCasa());
            System.out.println("Número cuartos: " + casa.getnCuartos());
            System.out.println("");
        }
    }

    public void mostrarRegistrosDepartamentos() throws IOException {
        int cantidadCasas = Integer.parseInt(obtenerUltimoId("departamentos"));
        for (int i = 1; i <= cantidadCasas; i++) {
            Departamento departamento = archivos.deserializarDepartamento(Integer.toString(i));
            System.out.println("============================");
            System.out.print("ID: " + departamento.getIdentificacion());
            System.out.print("ID de la constructora: " + departamento.getConstructora());
            System.out.print("ID del propietario: " + departamento.getIdentificacion());
            System.out.print("Nombre ciudad: " + departamento.getCiudad().getNombreCiudad());
            System.out.print("Número cuartos: " + departamento.getNumeroCuartos());
            System.out.print("Metros cuadrados: " + departamento.getmCuadrados());
            System.out.print("Número de Casa: " + departamento.getUbicacion().getNumeroCasa());
            System.out.println("");
        }
    }

    public void subirRegistroPropietario() throws IOException {
        System.out.println("============================");
        System.out.println("Nombres: ");
        String nombres = leer.nextLine();
        System.out.println("Apellidos: ");
        String apellidos = leer.nextLine();

        String id = obtenerYModificarUltimoId("propietarios");
        Propietario propietario = new Propietario(id, nombres, apellidos);
        archivos.serializarPropietario(id, propietario);
    }

    public void subirRegistroUbicacion() throws IOException {

        System.out.println("Número de casa: ");
        String numCasa = leer.nextLine();

        System.out.println("Barrio: ");
        String barrio = leer.nextLine();

        System.out.println("Referencia: ");
        String referencia = leer.nextLine();

        String id = obtenerYModificarUltimoId("ubicaciones");
        Ubicacion ubicacion = new Ubicacion(Integer.parseInt(id), barrio, referencia, numCasa);
        archivos.serializarUbicacion(id, ubicacion);
    }

    public void subirRegistroCiudad() throws IOException {
        System.out.println("Nombre ciudad: ");
        String nombreCiudad = leer.nextLine();
        System.out.println("Nombre provincia: ");
        String nombreProvincia = leer.nextLine();

        String id = obtenerYModificarUltimoId("ciudades");
        Ciudad ciudad = new Ciudad(id, nombreCiudad, nombreProvincia);
        archivos.serializarCiudad(id, ciudad);
    }

    public void subirRegistroConstructora() throws IOException {
        String id = obtenerYModificarUltimoId("constructoras");
        System.out.println("Nombre empresa: ");
        String nombreEmpresa = leer.nextLine();

        Constructora constructora = new Constructora(id, nombreEmpresa);
        archivos.serializarConstructora(id, constructora);
    }

    public void subirRegistroCasa() throws IOException {

        System.out.println("m ^2: ");
        String metrosCuadrados = leer.nextLine();

        System.out.println("Precio m²: ");
        String precioMetroCuadrado = leer.nextLine();

        System.out.println("Número cuartos: ");
        String numeroCuartos = leer.nextLine();

        System.out.println("ID del propietario: ");
        String propietarioID = leer.nextLine();

        System.out.println("Número de Casa: ");
        String numCasa = leer.nextLine();

        System.out.println("Nombre ciudad-> ");
        String nombreCiudad = leer.nextLine();

        System.out.println("ID de la constructora: ");
        String constructoraID = leer.nextLine();

        String id = obtenerYModificarUltimoId("casas");
        Ubicacion ubicacion = obtenerUbicacionPorNumeroCasa(Integer.parseInt(numCasa));
        Ciudad ciudad = obtenerCiudadPorNombre(nombreCiudad);
        Propietario propietario = obtenerPropietarioPorId(propietarioID);
        Constructora constructora = obtenerConstructoraPorId(constructoraID);

        Casa casa = new Casa(id, Double.parseDouble(precioMetroCuadrado), ubicacion,
                Double.parseDouble(metrosCuadrados), propietario, Integer.parseInt(numeroCuartos),
                constructora, ciudad);
        casa.getCostoTotal();

        archivos.serializarCasa(id, casa);
    }

    public void subirRegistroDepartamento() throws IOException {
        System.out.println("Nombre en edificio: ");
        String nombreEdificio = leer.nextLine();
        System.out.println("Ubicacion en edificio: ");
        String ubicacionEnEdificio = leer.nextLine();
        System.out.println("Número cuartos: ");
        String numeroCuartos = leer.nextLine();
        System.out.println("Valor mensual: ");
        String valorMensual = leer.nextLine();
        System.out.println("Número de casa: ");
        String numCasa = leer.nextLine();
        System.out.println("Precio metro cuadrado: ");
        String precioMetroC = leer.nextLine();
        System.out.println("Id de la constructora: ");
        String constructoraId = leer.nextLine();
        System.out.println("Nombre de la ciudad: ");
        String ciudadNombre = leer.nextLine();
        System.out.println("Precio: ");
        String precio = leer.nextLine();
        System.out.println("Id del propietario: ");
        String propietarioId = leer.nextLine();
        System.out.println("Metros cuadrados: ");
        String metrosCuadrados = leer.nextLine();

        String id = obtenerYModificarUltimoId("departamentos");
        Ciudad ciudad = obtenerCiudadPorNombre(ciudadNombre);
        Propietario propietario = obtenerPropietarioPorId(propietarioId);
        Ubicacion ubicacion = obtenerUbicacionPorNumeroCasa(Integer.parseInt(numCasa));
        Constructora constructora = obtenerConstructoraPorId(constructoraId);

        Departamento departamento = new Departamento(nombreEdificio,
                ubicacionEnEdificio, Integer.parseInt(numeroCuartos), Double.parseDouble(valorMensual),
                ubicacion, Double.parseDouble(precioMetroC), constructora, ciudad,
                Double.parseDouble(precio), propietario, id, Double.parseDouble(metrosCuadrados));
        departamento.getCostoTotal();

        archivos.serializarDepartamento(id, departamento);
    }

    public Propietario obtenerPropietarioPorId(String id) throws IOException {
        Propietario propietario = null;
        int cantidadPropietarios = Integer.parseInt(obtenerUltimoId("propietarios"));
        for (int i = 1; i <= cantidadPropietarios; i++) {
            Propietario prop = archivos.deserializarPropietario(
                    Integer.toString(i));
            if (prop.getIdentificacion() == id) {
                propietario = prop;
            }
        }
        return propietario;
    }

    public Ubicacion obtenerUbicacionPorNumeroCasa(int numCasa) throws IOException {
        Ubicacion ubicacion = null;
        int cantidadUbicaciones = Integer.parseInt(obtenerUltimoId("ubicaciones"));
        for (int i = 1; i <= cantidadUbicaciones; i++) {
            Ubicacion ub = archivos.deserializarUbicacion(
                    Integer.toString(i));
            if (ub.getNumeroCasa() == numCasa) {
                ubicacion = ub;
            }
        }
        return ubicacion;
    }

    public Ciudad obtenerCiudadPorNombre(String nombre) throws IOException {
        Ciudad ciudad = null;
        int cantidadCiudades = Integer.parseInt(obtenerUltimoId("ciudades"));
        for (int i = 1; i <= cantidadCiudades; i++) {
            Ciudad cd = archivos.deserializarCiudad(
                    Integer.toString(i));
            if (cd.getNombreCiudad() == nombre) {
                ciudad = cd;
            }
        }
        return ciudad;
    }

    public Constructora obtenerConstructoraPorId(String id) throws IOException {
        Constructora constructora = null;
        int cantidadConstructoras = Integer.parseInt(obtenerUltimoId("constructora"));
        for (int i = 1; i <= cantidadConstructoras; i++) {
            Constructora con = archivos.deserializarConstructora(
                    Integer.toString(i));
            if (con.getIdentificacion() == id) {
                constructora = con;
            }
        }
        return constructora;
    }

    public String obtenerYModificarUltimoId(String nombreArchivo) {

        String dir = System.getProperty("user.dir") + "/datos/" + nombreArchivo + "/ultimoId.txt";
        String ultimoId = "";

        try {
            Scanner lectorArchivos = new Scanner(new File(dir));
            ultimoId = lectorArchivos.nextLine();

            lectorArchivos.close();
            int idNumerico = 0;
            idNumerico = Integer.parseInt(ultimoId) + 1;
            ultimoId = Integer.toString(idNumerico);

            FileWriter escritorArchivos = new FileWriter(dir);
            escritorArchivos.write(ultimoId);
            escritorArchivos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return ultimoId;
    }

    public String obtenerUltimoId(String nombreArchivo) {

        String dir = System.getProperty("user.dir") + "/datos/" + nombreArchivo + "/ultimoId.txt";
        String ultimoId = "";

        try {
            Scanner lectorArchivos = new Scanner(new File(dir));
            ultimoId = lectorArchivos.nextLine();
            lectorArchivos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return ultimoId;
    }

}
