// Importa las clases necesarias.
import java.util.Scanner;
import static java.lang.System.*; // Evita escribir la palabra System.

/**
 * Clase Cuadrado.java
 * Programa que dibuja con asteriscos un cuadrado de
 * longitud que es pasada por el usuario.
 * 
 * @author Rodrigo Alejandro Sánchez Morales.
 * @version Agosto 2023.
 */
public class Cuadrado {
  
  public static void main(String[] args) {
    
    // Declaración de variables.
    int i, j, lado;
    Scanner lector;
    
    // Inicialización de las variables.
    i = 1;
    lector = new Scanner(in);
    
    // Pedimos la cantidad de la longitud del lado.
    out.println("¿De cuántos asteriscos vas a construir tu cuadrado?");
    lado = lector.nextInt();
    
    // Le mostramos al usuario su cuadrado.
    out.println("El cuadrado resultante es:\n");
    
    // Iteramos con un ciclo while incremental anidado.
    while (i <= lado) {
      j = 1;
      // Líneas.
      // out.print("i: " + i);
      while (j <= lado) {
        //out.print("j: " + j);
        out.print("* ");
        j++;
      }
      out.println();
      i++;
    }
    
    // Cerramos el Scanner.
    lector.close();
    
  } // Fin main.
  
} // Fin Cuadrado.