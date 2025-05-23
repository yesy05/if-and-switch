/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edadvotar;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class Edadvotar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);
         int edad;
         
         System.out.print("Ingrese su edad: ");
          edad = teclado.nextInt();
          
          if (edad >= 18) {
              System.out.println("Eres elegible para votar.");
              }
          else if (edad < 18) {
              System.out.println("No eres elegible para votar.");
          }
    }
    
}
