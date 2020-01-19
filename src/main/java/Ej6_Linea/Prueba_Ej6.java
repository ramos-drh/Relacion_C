/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej6_Linea;

import com.mycompany.ej4relcpuntogeom.PuntoGeometrico;


public class Prueba_Ej6 {
    public static void main(String[] args) {
        Linea l1 = new Linea();
        System.out.println(l1);
        
        Linea l2 = new Linea(new PuntoGeometrico(3, 4), new PuntoGeometrico(7, 6));
        System.out.println(l2);
    }
}
