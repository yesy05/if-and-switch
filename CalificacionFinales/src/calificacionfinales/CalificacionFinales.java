/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calificacionfinales;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class CalificacionFinales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int parciales, proyecto, examenFinal;
        
        double calificacionFinal;
        
        System.out.print("Ingrese la calificacion de los parciales (0-100): ");
        parciales = teclado.nextInt();
        System.out.print("Ingrese la calificacion del proyecto (0-100): ");
         proyecto = teclado.nextInt();
         
         System.out.print("Ingrese la calificacion del examen final (0-100): ");
         examenFinal = teclado.nextInt();
         
         if (parciales >= 0 && parciales <= 100 &&
                 proyecto >= 0 && proyecto <= 100 &&
                 examenFinal >= 0 && examenFinal <= 100) {
             
             calificacionFinal = (parciales * 0.40) + (proyecto * 0.30) + (examenFinal * 0.30);
             System.out.println("La calificacion final es: " + calificacionFinal);
              } else {
             System.out.println("Una o más calificaciones son invalidas. Deben estar entre 0 y 100.");
         }
    }
    
}
