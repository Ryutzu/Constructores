package coche;

/**
 *
 * @author OwlVirTech
 */
public class perrito {
    String raza, color, nombre;
    int edad;
    public perrito(){
        
    }

    public perrito(String raza, String color, String nombre, int edad) {
        this.raza = raza;
        this.color = color;
        this.nombre = nombre;
        this.edad = edad;
    }

    public perrito(String raza) {
        this.raza = raza;
    }

    public perrito(int edad) {
        this.edad = edad;
    }

    public perrito(String color, int edad) {
        this.color = color;
        this.edad = edad;
    }
    
    
    
}
