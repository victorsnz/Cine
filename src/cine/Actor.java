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
public class Actor {
    private boolean animado;
    private String apellido;
    private String nombre;

    public Actor(boolean animado, String apellido, String nombre) {
        this.animado = animado;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public boolean isAnimado() {
        return this.animado;
    }

    public void setAnimado(boolean animado) {
        this.animado = animado;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
    
    
}
