/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej11_Motor;

/**
 *
 * @author ramos-drh
 */
public class Coche {
    
    private Motor motor;
    private Rueda ruedaDelI, ruedaDelD, ruedaTraD, ruedaTraI;
    private Puerta puertaDelI, puertaDelD, puertaTraD, puertaTraI;
    private Ventana ventana;
    private int plazas;
    
    public Coche(Motor motor, Rueda ruedadd, Rueda ruedadi, Rueda ruedatd, Rueda ruedati,
            Puerta puertaDelI, Puerta puertaDelD, Puerta puertaTraD, Puerta puertaTraI,
            Ventana ventana, int plazas){
        this.motor = motor;
        this.puertaDelD = puertaDelD;
        this.puertaDelI = puertaDelD;
        this.puertaTraD = puertaDelD;
        this.puertaTraI = puertaDelD;
        this.ruedaDelI = ruedadi;
        this.ruedaDelD = ruedadd;
        this.ruedaTraD = ruedatd;
        this.ruedaTraI = ruedati;
        this.plazas = plazas;
    }
}
