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
public class Delegado extends Alumno{
    private double valoracion;

    public Delegado() {
    }

    
    public Delegado(double valoracion, String nombre, String apellido, String DNI, String curso, double notaMedia) {
        super(nombre, apellido, DNI, curso, notaMedia);
        this.valoracion = valoracion;
    }

    
    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }
    
    
}
