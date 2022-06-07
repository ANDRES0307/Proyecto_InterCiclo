/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Gus-Gus
 */
public class Cajero {
    
    private long id;
    private Banco banco;
    private String turno;
    private Date fecha;

    public Cajero(long id, Banco banco, String turno, Date fecha) {
        this.id = id;
        this.banco = banco;
        this.turno = turno;
        this.fecha = fecha;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Cajero{" + "id=" + id + ", banco=" + banco + ", turno=" + turno + ", fecha=" + fecha + '}';
    }
    
}
