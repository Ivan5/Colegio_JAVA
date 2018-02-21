/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

/**
 *
 * @author conve
 */
public class Alumno extends Persona{
    private String curso;
    private double notaMedia;

    public Alumno() {
    }

    public Alumno(String nombre,String apellido,String DNI,String curso, double notaMedia) {
        super(nombre,apellido,DNI);
        this.curso = curso;
        this.notaMedia = notaMedia;
       
    }
    
    

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    public void imprime(){
        super.imprime();
        System.out.print("Curso: "+this.getCurso()+" Nota Media: "+this.getNotaMedia());
    }
    
}
