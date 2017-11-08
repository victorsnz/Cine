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
public class Programacion {
    private GregorianCalendar fechaFin;
    private GregorianCalendar fechaHoraCreada;
    private GregorianCalendar fechaInicio;

    public Programacion(GregorianCalendar fechaFin, 
                        GregorianCalendar fechaHoraCreada,
                        GregorianCalendar fechaInicio) {
        this.fechaFin = fechaFin;
        this.fechaHoraCreada = fechaHoraCreada;
        this.fechaInicio = fechaInicio;
    }

    public GregorianCalendar getFechaFin() {
        return this.fechaFin;
    }

    public void setFechaFin(GregorianCalendar fechaFin) {
        this.fechaFin = fechaFin;
    }

    public GregorianCalendar getFechaHoraCreada() {
        return this.fechaHoraCreada;
    }

    public void setFechaHoraCreada(GregorianCalendar fechaHoraCreada) {
        this.fechaHoraCreada = fechaHoraCreada;
    }

    public GregorianCalendar getFechaInicio() {
        return this.fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    

}
