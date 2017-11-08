/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.GregorianCalendar;

/**
 *
 * @author Usuario
 */
public class Entrada {
    private GregorianCalendar fechaHoraFuncion;
    private GregorianCalendar fechaHoraVenta;
    private float precioCobrado;
    private int ticketNro;

    public Entrada(GregorianCalendar fechaHoraFuncion, GregorianCalendar fechaHoraVenta, float precioCobrado, int ticketNro) {
        this.fechaHoraFuncion = fechaHoraFuncion;
        this.fechaHoraVenta = fechaHoraVenta;
        this.precioCobrado = precioCobrado;
        this.ticketNro = ticketNro;
    }

    public GregorianCalendar getFechaHoraFuncion() {
        return this.fechaHoraFuncion;
    }

    public void setFechaHoraFuncion(GregorianCalendar fechaHoraFuncion) {
        this.fechaHoraFuncion = fechaHoraFuncion;
    }

    public GregorianCalendar getFechaHoraVenta() {
        return this.fechaHoraVenta;
    }

    public void setFechaHoraVenta(GregorianCalendar fechaHoraVenta) {
        this.fechaHoraVenta = fechaHoraVenta;
    }

    public float getPrecioCobrado() {
        return this.precioCobrado;
    }

    public void setPrecioCobrado(float precioCobrado) {
        this.precioCobrado = precioCobrado;
    }

    public int getTicketNro() {
        return this.ticketNro;
    }

    public void setTicketNro(int ticketNro) {
        this.ticketNro = ticketNro;
    }
    
//    public boolean estaAnulada(Funcion f){
//        return (!f.equals(this.getFuncion())) && 
//               (this.getFechaHoraFuncion().before(Calendar.getInstance));  
//    }
}
