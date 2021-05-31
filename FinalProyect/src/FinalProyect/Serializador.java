package FinalProyect;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
public class Serializador {

    public void serializarPropietario(String nombreCarpeta, String nombreArchivo, Propietario propietario) throws IOException {
        crearCarpeta(System.getProperty("user.dir") + "\\datos\\propietario\\" + nombreCarpeta);
        FileOutputStream flujoSalida = new FileOutputStream(System.getProperty("user.dir")
                + "\\datos\\propietario\\"
                + nombreCarpeta + "\\" + nombreArchivo + ".data");
        ObjectOutputStream flujoObjetoSalida = new ObjectOutputStream(flujoSalida);

        try {
            flujoObjetoSalida.writeObject(propietario);
            flujoSalida.close();
            flujoObjetoSalida.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void serializarUbicacion(String nombreCarpeta, String nombreArchivo, Ubicacion ubicacion)
            throws IOException {
        crearCarpeta(System.getProperty("user.dir") + "\\datos\\ubicacion\\" + nombreCarpeta);

        FileOutputStream flujoSalida = new FileOutputStream(System.getProperty("user.dir")
                + "\\datos\\ubicacion\\"
                + nombreCarpeta + "\\" + nombreArchivo + ".data");
        ObjectOutputStream flujoObjetoSalida = new ObjectOutputStream(flujoSalida);

        try {
            flujoObjetoSalida.writeObject(ubicacion);
            flujoSalida.close();
            flujoObjetoSalida.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void serializarCiudad(String nombreCarpeta, String nombreArchivo, Ciudad ciudad) throws IOException {
        crearCarpeta(System.getProperty("user.dir") + "\\datos\\ciudad\\" + nombreCarpeta);

        FileOutputStream flujoSalida = new FileOutputStream(System.getProperty("user.dir")
                + "\\datos\\ciudad\\"
                + nombreCarpeta + "\\" + nombreArchivo + ".data");
        ObjectOutputStream flujoObjetoSalida = new ObjectOutputStream(flujoSalida);

        try {
            flujoObjetoSalida.writeObject(ciudad);
            flujoSalida.close();
            flujoObjetoSalida.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void serializarConstructora(String nombreCarpeta, String nombreArchivo,
            Constructora constructora) throws IOException {
        crearCarpeta(System.getProperty("user.dir") + "\\datos\\constructora\\" + nombreCarpeta);

        FileOutputStream flujoSalida = new FileOutputStream(System.getProperty("user.dir")
                + "\\datos\\constructora\\"
                + nombreCarpeta + "\\" + nombreArchivo + ".data");
        ObjectOutputStream flujoObjetoSalida = new ObjectOutputStream(flujoSalida);

        try {
            flujoObjetoSalida.writeObject(constructora);
            flujoObjetoSalida.close();
            flujoSalida.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void serializarCasa(String nombreCarpeta, String nombreArchivo,
            Casa casa) throws IOException {
        crearCarpeta(System.getProperty("user.dir") + "\\datos\\casa\\" + nombreCarpeta);
        FileOutputStream flujoSalida = new FileOutputStream(System.getProperty("user.dir")
                + "\\datos\\casa\\"
                + nombreCarpeta + "\\" + nombreArchivo + ".data");
        ObjectOutputStream flujoObjetoSalida = new ObjectOutputStream(flujoSalida);

        try {
            flujoObjetoSalida.writeObject(casa);
            flujoObjetoSalida.close();
            flujoSalida.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void serializarDepartamento(String nombreCarpeta, String nombreArchivo,
            Departamento departamento) throws IOException {

        crearCarpeta(System.getProperty("user.dir") + "\\datos\\departamento\\" + nombreCarpeta);

        FileOutputStream flujoSalida = new FileOutputStream(System.getProperty("user.dir")
                + "\\datos\\departamento\\"
                + nombreCarpeta + "\\" + nombreArchivo + ".data");
        ObjectOutputStream flujoObjetoSalida = new ObjectOutputStream(flujoSalida);

        try {
            flujoObjetoSalida.writeObject(departamento);
            flujoObjetoSalida.close();
            flujoSalida.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void crearCarpeta(String nombreCarpeta) {
        try {
            File carpeta = new File(nombreCarpeta);
            carpeta.mkdir();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
