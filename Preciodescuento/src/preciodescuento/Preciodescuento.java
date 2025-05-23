/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preciodescuento;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class Preciodescuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);
         
         int precioOriginal;
         double precioFinal;
         System.out.print("Ingrese el precio original del producto: ");
          precioOriginal = teclado.nextInt();
          
          if (precioOriginal <= 100 && precioOriginal >= 0) {
               precioFinal = precioOriginal;
                System.out.println("No se aplica descuento.");
                 System.out.println("El precio final es: $" + precioFinal);
                  }
          
           else if (precioOriginal > 100 && precioOriginal <= 200) {
               precioFinal = precioOriginal - (precioOriginal * 0.10);
               System.out.println("Se aplica un 10% de descuento.");
               System.out.println("El precio final es: $" + precioFinal);
               }
          
           else if (precioOriginal > 200 && precioOriginal <= 500) {
               precioFinal = precioOriginal - (precioOriginal * 0.20);
                System.out.println("Se aplica un 20% de descuento.");
                System.out.println("El precio final es: $" + precioFinal);
                }
          
          else if (precioOriginal > 500) {
               precioFinal = precioOriginal - (precioOriginal * 0.25);
               System.out.println("Se aplica un 25% de descuento.");
                System.out.println("El precio final es: $" + precioFinal);
                }
          
          else if (precioOriginal < 0) {
               System.out.println("Precio inválido. Debe ser un número positivo.");
               
          }
    }
    
}
