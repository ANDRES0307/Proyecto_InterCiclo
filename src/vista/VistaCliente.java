package vista;

import controlador.ControladorCliente;
import java.util.Scanner;
import modelo.Cliente;

/**
 *
 * @author Andres
 */
public class VistaCliente {

    public ControladorCliente controladorCliente;
    public Scanner teclado;

    public VistaCliente() {
        controladorCliente = new ControladorCliente();
        teclado = new Scanner(System.in);

    }

    public void menu() {
        int opc = 0;
        do {
            System.out.println("**********Cliente**********");
            System.out.println("1. Crear\n2. Buscar\n3. Actualiza\n4. Eliminar\n5. Listar\n0. Salir");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    crear();
                    break;
                case 2:
                    buscar();
                    break;
                case 3:
                    actualizar();
                    break;
                case 4:
                    eliminar();
                    break;
                case 5:
                    listar();
                    break;
            }
        } while (opc != 0);
    }

    public void crear() {
        System.out.println("Ingrese el Nombre");
        String nombre = teclado.next();
        System.out.println("Ingrese el Apellido");
        String apellido = teclado.next();
        System.out.println("Ingrese la Cedula");
        String numCedula = teclado.next();
        System.out.println("Ingrese el numero de cuenta");
        String numCuenta = teclado.next();
        Cliente cliente = new Cliente(controladorCliente.generarId(), nombre, apellido, numCedula, numCuenta);
        System.out.println(controladorCliente.crear(cliente));
    }

    public void buscar() {
        System.out.println("Ingrese el id");
        long id = teclado.nextLong();
        System.out.println(controladorCliente.leer(id));
    }

    public void actualizar() {
        System.out.println("Ingrese el id");
        long id = teclado.nextLong();
        System.out.println("Ingrese el Nombre");
        String nombre = teclado.next();
        System.out.println("Ingrese el Apellido");
        String apellido = teclado.next();
        System.out.println("Ingrese la Cedula");
        String numCedula = teclado.next();
        System.out.println("Ingrese el numero de cuenta");
        String numCuenta = teclado.next();
        Cliente cliente = new Cliente(id, nombre, apellido, numCedula, numCuenta);
        System.out.println(controladorCliente.actualizar(cliente));
    }

    public void eliminar() {
        System.out.println("Ingrese el id");
        long id = teclado.nextLong();
        Cliente cliente = controladorCliente.leer(id);
        System.out.println(controladorCliente.crear(cliente));
    }

    public void listar() {
        controladorCliente.getListaCliente().forEach(l -> System.out.println(l));
    }

}
