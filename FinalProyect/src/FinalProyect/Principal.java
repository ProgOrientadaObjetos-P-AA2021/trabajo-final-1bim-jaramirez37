package FinalProyect;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Principal {

    public static void main(String[] args) throws IOException {
        MenuPrincipal();
    }

    public static void MenuPrincipal() throws IOException {
        Scanner leer = new Scanner(System.in);
        String opcionPrincipal, opcionSecundaria;
        boolean salir = false;

        while (salir == false) {
            System.out.println("---------------Administración Inmobiliaria--------------------");
            System.out.println("1.Ingresar registros");
            System.out.println("2.Mostrar registros");
            System.out.print("Escoga una opción(1 o 2) ");
            opcionPrincipal = leer.nextLine();

            System.out.println("1.Registros de propietario");
            System.out.println("2.Registros de ubicaciones");
            System.out.println("3.Registros de ciudades");
            System.out.println("4.Registros de constructoras");
            System.out.println("5.Registros de casas");
            System.out.println("6.Registros de departamentos");
            System.out.println("7.Salir");

            System.out.print("Escoga una opción");
            opcionSecundaria = leer.nextLine();

            if (opcionSecundaria == "7") {
                salir = true;
            } else {
                Controlador controlador = new Controlador();
                controlador.ejecutar(opcionPrincipal, opcionSecundaria);

            }
        }

    }
}
