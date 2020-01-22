/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej17_Hora;

/**
 *
 * @author ramos-drh
 */
public class Ej_17Prueba {

    public static void main(String[] args) {
        Hora hora1 = new Hora(23, 59, 59);

        System.out.println("La hora 1 es: ");
        hora1.escribirHora();

        System.out.println("Han pasado " + hora1.segundosDesde() + " segundos desde la media noche.");

        System.out.println("Quedan " + hora1.segundosHasta() + " segundos hasta la media noche.");
        
        Hora hora2 = new Hora(12, 20, 32);
        System.out.println("La hora 2 es: ");
        hora2.escribirHora();
        
        System.out.println("Entre las horas 1 y 2 hay " + hora1.segundosEntreHoras(hora2) + " segundos.");

        System.out.println("Si pasa 1 segundo, la hora 1 será");
        hora1.siguiente();
        hora1.escribirHora();
        
        System.out.println("Si volvemos 1 segundo atrás, la hora 1 será");
        hora1.anterior();
        hora1.escribirHora();
        
        Hora hora3 = hora2.copia();
        System.out.println("El objeto hora3 es una copia de la hora2:");
        hora3.escribirHora();
        
        System.out.println("La variable hora1 es: ");
        hora1.escribirHora();
        System.out.println("La variable hora2 es: ");
        hora2.escribirHora();
        
        
        System.out.println("¿La hora 1 y 2 son iguales? " + hora1.igualQue(hora3));
        System.out.println("¿La hora 1 es mayor que la 2? " + hora1.mayorQue(hora3));
        System.out.println("¿La hora 1 es menor que la 2? " + hora1.menorQue(hora3));
    }
}
