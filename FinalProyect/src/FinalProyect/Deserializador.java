package FinalProyect;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
public class Deserializador {

    public Propietario deserializarPropietario(String nombreCarpeta, String nombreArchivo)
            throws IOException {
        Propietario propietario = null;

        FileInputStream flujoEntrada = new FileInputStream(System.getProperty("user.dir")
                + "\\datos\\propietario\\" + nombreCarpeta + "\\" + nombreArchivo
                + ".data");
        ObjectInputStream flujoObjetoEntrada = new ObjectInputStream(flujoEntrada);

        try {
            propietario = (Propietario) flujoObjetoEntrada.readObject();
            flujoObjetoEntrada.close();
            flujoEntrada.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return propietario;
    }

    public Ubicacion deserializarUbicacion(String nombreCarpeta, String nombreArchivo)
            throws IOException {
        Ubicacion ubicacion = null;

        FileInputStream flujoEntrada = new FileInputStream(System.getProperty("user.dir")
                + "\\datos\\ubicacion\\" + nombreCarpeta + "\\" + nombreArchivo
                + ".data");
        ObjectInputStream flujoObjetoEntrada = new ObjectInputStream(flujoEntrada);

        try {
            ubicacion = (Ubicacion) flujoObjetoEntrada.readObject();
            flujoObjetoEntrada.close();
            flujoEntrada.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ubicacion;
    }

    public Ciudad deserializarCiudad(String nombreCarpeta, String nombreArchivo) throws IOException {
        Ciudad ciudad = null;

        FileInputStream flujoEntrada = new FileInputStream(System.getProperty("user.dir")
                + "\\datos\\ciudad\\" + nombreCarpeta + "\\" + nombreArchivo
                + ".data");
        ObjectInputStream flujoObjetoEntrada = new ObjectInputStream(flujoEntrada);

        try {
            ciudad = (Ciudad) flujoObjetoEntrada.readObject();
            flujoObjetoEntrada.close();
            flujoEntrada.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ciudad;
    }

    public Constructora deserializarConstructora(String nombreCarpeta, String nombreArchivo)
            throws IOException {
        Constructora constructora = null;

        FileInputStream flujoEntrada = new FileInputStream(System.getProperty("user.dir")
                + "\\datos\\constructora\\" + nombreCarpeta + "\\" + nombreArchivo
                + ".data");
        ObjectInputStream flujoObjetoEntrada = new ObjectInputStream(flujoEntrada);

        try {
            constructora = (Constructora) flujoObjetoEntrada.readObject();
            flujoObjetoEntrada.close();
            flujoEntrada.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return constructora;

    }

    public Casa deserializarCasa(String nombreCarpeta, String nombreArchivo)
            throws IOException {
        Casa casa = null;
        FileInputStream flujoEntrada = new FileInputStream(System.getProperty("user.dir")
                + "\\datos\\casa\\" + nombreCarpeta + "\\" + nombreArchivo
                + ".data");
        ObjectInputStream flujoObjetoEntrada = new ObjectInputStream(flujoEntrada);

        try {
            casa = (Casa) flujoObjetoEntrada.readObject();
            flujoObjetoEntrada.close();
            flujoEntrada.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return casa;
    }

    public Departamento deserializarDepartamento(String nombreCarpeta, String nombreArchivo)
            throws IOException {

        Departamento departamento = null;
        FileInputStream flujoEntrada = new FileInputStream(System.getProperty("user.dir")
                + "\\datos\\departamento\\" + nombreCarpeta + "\\" + nombreArchivo
                + ".data");
        ObjectInputStream flujoObjetoEntrada = new ObjectInputStream(flujoEntrada);

        try {
            departamento = (Departamento) flujoObjetoEntrada.readObject();
            flujoObjetoEntrada.close();
            flujoEntrada.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return departamento;
    }
}
