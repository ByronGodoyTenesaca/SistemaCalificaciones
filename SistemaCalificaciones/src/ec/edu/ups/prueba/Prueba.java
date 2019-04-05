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
        
        
        
        persona.setCodigo(0215156330);
        persona.setCedula("0101248778");
        persona.setNombre("byron");
        persona.setCorreo("bmfsmfsmf");
        persona.setDireccion("ricaurte");
        persona.setSede(sede);
        persona.setTelefono("20515120");
        
        System.out.println("codigo: "+persona.getCodigo());
        System.out.println("cedula: "+persona.getCedula());
        System.out.println("nombre: "+persona.getNombre());
        System.out.println("correo: "+persona.getCorreo());
        System.out.println("direccion: "+ persona.getDireccion());
        System.out.println("sede: "+persona.getSede());
        System.out.println("telefono: "+persona.getTelefono());
        
        
        historial.setEstudiante(estudiante);
        historial.setMateria(materia);
        historial.setAprovechamiento1(50);
        historial.setExamen1(2);
        historial.setAprovechamiento2(40);
        historial.setExamen2(5);
    }
}
