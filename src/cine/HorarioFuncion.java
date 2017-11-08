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
public class HorarioFuncion {
    private int diaDeSemana;
    private int duracionIntervalo;
    private int duracionPublicidad;
    private boolean esTrasnoche;
    private int horaPrimeraFuncion;
    private int horaUltimaFuncion;

    public HorarioFuncion(int diaDeSemana, int duracionIntervalo,
                          int duracionPublicidad, boolean esTrasnoche,
                          int horaPrimeraFuncion, int horaUltimaFuncion) {
        this.diaDeSemana = diaDeSemana;
        this.duracionIntervalo = duracionIntervalo;
        this.duracionPublicidad = duracionPublicidad;
        this.esTrasnoche = esTrasnoche;
        this.horaPrimeraFuncion = horaPrimeraFuncion;
        this.horaUltimaFuncion = horaUltimaFuncion;
    }

    public int getDiaDeSemana() {
        return this.diaDeSemana;
    }

    public void setDiaDeSemana(int diaDeSemana) {
        this.diaDeSemana = diaDeSemana;
    }

    public int getDuracionIntervalo() {
        return this.duracionIntervalo;
    }

    public void setDuracionIntervalo(int duracionIntervalo) {
        this.duracionIntervalo = duracionIntervalo;
    }

    public int getDuracionPublicidad() {
        return this.duracionPublicidad;
    }

    public void setDuracionPublicidad(int duracionPublicidad) {
        this.duracionPublicidad = duracionPublicidad;
    }

    public boolean isEsTrasnoche() {
        return this.esTrasnoche;
    }

    public void setEsTrasnoche(boolean esTrasnoche) {
        this.esTrasnoche = esTrasnoche;
    }

    public int getHoraPrimeraFuncion() {
        return this.horaPrimeraFuncion;
    }

    public void setHoraPrimeraFuncion(int horaPrimeraFuncion) {
        this.horaPrimeraFuncion = horaPrimeraFuncion;
    }

    public int getHoraUltimaFuncion() {
        return this.horaUltimaFuncion;
    }

    public void setHoraUltimaFuncion(int horaUltimaFuncion) {
        this.horaUltimaFuncion = horaUltimaFuncion;
    }
    
    @Override
    public String toString(){
        String dev = "Los horarios para el día "+this.getDiaDeSemana() 
                     +"son: ";
        dev += "\nDuracion del intervalo: "+this.getDuracionIntervalo();
        dev += "\nDuracion de la publicidad: "+this.getDuracionPublicidad();
        dev += "\nAcepta trasnoche: "+this.isEsTrasnoche();
        dev += "\nHorario de la primera funcion: "+this.getHoraPrimeraFuncion();
        dev += "\nHorario de la ultima funcion: "+this.getHoraUltimaFuncion();
        return dev;
    }    
}
