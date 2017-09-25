/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche;

/**
 *
 * @author Alumno
 */
public class avion {
    String nombre, aerolinea, dueno;
    int gasolina;
    
    public avion(){
        
    }

    public avion(String nombre, String aerolinea, String dueno, int gasolina) {
        this.nombre = nombre;
        this.aerolinea = aerolinea;
        this.dueno = dueno;
        this.gasolina = gasolina;
    }

    public avion(String nombre) {
        this.nombre = nombre;
    }
    
    public avion(String aerolinea, String nombre) {
        this.aerolinea = aerolinea;
        this.nombre = nombre;
    }
    public avion(int gaso){
        this.gasolina= gaso;
    }
    
    public avion(String aerolinea, String nombre, String dueno){
        this.nombre = nombre;
        this.aerolinea = aerolinea;
        this.dueno = dueno;
    }
}
