/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

/**
 *
 * @author Usuario
 */
public class Funcion {
    private String diaSemana;
    private int duracion;
    private int horaInicio;
    private int numero;

    public Funcion(String diaSemana, int duracion, int horaInicio, int numero) {
        this.diaSemana = diaSemana;
        this.duracion = duracion;
        this.horaInicio = horaInicio;
        this.numero = numero;
    }

    public String getDiaSemana() {
        return this.diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getHoraInicio() {
        return this.horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
//    //Calcular disponibilidad
//    public int calcularDisponibilidad (){    
//    }
//    
//    //Capacidad Sala
//    public int capacidadSala(){
//    }
    
    //Esta en Curso
//    public boolean estaEnCurso(){
//        if(this.getHoraInicio > )
//    }
    
}
