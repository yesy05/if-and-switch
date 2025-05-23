/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estacionaño;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class EstacionAño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);
         int mes;
         
         System.out.print("Ingrese el número del mes (1-12): ");
          mes = teclado.nextInt();
           switch (mes) {
                 case 12, 1, 2 -> System.out.println("La estación es INVIERNO.");
                     case 3, 4, 5 -> System.out.println("La estación es PRIMAVERA.");
                     case 6, 7, 8 -> System.out.println("La estación es VERANO.");
                              case 9, 10, 11 -> System.out.println("La estación es OTOÑO.");
                              default -> System.out.println("Mes inválido. Debe ser un número del 1 al 12.");
                                                                                                  
           }
    }
    
}
