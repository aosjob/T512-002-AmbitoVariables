/*
 * Motraremos el funcionamiento de los ambitos de uso de las variables
 * 
 */
package com.cice.ambitos;

/**
 * Clase Principar
 * @author cice
 */
public class Main {
    /**
     * Metodo main
     * @param args 
     */
    
    // variable de clase staticas solo se ejecutan en metodos estaticos
    // solamente se pueden llamar a los metodo estatico dentro de otro estatico
    // las constante van en mayusculas y se puede utilizar el guion bajo
     int numeroClase = 78;
    
    public static void main(String... args){
        //variable local del metodo
        int numero = 0;
        
        numero = 2;
        
        if (numero == 0){
            numero = 3;
        }
        
        Main miMetodo = new Main();
        miMetodo.metodoPrueba();
        
                
    }
    /**
     * Metodo de Prueba
     */
    void metodoPrueba(){
        numeroClase = 76;
        int numero = 4; 
        System.out.println("El numero es: " + numero);
    }
}//fin class
