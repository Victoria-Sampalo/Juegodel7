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
        
        
       
        int contadorJ1= 0; 
        int contadorJ2 = 0;
        
        
        //------COMIENZA DESARROLLO-------------------------
        
        //Bucle con las 5 rondas a imprimir 
        for (int ronda = 0; ronda < 5; ronda++) {
            
        
        
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
            System.out.println("Esta ronda la gana --> J1");
            contadorJ1++;
            //no hace falta poner contador global porque no hace falta
        } else if (sumaTotal >7){
            System.out.println("Esta ronda la gana --> J2");
            contadorJ2++;
        }
        else {
            
            System.out.println("ESTA RONDA NO LA GANA NADIE");
            ronda--; //hace que la ronda no cuente 
        }
         
          //las rondas siguen sumando 1
            ronda++;
            if(contadorJ1 ==3){
               System.out.println("GANA JUGADOR 1");
               break; 
            } else if (contadorJ2 == 3) {
               System.out.println("GANA JUGADOR 2");
               break; 
            }
            
      } //end for1
      /*  
       //Imprimo resultado de ambos contadores
        System.out.println("El ganador de las 5 RONDAS es\n"
                + "-------------------------------------\n");
         if (contadorJ1 > contadorJ2 || contadorJ1 ==3){
             System.out.println("GANA JUGADOR 1");
         } else {
             System.out.println("GANA JUGADOR 2");
         }
         */
       
    }

}
