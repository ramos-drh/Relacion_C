/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1_Y_2;


public class EjComplejos_Prueba {
    public static void main(String[] args) {
        Complejo c1 = new Complejo();
        
        //Constructor por defecto
        System.out.println(c1);
        
        //Constructor parametrizado
        Complejo c2 = new Complejo(5, 4);
        System.out.println(c2);
        
        Complejo c3 = new Complejo(1, -3);
        //Suma con el método no estático
        //System.out.println(c2.sumar(c3));
        
        //Suma con el método estático
        System.out.println(Complejo.sumar(c2, c3));
        
        //Mult con el método no estático
        System.out.println(c2.multiplicar(c3));
        
        //Mult con el método estático
        System.out.println(Complejo.multiplicar(c2,c3));
        
        //Div con el método no estático
        System.out.println(c2.division(c3));
        
        //Div con el método estático
        System.out.println(Complejo.division(c2,c3));
    }
}
