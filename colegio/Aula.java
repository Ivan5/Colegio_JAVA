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
public class Aula {
    private Alumno[] alumnos;
    private Profesor profesor;
    private String idAula;

    public Aula() {
    }

    public Aula(Alumno[] alumnos, Profesor profesor, String idAula) {
        this.alumnos = alumnos;
        this.profesor = profesor;
        this.idAula = idAula;
    }

    
    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getIdAula() {
        return idAula;
    }

    public void setIdAula(String idAula) {
        this.idAula = idAula;
    }
    
    public double getNotaMedia(){
        double sumaTotal = 0.0;
        for(int i=0;i < this.getAlumnos().length;i++){
            if(alumnos[i] instanceof Delegado){
                Delegado delegado = (Delegado) alumnos[i];
                sumaTotal =sumaTotal+(0.1*delegado.getValoracion());
                sumaTotal = sumaTotal + alumnos[i].getNotaMedia();
            }else{
                sumaTotal = sumaTotal + alumnos[i].getNotaMedia();
            }
        }
        return sumaTotal/alumnos.length;
    }
    
    public void imprimeListadoAlumnos(){
        System.out.println("-------------------------------"+this.getIdAula()+"-----------------");
        for(int i=0;i<alumnos.length;i++){
            alumnos[i].imprime();
        }
        System.out.println("---------------------------------------------------------------------");
    }
    
    public Alumno mejorAlumno(){
        Alumno mejor = new Alumno();
        double mejorNota = 0.0;
        for(int i=0;i<alumnos.length;i++){
            if(alumnos[i].getNotaMedia() > mejorNota){
                mejorNota = alumnos[i].getNotaMedia();
                mejor = alumnos[i];
            }
        }
        return mejor;
    }
}
