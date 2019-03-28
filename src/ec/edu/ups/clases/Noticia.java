
package ec.edu.ups.clases;

import java.sql.Date;


public class Noticia {
    
    private String titulo;
    private String autor;
    private Date fecha;
    private String contenido;
    private Multimedia imagenes[];

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return this.contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Multimedia[] getImagenes() {
        return this.imagenes;
    }

    public void setImagenes(Multimedia[] imagenes) {
        this.imagenes = imagenes;
    }
    
    
    
}
