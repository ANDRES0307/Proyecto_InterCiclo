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
    private long id;
    private String nombre;
    private String apellido;
    private String numCedula;
    private String numCuenta;

    public Cliente(long id, String nombre, String apellido, String numCedula, String numCuenta) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numCedula = numCedula;
        this.numCuenta = numCuenta;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", numCedula=" + numCedula + ", numCuenta=" + numCuenta + '}';
    }
   
}
