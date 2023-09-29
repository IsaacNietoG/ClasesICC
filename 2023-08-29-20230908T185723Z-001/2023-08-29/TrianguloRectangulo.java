// Importa las clases necesarias.
import java.util.Scanner;
import static java.lang.System.*; // Evita escribir la palabra System.

/**
 * Clase TrianguloRectangulo.java
 * Programa que dibuja con asteriscos un triángulo rectángulo del nivel que es
 * pasada por el usuario.
 * 
 * @author Rodrigo Alejandro Sánchez Morales.
 * @version Noviembre 2020.
 */
public class TrianguloRectangulo {
  
  public static void main(String[] args) {
    
    // Declaración de variables.
    int i, j, nivel;
    Scanner lector;
    
    // Inicialización de las variables.
    i = 1;
    lector = new Scanner(in);
    
    // Pedimos la cantidad de niveles.
    out.println("¿De cuántos niveles vas a construir tu triángulo?");
    nivel = lector.nextInt();
    
    // Le mostramos al usuario su triángulo.
    out.println("El triángulo resultante es:\n");
    
    // Iteramos con un ciclo while incremental anidado.
    while (nivel >= i) {
      j = 1;
      // Líneas.
      while (j <= i) {
        out.print("* ");
        j++;
      }
      out.println("");
      i++;
    }
    
    // Cerramos el Scanner.
    lector.close();
    
  } // Fin main.
  
} // Fin TrianguloRectangulo.
