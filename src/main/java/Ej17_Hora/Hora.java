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
        this.valida();
        this.min = minutos;
        this.seg = segundos;
    }

    //valida(): comprobará si la hora es correcta; si no lo es la ajustará a 12:00:00. 
    //Será un método auxiliar (privado) que se llamará en el constructor parametrizado.
    private void valida() {
        //Si la hora es > 23 o < 0: Error
        if (this.hora > 23 || this.hora < 0) {
            System.out.println("La hora es incorrecta. Se establecerá a 12");
            this.hora = 12;
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
        System.out.println(hora + ":" + min + ":" + seg);
    }

    /*
    segundosDesde(): devolverá el número de segundos transcurridos desde la medianoche.

segundosHasta(): devolverá el número de segundos transcurridos hasta la medianoche.

segundosEntreHoras(Hora): devolverá el número de segundos entre la hora y la proporcionada.

siguiente(): pasará al segundo siguiente.

anterior(): pasará al segundo anterior.

copia(): devolverá un clon de la hora.

igualQue(Hora): indica si la hora es la misma que la proporcionada.

menorQue(Hora): indica si la hora es anterior a la proporcionada.

mayorQue(Hora): indica si la hora es posterior a la proporcionada.

    
     */
}
