/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej12_Y_13Empleado;


public class PruebaEj13 {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado ();
        
        System.out.println(empleado1);
        
        Empleado empleado2 = new Empleado("09078878L", 950, 15, 6, 21, true, 2);
        
        System.out.println(empleado2);
        
        System.out.println("Horas extras realizadas: " + empleado2.getHorasExtrasRealizadas());
    }
}
