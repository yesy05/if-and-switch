/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversormonedas;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class ConversorMonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
         double pesos, resultado;
         int opcion;
         
         System.out.print("Ingrese la cantidad en pesos mexicanos (MXN): ");
         pesos = teclado.nextDouble();
         
         System.out.println("Seleccione la moneda a la que desea convertir:");
         System.out.println("1. Dolar (USD)");
         System.out.println("2. Euro (EUR)");
         System.out.println("3. Bath (THB)");
         System.out.println("4. Yen (JPY)");
         System.out.println("5. Won (KRW)");
         System.out.println("6. Dolar Australiano (AUD)");
         System.out.println("7. Sol Peruano (PEN)");
         System.out.println("8. Dolar Canadiense (CAD)");
         System.out.println("9. Bolivar (VES)");
         System.out.println("10. Peso Argentino (ARS)");
         System.out.print("Opcion: ");
         opcion = teclado.nextInt();
         
         switch (opcion) {
             case 1:
                 resultado = pesos * 19.93;
                 System.out.println("Equivale a " + resultado + " dolares estadounidenses (USD).");
                  break;
                  case 2:
                      resultado = pesos * 22.03;
                      System.out.println("Equivale a " + resultado + " euros (EUR).");
                       break;
                        case 3:
                            resultado = pesos * 0.57;
                            System.out.println("Equivale a " + resultado + " baths tailandeses (THB).");
                            break;
                             case 4:
                                  resultado = pesos * 0.13;
                                  System.out.println("Equivale a " + resultado + " yenes japoneses (JPY).");
                                   break;
                                   case 5:
                                        resultado = pesos * 0.013;
                                        System.out.println("Equivale a " + resultado + " wones surcoreanos (KRW).");
                                         break;
                                         case 6:
                                             resultado = pesos * 12.91;
                                             System.out.println("Equivale a " + resultado + " dolares australianos (AUD).");
                                              break;
                                              case 7:
                                                  resultado = pesos * 5.43;
                                                  System.out.println("Equivale a " + resultado + " soles peruanos (PEN).");
                                                  break;
                                                   case 8:
                                                       resultado = pesos * 14.14;
                                                       System.out.println("Equivale a " + resultado + " dolares canadienses (CAD).");
                                                       break;case 9:
                                                           resultado = pesos * 0.294;
                                                           System.out.println("Equivale a " + resultado + " bolivares (VES).");
                                                            break;
                                                            case 10:
                                                                 resultado = pesos * 0.0186;
                                                                 System.out.println("Equivale a " + resultado + " pesos argentinos (ARS).");
                                                                  break;
                                                                   default:
                                                                       System.out.println("Opción inválida. Por favor seleccione del 1 al 10.");
         }
    }
    
}
