package FinalProyect;

import java.io.File;
import java.io.FileReader;
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
    Serializador serializador = new Serializador();
    Deserializador deserializador = new Deserializador();

    public void ejecutar(String opcionPrincipal, String opcionSecundaria) throws IOException {
        if (opcionPrincipal.equals("1")) {
            if (opcionSecundaria.equals("1")) {
                subirRegistroPropietario();
            } else if (opcionSecundaria.equals("2")) {
                subirRegistroUbicacion();
            } else if (opcionSecundaria.equals("3")) {
                subirRegistroCiudad();
            } else if (opcionSecundaria.equals("4")) {
                subirRegistroConstructora();
            } else if (opcionSecundaria.equals("5")) {
                subirRegistroCasa();
            } else if (opcionSecundaria.equals("6")) {
                subirRegistroDepartamento();
            }
        } else if (opcionPrincipal.equals("2")) {
            if (opcionSecundaria.equals("1")) {
                mostrarRegistrosPropietarios();
            } else if (opcionSecundaria.equals("2")) {
                mostrarRegistrosUbicaciones();
            } else if (opcionSecundaria.equals("3")) {
                mostrarRegistrosCiudades();
            } else if (opcionSecundaria.equals("4")) {
                mostrarRegistrosConstructoras();
            } else if (opcionSecundaria.equals("5")) {
                mostrarRegistrosCasas();
            } else if (opcionSecundaria.equals("6")) {
                mostrarRegistrosDepartamentos();
            }
        }

    }

    public void mostrarRegistrosPropietarios() throws IOException {
        int cantidadPropietarios = Integer.parseInt(ultimoId("propietario", false));
        for (int i = 1; i <= cantidadPropietarios; i++) {
            Propietario propietario = deserializador.deserializarPropietario(
                    Integer.toString(i), "propietario");
            System.out.println("ID: " + propietario.obtenerIdentificacion());
            System.out.println("Nombres: " + propietario.obtenerNombresPropietario());
            System.out.println("Apellidos: " + propietario.obtenerApellidosPropietario());
            System.out.println("");
        }
    }

    public void mostrarRegistrosUbicaciones() throws IOException {
        int cantidadUbicaciones = Integer.parseInt(ultimoId("ubicacion", false));
        for (int i = 1; i <= cantidadUbicaciones; i++) {
            Ubicacion ubicacion = deserializador.deserializarUbicacion(
                    Integer.toString(i), "ubicacion");
            System.out.println("ID: " + ubicacion.obtenerIdentificacion());
            System.out.println("Barrio: " + ubicacion.obtenerNombreBarrio());
            System.out.println("Referencia: " + ubicacion.obtenerReferencia());
            System.out.println("Número de casa: " + ubicacion.obtenerNumeroCasa());
            System.out.println("");
        }
    }

    public void mostrarRegistrosCiudades() throws IOException {
        int cantidadCiudades = Integer.parseInt(ultimoId("ciudad", false));
        for (int i = 1; i <= cantidadCiudades; i++) {
            Ciudad ciudad = deserializador.deserializarCiudad(
                    Integer.toString(i), "ciudad");
            System.out.println("ID: " + ciudad.obtenerIdentificacion());
            System.out.println("Nombre ciudad: " + ciudad.obtenerNombreCiudad());
            System.out.println("Nombre provincia: " + ciudad.obtenerNombreProvincia());
            System.out.println("");
        }
    }

    public void mostrarRegistrosConstructoras() throws IOException {
        int cantidadConstructoras = Integer.parseInt(ultimoId("constructora", false));
        for (int i = 1; i <= cantidadConstructoras; i++) {
            Constructora constructora = deserializador.deserializarConstructora(
                    Integer.toString(i), "constructor");
            System.out.print("ID: " + constructora.obtenerIdentificacion());
            System.out.print("Nombre de la empresa: "
                    + constructora.obtenerNombreConstructora());
            System.out.println("");
        }
    }

    public void mostrarRegistrosCasas() throws IOException {
        int cantidadCasas = Integer.parseInt(ultimoId("casa", false));

        for (int i = 1; i <= cantidadCasas; i++) {
            Casa casa = deserializador.deserializarCasa(Integer.toString(i), "casa");
            System.out.print("ID: " + casa.obtenerIdentificacion());
            System.out.print("ID de la constructora-> " + casa.obtenerConstructora());
            System.out.print("ID del propietario: " + casa.obtenerIdentificacion());
            System.out.print("Metros cuadrados: " + casa.obtenerMCuadrados());
            System.out.print("Precio m²: " + casa.obtenerMCuadradosPrecio());
            System.out.print("Nombre ciudad-> " + casa.obtenerCiudad().obtenerNombreCiudad());
            System.out.print("Número de Casa: " + casa.obtenerUbicacion().obtenerNumeroCasa());
            System.out.print("Número cuartos: " + casa.obtenerNCuartos());
            System.out.println("");
        }
    }

    public void mostrarRegistrosDepartamentos() throws IOException {
        int cantidadCasas = Integer.parseInt(ultimoId("departamento", false));
        for (int i = 1; i <= cantidadCasas; i++) {
            Departamento departamento = deserializador.deserializarDepartamento(
                    Integer.toString(i), "departamento");
            System.out.print("ID: " + departamento.obtenerIdentificacion());
            System.out.print("ID de la constructora-> " + departamento.obtenerConstructora());
            System.out.print("ID del propietario: " + departamento.obtenerIdentificacion());
            System.out.print("Metros cuadrados: " + departamento.obtenerMCuadrados());
            System.out.print("Precio m²: " + departamento.obtenerPrecioMetroCuadrado());
            System.out.print("Nombre ciudad-> " + departamento.obtenerCiudad().obtenerNombreCiudad());
            System.out.print("Número de Casa: " + departamento.obtenerUbicacion().obtenerNumeroCasa());
            System.out.print("Número cuartos: " + departamento.obtenerNumeroCuartos());
            System.out.println("");
        }
    }

    public void subirRegistroPropietario() throws IOException {
        String id = ultimoId("propietario", true);
        System.out.println("ID: " + id);
        System.out.println("Nombres: ");
        String nombres = leer.nextLine();
        System.out.println("Apellidos: ");
        String apellidos = leer.nextLine();
        Propietario propietario = new Propietario(id, nombres, apellidos);
        serializador.serializarPropietario(id, "propietario", propietario);
    }

    public void subirRegistroUbicacion() throws IOException {
        String id = ultimoId("ubicacion", true);
        System.out.println("\nID: " + id);
        System.out.println("Barrio: ");
        String barrio = leer.nextLine();
        System.out.print("\nReferencia: ");
        String referencia = leer.nextLine();
        System.out.print("\nNúmero de casa: ");
        String numCasa = leer.nextLine();
        Ubicacion ubicacion = new Ubicacion(Integer.parseInt(id), barrio, referencia, numCasa);
        serializador.serializarUbicacion(id, "ubicacion", ubicacion);
    }

    public void subirRegistroCiudad() {
        String id = ultimoId("ciudad", true);
        System.out.println("ID: " + id);
        System.out.println("Nombre ciudad: ");
        String nombreCiudad = leer.nextLine();
        System.out.println("Nombre provincia: ");
        String nombreProvincia = leer.nextLine();
        Ciudad ciudad = new Ciudad(id, nombreCiudad, nombreProvincia);
    }

    public void subirRegistroConstructora() throws IOException {
        String id = ultimoId("constructora", true);
        System.out.println("ID: " + id);
        System.out.println("Nombre de la empresa: ");
        String nombreEmpresa = leer.nextLine();

        Constructora constructora = new Constructora(id, nombreEmpresa);
        serializador.serializarConstructora(id, "constructora", constructora);
    }

    public void subirRegistroCasa() throws IOException {
        String id = ultimoId("casa", true);
        System.out.println("ID: " + id);

        System.out.println("Metros cuadrados: ");
        String metrosCuadrados = leer.nextLine();

        System.out.println("Precio m²: ");
        String precioMetroCuadrado = leer.nextLine();

        System.out.println("Número cuartos: ");
        String numeroCuartos = leer.nextLine();

        System.out.println("ID del propietario: ");
        String propietarioID = leer.nextLine();

        System.out.println("Número de Casa-: ");
        String numCasa = leer.nextLine();

        System.out.println("Nombre ciudad-> ");
        String nombreCiudad = leer.nextLine();

        System.out.println("ID de la constructora-> ");
        String constructoraID = leer.nextLine();

        Propietario propietario = obtenerPropietarioPorId(propietarioID);
        Ubicacion ubicacion = obtenerUbicacionPorNumeroCasa(Integer.parseInt(numCasa));
        Ciudad ciudad = obtenerCiudadPorNombre(nombreCiudad);
        Constructora constructora = obtenerConstructoraPorId(constructoraID);

        Casa casa = new Casa(id, Double.parseDouble(precioMetroCuadrado), ubicacion,
                Double.parseDouble(metrosCuadrados), propietario, Integer.parseInt(numeroCuartos),
                constructora, ciudad);
        casa.calcularCostoTotal();

        serializador.serializarCasa(id, "casa", casa);
    }

    public void subirRegistroDepartamento() throws IOException {
        String id = ultimoId("departamento", true);
        System.out.println("ID: " + id);
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

        Ciudad ciudad = obtenerCiudadPorNombre(ciudadNombre);
        Propietario propietario = obtenerPropietarioPorId(propietarioId);
        Ubicacion ubicacion = obtenerUbicacionPorNumeroCasa(Integer.parseInt(numCasa));
        Constructora constructora = obtenerConstructoraPorId(constructoraId);

        Departamento departamento = new Departamento(nombreEdificio,
                ubicacionEnEdificio, Integer.parseInt(numeroCuartos), Double.parseDouble(valorMensual),
                ubicacion, Double.parseDouble(precioMetroC), constructora, ciudad,
                Double.parseDouble(precio), propietario, id, Double.parseDouble(metrosCuadrados));
        departamento.calcularCostoTotal();

        serializador.serializarDepartamento(id, "departamento", departamento);
    }

    public Propietario obtenerPropietarioPorId(String id) throws IOException {
        Propietario propietario = null;
        int cantidadPropietarios = Integer.parseInt(ultimoId("propietario", false));
        for (int i = 1; i <= cantidadPropietarios; i++) {
            Propietario prop = deserializador.deserializarPropietario(
                    Integer.toString(i), "propietario");
            if (prop.obtenerIdentificacion() == id) {
                propietario = prop;
            }
        }
        return propietario;
    }

    public Ubicacion obtenerUbicacionPorNumeroCasa(int numCasa) throws IOException {
        Ubicacion ubicacion = null;
        int cantidadUbicaciones = Integer.parseInt(ultimoId("ubicacion", false));
        for (int i = 1; i <= cantidadUbicaciones; i++) {
            Ubicacion ub = deserializador.deserializarUbicacion(
                    Integer.toString(i), "ubicacion");
            if (ub.obtenerNumeroCasa() == numCasa) {
                ubicacion = ub;
            }
        }
        return ubicacion;
    }

    public Ciudad obtenerCiudadPorNombre(String nombre) throws IOException {
        Ciudad ciudad = null;
        int cantidadCiudades = Integer.parseInt(ultimoId("ciudad", false));
        for (int i = 1; i <= cantidadCiudades; i++) {
            Ciudad cd = deserializador.deserializarCiudad(
                    Integer.toString(i), "ciudad");
            if (cd.obtenerNombreCiudad() == nombre) {
                ciudad = cd;
            }
        }
        return ciudad;
    }

    public Constructora obtenerConstructoraPorId(String id) throws IOException {
        Constructora constructora = null;
        int cantidadConstructoras = Integer.parseInt(ultimoId("constructora", false));
        for (int i = 1; i <= cantidadConstructoras; i++) {
            Constructora con = deserializador.deserializarConstructora(
                    Integer.toString(i), "constructora");
            if (con.obtenerIdentificacion() == id) {
                constructora = con;
            }
        }
        return constructora;
    }

    public String ultimoId(String nombreArchivo, boolean modificar) {

        String dir = System.getProperty("user.dir") + "/datos/" + nombreArchivo + "/id.txt";
        String ultimoId = "";

        try {
            Scanner lectorArchivos = new Scanner(new File(dir));
            ultimoId = lectorArchivos.nextLine();

            lectorArchivos.close();
            int idNumerico = 0;
            if (modificar == true) {
                idNumerico = Integer.parseInt(ultimoId) + 1;
                ultimoId = Integer.toString(idNumerico);

                FileWriter escritorArchivos = new FileWriter(dir);
                escritorArchivos.write(ultimoId);
                escritorArchivos.close();

            } else {
                idNumerico = Integer.parseInt(ultimoId);
                ultimoId = Integer.toString(idNumerico);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return ultimoId;
    }

}
