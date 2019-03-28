package ec.edu.ups.pruebas;

import ec.edu.ups.clases.EstructuraPeriodico;
import ec.edu.ups.clases.Multimedia;
import ec.edu.ups.clases.Noticia;
import ec.edu.ups.clases.RedSocial;
import ec.edu.ups.clases.Seccion;
import java.sql.Date;

public class Prueba {

    public static void main(String[] args) {
        //Red Social.
        RedSocial facebook = new RedSocial();
        facebook.setCodigo(100);
        facebook.setNombre("Facebook");
        facebook.setUrl("www.facebook.com");

        int cod = facebook.getCodigo();
        System.out.println("Codigo: " + cod);

        String nombre = facebook.getNombre();
        System.out.println("Nombre: " + nombre);

        String url = facebook.getUrl();
        System.out.println("Url: " + url);

        //Multimedia
        Multimedia imagen = new Multimedia();
        imagen.setNombre("Imagen de paisaje");
        byte[] vectorBytes = {12, 6, 78, 4, 23, 5, 76, 1};
        imagen.setArchivo(vectorBytes);
        imagen.setFormato(".jpg");
        imagen.setTamañoBytes(300);
        imagen.setPath("pathx");

        String nombreImagen = imagen.getNombre();
        System.out.println("Nombre de imagen: " + nombreImagen);

        byte[] vectorB = imagen.getArchivo();
        System.out.println("Archivo: ");
        imprimirVectorByte(vectorB);

        String formato = imagen.getFormato();
        System.out.println("Formato: " + formato);

        int tamaño = imagen.getTamañoBytes();
        System.out.println("Tamaño: " + tamaño);

        String path = imagen.getPath();
        System.out.println("Path: " + path);

        //Noticia
        Noticia primeraNoticia = new Noticia();
        primeraNoticia.setTitulo("Empieza el torneo de futbol");
        primeraNoticia.setAutor("Eduardo Ayora");
        primeraNoticia.setContenido("El equipo A tras una mala semana a bajado a la tercera posicion de la tabla.");
        Date fecha = null;
        primeraNoticia.setFecha(fecha);
        Multimedia imagenes[] = new Multimedia[3];
        primeraNoticia.setImagenes(imagenes);

        String titulo = primeraNoticia.getTitulo();
        System.out.println("Titulo: " + titulo);

        String autor = primeraNoticia.getAutor();
        System.out.println("Autor: " + autor);

        String contenido = primeraNoticia.getContenido();
        System.out.println("Contendido: " + contenido);

        Date fechaActual = primeraNoticia.getFecha();
        System.out.println("Fecha: " + fechaActual);

        Multimedia vectorImagen[] = primeraNoticia.getImagenes();
        System.out.println("Imagenes:");
        imprimirVectorImagenes(vectorImagen);

        //Seccion
        Seccion deportes = new Seccion();
        deportes.setNombre("Deportes");
        Noticia[] noticia = new Noticia[5];
        deportes.setNoticia(noticia);

        String nombreSeccion = deportes.getNombre();
        System.out.println("Nombre de seccion: " + nombreSeccion);

        Noticia[] vectorNoticia = deportes.getNoticia();
        System.out.println("Noticias: ");
        imprimirVectorNoticias(vectorNoticia);

        //Estructura Periodico
        EstructuraPeriodico estructura = new EstructuraPeriodico();
        estructura.setNombrePeriodico("ActualidadEcuador.com");
        estructura.setUbicacion("Ecuador, Cuenca");
        estructura.setFecha(fecha);
        Seccion[] seccion = new Seccion[5];
        estructura.setSeccion(seccion);

        String nombrePeriodico = estructura.getNombrePeriodico();
        System.out.println("Nombre del Periodico: " + nombrePeriodico);

        String ubicacion = estructura.getUbicacion();
        System.out.println("Ubicacion: " + ubicacion);

        Date fechaPeriodico = estructura.getFecha();
        System.out.println("Fecha de periodico: " + fechaPeriodico);

        Seccion[] vectorSeccion = estructura.getSeccion();
        System.out.println("Secciones:");
        imprimirVectorSeccion(vectorSeccion);

    }

    public static void imprimirVectorByte(byte[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + "   ");
        }
        System.out.println();
    }

    public static void imprimirVectorImagenes(Multimedia[] vectorImagen) {
        for (int i = 0; i < vectorImagen.length; i++) {
            System.out.print(vectorImagen[i] + "   ");
        }
        System.out.println();
    }

    public static void imprimirVectorNoticias(Noticia[] vectorNoticia) {
        for (int i = 0; i < vectorNoticia.length; i++) {
            System.out.print(vectorNoticia[i] + "   ");
        }
        System.out.println();
    }

    public static void imprimirVectorSeccion(Seccion[] vectorSeccion) {
        for (int i = 0; i < vectorSeccion.length; i++) {
            System.out.print(vectorSeccion[i] + "   ");
        }
        System.out.println();
    }

}
