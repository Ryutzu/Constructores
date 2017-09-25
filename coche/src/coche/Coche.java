package coche;

/**
 *
 * @author OwlVirTech
 */
public abstract class  Coche{
    int color= 0;
    int gasolina= 0;
    
    public static void main(String[] args) {
        
    }
    
    public Coche(){
        
    }
    
    public Coche(int color, int gaso){
        this.color= color;
        this.gasolina= gaso;
    }
    
    public void acelerar(){
        //Acelera
        
    }
    public void frenar(){
        //Frena
    }
    public void arrancar(){
        //Arranca
    }
}
