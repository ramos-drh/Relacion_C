/*
NO HACER LA CLASE NIF; USARLO COMO UN ATR
 */
package Ej12Y13_Empleado;


public class Empleado {
    private String nif;
    private double sueldoBase;
    private double pagoPorHoraExtra;
    private int horasExtrasRealizadas;
    private double tipoIRPF; //En %
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
    public  Empleado(String nif, double sueldoB, double pagoXhora, int horasExtras, double porcIRPF, boolean casado, int numHijos){
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

    public double getTipoIRPF() {
        return tipoIRPF;
    }

    public void setTipoIRPF(double tipoIRPF) {
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
    
    
    //--------------    AÑADIDO DEL EJ 13   ------------
    
    //Cálculo del complemento correspondiente a las horas extra realizadas.
    public double complementoHorasExtras(){
        return this.horasExtrasRealizadas * this.pagoPorHoraExtra;
    }
    
    public double SueldoBruto(){
        //No se le resta lo de la amiga Hacienda
        //Sueldo base + horas extras
        return this.sueldoBase + this.complementoHorasExtras();
    }
    
    public double Retenciones(){
        /*
        No modificar el tipoIRPF
        */
        double retenciones = this.tipoIRPF;
        
        retenciones -= this.numHijos;
        
        if(this.casado){
            retenciones -= 2;
        }
        
        //El sueldo bruto * porcentaje final que se le aplica
        return this.SueldoBruto()*retenciones;
    }
    
    public void escribirBasicInfo(){
        String estadoCivil =  this.casado ? "Casado" : "Soltero";
        
        System.out.println("NIF: " + this.nif +"\n"
                        + "Estado Civil: " + estadoCivil +"\n"
                        + "Tiene: " + this.numHijos + "hijos");
    }
    
    public void escribirAllInfo(){
        System.out.println(
        "Sueldo Base: " + this.sueldoBase + "€ \n"
        + "Complemento por horas extras: " + this.complementoHorasExtras() + "€ \n"
        + "Sueldo bruto: " + this.SueldoBruto() + "€ \n"
        //Aquí no sé si pide el tipoIRPF o las retenciones
        + "Retención de IRPF: " + this.Retenciones() + "€ \n"
        + "Sueldo neto: " + sueldoNeto(this) + "€ \n");
    }
    
    //Constructor Copia
    public Empleado (Empleado empleado){
        this.nif = empleado.nif;
        this.sueldoBase = empleado.sueldoBase;
        this.horasExtrasRealizadas = empleado.horasExtrasRealizadas;
        this.pagoPorHoraExtra = empleado.pagoPorHoraExtra;
        this.tipoIRPF = empleado.tipoIRPF;
        this.casado = empleado.casado;
        this.numHijos = empleado.numHijos;
    }
    
    //Método extra para usar un static
    //También puede ser NO estático perfectamente (ABAJO)
    
    public static double sueldoNeto(Empleado emp){
        double res;
        
        res = emp.SueldoBruto() - emp.Retenciones();
        
        return res;
    }
    
    /*
    public double sueldoNeto(){
        double res;
        
        res = this.SueldoBruto() - this.Retenciones();
        
        return res;
    }*/
}
