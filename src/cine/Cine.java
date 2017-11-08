/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author Usuario
 */
public class Cine {
    private String direccion;
    private GregorianCalendar fechaInigauracion;
    private String nombre;
    private float precioEntrada;

    public Cine(String direccion, GregorianCalendar fechaInigauracion, String nombre, float precioEntrada) {
        this.direccion = direccion;
        this.fechaInigauracion = fechaInigauracion;
        this.nombre = nombre;
        this.precioEntrada = precioEntrada;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public GregorianCalendar getFechaInigauracion() {
        return this.fechaInigauracion;
    }

    public void setFechaInigauracion(GregorianCalendar fechaInigauracion) {
        this.fechaInigauracion = fechaInigauracion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecioEntrada() {
        return this.precioEntrada;
    }

    public void setPrecioEntrada(float precioEntrada) {
        this.precioEntrada = precioEntrada;
    }
    
    public String mostrarCine(){
        String dev = "Direccion: "+this.getDireccion()+
                "\nFecha de inauguracion: "+this.getFechaInigauracion()+
                "\nNombre: "+this.getNombre()+
                "\nPrecio Entrada: "+this.getPrecioEntrada();
        return dev;
    }
    
// //Mostrar info horarios Funcion    
//    @Override
//    public String toString(){
        
//    }
}
