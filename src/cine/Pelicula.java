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
public class Pelicula {
    private int añoEstreno;
    private boolean disponible;
    private int duracion;
    private GregorianCalendar fechaIngreso;
    private String nombre;
    private String tituloOriginal;

    public Pelicula(int añoEstreno, boolean disponible, int duracion, GregorianCalendar fechaIngreso, String nombre, String tituloOriginal) {
        this.añoEstreno = añoEstreno;
        this.disponible = disponible;
        this.duracion = duracion;
        this.fechaIngreso = fechaIngreso;
        this.nombre = nombre;
        this.tituloOriginal = tituloOriginal;
    }

    public int getAñoEstreno() {
        return this.añoEstreno;
    }

    public void setAñoEstreno(int añoEstreno) {
        this.añoEstreno = añoEstreno;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public GregorianCalendar getFechaIngreso() {
        return this.fechaIngreso;
    }

    public void setFechaIngreso(GregorianCalendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTituloOriginal() {
        return this.tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }
    
    public int calcularDuracionEnFuncion (HorarioFuncion horarioFuncion) {
        return this.duracion + horarioFuncion.getDuracionPublicidad() + 
                horarioFuncion.getDuracionIntervalo();
    }
    //esta disponible
//    public estaDisponible(){
//}
    //esta en cartelera
//    public boolean estaEnCartela(funcion funcion){
//    
//}
    //mostrar funciones hablilitada
//    mostrarFuncionesHabilitadas(){
//    }
    

    
}
