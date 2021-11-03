/*
 * Planteo un menú 
 */
package juegodel7;

import java.util.Random;
import java.util.Scanner;

public class JuegoDel7 {

    public static void main(String[] args) {

        //Declaro objeto de clase tipo Random
        Random miAleatorio = new Random();

        //------VARIABLES A USAR--------------------
        int numJ1, numJ2, sumaTotal;

        
        
        //5 rondas
        for (int i = 0; i < 5; i++) {
            
        
        //CONTADOR DE PUNTOS PUNTO 1 
        //CONTADOR PUNTO ++
        
        //Imprimo numeros aleatorios de ambos jugadores
        //jugador 1
        //Rango de impresion de 1 a 5
        
        
        numJ1 = miAleatorio.nextInt(5) + 1;

        System.out.println("Jugador 1: " + numJ1);
        //jugador 2

        numJ2 = miAleatorio.nextInt(5) + 1;

        System.out.println("Jugador 2:" + numJ2);

        //sumamos ambos números 
        sumaTotal = numJ1 + numJ2;

        // condiciones 
        if (sumaTotal < 7) {
            System.out.println("gana J1");
        } else {
            System.out.println("gana j2");
        }
        if (sumaTotal == 7) {
            
            System.out.println("no gana ninguna");
            i--; //hace que la ronda no cuente 
        }
        
      }
    }

}
