
package ec.edu.ups.clases;

import java.sql.Date;


public class EstructuraPeriodico {
    
    private String nombrePeriodico;
    private String ubicacion;
    private Seccion seccion[];
    private Date fecha;

    public String getNombrePeriodico() {
        return this.nombrePeriodico;
    }

    public void setNombrePeriodico(String nombrePeriodico) {
        this.nombrePeriodico = nombrePeriodico;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Seccion[] getSeccion() {
        return this.seccion;
    }

    public void setSeccion(Seccion[] seccion) {
        this.seccion = seccion;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
