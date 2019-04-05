/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueba;

import ec.edu.ups.clases.*;

/**
 *
 * @author Usuario
 */
public class Prueba {
    
    public static void main(String[] args){
    
        Sede sede=new Sede();
        Persona persona=new Persona();
        HistorialCalificaciones historial=new HistorialCalificaciones();
        Estudiante estudiante=new Estudiante();
        Profesor profeson =new Profesor();
        Carrera carrera=new Carrera();
        Materia materia =new Materia();
        Grupo grupo=new Grupo();
        
        
        sede.setCodigo(1250);
        sede.setNombre("campus central");
        sede.setDireccion("calle vieja");
        sede.setTelefono("20550025");
        
        System.out.println("codigo: "+sede.getCodigo());
        System.out.println("telefono: "+sede.getTelefono());
        System.out.println("direccion: "+sede.getDireccion());
        
    }
}
