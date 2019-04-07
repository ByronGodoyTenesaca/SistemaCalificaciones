/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*crear dos profesores, 4 estudiantes, 2 grupos
    agregar 2 materias a cada carrera
    en materia agregar un gupo y un profesor

*/
package ec.edu.ups.prueba;

import ec.edu.ups.clases.*;
import java.awt.BorderLayout;
   

/**
 *
 * @author Usuario
 */
public class Prueba {
    
    public static void main(String[] args){
    
        
       
        Sede cuenca=new Sede(1, "campus central", "calle vieja", "20114421");
        Carrera computacion=new Carrera(1, "computacion", 10, 40, "Ing. ciendias de la computacion");
        Carrera electricidad=new Carrera(2, "electricidad", 10, 40, "ing. electrico");
        Carrera contabilidad=new Carrera(3, "contabilidad", 8, 40, "contadora");
        
        Materia calculo=new Materia(1, "Calculo de una variable", 3, 180, 1);
        Materia algebra=new Materia(2, "Algebra lineal", 4, 80, 1);
        Materia electronica=new Materia(3, "Electronica", 5, 100, 3);
        Materia expresionOral=new Materia(4, "Expresion oral y escrita", 2, 80, 2);
        Materia ecuaciones=new Materia(5, "Ecuaciones diferenciales", 5, 240, 3);
        Materia fisica=new Materia(6, "Fisica", 4, 120, 2);
        
        Profesor jenifer=new Profesor("ing en sistemas", 2000, "docente", 0, "Jenifer Yepez", "0215406512", "023115632", "racar", "anafkjfn");
        Profesor paola=new Profesor("ing en sistemas", 2103.10, "docente", 2, "Paola Ingavelez", "0102175151", "02015120518", "baños", "bbdabdkjand");
        
        Estudiante byron=new Estudiante(1, "Byron", "0107377020", "096874", "Ricaurte", "byron@hotmail.com");
        Estudiante jonatan=new Estudiante(2, "Jonathan", "056156165", "26262662", "sidcay", "camcioaefnia");
        Estudiante javier=new Estudiante(3, "Javier", "0101472052", "20125151", "Ricaurte", "javier1@hotail.com|");
        Estudiante vinicio=new Estudiante(4, "Vinicio", "01258415", "2013481", "Sinincay", "vnijnisvn skjv");
        
        Grupo uno=new Grupo(1, "ciencias exactas", 40);
        Grupo dos=new Grupo(2, "profesional", 40);
        
        HistorialCalificacionesEstudiante historial=new HistorialCalificacionesEstudiante( algebra, 20, 8, 10, 20, byron);
        
     
        cuenca.agregarCarrera(computacion);
        cuenca.agregarCarrera(electricidad);
        cuenca.agregarCarrera(contabilidad);
        
        computacion.agregarMateria(calculo);
        computacion.agregarMateria(algebra);
        electricidad.agregarMateria(electronica);
        electricidad.agregarMateria(expresionOral);
        contabilidad.agregarMateria(ecuaciones);
        contabilidad.agregarMateria(fisica);
        
        calculo.setGrupo(uno);
        algebra.setGrupo(uno);
        electronica.setGrupo(uno);
        expresionOral.setGrupo(dos);
        ecuaciones.setGrupo(dos);
        fisica.setGrupo(dos);
        
        calculo.setProfesor(paola);
        algebra.setProfesor(paola);
        electronica.setProfesor(paola);
        expresionOral.setProfesor(jenifer);
        ecuaciones.setProfesor(jenifer);
        fisica.setProfesor(jenifer);
        

        //byron.agregarEstudiante(historial);
        System.out.println(cuenca);
        cuenca.imprimir();
        
    }
}
