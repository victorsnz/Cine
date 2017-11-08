
package cine;

import java.util.GregorianCalendar;

/**
 *
 * @author Victor Sanchez
 */
public class Comentario {
    private String autor;
    private String descripcion;
    private GregorianCalendar fechaIngreso;

    public Comentario(String autor, String descripcion, GregorianCalendar fechaIngreso) {
        this.autor = autor;
        this.descripcion = descripcion;
        this.fechaIngreso = fechaIngreso;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public GregorianCalendar getFechaIngreso() {
        return this.fechaIngreso;
    }

    public void setFechaIngreso(GregorianCalendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
