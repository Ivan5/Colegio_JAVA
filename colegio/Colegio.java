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
public class Colegio {
    private Aula[] aulas;
    private Director director;
    private String nombreColegio;

    public Colegio() {
    }

    public Colegio(Aula[] aulas, Director director, String nombreColegio) {
        this.aulas = aulas;
        this.director = director;
        this.nombreColegio = nombreColegio;
    }

    
    public Aula[] getAulas() {
        return aulas;
    }

    public void setAulas(Aula[] aulas) {
        this.aulas = aulas;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getNombreColegio() {
        return nombreColegio;
    }

    public void setNombreColegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
    }
    
    public double getNotaMediaTotal(){
        double sumaTotal = 0.0;
        for(int i=0;i<aulas.length;i++){
            sumaTotal = sumaTotal + aulas[i].getNotaMedia();
        }
        return (sumaTotal/aulas.length)*(this.getDirector().getValoracion() * 0.3);
    }
    
    public Alumno getMejorAlumnoColegio(){
        Alumno mejorAlumnoColegio = new Alumno();
        double mejorNota = 0.0;
        for(int i=0;i<aulas.length;i++){
            if(aulas[i].mejorAlumno().getNotaMedia() > mejorNota){
                mejorAlumnoColegio = aulas[i].mejorAlumno();
                mejorNota = aulas[i].mejorAlumno().getNotaMedia();
            }
        }
        
        return mejorAlumnoColegio;
    }
    
    public void imprimirEstadistica(){
        System.out.println("Resumen de las estadisticas del colegio "+this.getNombreColegio());
        Alumno mejorAlumnoColegio = new Alumno();
        System.out.print("El mejor alumno del colegio es: ");
        mejorAlumnoColegio = this.getMejorAlumnoColegio();
        mejorAlumnoColegio.imprime();
        
        if (this.getNotaMediaTotal() > 5.0) {
            System.out.println("El colegio esta listo para recibir la subencion con una nota media toral del : "+this.getNotaMediaTotal());
        }else{
            System.out.println("El colegio no esta listo para recibir la subencion con una nota media toral del : "+this.getNotaMediaTotal());

        }
        
    }
}
