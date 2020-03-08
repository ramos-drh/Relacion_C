/*
15.- Crea una clase Fecha con atributos para el día, el mes y el año 
de la fecha. Incluye, al menos, los siguientes métodos:

 */
package Ej15_FechaLocalDate;

import java.time.Month;
import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;
import java.time.Period;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;

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
        anio = Year.parse(Integer.toString(MAX_ANIO));
    }
    
    //Constructor parametrizado con día, mes y año. Debe comprobar que es una fecha válida usando el 
    //método validarFecha() descrito más abajo.
    public Fecha(int dia, Month mes, Year anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
//        if(this.validarFecha()){
//            
//        }
    }
    
    /*leerFecha(): pedirá por teclado al usuario el día (1 a 31), el mes (1 a 12) 
    y el año (1900 a 2100). Este método, a su vez llamará a leerDia(), leerMes() y leerAnio(). 
    Haciendo uso de los métodos set, establecerá la fecha leída en los atributos del objeto.
    */
    
    public static void leerFecha(){
        System.out.println("Escriba una fecha (día, mes y año): ");
        //EL ENUNCIADO NO SE REFEIRE A QUE TENGA Q USARSE ASÍ
        /*if(this.validarFecha()){
            setDia(Fecha.leerDia());
            setMes(Month.of(leerMes()));
            setAnio(Year.of(leerAnio()));
        } else{
            
        }*/
        int dia = leerDia();
        int mes = leerMes();
        int anio = leerAnio();
        
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
    public static int leerAnio(){
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
        
        //CON EL FORMATTER
        /*DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(LocalDate.of(this.dia, this.mes, this.anio.getValue()).format(dTF)); o crear una var LocalDatae aux en vez de esta linea tan larga
        */
    }
    
    //bisiesto(): indicará si el año de la fecha es bisiesto o no.
    public boolean bisiesto(){
        return this.anio.isLeap();
    }
    
    //diasMes(int): devolverá el número de días del mes que se le indique (para el año de la fecha).
    public int diasMes(int anio){
        //bisiesto como parámetro porque así lo requiere el método legth
        //Creo que no está bien
        return mes.length(bisiesto());
        
        //También return L..a.of(this.anio,mes,this.dia).lengthOfMonth();
        //También se podía usar la clase YearMonth y su método of()
        //YearMonth.of(this.anio, mes).lengthOfMonth();
    }
    
    //validarFecha(): comprobará si la fecha es correcta;  Ejemplos: 31-2-2010 no es una fecha correcta. 
    //Será un método auxiliar (privado). Este método se llamará en el constructor parametrizado y en leer().

    private boolean validarFecha(){
        //MAL PORQUE SE TRAGARÍA POR EJEMPLO 31 DE FEBRERO
        //USAR EL CONSTRUCTOR DE LOCALDATE CON LOS PARÁMETROS DE THIS
        //TAMBIÉN DEBERÍAMOS CONTROLAR QUÉ HACE CUANDO ES INCORRECTO (o eso lo hace tambn autom el constr?)
        return  !(  (dia <= 1 || dia >= 31)||
                    (mes.getValue() < 1 || mes.getValue() > 12) ||
                    (anio.getValue() < MIN_ANIO || anio.getValue() > MAX_ANIO)  
                );      
    }
    
    //diasTranscurridos(): devolverá el número de días transcurridos desde el 1-1-1900 hasta la fecha.
    public int diasTranscurridos(){
        Fecha f1 = new Fecha();
        return Period.between(LocalDate.of(f1.dia, f1.mes, f1.anio.getValue()), LocalDate.of(this.dia, this.mes.getValue(), this.anio.getValue())).getDays();
    }
    
    //diaSemana(): devolverá el día de la semana de la fecha (0 para domingo, ..., 6 para sábado). 
    //El 1-1-1900 fue domingo.
    
    public int diaSemana(){
        return DayOfWeek.of(dia).getValue();
    }
    
    //mostrarFechaLarga(): mostrará la fecha en formato largo, empezando por el día 
    //de la semana (martes 2 de septiembre de 2003).
    
    public void mostrarFechaLarga(){
        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("E d de M de yyyy");
       
        System.out.println("Fecha: " +  LocalDate.of(this.dia, this.mes, this.anio.getValue()).format(formatoLargo));
    }

    //fechaTras(long): hará que la fecha sea la correspondiente a haber 
    //transcurrido los días que se indiquen desde el 1-1-1900.
    
    public void fechaTras(long diasTranscurridos){
        LocalDate fecha;
        fecha = LocalDate.of(this.dia, this.mes, this.anio.getValue());
        
        fecha.plusDays(diasTranscurridos);
        //FALTA EXCEPCIÓN DE QUE SE PASE DEL RANGO MÁXIMO (DateTimeException) (que se inicialice con 1-1-1900)
    }
    
    //diasEntre(Fecha): devolverá el número de días entre la fecha y la proporcionada.
    
    public long diasEntre(Fecha f1){
        LocalDate fParametro = LocalDate.of(f1.dia, f1.mes, f1.anio.getValue());
        LocalDate fObj = LocalDate.of(this.dia, this.mes, this.anio.getValue());
        
        return Period.between(fParametro, fObj).getDays();
    }
    
    //siguiente(): pasará al día siguiente.
    
    public void siguiente(){
        this.dia++;
        //Controlar cambio de mes (y de año)
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

