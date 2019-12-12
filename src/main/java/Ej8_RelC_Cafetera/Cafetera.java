/*

 */
package Ej8_RelC_Cafetera;


public class Cafetera {
    //En cc
    private int capacidadMaxima;
    private int cantidadActual;
    
    //Constructor por defecto (sin parámetros)
    public Cafetera(){
        this.capacidadMaxima = 1000;
        //this.cantidadActual = 0;
        //Sse puede dejar sin inicializar porq es un tipo PRIMITIVO. CON OBJ NO QUE APUNTA A NULL
        //Y PUEDE DAR PROBLEMAS (exception nullpointer)
    }
    
    //Constructor con capMax solo como parámretro
    public Cafetera(int capMax){
        this.cantidadActual = capMax;
        //Me faltó:
        this.capacidadMaxima = capMax;
    }
    
    //Constructor con ambos parámetros
    public Cafetera(int capMax, int cantActual){
        this.capacidadMaxima = capMax;
        //Si la cantidad actual es mayor que la capacidad
        if(this.cantidadActual > this.capacidadMaxima){
            this.cantidadActual = this.capacidadMaxima;
        }else{
            this.cantidadActual = cantActual;
        }

    }
    
    public void llenarCafetera(){
        this.cantidadActual = this.capacidadMaxima;
    }
    
    //Sirve la cantIndicada a una taza => se le resta esa cant a la cantidadActual
    public void servirTaza(int cantIndicada){
        //Si la cantServida es menor que la cantActual
        if(cantIndicada < this.cantidadActual){
            this.cantidadActual -= cantIndicada;
        } else{
            this.cantidadActual = 0;
        }
        
    }
    
    public void vaciarCafetera(){
        this.cantidadActual = 0;   
    }
    
    //Le añade a la cafetera la cantAnadida
    public void agregarCafe(int cantAnadida){
        //Si la suma de la actual y la añadida es menor a la máxima, la añadimos
        if(cantidadActual + cantAnadida < this.capacidadMaxima){
            this.cantidadActual += cantAnadida;
        } else{
            this.cantidadActual = this.capacidadMaxima;
        }
        
    }
}
