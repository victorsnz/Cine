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
public class Personaje {
    private String nombreEnPelicula;

    public Personaje(String nombreEnPelicula) {
        this.nombreEnPelicula = nombreEnPelicula;
    }

    public String getNombreEnPelicula() {
        return this.nombreEnPelicula;
    }

    public void setNombreEnPelicula(String nombreEnPelicula) {
        this.nombreEnPelicula = nombreEnPelicula;
    }  
}
