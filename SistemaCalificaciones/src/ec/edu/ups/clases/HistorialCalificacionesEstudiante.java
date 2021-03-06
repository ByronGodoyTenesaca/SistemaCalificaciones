/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author Usuario
 */

// crear 4 lista de historial calificacion 
public class HistorialCalificacionesEstudiante {
    
    private Materia materia;
    private int aprovechamiento1;
    private int examen1;
    private int aprovechamiento2;
    private int examen2;
    Estudiante estudiante;

    public HistorialCalificacionesEstudiante(Materia materia, int aprovechamiento1, int examen1, int aprovechamiento2, int examen2, Estudiante estudiante) {
        this.materia = materia;
        this.aprovechamiento1 = aprovechamiento1;
        this.examen1 = examen1;
        this.aprovechamiento2 = aprovechamiento2;
        this.examen2 = examen2;
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "HistorialCalificacionesEstudiante{" + "materia=" + materia + ", aprovechamiento1=" + aprovechamiento1 + ", examen1=" + examen1 + ", aprovechamiento2=" + aprovechamiento2 + ", examen2=" + examen2 + ", estudiante=" + estudiante + '}';
    }
    
    

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Estudiante getEstudiante() {
 
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public int getAprovechamiento1() {
        return aprovechamiento1;
    }

    public void setAprovechamiento1(int aprovechamiento1) {
        this.aprovechamiento1 = aprovechamiento1;
    }

    public int getExamen1() {
        return examen1;
    }

    public void setExamen1(int examen1) {
        this.examen1 = examen1;
    }

    public int getAprovechamiento2() {
        return aprovechamiento2;
    }

    public void setAprovechamiento2(int aprovechamiento2) {
        this.aprovechamiento2 = aprovechamiento2;
    }

    public int getExamen2() {
        return examen2;
    }

    public void setExamen2(int examen2) {
        this.examen2 = examen2;
    }
    
    
}
