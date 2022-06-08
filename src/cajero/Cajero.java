/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajero;

import java.util.Scanner;
import vista.VistaBanco;
import vista.VistaCajero;
import vista.VistaCliente;

/**
 *
 * @author Gus-Gus
 */
public class Cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        VistaBanco vistaBanco = new VistaBanco();
        VistaCliente vistaCliente = new VistaCliente();
        VistaCajero vistaCajero = new VistaCajero();
        int opc = 0;
        do {  
            System.out.println("Generador de Turno");
            System.out.println("1. Banco");
            System.out.println("2. Cliente");
            System.out.println("3. Cajero");
            opc = teclado.nextInt();
            switch(opc){
                case 1: vistaBanco.menu(); break;
                case 2: vistaCliente.menu(); break;
                case 3: vistaCajero.menu(); break;
            }
            
        } while (opc !=0);

    }
    
}
