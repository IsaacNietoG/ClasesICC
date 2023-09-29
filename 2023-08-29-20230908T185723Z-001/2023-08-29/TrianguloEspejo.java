// Importa las clases necesarias.
import java.util.Scanner;
import static java.lang.System.*; // Evita escribir la palabra System.

/**
 * Clase Triangulo.java
 * Programa que dibuja con asteriscos un triángulo rectángulo del nivel que es
 * pasada por el usuario.
 * 
 * @author Rodrigo Alejandro Sánchez Morales.
 * @version Agosto 2023.
 */
public class TrianguloEspejo {

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
            out.println();
            i++;
        }

        // 
        i = i--;

  // Iteramos con un ciclo while descremental anidado.
        while (i > 0) {
            j = 1;
            // Líneas.
            while (j <= i) {
                out.print("* ");
                j++;
            }
            i--;
            out.println();
        }

  // Cerramos el Scanner.
        lector.close();

    } // Fin main.

} // Fin TrianguloEspejo.
