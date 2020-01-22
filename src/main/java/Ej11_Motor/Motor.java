/*
Motor: con métodos para arrancar el motor y apagarlo.

Rueda: con métodos para inflar la rueda y desinflarla.

Ventana: con métodos para abrirla y cerrarla.

Puerta: con una ventana y métodos para abrir la puerta y cerrar la puerta.

Coche: con un motor, cuatro ruedas y dos puertas; con los métodos que te parezcan adecuados.
	
Inventa un atributo para cada clase, creando los constructores, métodos set y get.
 */
package Ej11_Motor;


public class Motor {
    
    private boolean arrancado;
    private String marca;

    public boolean getArrancado() {
        return arrancado;
    }

    public String getMarca() {
        return marca;
    }
    
    public Motor(){
        marca = "";
    }
    
    public void arrancarMotor(){
        this.arrancado = true;
    }
    
    public void apagarMotor(){
        this.arrancado = false;
    }
}
