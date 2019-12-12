/*
5.Crea una clase Rectangulo que modele rectángulos por medio de cuatro puntos (los vértices).
Dispondrá de un constructor que cree un rectángulo partiendo de la base y la altura, 
de forma que su vértice inferior izquierdo esté en (0,0). La clase también incluirá 
un método para calcular la superficie y otro que desplace el rectángulo en el plano, 
pasando como parámetros dos valores que indiquen el desplazamiento en eje X y el 
desplazamiento en el eje Y, respectivamente. Utiliza la clase  
PuntoGeométrico para modelar los cuatro vértices del Rectangulo.

 */
package Ej5_Rectangulo;
import com.mycompany.ej4relcpuntogeom.PuntoGeometrico;

public class Rectangulo {
//rectángulos por medio de cuatro puntos (los vértices)
// Utiliza la clase PuntoGeométrico para modelar los cuatro vértices del Rectangulo
    private PuntoGeometrico verticeInfIzq;
    private PuntoGeometrico verticeInfDer;
    private PuntoGeometrico verticeSupIzq;
    private PuntoGeometrico verticeSupDer;
    
    
    //Constructor con parámetros = base y altura
    public Rectangulo(Double base, Double altura){
        //de forma que su vértice inferior izquierdo esté en (0,0)
        this.verticeInfIzq = new PuntoGeometrico(0, 0);
        
        //Por tanto, el vértice inferior derecho estará en (base, 0)
        this.verticeInfDer = new PuntoGeometrico(base, 0);
        
        this.verticeSupIzq = new PuntoGeometrico(0, altura);
        this.verticeSupDer = new PuntoGeometrico(base, altura);
    }
    
    //Método calcular superficie
    
    public double calcularSuperficie(){
        //Superficie del rect: Base*Altura
        //Base = Coordenada x del vertInfIzq - Coordenada x del vertInfDerech (también se pueden restar
        //la de los vértices superiores)
        //Altura = Coordenada y del vertSupIzq - Coordenada x del vertInfIzq
        return (this.verticeInfIzq.getCoordX() - this.verticeInfDer.getCoordX() ) * ( this.verticeSupIzq.getCoordY() - this.verticeInfIzq.getCoordY() );
     
    }
    
    //Método desplazar rectángulo, con 2 parámetros: desplazEjeX, desplazEjeY
    //Pasando como parámetros dos valores que indiquen el desplazamiento en eje X y el 
    //desplazamiento en el eje Y, respectivamente
    
    public void desplazarRectangulo(Double cantidadEjeX, Double cantidadEjeY){
        this.verticeInfDer.setCoordX(this.verticeInfDer.getCoordX() + cantidadEjeX);
        this.verticeSupDer.setCoordX(this.verticeSupDer.getCoordX() +cantidadEjeX);
        this.verticeInfIzq.setCoordX(this.verticeInfIzq.getCoordX() +cantidadEjeX);
        this.verticeSupIzq.setCoordX(this.verticeSupIzq.getCoordX() +cantidadEjeX);
        
        this.verticeInfDer.setCoordY(this.verticeInfDer.getCoordY() + cantidadEjeY);
        this.verticeSupDer.setCoordY(this.verticeSupDer.getCoordY() +cantidadEjeY);
        this.verticeInfIzq.setCoordY(this.verticeInfIzq.getCoordY() +cantidadEjeY);
        this.verticeSupIzq.setCoordY(this.verticeSupIzq.getCoordY() +cantidadEjeY);
    }
}
