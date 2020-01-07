/*
Crea una clase Hora con atributos para las horas, los minutos y los segundos. 
Incluye, al menos, los siguientes métodos:
 */
package Ej17_Hora;

public class Hora {

    private int hora;
    private int min;
    private int seg;

    //Constructor predeterminado con el 00:00:00 como hora por defecto.
    public Hora() {
        //Como son de tipo numérico, se inicializarán a 0
        //hora = 0;
        //min = 0;
        //seg = 0;
    }

    //Constructor parametrizado con horas, minutos y segundos.
    public Hora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.min = minutos;
        this.seg = segundos;
        this.valida();
    }

    //valida(): comprobará si la hora es correcta; si no lo es la ajustará a 12:00:00. 
    //Será un método auxiliar (privado) que se llamará en el constructor parametrizado.
    private void valida() {
        //Si la hora es > 23 o < 0: Error
        if ((this.hora < 0 || this.hora > 23) ||
            (this.min < 0 || this.min > 59) ||
            (this.seg < 0 || this.seg > 59) ){
            System.out.println("La hora es incorrecta. Se establecerá a 12:00:00");
            this.hora = 12;
            this.min = 0;
            this.seg = 0;
        }
    }

    //Métodos get y set.
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
        this.valida();
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    //escribirHora(): mostrará la hora (ejemplo: 07:03:21).
    public void escribirHora() {
        //FALTA que muestre 0 a la derecha cuando sea un nº <= 9
        System.out.println(hora + ":" + min + ":" + seg);
    }

    
    //Devolverá el número de segundos transcurridos desde la medianoche.
    //Usamos la clase auxiliar que pasa una hora dada en horas min y seg a segundos
    
    public int obtenerSegundos(){
        return (this.hora*3600) +
                (this.min*60) +
                (this.seg);
    }
    
    public int segundosDesde(){
        //Pasar this a seg.
        return this.obtenerSegundos();
    }

    //Devolverá el número de segundos transcurridos hasta la medianoche.

    public int segundosHasta(){
        //Resto los segundos totales de un día menos la hora actual en segundos
        return (24*3600) - this.segundosDesde();
    }

    //Devolverá el número de segundos entre la hora y la proporcionada.

    public int segundosEntreHoras(Hora h1){
        //Pasamos ambas horas a segundos y a la mayor le restamos la otra
        int horaPrincipal = this.obtenerSegundos();
        int horaParametro = h1.obtenerSegundos();
        if(horaPrincipal > horaParametro){
            return horaPrincipal - horaParametro;
        } else{
            //Aquí entrará también si son iguales
            return horaParametro - horaPrincipal;
        }
    }
    

    //siguiente(): pasará al segundo siguiente.
    public void siguiente(){
        
        if(this.seg < 59){
            this.seg++;
        } else{
            //Si el segundo es 59:
            this.seg = 0;
            this.sumarMinuto();
        }
    }
    
    //METODOS AUX SUMAR MINUTO
    
    public void sumarMinuto(){
        if(this.min < 59){
            this.min++;
        } else{
            //Si el minuto es 59:
            this.min = 0;
            this.sumarHora();
        }
    }
    
    public void sumarHora(){
        if(this.hora < 23){
            this.hora++;
        } else{
            //Si la hora es 23:
            this.hora = 0;
        }
    }
    
    //anterior(): pasará al segundo anterior.
    public void anterior(){
        if(seg == 0){
            this.seg = 59;
            this.restarMinuto();
        } else{
            //Si el segundo es > 0
            this.seg--;
        }
    }
     public void restarMinuto(){
        if(this.min == 0){
            this.min = 59;
            this.restarHora();
        } else{
            //Si el minuto es > 0
            this.min--;
        }
    }
    
    public void restarHora(){
        if(this.hora == 0){
            this.hora = 23;
        } else{
            //Si la hora es > 0:
            this.hora --;
        }
    }
    
    //Devolverá un clon de la hora.
    
    public Hora copia(){
        Hora horaCopia;
        return new Hora(this.hora, this.min, this.seg);
    }
    
    // Indica si la hora es la misma que la proporcionada.
    
    public boolean igualQue(Hora h1){
        return this.obtenerSegundos() == h1.obtenerSegundos();
    }
    
    //indica si la hora es anterior a la proporcionada.
            
    public boolean menorQue(Hora h1){
        return this.obtenerSegundos() < h1.obtenerSegundos();
    }
    
    //indica si la hora es posterior a la proporcionada.
    
    public boolean mayorQue(Hora h1){
        return this.obtenerSegundos() > h1.obtenerSegundos();
    }
}
