/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej6_Linea;

//Yo importé la clase pero el profe la hizo de nuevo en el paquete
import com.mycompany.ej4relcpuntogeom.PuntoGeometrico;

public class Linea {

    //Composición de clases
    //Atributos de una clase objetos de otra
    private PuntoGeometrico puntoA;
    private PuntoGeometrico puntoB;

    //Constr por edefecto
    //crea una línea con sus dos puntos como (0,0) y (1,1).
    public Linea() {
        this.puntoA = new PuntoGeometrico(0, 0);
        this.puntoB = new PuntoGeometrico(1, 1);
    }

    public Linea(PuntoGeometrico puntoA, PuntoGeometrico puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    //Desplaza la línea a la derecha la distancia que se indique.
    public void mueveDerecha(double distancia) {
        //Es decir, variamos la coord X de ambos puntos
        this.puntoA.setCoordX(this.puntoA.getCoordX() + distancia);
        this.puntoB.setCoordX(this.puntoB.getCoordX() + distancia);
    }

    //Desplaza la línea a la izquierda la distancia que se indique.
    public void mueveIzquierda(double distancia) {
        //Es decir, variamos la coord X de ambos puntos
        this.puntoA.setCoordX(this.puntoA.getCoordX() - distancia);
        this.puntoB.setCoordX(this.puntoB.getCoordX() - distancia);
    }

    //Desplaza la línea hacia arriba la distancia que se indique.
    public void mueveArriba(double distancia) {
        //Es decir, variamos la coord X de ambos puntos
        this.puntoA.setCoordY(this.puntoA.getCoordY() + distancia);
        this.puntoB.setCoordY(this.puntoB.getCoordY() + distancia);
    }

    //Desplaza la línea hacia abajo la distancia que se indique.
    public void mueveAbajo(double distancia) {
        //Es decir, variamos la coord X de ambos puntos
        this.puntoA.setCoordY(this.puntoA.getCoordY() - distancia);
        this.puntoB.setCoordY(this.puntoB.getCoordY() - distancia);
    }
    
    public void mostrarLinea(){
        System.out.println(this.toString());
    }

    public PuntoGeometrico getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(PuntoGeometrico puntoA) {
        this.puntoA = puntoA;
    }

    public PuntoGeometrico getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(PuntoGeometrico puntoB) {
        this.puntoB = puntoB;
    }

    @Override
    public String toString() {
        //puntoA es (en este caso) como si pusiera puntoA.toString(); 
        //se puede observar en la clase de prueba
        return "[(" + puntoA.getCoordX() + "),(" + puntoA.getCoordY() + ") , "
                + "(" + puntoB.getCoordX() + "),(" + puntoB.getCoordY() + ")]";
    }
}
