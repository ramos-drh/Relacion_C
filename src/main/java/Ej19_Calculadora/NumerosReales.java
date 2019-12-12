/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej19_Calculadora;


public class NumerosReales {
   
    
    double numeroReal;
    
     //Sumar En el atr del obj guardamos atr += parámetro

    public void sumar(double numero){
        this.numeroReal += numero;
    }
    
    public void restar(double numero){
        this.numeroReal -= numero;
    }
    
    public void multiplciar (double numero){
        this.numeroReal *= numero;
    }
    
    public double dividir(double numero){
        if(numero != 0){
            double solucion = this.numeroReal/numero;
            return solucion;
        } else{
            return 0;
        }
    }
}
