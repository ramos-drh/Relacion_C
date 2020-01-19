/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej7_CuentaBancaria;

/**
 *
 * @author ramos-drh
 */
public class Prueba_Ej7CuentaBancaria {

    public static void main(String[] args) {
        //Creamos una cuenta con el constr por defecto
        CuentaBancaria cuenta1 = new CuentaBancaria();
        //Y la mostramos con el método creado para ello
        cuenta1.mostrarInfo();

        //Repetimos pero con el constr con parámetros:
        CuentaBancaria cuenta2 = new CuentaBancaria("09078878L", 1500, 2);
        cuenta2.mostrarInfo();
        
        //Actualizamos saldo:
        cuenta2.actualizarSaldo();
        cuenta2.mostrarInfo();
    }
}
