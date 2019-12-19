/*
4. Crea la clase PuntoGeometrico que permita 
gestionar coordenadas (x,y) en un plano de dos dimensiones. 
Esas coordenadas serán números reales. 
Incluye los siguientes métodos: constructores 
(por defecto y parametrizado) y métodos get y set.
 */
package com.mycompany.ej4relcpuntogeom;

public class PuntoGeometrico {

    private double coordX;
    private double coordY;

    //Constructor por defecto
    public PuntoGeometrico() {

    }

    public PuntoGeometrico(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public double getCoordX() {
        return coordX;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    @Override
    public String toString() {
        return "(" +  coordX + ", "+ coordY + ')';
    }
    
}
