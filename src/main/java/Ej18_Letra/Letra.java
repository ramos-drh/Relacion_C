/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej18_Letra;

import java.util.Random;


public class Letra {
    char letra;
    
    public Letra(){
        letra = 'a';
    }
    
    public Letra(char letraPasada){
        letra = letraPasada;
    }
    
    public char letraAleatoria(){
        Random aleatorio = new Random();
        return (char) (aleatorio.nextInt((int) 'Z') + (int)('a'));
    }
    
    public void letrasAleatorias(int numCantAleatoria){
        for(int i = 0; i < numCantAleatoria; i++){
            System.out.println(letraAleatoria());
        }
    }
    
    @Override
    public String toString() {
        return "Letra: " + this.letra;
    }
}
