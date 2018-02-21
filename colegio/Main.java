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
public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juan","Perez","6565sa","Tercero",9.8);
        Alumno[] alumnos = new Alumno[1];
        alumnos[0] = alumno1;
        Profesor profesor1 = new Profesor();
        Aula aula1 = new Aula(alumnos,profesor1,"101");
        aula1.imprimeListadoAlumnos();
    }
}
