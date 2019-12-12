/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej19_Calculadora;

/**
 *
 * @author ramos-drh
 */
public class NumerosEnteros {
    int numeroEntero;
    
     //Sumar En el atr del obj guardamos atr += parámetro

    public void sumar(double numero){
        this.numeroEntero += numero;
    }
    
    public void restar(double numero){
        this.numeroEntero -= numero;
    }
    
    public void multiplciar(double numero){
        this.numeroEntero *= numero;
    }
    
    public double dividir(double numero){
        if(numero != 0){
            double solucion = this.numeroEntero/numero;
            return solucion;
        } else{
            return 0;
        }
    }
}
