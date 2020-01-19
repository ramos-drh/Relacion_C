/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej15_FechaLocalDate;

import java.time.Month;
import java.time.Year;

/**
 *
 * @author ramos
 */
public class Prueba_Ej15Fecha {
    public static void main(String[] args) {
        Fecha f1 = new Fecha();
        Fecha f2 = new Fecha(26, Month.MARCH, Year.of(1999));
    
        f1.mostrarFechaCorta();
        f2.mostrarFechaCorta();
        
        Fecha.leerFecha();
    }
}

