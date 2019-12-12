/*
 1.Crea una clase Complejo que permita trabajar con números complejos (parte real y parte imaginaria). 
Se define cada número complejo z como un par ordenado de números reales: z = (a, b). 
A su vez el primer elemento a se define como parte real de z, se denota a=Re(z); 
el segundo elemento b se define como parte imaginaria de z, se denota b=Im(z). 
Incluye los siguientes métodos: constructores (por defecto y parametrizado) y métodos get, set y toString. 
 */
package Ej1_Y_2;


public class Complejo {
    
    private double parteReal;
    private double parteImg;
    
    //Constructor por defecto
    public Complejo(){
        this.parteReal = 0;
        this.parteImg = 0;
    }
    public Complejo(double pReal, double pImg){
        this.parteReal = pReal;
        this.parteImg = pImg;
    }

    public double getParteReal() {
        return parteReal;
    }

    public void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }

    public double getParteImg() {
        return parteImg;
    }

    public void setParteImg(double parteImg) {
        this.parteImg = parteImg;
    }
    
//Suma de dos nº complejos
    
    //Si sí necesita obj=> NO puede ser estático
    //La llamada al método será c1.suma(c2)
    public void sumar (Complejo c2){
       parteImg += c2.getParteImg();
       parteReal += c2.getParteReal();
    }
    
    //Si no depende de un obj => es STATIC (no depende de los atributos del obj)
    //La llamada al método será: Complejo.sumar(Complejo c1, Complejo c2)
    public static Complejo sumar(Complejo c1, Complejo c2){
        return new Complejo(c1.getParteReal() + c2.getParteReal(), c1.getParteImg() + c2.getParteImg() );
    }
  
//Multiplicación de dos nº complejos
    
    //NO ESTÁTICO => NECESITA OBJETOS =>
    //La llamada al método será num = c1.suma(c2)
    public Complejo multiplicar (Complejo c2){
        Complejo num;
        return num = new Complejo(this.getParteReal() * c2.getParteReal() - this.getParteImg() * c2.getParteImg(), 
                this.getParteReal() * c2.getParteReal() + this.getParteImg() * c2.getParteReal());
    }
    
    //ESTÁTICO =>NO NECESITA OBJETOS =>
    //La llamada al método será: Complejo.multplicar(Complejo c1, Complejo c2)
    public static Complejo multiplicar (Complejo c1, Complejo c2){
        //Res. de la parte REAL: las partes reales y restarle la mult. de las partes imaginarias
        //Res. de la parte IMG: mult la partReal del 1º por la partImg del 2º y le sumamos la pI del 1º + la pR del 2º
        return new Complejo(c1.getParteReal() * c2.getParteReal() - c1.getParteImg() * c2.getParteImg(),
                c1.getParteReal()*c2.getParteImg() + c1.getParteImg()*c2.getParteReal() );
    }
    
//División de dos nº complejos
    
    //NO ESTÁTICO => NECESITA OBJETOS =>
    //La llamada al método será num = c1.division(c2)
    public Complejo division (Complejo c2){
        //Res. de la parte REAL: suma de las multiplicaciones de las pR DIV por la suma de los cuadrados de la parte 
        //Res. de la parte IMG: resta de las multiplicaciones de las pR DIV por la suma de los cuadrados de la parte
        return new Complejo(this.getParteReal() / c2.getParteReal(), 
                this.getParteImg() / c2.getParteImg() );
    }
    
    //ESTÁTICO =>NO NECESITA OBJETOS =>
    //La llamada al método será: Complejo.division(Complejo c1, Complejo c2)
    public static Complejo division (Complejo c1, Complejo c2){
        return new Complejo( (c1.getParteReal() * c2.getParteReal() + c1.getParteImg() * c2.getParteImg()) / (Math.pow(c1.getParteImg(),2) + (Math.pow(c2.getParteReal(), 2))) ,
        (c1.getParteImg() * c2.getParteReal() + c1.getParteReal() * c2.getParteImg()) / (Math.pow(c1.getParteReal(),2) + (Math.pow(c2.getParteImg(), 2))));
    }
    
//COMPARACIÓN
    //
    
    @Override
    public String toString(){
        return "(" + parteReal + " + " + parteImg + "i)";
    }
}

/*
x = new Complejo(3,4)
y = new Complejo(5,8)

Version static y no static 
Complejo z = Complejo.suma(x,y)
X.sumar(y)
*/