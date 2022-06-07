package vista;

import controlador.ControladorBanco;
import java.util.Scanner;
import modelo.Banco;

/**
 *
 * @author Andres
 */
public class VistaBanco {
    
    public ControladorBanco controladorBanco;
    public Scanner teclado;
    
    public VistaBanco(){
        controladorBanco = new ControladorBanco();
        teclado = new Scanner(System.in);
        
    }
    public void menu(){
        int opc = 0;
        do {            
            System.out.println("**********Banco**********");
            System.out.println("1. Crear\n2. Buscar\n3. Actualiza\n4. Eliminar\n5. Listar\n0. Salir");
            opc = teclado.nextInt();
            switch (opc) {
                case 1: crear(); break;
                case 2: buscar(); break;
                case 3: actualizar(); break;
                case 4: eliminar(); break;
                case 5: listar(); break;
            }
        } while (opc != 0);
    }
    
    public void crear(){
        System.out.println("Ingrese el Nombre");
        String nombre = teclado.next();
        System.out.println("Ingrese la Direccion");
        String direccion = teclado.next();
        Banco banco = new Banco(controladorBanco.generarId(), nombre, direccion);
        System.out.println(controladorBanco.crear(banco));
    }
    
    public void buscar(){
        System.out.println("Ingrese el id");
        long id = teclado.nextLong();
        System.out.println(controladorBanco.leer(id));
    }
    
    public void actualizar(){
        System.out.println("Ingrese el id");
        long id = teclado.nextLong();
        System.out.println("Ingrese el Nombre");
        String nombre = teclado.next();
        System.out.println("Ingrese la Direccion");
        String direccion = teclado.next();
        Banco banco = new Banco(id, nombre, direccion);
        System.out.println(controladorBanco.actualizar(banco));
    }
    
    public void eliminar(){
        System.out.println("Ingrese el id");
        long id = teclado.nextLong();
        Banco banco = controladorBanco.leer(id);
        System.out.println(controladorBanco.crear(banco));
    }
    
    public void listar(){
        controladorBanco.getListaBanco().forEach(l -> System.out.println(l));
    }
    

}
