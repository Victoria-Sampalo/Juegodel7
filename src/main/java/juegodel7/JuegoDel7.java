/*
 *El juego consiste en 5 rondas donde los usuarios general números aleatorios
 entre 1 y 5, se suma ambos resultados, si el resultado es <7 (menor que 7) gana j1,
 si es >7 (mayor que 7)gana j2, si es 7 no cuenta esa ronda.
        Gana el que más victorias lleve en las 5 rondas. (a la victoria 3 ganará uno de ellos)
 */
package juegodel7;

import java.util.Random;


public class JuegoDel7 {

    public static void main(String[] args) {

        //Declaro objeto de clase tipo Random
        Random miAleatorio = new Random();

        //------VARIABLES A USAR--------------------
        int numJ1, numJ2, sumaTotal;
        
        int contadorGlobal, contadorJ1, contadorJ2; 
        
        //------COMIENZA DESARROLLO-------------------------
        
        //Bucle con las 5 rondas a imprimir 
        for (int i = 0; i < 5; i++) {
            
        
        //CONTADOR DE PUNTOS PUNTO 1 
        //CONTADOR PUNTO ++
        
        //--------IMPRIMO LOS VALORES ALEATORIOS PARA AMBOS JUGADORES-----------
        
        //JUGADOR 1-----------------------------------------------
        //Rango de 1 a 5
        numJ1 = miAleatorio.nextInt(5) + 1;

        System.out.println("Jugador 1: " + numJ1);
        
        
        //JUGADOR 1-----------------------------------------------      
        numJ2 = miAleatorio.nextInt(5) + 1;

        System.out.println("Jugador 2:" + numJ2);

        //sumamos ambos números 
        sumaTotal = numJ1 + numJ2;
        
        //---------------CONDICIONES----------------------
        if (sumaTotal < 7) {
            System.out.println("gana J1");
        } else {
            System.out.println("gana J2");
        }
        if (sumaTotal == 7) {
            
            System.out.println("no gana ninguna");
            i--; //hace que la ronda no cuente 
        }
        
      } //end for1
    }

}
