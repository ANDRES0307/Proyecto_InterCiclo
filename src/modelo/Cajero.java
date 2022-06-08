/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gus-Gus
 */
public class Cajero {
    
    private long id;
    private String nombre;
    private int clientesAtendidos;
    private String turno;
    private List<Cliente>listaClientes;

    public Cajero(long id, String nombre, int clientesAtendidos, String turno) {
        this.id = id;
        this.nombre = nombre;
        this.clientesAtendidos = clientesAtendidos;
        this.turno = turno;
        this.listaClientes=new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    public int getClientesAtendidos() {
        return clientesAtendidos;
    }

    public void setClientesAtendidos(int clientesAtendidos) {
        this.clientesAtendidos = clientesAtendidos;
    }

    @Override
    public String toString() {
        return "Cajero{" + "id=" + id + ", nombre=" + nombre + ", clientesAtendidos=" + clientesAtendidos + '}';
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
}
