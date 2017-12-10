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
    private ArrayList<Sala> salas;
    private ArrayList<HorarioFuncion> horariosFunciones;
    private ArrayList<Programacion> programaciones;
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

    public ArrayList<Sala> getSalas() {
        return this.salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    public ArrayList<HorarioFuncion> getHorariosFunciones() {
        return this.horariosFunciones;
    }

    public void setHorariosFunciones(ArrayList<HorarioFuncion> horariosFunciones) {
        this.horariosFunciones = horariosFunciones;
    }

    public ArrayList<Programacion> getProgramaciones() {
        return this.programaciones;
    }

    public void setProgramaciones(ArrayList<Programacion> programaciones) {
        this.programaciones = programaciones;
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
/*@Override
    public String toString () {
        // creamos una instancia del formateador de fechas
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/y");
        
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre del Cine: ").append(nombre).append(" - Dirección: ").append(direccion).append("\n");
        sb.append("Fecha Inauguración: ").append(sdf.format(fechaInauguracion)).append(" - Precio de la Entrada: $").append(precioEntrada).append("\n");
        sb.append("Salas: \n");
        
        // iteramos sobre las salas del cine
        Iterator<Sala> salasIt = salas.iterator();
        while (salasIt.hasNext()) {
            // llama automaticamenticamente al método toString() de la Sala
            sb.append(salasIt.next()).append("\n"); 
        }
        
        // iteramos sobre los horarios posibles de las funciones
        Iterator<HorarioFuncion> horariosIt = horariosFunciones.iterator();
        while (horariosIt.hasNext()) {
            // llama automaticamenticamente al método toString() de HorarioFuncion
            sb.append(horariosIt.next()).append("\n");
        }
        
        // agregamos las programacion vigente de este Cine
        sb.append("Programación vigente: \n").append(obtenerProgramacionVigente().toString());
        
        // devolvemos toda la cadena de texto resultante
        return sb.toString();
    }*/
}
