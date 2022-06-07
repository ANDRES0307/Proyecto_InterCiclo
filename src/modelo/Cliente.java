/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gus-Gus
 */
public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private long numCedula;
    private long numCuenta;

    public Cliente(int id, String nombre, String apellido, long numCedula, long numCuenta) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numCedula = numCedula;
        this.numCuenta = numCuenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(long numCedula) {
        this.numCedula = numCedula;
    }

    public long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(long numCuenta) {
        this.numCuenta = numCuenta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", numCedula=" + numCedula + ", numCuenta=" + numCuenta + '}';
    }
   
}
