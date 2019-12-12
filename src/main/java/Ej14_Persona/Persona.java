/*

 */
package Ej14_Persona;


public class Persona {
   
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private String nif;
    
    public Persona(){
         
         
    }
    
    public Persona(String nombre, String ap1, String ap2, int edad, String nif){
         this.nombre = nombre;
         this.apellido1 = ap1;
         this.apellido2 = ap2;
         this.edad = edad;
         this.nif = nif;
         
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad=" + edad + ", nif=" + nif + '}';
    }
}

