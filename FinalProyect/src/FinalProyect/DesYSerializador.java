package FinalProyect;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
public class DesYSerializador {
    String dir = System.getProperty("user.dir");
    public Propietario deserializarPropietario(String nombreArchivo)
            throws IOException {
        Propietario propietario = null;

        FileInputStream flujoEntrada = new FileInputStream(dir
                + "\\datos\\propietarios\\propietario" + nombreArchivo
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

    public Ubicacion deserializarUbicacion(String nombreArchivo)
            throws IOException {
        Ubicacion ubicacion = null;

        FileInputStream flujoEntrada = new FileInputStream(dir
                + "\\datos\\ubicaciones\\ubicacion" + nombreArchivo
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

    public Ciudad deserializarCiudad(String nombreArchivo) throws IOException {
        Ciudad ciudad = null;

        FileInputStream flujoEntrada = new FileInputStream(dir
                + "\\datos\\ciudades\\ciudad" + nombreArchivo
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

    public Constructora deserializarConstructora(String nombreArchivo)
            throws IOException {
        Constructora constructora = null;

        FileInputStream flujoEntrada = new FileInputStream(dir
                + "\\datos\\constructoras\\constructora" + nombreArchivo
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

    public Casa deserializarCasa(String nombreArchivo)
            throws IOException {
        Casa casa = null;
        FileInputStream flujoEntrada = new FileInputStream(dir
                + "\\datos\\casas\\casa" + nombreArchivo
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

    public Departamento deserializarDepartamento(String nombreArchivo)
            throws IOException {

        Departamento departamento = null;
        FileInputStream flujoEntrada = new FileInputStream(dir
                + "\\datos\\departamentos\\departamento" + nombreArchivo
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
    

    public void serializarPropietario(String nombreArchivo, Propietario propietario) throws IOException {
        FileOutputStream flujoSalida = new FileOutputStream(dir
                + "\\datos\\propietarios\\propietario" + nombreArchivo + ".data");
        ObjectOutputStream flujoObjetoSalida = new ObjectOutputStream(flujoSalida);

        try {
            flujoObjetoSalida.writeObject(propietario);
            flujoSalida.close();
            flujoObjetoSalida.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void serializarUbicacion(String nombreArchivo, Ubicacion ubicacion)
            throws IOException {

        FileOutputStream flujoSalida = new FileOutputStream(dir
                + "\\datos\\ubicaciones\\ubicacion" + nombreArchivo + ".data");
        ObjectOutputStream flujoObjetoSalida = new ObjectOutputStream(flujoSalida);

        try {
            flujoObjetoSalida.writeObject(ubicacion);
            flujoSalida.close();
            flujoObjetoSalida.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void serializarCiudad(String nombreArchivo, Ciudad ciudad) throws IOException {

        FileOutputStream flujoSalida = new FileOutputStream(dir
                + "\\datos\\ciudades\\ciudad" + nombreArchivo + ".data");
        ObjectOutputStream flujoObjetoSalida = new ObjectOutputStream(flujoSalida);

        try {
            flujoObjetoSalida.writeObject(ciudad);
            flujoSalida.close();
            flujoObjetoSalida.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void serializarConstructora(String nombreArchivo,
            Constructora constructora) throws IOException {

        FileOutputStream flujoSalida = new FileOutputStream(dir
                + "\\datos\\constructoras\\constructora" + nombreArchivo + ".data");
        ObjectOutputStream flujoObjetoSalida = new ObjectOutputStream(flujoSalida);

        try {
            flujoObjetoSalida.writeObject(constructora);
            flujoObjetoSalida.close();
            flujoSalida.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void serializarCasa(String nombreArchivo,
            Casa casa) throws IOException {
        FileOutputStream flujoSalida = new FileOutputStream(dir
                + "\\datos\\casas\\casa" + nombreArchivo + ".data");
        ObjectOutputStream flujoObjetoSalida = new ObjectOutputStream(flujoSalida);

        try {
            flujoObjetoSalida.writeObject(casa);
            flujoObjetoSalida.close();
            flujoSalida.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void serializarDepartamento(String nombreArchivo,
            Departamento departamento) throws IOException {
        
        FileOutputStream flujoSalida = new FileOutputStream(dir
                + "\\datos\\departamentos\\departamento" + nombreArchivo + ".data");
        ObjectOutputStream flujoObjetoSalida = new ObjectOutputStream(flujoSalida);

        try {
            flujoObjetoSalida.writeObject(departamento);
            flujoObjetoSalida.close();
            flujoSalida.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

