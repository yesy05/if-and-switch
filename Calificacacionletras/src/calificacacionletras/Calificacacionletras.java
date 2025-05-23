/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calificacacionletras;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class Calificacacionletras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
         int calificacion;
         
         System.out.print("Ingrese la calificacion numerica (0-100): ");
         calificacion = teclado.nextInt();
         if (calificacion >= 90 && calificacion <= 100) {
             System.out.println("Calificacion: A");
             }
         
          else if (calificacion >= 80 && calificacion <= 89) {
               System.out.println("Calificacion: B");
                }
         
         else if (calificacion >= 70 && calificacion <= 79) {
             System.out.println("Calificacion: C");
              }
         
         else if (calificacion >= 60 && calificacion <= 69) {
             System.out.println("Calificacion: D");
             }
         
         else if (calificacion >= 0 && calificacion < 60) {
              System.out.println("Calificacion: F");
              }
         else if (calificacion < 0 || calificacion > 100) {
             System.out.println("Calificacion invalida. Debe estar entre 0 y 100.");
         }
    }
    
}
