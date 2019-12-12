/*
NO HACER LA CLASE NIF; USARLO COMO UN ATR
 */
package Ej12_RelC_Empleado;


public class Empleado {
    private String nif;
    private double sueldoBase;
    private double pagoPorHoraExtra;
    private int horasExtrasRealizadas;
    private int tipoIRPF; //En %
    private boolean casado;
    private int numHijos;
    
    //Constructor por defecto que inicialice los valores como consideres oportunos
    public Empleado() {
        this.nif = "";
        this.sueldoBase = 900.00;
        this.pagoPorHoraExtra = 10;
        this.horasExtrasRealizadas = 0;
        this.tipoIRPF = 21;
        this.casado = false;
        this.numHijos = 0;
    }
    
    //Constructor parametrizado
    public  Empleado(String nif, double sueldoB, double pagoXhora, int horasExtras, int porcIRPF, boolean casado, int numHijos){
        this.nif = nif;
        this.sueldoBase = sueldoB;
        this.pagoPorHoraExtra = pagoXhora;
        this.horasExtrasRealizadas = horasExtras;
        this.tipoIRPF = porcIRPF;
        this.casado = casado;
        this.numHijos = numHijos;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getPagoPorHoraExtra() {
        return pagoPorHoraExtra;
    }

    public void setPagoPorHoraExtra(double pagoPorHoraExtra) {
        this.pagoPorHoraExtra = pagoPorHoraExtra;
    }

    public int getHorasExtrasRealizadas() {
        return horasExtrasRealizadas;
    }

    public void setHorasExtrasRealizadas(int horasExtrasRealizadas) {
        this.horasExtrasRealizadas = horasExtrasRealizadas;
    }

    public int getTipoIRPF() {
        return tipoIRPF;
    }

    public void setTipoIRPF(int tipoIRPF) {
        this.tipoIRPF = tipoIRPF;
    }

    public boolean getCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nif=" + nif + ", sueldoBase=" + sueldoBase + ", pagoPorHoraExtra=" + pagoPorHoraExtra + ", horasExtrasRealizadas=" + horasExtrasRealizadas + ", tipoIRPF=" + tipoIRPF + ", casado=" + casado + ", numHijos=" + numHijos + '}';
    }
    
}
