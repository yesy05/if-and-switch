/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertidorgrados;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class Convertidorgrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner teclado = new Scanner(System.in);
        double celsius, resultado;
        int opcion;
         System.out.print("Ingrese la temperatura en grados Celsius: ");
         celsius = teclado.nextDouble();
         
         System.out.println("Seleccione una opcion de conversion:");
         System.out.println("1. Convertir a Fahrenheit");
         System.out.println("2. Convertir a Kelvin");
         System.out.print("Opcion: ");
         opcion = teclado.nextInt();
         
         switch (opcion) {
             case 1 -> {
                 resultado = (celsius * 9/5) + 32;
                 System.out.println("La temperatura en Fahrenheit es: " + resultado + " °F");
            }
                 case 2 -> {
                     resultado = celsius + 273.15;
                     System.out.println("La temperatura en Kelvin es: " + resultado + " K");
            }
                 default -> System.out.println("Opción inválida. Por favor elija 1 o 2.");
         }
    }
    
}
