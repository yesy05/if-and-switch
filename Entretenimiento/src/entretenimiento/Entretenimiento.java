/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entretenimiento;

import java.util.Scanner;

/**
 *
 * @author 52449
 */
public class Entretenimiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);
          String eleccion;
          
          System.out.println("Ingrese el nombre de una pelicula, serie o artista:");
          System.out.println("Opciones: Nemo,La sirenita,Los dos emisferios de Lucca ,Shakira");
           System.out.print("Tu eleccion: ");
            eleccion = teclado.nextLine();
            
            
             
             
              switch (eleccion) {
                  case "Nemo": System.out.println("La pelicula de Nemo fue lanzada en 2003.");
                   System.out.println("Basada en la historia de un pez payaso que va en busca de su pequeño hijo .");
                     break;
                      case "La sirenita":
                          System.out.println("La sirenita es una pelicula animada de Hans Christian estrenada en 1989.");
                           System.out.println("Es pelicula de animacion basada en un cuento.");
                           break;
                           case "Los dos emisferios de Lucca":
                               System.out.println(" Los dos emisferios de Lucca es una serie de ciencia drama sobre una familia que busca tratamiento que podria reactivar las conecciones en el cerebro.");
                                System.out.println("La historia se basa en el libro de Barbara Moriquien quien comparte su historia personal.");
                                 break;
                                 case "Shakira":
                                     System.out.println(" Shakira es una cantante conciderada un icono de la musica latina.");
                                      System.out.println("Conocida por sus alto nivel de ventas, versatilidad vocal.");
                                         break;
                                          default:
                                               System.out.println("Lo siento, no tengo informacion sobre esa opcion.");
                                      
                          
              }
    }
    
}
