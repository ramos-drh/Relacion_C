/*
Modifica el constructor:
Si la edad introducida es negativa o mayor de 125 años, el programa informe 
por consola de que la edad no es válida y se establecerá a cero.

En caso de que el NIF no tenga 9 elementos entre dígitos y letras, es decir, 
tenga un tamaño inferior o superior a 9, se informará al usuario de que el NIF 
no está bien establecido y se inicializará con la cadena vacía.
 */
package Ej21_PersConstControlado;


public class Persona21 {
   
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private String nif;
    
    public Persona21(){
         
         
    }
    
    public Persona21(String nombre, String ap1, String ap2, int edad, String nif){
         this.nombre = nombre;
         this.apellido1 = ap1;
         this.apellido2 = ap2;
         if(edad > 0 && edad < 125){
             this.edad = edad;
         }  else{
             this.edad = 0;
             System.out.println("La edad no es válida (se ha establecido a 0)");
         }
         
         if(nif.length() == 9){
             this.nif = nif;
         } else{
             this.nif ="";
             System.out.println("El NIF no está bien establecido (se ha establecido como una cadena vacía)");
         }
         
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
        //Aquí habría que controlarlo también
        this.edad = edad;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        //Aquí habría que controlarlo también
        this.nif = nif;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad=" + edad + ", nif=" + nif + '}';
    }
}

