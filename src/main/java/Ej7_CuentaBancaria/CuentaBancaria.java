/*
Atributos para el número de cuenta (un long), el NIF del cliente, el saldo actual 
y el interés anual que se aplica a la cuenta (porcentaje). Define en la clase los siguientes métodos:
 */
package Ej7_CuentaBancaria;

public class CuentaBancaria {

    //Atributos
    /*El número de cuenta se asignará de forma correlativa a partir de 100001, 
    asignando el siguiente número al último asignado.*/
    //¿¿¿¿interés es static porque no necesita ningún obj para existir, existe
    //al crear la clase
    final static int DIAS_ANIO = 365;
    final static int PORCIENTO = 100;
    
    private long numCuenta;
    private String nif;
    private double saldoActual;
    private double interesAnual;
    private static long contador = 100001;

    //Constructor por defecto con NIF, saldo e interés.
    public CuentaBancaria() {
        nif = "000000000A";
        numCuenta =++contador;
    }

    //Constructor parametrizado con NIF, saldo e interés
    public CuentaBancaria(String nif, double saldo, double interes) {
        this.nif = nif;
        this.saldoActual = saldo;
        this.interesAnual = interes;
        this.numCuenta = ++contador;
    }

    //Métodos get y set. Para el número de cuenta no habrá método set.
    public long getNumCuenta() {
        return numCuenta;
    }

    public void setNif(String nif) {
        //Comprobar si tiene el tam adecuado &&
        //El último carac es una letra mayúscula (del abecedario)
        this.nif = nif;
    }

    public String getNif() {
        return this.nif;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    //actualizarSaldo(): actualizará el saldo de la cuenta aplicándole el 
    //interés diario (interés anual dividido entre 365 aplicado al saldo actual).
    public void actualizarSaldo() {
        //Es decir, al saldo le multiplico el interes diario/100
        //(es lo mismo que saldo = saldo + saldo*porcDiaro/100
        this.saldoActual += (this.saldoActual * (this.interesAnual / DIAS_ANIO)) / PORCIENTO;
    }

    // ingresar(double): permitirá ingresar una cantidad en la cuenta.
    public void ingresar(double cantidadIngresar) {
        if (cantidadIngresar <= 0) {
            System.out.println("No puedes ingresar una cantidad menor que 1€");
        } else {
            this.saldoActual += cantidadIngresar;
        }
    }

    //retirar(double): permitirá sacar una cantidad de la cuenta (si hay saldo).
    public void retirar(double cantidadRetirar) {
        //Impediremos la operación si la cantidad es negativa o si es mayor que el saldoActual
        if (cantidadRetirar <= 0) {
            System.out.println("No puedes retirar una cantidad menor que 1€");
        } else if (cantidadRetirar > this.saldoActual) {
            System.out.println("La cantidad a retirar no puede ser mayor que su saldo ( " + this.saldoActual + "€)");
        } else {
            this.saldoActual -= cantidadRetirar;
        }
    }

    // mostrarInfo(). Método que nos permita mostrar todos los datos de la cuenta.
    public void mostrarInfo() {
        System.out.println("Numero de cuenta: " + numCuenta + "\n"
                + "NIF del cliente: " + this.nif + "\n"
                + "Saldo actual: " + this.saldoActual + "€\n"
                + "Interés anual: " + this.interesAnual + "%\n");
    }
}
