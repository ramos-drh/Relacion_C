/*
Clase de prueba para ej 4, 10 y14
 */
package Ej4_10Y14_PuntoGeo_Song_Pers;


public class Prueba_Ej4_10Y14 {
    public static void main(String[] args) {
        
        //EJ 4 PUNTO GEOMÉTRICO
            //Probamos el constr por defecto
            PuntoGeometrico p1 = new PuntoGeometrico();
            System.out.println(p1.getCoordX() + " " + p1.getCoordY());

            //Probamos el constr parametrizado
            PuntoGeometrico p2 = new PuntoGeometrico(3.4, 5.7);
            System.out.println(p2.getCoordX() + " " + p2.getCoordY());

            //Probamos uno de los met set
            p1.setCoordX(3.1);
            System.out.println(p1.getCoordX() + " " + p1.getCoordY() + "\n");
            
        //EJ 10 CANCION

            //Probamos el constr por defecto
            Cancion cancion1 = new Cancion();
            
            System.out.println(cancion1.toString());
            
            Cancion cancion2 = new Cancion("Rocket", "Paul");
            
            System.out.println(cancion2.toString());
        
        //EJ 14 PERSONA
        
            
    }
}
