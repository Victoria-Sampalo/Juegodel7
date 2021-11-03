/*
 * 
 */
package juegodel7;

import java.util.Random;


public class Juegodel7DoWhile {

    
    public static void main(String[] args) {
        
        //Defino método de clase random
       Random miAleatorio = new Random (); 
      
        //------VARIABLES A USAR--------------------
        int numJ1, numJ2, suma;
        
        //Los contadores deben de partir de 0 y la ronda de 1
        int contadorGlobal= 0;
        int contadorJ1= 0; 
        int contadorJ2 = 0;
        int ronda=1; 
        
        //------COMIENZA DESARROLLO------------------------
        //--------MÉTODO DO-WHILE-------------------------- 
       
        do{
         
           //-------INTRODUCCIÓN AL JUEGO------------------
            System.out.println("ESTE ES EL JUEGO DEL 7.\nComenzamos por la ronda" + ronda + "  .Adelante...");
           
          //--------IMPRIMO LOS VALORES ALEATORIOS PARA AMBOS JUGADORES-----------
        
        //JUGADOR 1-----------------------------------------------
        //Rango de 1 a 5
        numJ1 = miAleatorio.nextInt(5) + 1;

        System.out.println("Jugador 1=  " + numJ1);
        
        
        //JUGADOR 1-----------------------------------------------      
        numJ2 = miAleatorio.nextInt(5) + 1;

        System.out.println("Jugador 2=  " + numJ2);

        //sumamos ambos números 
        suma = numJ1 + numJ2;
            System.out.println("El resultado de la suma de ambos en la ronda nº"+ ronda + " es =" + suma);
            
         //----------CONDICIONES GANADOR Y SUMATORIA DE RONDAS-------------
         //Usamos el bucle if else
          //menor que 7
         if (suma <7){
             System.out.println("GANA J1");
             contadorJ1++;
           //mayor que 7
         } else if (suma >7) {
             System.out.println("GANA J2");
             contadorJ2++; 
          //igual que 7, contador descuenta   
          }else{
             System.out.println("NO GANA NADIE");
             contadorGlobal--;
         } 
         //las rondas siguen sumando 1
            ronda++;
            
        }while (ronda <= 5);
        
        //Imprimo resultado de ambos contadores
       
         if (contadorJ1 > contadorJ2 || contadorJ1 ==3){
             System.out.println("GANA JUGADOR 1");
         } else {
             System.out.println("GANA JUGADOR 2");
         }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
    
}
