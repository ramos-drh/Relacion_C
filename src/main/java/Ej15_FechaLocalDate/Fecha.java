/*
15.- Crea una clase Fecha con atributos para el día, el mes y el año 
de la fecha. Incluye, al menos, los siguientes métodos:

 */
package Ej15_FechaLocalDate;

import java.time.Month;
import java.time.LocalDate;
import java.time.Year;

/**
 *
 * @author ramos
 */
public class Fecha {
    
    byte dia;
    Month mes;  //Clase de enumerado
    Year anio;  //Clase
    
    //Constructor predeterminado con el 1-1-2000 como fecha por defecto.
    public Fecha(){
        dia = 1;
        mes = mes.JANUARY;
        anio = Year.parse("2000");
    }
    
}
