package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Banco;

/**
 *
 * @author Andres
 */
public class ControladorBanco {

    private List<Banco> listaBanco;

    public ControladorBanco() {
        listaBanco = new ArrayList();
    }

    public long generarId() {
        if (!listaBanco.isEmpty()) {
            return listaBanco.get(listaBanco.size() - 1).getId() + 1;
        }
        return 1;

    }
    
    public boolean crear(Banco banco){
        return listaBanco.add(banco);
    }
    
    public Banco leer(long id){
        return listaBanco.stream().filter(lec -> lec.getId() == id).findFirst().get();
    }
    public boolean actualizar(Banco banco){
        int posicion = listaBanco.indexOf(leer(banco.getId()));
        return listaBanco.set(posicion, banco) != null;
    }
    public boolean eliminar(Banco banco){
        return listaBanco.remove(banco);
    }

    public List<Banco> getListaBanco() {
        return listaBanco;
    }

    public void setListaBanco(List<Banco> listaBanco) {
        this.listaBanco = listaBanco;
    }

}
