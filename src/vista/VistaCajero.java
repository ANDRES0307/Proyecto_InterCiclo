package vista;

import controlador.ControladorCajero;
import java.util.Scanner;
import modelo.Cajero;

/**
 *
 * @author Andres
 */
public class VistaCajero {

    Scanner teclado;
    ControladorCajero controladorCajero;

    public VistaCajero() {
        teclado = new Scanner(System.in);
        controladorCajero = new ControladorCajero();
    }

    public void menu() {
        int opc = 0;
        do {
            System.out.println("* * * Menu * * *"
                    + "\n[1] Crear cajeros "
                    + "\n[2] Listar Cajeros"
                    + "\n[3] Ordenar cajeros "
                    + "\n[0] Salir");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    crearCajeros();
                    break;
                case 2:
                    listarCajeros();
                    break;
                case 3:
                    ordenarCajero();
                    break;
            }

        } while (opc != 0);
    }

    public void crearCajeros() {
        System.out.println("Numero de cajeros con los que se cuenta 10");
        System.out.println("Ingrese su nombre");
        String nombre = teclado.next();
        System.out.println("Ingrese el turno");
        String turno = teclado.next();
        Cajero cajero = new Cajero(controladorCajero.generarId(), nombre,controladorCajero.numeroClientesAtendidos(),turno);
        controladorCajero.crearCajero(cajero);

    }

    public void listarCajeros() {
        controladorCajero.listar();
    }

    public void ordenarCajero() {

    }

}
