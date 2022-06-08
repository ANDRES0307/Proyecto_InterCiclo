package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

/**
 *
 * @author Andres
 */
public class ControladorCliente {

    private List<Cliente> listaCliente;

    public ControladorCliente() {
        listaCliente = new ArrayList();
    }

    public long generarId() {
        if (!listaCliente.isEmpty()) {
            return listaCliente.get(listaCliente.size() - 1).getId() + 1;
        }
        return 1;
    }
    
    public boolean crear(Cliente cliente){
        return listaCliente.add(cliente);
    }
    
    public Cliente leer(long id){
        return listaCliente.stream().filter(lec -> lec.getId() == id).findFirst().get();
    }
    public boolean actualizar(Cliente cliente){
        int posicion = listaCliente.indexOf(leer(cliente.getId()));
        return listaCliente.set(posicion, cliente) != null;
    }
    public boolean eliminar(Cliente cliente){
        return listaCliente.remove(cliente);
    }

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

}
