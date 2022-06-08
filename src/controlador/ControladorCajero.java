 package controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import modelo.Cajero;

/**
 *
 * @author Andres
 */
public class ControladorCajero {

   List<Cajero>listaCajero;
    ControladorCliente controladorCliente;
    Random random;
    
    public ControladorCajero(){
        random=new Random();
        listaCajero=new ArrayList<>();
        controladorCliente=new ControladorCliente();
    }
    
    public long generarId(){
        if(!listaCajero.isEmpty()){
            return listaCajero.get(listaCajero.size()-1).getId()+1;
            
        }
        return 1;
    }

    
    public boolean crearCajero(Cajero nombre){
        return listaCajero.add(nombre);
    }
    
    public int listar(){
        for(Cajero cajero:listaCajero){
            System.out.println(cajero);
        }
        return 1;
    }
    
    public int listarCajerosDisponibles(){
        for(int i=0;i<listaCajero.size();i++){
            
        }
        System.out.println(listaCajero.size());
        return 1;
    }
    
     public Cajero buscarCajero(long Id){
        for(Cajero cajero:listaCajero){
            if(cajero.getId()==Id){
                return cajero;
            }
        }
        return null;
    }
     
    public int numeroClientesAtendidos(){
        for(Cajero cajero:listaCajero){
            cajero.setClientesAtendidos(10);
        }
        return 10;
   }

    public List<Cajero> getListaCajero() {
        return listaCajero;
    }

    public void setListaCajero(List<Cajero> listaCajero) {
        this.listaCajero = listaCajero;
    }

    public ControladorCliente getControladorCliente() {
        return controladorCliente;
    }

    public void setControladorCliente(ControladorCliente controladorCliente) {
        this.controladorCliente = controladorCliente;
    }
    
    public boolean ordenarCajerosPorClientesAtendidos(){
        
        return false;
    }

}