/*
Rueda: con métodos para inflar la rueda y desinflarla.
 */
package Ej11_Motor;


public class Rueda {
    
    private boolean inflada;
    
    public Rueda(){
        
    }
    
    public void inflarRueda(){
        this.inflada = true;
    }
    
    public void desinflarRueda(){
        this.inflada = false;
    }
}
