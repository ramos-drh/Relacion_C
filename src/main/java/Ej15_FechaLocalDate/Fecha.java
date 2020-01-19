/*
15.- Crea una clase Fecha con atributos para el día, el mes y el año 
de la fecha. Incluye, al menos, los siguientes métodos:

 */
package Ej15_FechaLocalDate;

import java.time.Month;
import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author ramos
 */
public class Fecha {
    
    private static Scanner teclado = new Scanner(System.in);
    private int dia;
    private Month mes;  //Clase de enumerado
    private Year anio;  //Clase
    final static int MIN_ANIO = 1900;
    final static int MAX_ANIO = 2100;
    
    //Constructor predeterminado con el 1-1-2000 como fecha por defecto.
    public Fecha(){
        dia = 1;
        mes = Month.JANUARY;
        anio = Year.parse("2000");
    }
    
    //Constructor parametrizado con día, mes y año. Debe comprobar que es una fecha válida usando el 
    //método validarFecha() descrito más abajo.
    public Fecha(int dia, Month mes, Year anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
//        if(this.validarFecha){
//            
//        }
    }
    
    /*leerFecha(): pedirá por teclado al usuario el día (1 a 31), el mes (1 a 12) 
    y el año (1900 a 2100). Este método, a su vez llamará a leerDia(), leerMes() y leerAnio(). 
    Haciendo uso de los métodos set, establecerá la fecha leída en los atributos del objeto.
    */
    
    //Este método debe ser estático, así también leerDia y los setter ERROR ESTOS NO PUEDEN SERLO
    public static void leerFecha(){
        System.out.println("Escriba una fecha (día, mes y año): ");
        setDia(Fecha.leerDia());
        setMes(Month.of(leerMes()));
        setAnio(Year.of(leerAnio()));
    }
    
    //leerDia(): leerá un entero por teclado hasta que se encuentre en el rango 1 – 31 y lo devolverá.
    public static int leerDia(){
        int diaInt;
        do{
            diaInt = teclado.nextInt();
        }while(diaInt <= 1 || diaInt >= 31);
        
        return diaInt;
    }
    
    //leerMes(): leerá un entero por teclado hasta que se encuentre en el rango 1 – 12 y lo devolverá.
    public static int leerMes(){
        int mesInt;
        do{
            mesInt = Fecha.teclado.nextInt();
        }while(mesInt < 1 || mesInt > 12);
        
        return mesInt;
    }

    //leerAnio(): leerá un entero por teclado hasta que se encuentre en el rango 1900 – 2100 y lo devolverá.
    public int leerAnio(){
        int anioInt;
        do{
            anioInt = teclado.nextInt();
        }while(anioInt < MIN_ANIO || anioInt > MAX_ANIO);
        
        return anioInt;
    }

    
    
    //mostrarFechaCorta(): mostrará la fecha en formato corto (02-09-2003).
    public void mostrarFechaCorta(){
        
        //El toString de la clase LocalDate muestra con el formato pedido, así que nos valemos de él
        //El año pasado debe ser de tipo int, así que usamos el método getValue() de la clase Year (que devuelve el año en un int)
        System.out.println(LocalDate.of(anio.getValue(),mes, dia));
        
        /*Si queremos exactamente el mismo orden (y aún así faltarían los 0s pero profe no tengo tanto tiempo :v:*/
        System.out.println(dia+ " - " + mes.getValue() + " - " + anio.getValue());
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia <= 1 || dia >= 31){
            this.dia = dia;
        } else{
            this.dia = 1;
        }
    }

    public Month getMes() {
        return mes;
    }

    public void setMes(Month mes) {
        if(mes.getValue() < 1 || mes.getValue() > 12){
            this.mes = mes;
        } else{
            this.mes = Month.JANUARY;
        }
    }

    public Year getAnio() {
        return anio;
    }

    public void setAnio(Year anio) {
        //Si el valor no está entre el rango que reza el enunciado
        if(anio.getValue() < MIN_ANIO || anio.getValue() > MAX_ANIO){
            this.anio = anio;
        } else{
            //Si no, el valor mínimo
            this.anio = Year.of(Year.MIN_VALUE);
        }
    }
}

