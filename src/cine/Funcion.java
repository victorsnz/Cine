/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.ArrayList;

/**
 *
 * @author Victor Sanchez
 */

public class Funcion {
    private String diaSemana;
    private int duracion;
    private int horaInicio;
    private int numero;
     private Sala sala;                   //cambio linea 17 funcion
    private ArrayList<Entrada> entradas; //cambio linea 18 funcion

    // Constructor
    public Funcion(String diaSemana, int duracion, int horaInicio, int numero,
                   Sala sala, ArrayList<Entrada> entradas ) {
        this.diaSemana = diaSemana;
        this.duracion = duracion;
        this.horaInicio = horaInicio;
        this.numero = numero;
        this.sala = sala;
        this.entradas = entradas;
    }
    
    // Constructor
    public Funcion(String diaSemana, int duracion, int horaInicio, int numero,
                   Sala sala, Entrada entrada ) {
        this.diaSemana = diaSemana;
        this.duracion = duracion;
        this.horaInicio = horaInicio;
        this.numero = numero;
        this.sala = sala;
        this.entradas = new ArrayList<>();
        this.addEntrada(entrada);
    }

     public void addEntrada(Entrada entrada) {
        this.entradas.add(entrada);
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
    
    //cambio linea 58 funcion
    public Sala getSala() {
        return this.sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    //linea 66
     public ArrayList<Entrada> getEntradas() {
        return this.entradas;
    }

    public void setEntradas(ArrayList<Entrada> entradas) {
        this.entradas = entradas;
    }
    
    @Override
    public String toString() {
        return "Datos de la función: " + "Falta de hacer";
    }
    
//    //Calcular disponibilidad
//    public int calcularDisponibilidad (){ 
        //return this.capacidadSala()
//    
//    //Capacidad Sala
//    public int capacidadSala(){
//    }
    
    //Esta en Curso
//    public boolean estaEnCurso(){
//        if(this.getHoraInicio > )
//    }
//     public boolean hayLugar() {
//        return true;   
}