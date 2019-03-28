package ec.edu.ups.clases;

public class Multimedia {

    private String nombre;
    private byte[] archivo;
    private String formato;
    private int tamañoBytes;
    private String path;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte[] getArchivo() {
        return this.archivo;
    }

    public void setArchivo(byte[] archivo) {
        this.archivo = archivo;
    }

    public String getFormato() {
        return this.formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getTamañoBytes() {
        return this.tamañoBytes;
    }

    public void setTamañoBytes(int tamañoBytes) {
        this.tamañoBytes = tamañoBytes;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
