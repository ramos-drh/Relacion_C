/*
10.  Desarrolla una clase Cancion con los siguientes atributos:
titulo: una variable String que guarda el título de la canción.
autor: una variable String que guarda el autor de la canción.
y los constructores por defecto (inicializando a cadenas vacías) 
y parametrizado, así como métodos get, set y toString.

 */
package Ej4_10Y14_PuntoGeo_Song_Pers;

public class Cancion {

    private String titulo;
    private String autor;

    //Constructor por defecto
    public Cancion() {
        //Como el enunc pide cadenas vacías:
        this.autor = "";
        this.titulo = "";
    }

    //Constructor para metrizado
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    //Métodos getter y setter
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    //Redefinición del método toString
    @Override
    public String toString() {
        return "Titulo de la canción: " + this.titulo + "\n Nombre del autor: " + this.autor;
    }
}
