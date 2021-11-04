/*
 * 
 */
package juegodel7;

import java.util.Random;

public class Juegodel7DoWhile {

    public static void main(String[] args) {

        //Defino método de clase random
        Random miAleatorio = new Random();

        //------VARIABLES A USAR--------------------
        int numJ1, numJ2, suma;

        //Los contadores deben de partir de 0 y la ronda de 1
       
        int contadorJ1 = 0;
        int contadorJ2 = 0;
        int ronda = 1;

        //-------INTRODUCCIÓN AL JUEGO------------------
        System.out.println("ESTE ES EL JUEGO DEL 7.\nComenzamos por la ronda" + ronda + "  .Adelante...");
        //------COMIENZA DESARROLLO------------------------
        //--------MÉTODO DO-WHILE-------------------------- 

        do {

            //--------IMPRIMO LOS VALORES ALEATORIOS PARA AMBOS JUGADORES-----------
            //JUGADOR 1-----------------------------------------------
            //Rango de 1 a 5
            numJ1 = miAleatorio.nextInt(5) + 1;

            System.out.println("Jugador 1=  " + numJ1);

            //JUGADOR 2-----------------------------------------------      
            numJ2 = miAleatorio.nextInt(5) + 1;

            System.out.println("Jugador 2=  " + numJ2);

            //sumamos ambos números 
            suma = numJ1 + numJ2;
            System.out.println("El resultado de la suma de ambos en la ronda nº" + ronda + " es =" + suma);

            //----------CONDICIONES GANADOR Y SUMATORIA DE RONDAS-------------
            //Usamos el bucle if else
            //menor que 7
            if (suma < 7) {
                System.out.println("Esta ronda la gana --> J1");
                contadorJ1++;
                //mayor que 7
            } else if (suma > 7) {
                System.out.println("Esta ronda la gana --> J2");
                contadorJ2++;
                //igual que 7, contador descuenta   
            } else {
                System.out.println("ESTA RONDA NO LA GANA NADIE");
                ronda--;
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
            
        } while (ronda <= 5);
      /*
        //Imprimo resultado de ambos contadores
        System.out.println("El ganador de las 5 RONDAS es\n"
                + "-------------------------------------\n");
        if (contadorJ1 > contadorJ2 || contadorJ1 == 3) {
            System.out.println("GANA JUGADOR 1");
        } else {
            System.out.println("GANA JUGADOR 2");
        }
        */

    }

}
